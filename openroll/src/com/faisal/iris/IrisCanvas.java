/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.iris;

import com.iritech.iddk.standard.IddkImage;
import com.iritech.iddk.standard.IddkImageFormat;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author User
 */
public class IrisCanvas extends Canvas{
    
    private IddkImage mImg;

    public IrisCanvas() {
        mImg = null;
    }

    public IddkImage getmImg() {
        return mImg;
    }

    public void setmImg(IddkImage mImg) {
        this.mImg = mImg;
    }

    public void paint(Graphics g) {
        if (mImg == null) {
            return;
        }
//        if (mImg.getImageFormat().getValue() == IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000) {
        if (mImg.getImageFormat().getValue() == IddkImageFormat.IDDK_IFORMAT_MONO_RAW) {
            try {

                //

//                FileOutputStream fos = new FileOutputStream("F:/Project_misc/output/eye_left.jp2");
//                fos.write(mImg.getImageData());
//                System.out.println("Image size : " + mImg.getImageData().length);
//                System.out.println("Image height : " + mImg.getImageHeight());
//                System.out.println("Image width : " + mImg.getImageWidth());
//                System.out.println("Image format : " + mImg.getImageFormat());
//                fos.close();

                //

//                BMP bmp = JP2Decoder.getInstance().jp2Decode(mImg.getImageData(), mImg.getImageData().length, JP2Decoder.JP2_CFMT);
//                BufferedImage bImg = ImageIO.read(new ByteArrayInputStream(bmp.getImgData()));
                BufferedImage bImg = IrisUtils.getGrayscale(mImg.getImageWidth(), mImg.getImageHeight(), mImg.getImageData());
                
                g.drawImage(bImg, 0, 0, this.getWidth(), this.getHeight(), null);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        } else if (mImg.getImageFormat().getValue() == IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000) {
        } else if (mImg.getImageFormat().getValue() == IddkImageFormat.IDDK_IFORMAT_IRITECH_RAW) {
        } else if (mImg.getImageFormat().getValue() == IddkImageFormat.IDDK_IFORMAT_IRITECH_JPEG2000) {
        }
    }
    
}
