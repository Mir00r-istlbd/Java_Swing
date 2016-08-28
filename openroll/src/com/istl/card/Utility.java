/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Utility 
{
    final static private char[] hexArray = "0123456789ABCDEF".toCharArray();
    static private Font banglaFont12 = null;    
    
    static
    {
        try 
        {
            //create the font to use. Specify the size!
            banglaFont12 = Font.createFont(Font.TRUETYPE_FONT, Utility.class.getResourceAsStream("SolaimanLipi_29-05-06.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Utility.class.getResourceAsStream("SolaimanLipi_29-05-06.ttf")));
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
        catch(FontFormatException e)
        {
            System.out.println(e);
        }

    }
    
    public static byte[] hexStringToByteArray(String s) 
    {
        int len = s.length();
        if(len%2!=0)
        {
            s = "0"+s;
        }
        len++;
        
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    public static String byteArrayToHexString(byte[] bytes) 
    {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
    
    public static Font getBanglaFont()
    {
        return banglaFont12;
    }
    
    public static String getFingerName(Integer key)
    {
      if(key == 1)
      {
          return "right_thumb";
      }else if(key == 2)
      {
          return "right_index";
      }else if(key == 6)
      {
          return "left_thumb";
      }else if(key == 7)
      {
          return "left_index";
      }
      
      return "";    
    }
    
    public static byte[] merge(byte[] first, byte[] second)
    {
            if (second == null & first == null)
            {
                    return null;
            }
            if (second == null & first != null)
            {
                    return first;
            }
            if (second != null & first == null)
            {
                    return second;
            }
            byte[] array = new byte[first.length + second.length];
            System.arraycopy(first, 0, array, 0, first.length);
            System.arraycopy(second, 0, array, first.length, second.length);
            
            return array;
    }
}
