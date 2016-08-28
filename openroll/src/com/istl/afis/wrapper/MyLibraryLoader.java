/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.afis.wrapper;

import com.sun.jna.Native;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author User
 */
public class MyLibraryLoader 
{
    private static Object myLib = null;
    static 
    {        
        try
        {
            myLib = Native.loadLibrary("TafisDLL", TafisLibrary.class);
        } catch (UnsatisfiedLinkError e)
        {
            loadFromJar();
        }
    }

    private static void loadFromJar() 
    {
        // we need to put both DLLs to temp dir
        String path = "TIGERAFIS";
        loadLib(path, "TA_Engine32",true);
        loadLib(path, "TafisDLL",false);
    }
    
    private static void loadLib(String path, String name , boolean dependency)
    {
        String toLoad = name;
        name = name + ".dll";
        try 
        {            
            ////System.out.println(System.getProperty("java.library.path"));
            
            InputStream in = MyLibraryLoader.class.getResourceAsStream("nativelib/" + name);            
            File fileOut = new File(System.getProperty("java.io.tmpdir")+"/" + path + "/nativelib/");
            if(!fileOut.exists())
            {
                fileOut.mkdirs();
                
            }
            fileOut = new File(System.getProperty("java.io.tmpdir")+"/" + path + "/nativelib/"+name);
            if(!fileOut.exists())
            {
                fileOut.createNewFile();                
            }
            OutputStream out = new FileOutputStream(fileOut);
           
            IOUtils.copy(in, out);
            in.close();
            out.close();
            if(dependency)
                System.load(fileOut.toString());
            else
            {
                System.load(fileOut.toString());
                myLib = Native.loadLibrary(toLoad, TafisLibrary.class);
            }
        } 
        catch (Exception e) 
        {
                e.printStackTrace();
        }
    }
    
    public static TafisLibrary getTafisLibrary()
    {
        if(myLib==null) return null;
        return (TafisLibrary)myLib;
    }

}
