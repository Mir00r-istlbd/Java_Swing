/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.data.parser;

import com.istl.card.model.Field;
import com.istl.card.model.TLVPos;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public class CardDataParser 
{
    public static boolean parseInfo(byte[] data, Field[] fields, HashMap<String, byte[]> plainRecord) throws Exception
    {           
      
        int startIndex = 0;
        
        TLVPos tlvPos = new TLVPos();
                
          
        for (Field field : fields)
        {  
          tlvPos.setValueStarts(0);
          tlvPos.setValueLen(0);
              
          plainRecord.put(field.getName(),(byte[]) null);                    
          
          if(parseTlvEncodedData(data, field.getTag().getBytes("ASCII"),startIndex, tlvPos))
          {                                          
              byte[] tmp = new byte[tlvPos.getValueLen()];
              System.arraycopy(data, tlvPos.getValueStarts(), tmp, 0, tlvPos.getValueLen());
              plainRecord.put(field.getName(),tmp);                    
          }
          
        }
        
        return true;
    }
    
    public static boolean parseTlvEncodedData(byte[] data, byte[] tag, int lenSize, int startIndex , TLVPos tlvPos) throws Exception
    {                                
        byte[] number = new byte[lenSize];
        int length1 = data.length;
        int length2 = tag.length;


        int num = startIndex;

        while (num + length2 + lenSize - 1 < length1)
        {
            for (int index = 0; index < lenSize; ++index)
            {
              number[index] = data[num + length2 + index];
            }
            
            tlvPos.setValueLen((( (int)(number[1]&0xFF)<<8) | (int)(number[0]&0xFF) )); 

            int index1 = 0;

            while (index1 < length2 && (int) data[num + index1] == (int) tag[index1])
            {
                ++index1;
            }

            if (index1 == length2)
            {
                tlvPos.setValueStarts( num + length2 + lenSize);            
                return true;
            }

            num += length2 + lenSize + tlvPos.getValueLen();

        }

        tlvPos.setValueLen(0);

        return false;
    }
    
    public static boolean parseTlvEncodedData(byte[] data, byte[] bytes, int startIndex , TLVPos tlvPos) throws Exception
    {                                
        byte[] numArray = new byte[2];
        int length1 = data.length;
        int length2 = bytes.length;
        int num1 = 2;

        int num2 = startIndex;

        while (num2 + length2 + num1 - 1 < length1)
        {
            numArray[0] = data[num2 + length2];
            numArray[1] = data[num2 + length2 + 1];           

            tlvPos.setValueLen((((numArray[1]&0xFF)<<8)|(numArray[0]&0xFF)) ); 

            int index = 0;

            while (index < length2 && (int) data[num2 + index] == (int) bytes[index])
            {
                ++index;
            }

            if (index == length2)
            {
                tlvPos.setValueStarts(num2 + length2 + num1);            
                return true;
            }

            num2 += length2 + num1 + tlvPos.getValueLen();
        }

        tlvPos.setValueLen(0);

        return false;
    }
    
    public static int parseICAODataLen(DataInputStream dis) throws Exception
    {
      int num1 = 0;
      int num2 = (dis.readByte()&0xFF);
      if ((num2 & 128) == 0)
      {
        num1 = num2;
      }
      else
      {
        int num3 = num2 & 127;
        for (int index = 0; index < num3; ++index)
        {
          int num4 = (dis.readByte()&0xFF);
          num1 = num1 << 8 | num4;
        }
      }
      return num1;
    }
    
    public static byte[] parseDGData(byte[] rawdata) throws Exception
    {
        byte[] buffer = null;
        ByteArrayInputStream bis = new ByteArrayInputStream(rawdata);
        DataInputStream dis = new DataInputStream(bis);
        
        dis.readByte();
        
        int num = parseICAODataLen(dis);
        int count = (rawdata.length-dis.available())+num;
        bis.close();
        dis.close();
        
        bis = new ByteArrayInputStream(rawdata);
        dis = new DataInputStream(bis);
        
        buffer = new byte[count];
        dis.readFully(buffer);
        
        bis.close();
        dis.close();
        
        return buffer;
    }
    
    public static List<byte[]> parsePhoto(byte[] rawdata) throws Exception
    {
        List<byte[]> list = new ArrayList<byte[]>();
        
        DataInputStream memoryStream1 = null;
        DataInputStream memoryStream2 = null;
        
        try 
        {
            memoryStream1 = new DataInputStream(new ByteArrayInputStream(rawdata));
            
            ///Skip a byte
            memoryStream1.readByte();
            
            int num1 = parseICAODataLen(memoryStream1);
            
            ///Skip 2 bytes
            memoryStream1.readByte();
            memoryStream1.readByte();
            
            num1 = parseICAODataLen(memoryStream1);
            
            ////Skip 1 byte
            memoryStream1.readByte();
            
            num1 = memoryStream1.readByte();

            int num2 = memoryStream1.readByte();

            for (int index1 = 0; index1 < num2; ++index1) 
            {
                memoryStream1.readByte();
                memoryStream1.readByte();

                byte[] buffer1 = new byte[parseICAODataLen(memoryStream1)];

                memoryStream1.readFully(buffer1, 0, buffer1.length);

                memoryStream2 = new DataInputStream(new ByteArrayInputStream(buffer1));

                memoryStream2.readByte();

                byte[] buffer2 = new byte[parseICAODataLen(memoryStream2)];

                memoryStream2.readFully(buffer2, 0, buffer2.length);

                memoryStream2.readByte();

                memoryStream2.readByte();

                byte[] buffer3 = new byte[parseICAODataLen(memoryStream2)];

                memoryStream2.readFully(buffer3, 0, buffer3.length);

                int num3 = (int) buffer3[12] << 8 | (int) buffer3[13];

                byte[] numArray1 = new byte[buffer3.length - 14];///Enumerable.ToArray<byte>(Enumerable.Skip<byte>((IEnumerable<byte>) buffer3, 14));

                System.arraycopy(buffer3, 14, numArray1, 0, buffer3.length - 14);

                for (int index2 = 0; index2 < num3; ++index2) 
                {
                    long num4 = (long) (((int) ((numArray1[0]&0xFF) << 24) | (int) ((numArray1[1]&0xFF) << 16) | (int) ((numArray1[2]&0xFF) << 8) | (int) (numArray1[3]&0xFF) ) & 4294967295L);

                    int num5 = (int) numArray1[4] << 8 | (int) numArray1[5];

                    long length = num4 - (long) (8 * num5) - 32L;

                    int srcOffset = (int) (num4 - length);

                    byte[] numArray2 = new byte[(int) length];

                    ///Buffer.BlockCopy((Array) numArray1, srcOffset, (Array) numArray2, 0, (int) length);

                    System.arraycopy(numArray1, srcOffset, numArray2, 0, (int) length);

                    list.add(numArray2);

                    ///numArray1 = Enumerable.ToArray<byte>(Enumerable.Skip<byte>((IEnumerable<byte>) numArray1, (int) num4));              
                    byte[] tmp = new byte[(int) (numArray1.length - num4)];
                    System.arraycopy(numArray1, (int) num4, tmp, 0, (int) (numArray1.length - num4));

                }
            }
        } 
        finally 
        {
            try 
            {
                if (memoryStream1 != null) 
                {
                    memoryStream1.close();
                }
            } 
            catch (Exception exc2) 
            {
            }
            try 
            {
                if (memoryStream2 != null) 
                {
                    memoryStream2.close();
                }
            } 
            catch (Exception exc2) 
            {
            }
        }
      return list;
    }
        
}
