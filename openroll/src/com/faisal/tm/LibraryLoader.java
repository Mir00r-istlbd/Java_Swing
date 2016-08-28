/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm;

import com.sun.jna.Native;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author User
 */
public class LibraryLoader 
{
    private static HashMap libMap = new HashMap();
    /*static 
    {        
        try
        {
            myLib = Native.loadLibrary("CG4EssentialsApi", CSD200Library.class);
        } 
        catch (UnsatisfiedLinkError e)
        {
            loadFromJar();
        }
    }*/
    
    private static Object loadLibrary(String libName,String className) throws ClassNotFoundException
    {
        try
        {
            return Native.loadLibrary(libName, Class.forName(className));
        } 
        catch (UnsatisfiedLinkError e)
        {
            return loadFromJar(libName,className);
        }
    }
    private static Object loadFromJar(String libName,String className) 
    {        
        return loadLib(libName, className);
    }
    
    private static Object loadLib(String libName, String className)
    {
        Object myLib = null;
        
        String toLoad = libName;
        libName = libName + ".dll";
        try 
        {            
            
            /*
            ////System.out.println(System.getProperty("java.library.path"));
            
            InputStream in = LibraryLoader.class.getResourceAsStream("/nativelib/" + libName);            
            File fileOut = new File(System.getProperty("java.io.tmpdir")+"/FAISAL/nativelib/");
            if(!fileOut.exists())
            {
                fileOut.mkdirs();
                
            }
            fileOut = new File(System.getProperty("java.io.tmpdir")+"/FAISAL/nativelib/"+libName);
            if(!fileOut.exists())
            {
                fileOut.createNewFile();                
            }
            OutputStream out = new FileOutputStream(fileOut);
           
            IOUtils.copy(in, out);
            in.close();
            out.close();
                           */             
            //myLib = Native.loadLibrary(toLoad, Class.forName(className));
            myLib = Native.loadLibrary(toLoad, Class.forName(className));
            
        } 
        catch (Exception e) 
        {
                e.printStackTrace();
        }
        
        return myLib;
    }
    
    public static Object getLibrary(String libName,String className) throws Exception
    {                        
        
        if(!libMap.containsKey(libName))                
        {
            Object lib = loadLibrary(libName,className);

            if(lib!=null)
            {
                 libMap.put(libName, lib);   
            }
        }
        
        return libMap.get(libName);
    }

}
