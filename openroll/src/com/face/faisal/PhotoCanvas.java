/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.face.faisal;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author User
 */
public class PhotoCanvas extends Canvas
{
    private Image photoImg = null;
    
    public PhotoCanvas()
    {
    }

    public Image getPhotoImg() {
        return photoImg;
    }

    public void setPhotoImg(Image photoImg) {
        this.photoImg = photoImg;
    }
    
    
    @Override
    public void paint(Graphics g) 
    {
        System.out.println("Canvas paint called >>>>>>>>>>>>>> ");
        if(this.photoImg!=null)
        {
            g.drawImage(this.photoImg, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
}
