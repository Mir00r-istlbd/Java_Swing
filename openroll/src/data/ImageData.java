package data;


import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ImageData extends Structure 
{
    public static class ByValue extends ImageData implements Structure.ByValue {}
    //public static class ByReference extends ImageData implements Structure.ByReference {}
    
    public Pointer Buffer;
    public int    Width;            
    public int    Height;
    public double  ResolutionX;
    public double  ResolutionY;
    public double  FrameTime;
    public int     Pitch;
    public byte    BitsPerPixel;
    public int     Format;
    public int     IsFinal;       
    
    protected ArrayList getFieldOrder() {
        // TODO Auto-generated method stub
        ArrayList fields = new ArrayList();
            
        fields.add(Arrays.asList(new String[]{"Buffer", "Width", "Height", "ResolutionX", "ResolutionY", "FrameTime", "Pitch", "BitsPerPixel", "Format", "IsFinal"}));
        return fields;
    }
    
}
