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
public class Rect extends Structure 
{
    public static class ByValue extends Rect implements Structure.ByValue {}
    public static class ByReference extends Rect implements Structure.ByReference {}
    
    public long    left;
    public long     top;
    public long     right;
    public long     bottom;   
    
    protected ArrayList getFieldOrder() 
    {
        // TODO Auto-generated method stub
        ArrayList fields = new ArrayList();
            
        fields.add(Arrays.asList(new String[]{"left", "top", "right", "bottom"}));
        return fields;
    }
    
}
