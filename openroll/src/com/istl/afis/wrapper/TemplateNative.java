package com.istl.afis.wrapper;


import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.ByteByReference;

public class TemplateNative extends Structure
{  
    public  int           quality;  
    public ByteByReference nativeTemplate;
    public int            nativeSize;     
    public ByteByReference isoTemplate;
    public int            isoSize;    
    public ByteByReference minexTemplate;
    public int            minexSize;
    public static class ByReference extends TemplateNative implements Structure.ByReference { }    
    
    public Template packTemplate()
    {
        Template tmpl = new Template();
        tmpl.setQuality(quality);
        tmpl.setNativeSize(nativeSize);
        tmpl.setIsoSize(isoSize);
        tmpl.setMinexSize(minexSize);
        
        byte[] ndata = new byte[nativeSize];
        System.arraycopy(nativeTemplate.getPointer().getByteArray(0,nativeSize),0, ndata, 0, nativeSize);
        tmpl.setNativeTemplate(ndata);
        
        byte[] isodata = new byte[isoSize];
        System.arraycopy(isoTemplate.getPointer().getByteArray(0,isoSize),0, isodata, 0, isoSize);
        tmpl.setIsoTemplate(isodata);
        
        byte[] minexdata = new byte[minexSize];
        System.arraycopy(minexTemplate.getPointer().getByteArray(0,minexSize),0, minexdata, 0, minexSize);
        tmpl.setMinexTemplate(minexdata);
                
        return tmpl;
    }
}
