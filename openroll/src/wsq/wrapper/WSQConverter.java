/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wsq.wrapper;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;


/**
 *
 * @author Maverick
 */
public class WSQConverter 
{
    
//    private static Logger LOGGER = LoggerUtil.getLogger(LoggerUtil.LogType.CONTROLLER_LOGGER);
    int res;
    static
    {
        Native.setProtected(true);
    }
    public WSQConverter()
    {
    }
    
    public Dimension getBMPDimension(InputStream is) throws Exception
    {
        if(is==null) return null;
        BufferedImage bi = ImageIO.read(is);
        return new Dimension(bi.getWidth(),bi.getHeight());        
    }    
    
    public byte[] convertToWSQ(byte[] inpbyte,int width,int height) throws Throwable
    {
            res = 0;
//            byte[] outbyte = wsqEncode(inpbyte, 800, 750, 500, (float)0.75, 1);
            byte[] outbyte = wsqEncode(inpbyte, width,height,500, (float)0.75,1);
            System.out.println("Done>>>>>>");
            return outbyte;
    }
    
    public byte[] wsqEncode(byte[] inpbyte , int w, int h, int ppi, float bitrate,int depth) throws Throwable
    {
        
        if(inpbyte == null || w<=0 || h<=0 ) return null;
        
        WSQLibrary wsqLib = (WSQLibrary)MyWSQLibraryLoader.getWSQLibrary();
        
        ByteByReference inpdata = new ByteByReference();
        inpdata.setPointer(new Memory(inpbyte.length));
        inpdata.getPointer().write(0, inpbyte, 0, inpbyte.length);
        
        PointerByReference outPointer = new PointerByReference();                        
        IntByReference outLen = new IntByReference();
            
        int ret = wsqLib.wsq_encode(outPointer, outLen, (float)bitrate, inpdata, w, h, depth, ppi, "faisal");
        
        if(ret!=0) return null;
        
        Pointer pp = outPointer.getValue();
        byte[] outbyte = pp.getByteArray(0, outLen.getValue());
        
//        FileOutputStream fos = new FileOutputStream("D:/img/conv.wsq");
//        DataOutputStream dos = new DataOutputStream(fos);            
//        dos.write(outbyte, 0, outbyte.length);                        
//        dos.close();
//        fos.close();        
        
        
        
        return outbyte;
    }

}
