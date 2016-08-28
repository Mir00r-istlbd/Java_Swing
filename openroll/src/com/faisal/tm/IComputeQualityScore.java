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
public interface IComputeQualityScore 
{
    FPData getFPData();
    void setFPData(FPData fpData);
    int getFingerCnt();
    void qualityComputeDone();
    void qualityComputeFailed(String errMsg);
    int getWhichFinger();
}
