/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.afis.wrapper;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Maverick
 */
public class QualityTest {
    
    public static int getQuality(byte[] fp,int width,int height)
    {
        
        try{
            Tafis tafis=new Tafis();
            Template localLiTemplate=tafis.makeTemplate(fp,width,height);
            localLiTemplate.setIsoTemplate(null);
            localLiTemplate.setNativeTemplate(null);
            localLiTemplate.setIsoTemplate(null);
            return localLiTemplate.getQuality();
        }
        catch(Exception ex)
        {
            System.out.println("template generation error, reason follows:");
            ex.printStackTrace();
            
            return 200000;//means tooooooooo bad. worst has been recognized as 10000, thus 20000 means toooo bad
        }
    }
    
}
