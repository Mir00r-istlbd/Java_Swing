/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * REFERENCE SITE : http://www.cardwerk.com/smartcards/smartcard_standard_ISO7816-4_5_basic_organizations.aspx
 * 
 Value 	Command name            Clause
'0E' 	ERASE BINARY            6.4
'20' 	VERIFY                  6.12
'70' 	MANAGE CHANNEL          6.16
'82' 	EXTERNAL AUTHENTICATE 	6.14
'84' 	GET CHALLENGE           6.15
'88' 	INTERNAL AUTHENTICATE 	6.13
'A4' 	SELECT FILE             6.11
'B0' 	READ BINARY             6.1
'B2' 	READ RECORD(S)          6.5
'C0' 	GET RESPONSE            7.1
'C2' 	ENVELOPE                7.2
'CA' 	GET DATA                6.9
'D0' 	WRITE BINARY            6.2
'D2' 	WRITE RECORD            6.6
'D6' 	UPDATE BINARY           6.3
'DA' 	PUT DATA                6.10
'DC' 	UPDATE DATA             6.8
'E2' 	APPEND RECORD           6.7 
 */

package com.istl.card.reader;

import com.istl.card.data.structure.CardDataStructure;
import com.istl.card.pdu.APDURequest;
import javax.smartcardio.Card;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author User
 */
public class CardDataReader 
{
    private Card readCard;
    
    public CardDataReader()
    {
    }

    public Card getReadCard() {
        return readCard;
    }

    public void setReadCard(Card readCard) {
        this.readCard = readCard;
    }
    
    public void selectFile(String fileIDWithPath) throws Exception
    {
      APDURequest apdu = new APDURequest();

      if (fileIDWithPath.length() % 2 != 0 || fileIDWithPath.length() <= 0)
      {
        return;
      }
      
      for (int index = 0; index < fileIDWithPath.length() / 4; ++index)
      {
        apdu.setbCLA((byte) 0);
        apdu.setbINS((byte) 0xA4);
        apdu.setbP1((byte) 0);
        apdu.setbP2((byte) 0);
        apdu.setbLc((byte) 2);
        
        byte[] _data = new byte[(int) apdu.getbLc()];
                        
        String str = fileIDWithPath.substring(index*4, (index*4)+2);
        _data[0] = Byte.parseByte(str,16);
        
        str = fileIDWithPath.substring((index*4)+2,((index*4)+2)+2);
        _data[1] = Byte.parseByte(str, 16);
        
        apdu.setData(_data);
        byte[] _apdu = apdu.prepareData();

        ResponseAPDU answer = readCard.getBasicChannel().transmit(new CommandAPDU(_apdu));                
        
        if(answer.getSW()!=0x9000)
        {
            throw new Exception("Could not select file "+fileIDWithPath);
        }
      }
    }
    
    
    
    public byte[] readFile(String fileIdWithPath, int fileSize) throws Exception
    {
        
      ResponseAPDU answer = null;  
      byte[] readData = new byte[fileSize];
      
      selectFile(fileIdWithPath);

      APDURequest apdu = new APDURequest();

      int num = fileSize;

      while (num != 0)
      {

        int length = num;
        
        if (length > 256)
        {
          length = 256;
        }
        
        int destinationIndex = fileSize - num;

        
        apdu.setbCLA((byte)0x00);
        apdu.setbINS((byte)0xB0);
        apdu.setbP1((byte)(((destinationIndex)>>8)&0xFF));
        apdu.setbP2((byte)((destinationIndex)&0xFF));
        
        apdu.setbLe(length);                

        byte[] _apdu = apdu.prepareData();
        
        answer = readCard.getBasicChannel().transmit(new CommandAPDU(_apdu));
        
        
        if( (answer.getSW1() == 0x54) && (answer.getSW2() == 0x67))
        {
          num = length = (int) Integer.parseInt(String.valueOf(answer.getSW()).substring(2, 4),16);
          apdu.setbLe(length == 256 ? 0 : (int)length);          
          _apdu = apdu.prepareData();
          answer = readCard.getBasicChannel().transmit(new CommandAPDU(_apdu));                    
        }
        else if (answer.getSW()!=0x9000)
        {          
          break;
        } 
        
        System.arraycopy(answer.getData(), 0, readData, destinationIndex, answer.getData().length);                
        num -= answer.getData().length;
      }                              
      
      return readData;
      
    }
    
    public byte[] readUpdateKey(String fileIdWithPath, int fileSize) throws Exception
    {
        return readFile(fileIdWithPath,CardDataStructure.UpdatableDataFilesInfo[6].getSize());
    }
        
    
}
