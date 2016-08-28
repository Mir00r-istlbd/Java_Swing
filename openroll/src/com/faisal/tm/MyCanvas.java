/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

/**
 *
 * @author User
 */
public class MyCanvas extends Canvas
{
    private byte[] imgData;
    private int imgWd;
    private int imgHt;
    private int bpp;
    
    private Image fpImg = null;
    
    
    public MyCanvas()
    {
        
    }
    
    public Image getFpImg() 
    {
        return fpImg;
    }

    public void setFpImg(Image fpImg) 
    {                
        BufferedImage scaledImage = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB); 
        // Paint scaled version of image to new image
        Graphics2D graphics2D = scaledImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(fpImg, 0, 0, this.getWidth(), this.getHeight(), null);
        // clean up
        graphics2D.dispose();
        
        this.fpImg = scaledImage;
        
    }
           
    
    @Override
    public void paint(Graphics g) 
    {   
                
        if(this.fpImg!=null)
        {
            
            ///System.out.println(">>>>>In Paint. W = "+this.getWidth()+" , H = "+this.getHeight());
            g.drawImage(this.fpImg, 0, 0, this.getWidth(), this.getHeight(), null);
        }                        
    }
}
