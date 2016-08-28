package com.istl.afis.wrapper;


import com.istl.afis.wrapper.TemplateNative;
import com.istl.afis.wrapper.TafisLibrary;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.istl.afis.wrapper.Template;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Tafis 
{
    public Template makeTemplate(byte[] greyData,int width , int height) throws Exception
    {        
        Memory mem1 = new Memory(greyData.length);
        mem1.write(0, greyData, 0, greyData.length);
        TafisLibrary tLib = null;
        
        tLib = MyLibraryLoader.getTafisLibrary();////(TafisLibrary)Native.loadLibrary("TafisDLL", TafisLibrary.class);            
        
        TemplateNative.ByReference ii1 = tLib.GetTemplate(mem1, height, width);             
        Template tpl = ii1.packTemplate();
        tLib.FreeTemplate(ii1);
        
        return tpl;
    }
    
    public boolean compareTemplate(byte[] model1,int size1 , byte[] model2 , int size2) throws Exception
    {                        
        FloatByReference ff1 = new FloatByReference();        
        TafisLibrary tLib = null;
        try
        {
            tLib = MyLibraryLoader.getTafisLibrary();////(TafisLibrary)Native.loadLibrary("TafisDLL", TafisLibrary.class);            
        }catch(Exception exc)
        {
            exc.printStackTrace();
        }
        int ret = tLib.CompareTwoProprietary(model1, model2, 0, 1,7, 53, (float)0.5, ff1); 
        System.out.println(ff1.getValue());
        return ret==1;
    }
    public boolean compareMinexTemplate(byte[] model1,int size1 , byte[] model2 , int size2) throws Exception
    {                        
        FloatByReference ff1 = new FloatByReference();        
        TafisLibrary tLib = null;
        try
        {
            tLib = MyLibraryLoader.getTafisLibrary();////(TafisLibrary)Native.loadLibrary("TafisDLL", TafisLibrary.class);            
        }catch(Exception exc)
        {
            exc.printStackTrace();
        }
        int ret = tLib.CompareTwoMinex(model1, model2, 0, 1,7, 53, (float)0.5, ff1); 
        System.out.println(ff1.getValue());
        return ret==1;
    }
    
    public boolean compareISOTemplate(byte[] model1,int size1 , byte[] model2 , int size2) throws Exception
    {                        
        FloatByReference ff1 = new FloatByReference();        
        TafisLibrary tLib = null;
        try
        {
            tLib = MyLibraryLoader.getTafisLibrary();////(TafisLibrary)Native.loadLibrary("TafisDLL", TafisLibrary.class);            
        }catch(Exception exc)
        {
            exc.printStackTrace();
        }
        int ret = tLib.CompareTwoISO(model1, model2, 0, 1,7, 53, (float)0.5, ff1); 
        System.out.println(ff1.getValue());
        return ret==1;
    }
    
    public static void main(String[] args)
    {
        
        byte[] data = new byte[800*750];
        ////while(true)
        {
            try
            {
                DataInputStream dis = new DataInputStream(new FileInputStream("D:/img/rawmarz_li"));
                dis.readFully(data);
                dis.close();
                System.gc();
                System.out.println("Free Memory Before : "+Runtime.getRuntime().freeMemory());
                Tafis tafis = new Tafis();
                
                Template tt1 = tafis.makeTemplate(data, 800, 750);            
                tt1.setIsoTemplate(null);
                tt1.setMinexTemplate(null);
                
                data = new byte[800*750];
                dis = new DataInputStream(new FileInputStream("D:/img/rawmarz_li"));
                dis.readFully(data);
                dis.close();
                System.gc();
                
                Template tt2 = tafis.makeTemplate(data, 800, 750);            
                tt2.setIsoTemplate(null);
                tt2.setMinexTemplate(null);
                
                ///System.out.println(tafis.compareTemplate(tt1.getNativeTemplate(), tt1.getNativeSize(), tt2.getNativeTemplate(), tt2.getNativeSize()));
                ///tt2=null;
                System.gc();
                System.out.println("Free Memory After : "+Runtime.getRuntime().freeMemory());
                ///System.out.println("Quality = "+tt.getQuality()+" Size1 = "+tt.getNativeSize()+" Size2 = "+tt.getIsoSize()+" Size3 = "+tt.getMinexSize());
            }catch(Exception exc)
            {
                exc.printStackTrace();
            }
            try{Thread.sleep(5000);}catch(Exception exc){}
        }
    }
}
