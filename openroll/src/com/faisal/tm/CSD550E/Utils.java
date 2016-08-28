/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.CSD550E;

import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;

/**
 *
 * @author User
 */
public class Utils 
{
    public static BufferedImage getGrayscale(int width, int height , byte[] buffer) 
    {   
        /////reverse image data upside-down
        
        int j=0;
        int k=0;        
        byte[] rev_data = new byte[width*height];        
        k = height-1;
        
        while(k>=0)
        {
            System.arraycopy(buffer, k*width, rev_data, j*width, width);
            k--;
            j++;
        }
        
        buffer = rev_data;
        
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        int[] nBits = { 8 };
        ColorModel cm = new ComponentColorModel(cs, nBits, false, true,
                Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
        SampleModel sm = cm.createCompatibleSampleModel(width, height);
        DataBufferByte db = new DataBufferByte(buffer, width * height);
        WritableRaster raster = Raster.createWritableRaster(sm, db, null);
        BufferedImage result = new BufferedImage(cm, raster, false, null);

        return result;
    }
}
