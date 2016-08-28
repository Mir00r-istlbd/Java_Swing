/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.nfiq;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;

/**
 *
 * @author User
 */
public interface NFIQLibrary  extends StdCallLibrary
{
    int computeFPQuality(byte[] imgData,int imgDataLen,byte fmt,int imgWidth,int imgHeight);
//    int comp_nfiq(IntByReference onfiq, FloatByReference oconf, byte[] idata,int iw,int ih,int id,int ippi,IntByReference optflag);    
}
