/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.terminal;

import com.istl.card.pdu.APDURequest;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;

/**
 *
 * @author User
 */
public class Token 
{    
    private CardChannel channel;
    
    public Token(CardChannel _channel)
    {
        this.channel = _channel;
    }
    
    public CardChannel getChannel() {
        return channel;
    }

    public void setChannel(CardChannel channel) {
        this.channel = channel;
    }
    
    public byte[] ReadFile256(String fileIdWithPath, int fileSize) throws Exception
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
        apdu.setbCLA((byte)0);
        apdu.setbINS((byte)176);
        apdu.setbP1((byte)(((destinationIndex)>>8)&0xFF));
        apdu.setbP2((byte)((destinationIndex)&0xFF));
        apdu.setbLe(length);
                
        byte[] _apdu = apdu.prepareData();
        
        answer = channel.transmit(new CommandAPDU(_apdu));
        
        
        if( (answer.getSW1() == 0x54) && (answer.getSW2() == 0x67))
        {
          num = length = (int) Integer.parseInt(String.valueOf(answer.getSW()).substring(2, 4),16);
          apdu.setbLe(length == 256 ? 0 : (int)length);
          _apdu = apdu.prepareData();
          answer = channel.transmit(new CommandAPDU(_apdu));                    
        }
        else if (answer.getSW()!=0x9000)
        {          
          break;
        } 
        
        System.arraycopy(answer.getData(), 0, readData, destinationIndex, answer.getData().length);                
        num -= answer.getData().length;
      }                                    
      
      if(num>0)
      {
          throw new Exception("Could not properly read field data");
      }
      
      return readData;      
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
          apdu.setbCLA((byte)0);
          apdu.setbINS((byte) 164);
          apdu.setbP1((byte)0);
          apdu.setbP2((byte)0);
          apdu.setbLc((byte)2);          
          
          byte[] _data = new byte[2];
          
        String str = fileIDWithPath.substring(index*4, (index*4)+2);
        _data[0] = Byte.parseByte(str,16);
        str = fileIDWithPath.substring((index*4)+2,((index*4)+2)+2);
        _data[1] = Byte.parseByte(str, 16);
        
        apdu.setData(_data);
        
        byte[] _apdu = apdu.prepareData();

        ResponseAPDU answer = channel.transmit(new CommandAPDU(_apdu));        
        
        if(answer.getSW()!=0x9000)
        {
            throw new Exception(answer.toString());
        }
      }
    }
    
}
