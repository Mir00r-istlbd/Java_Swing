/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm;

import com.faisal.tm.data.FPData;
import java.awt.Image;

/**
 *
 * @author User
 */
public interface ICaptureObserver 
{
    FPData getFPData();
    void setFPData(FPData fpData);
    Image getFPImage();
    void setFPImagePreview(Image img);
    void setFPImageFinal(Image img);
    void setCaptureDone();
    int getFingerCnt();
    int getWhichFinger();
}
