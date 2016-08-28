/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm;

import com.faisal.tm.data.FPData;

/**
 *
 * @author User
 */
public interface ISegmentFingerprint 
{
    FPData getFPData();
    int getFingerCnt();    
    void setFPData(FPData fpData);
    void segmentationDone();
    void segmentationFailed(String msg);
    int getWhichFinger();
}
