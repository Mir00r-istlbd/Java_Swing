package com.istl.afis.wrapper;


import com.sun.jna.Pointer;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface TafisLibrary extends StdCallLibrary
{
    public TemplateNative.ByReference GetTemplate(Pointer IN_rawImage, int IN_width,int IN_height);    
    public int CompareTwoProprietary(byte[] aModel,byte[] bModel,int iSecur,int iNorma,int iSpeed,int MaxRot,float thresold, FloatByReference matchScore);
    public int CompareTwoMinex(byte[] aModel,byte[] bModel,int iSecur,int iNorma,int iSpeed,int MaxRot,float thresold, FloatByReference matchScore);
    public int CompareTwoISO(byte[] aModel,byte[] bModel,int iSecur,int iNorma,int iSpeed,int MaxRot,float thresold, FloatByReference matchScore);
    public void FreeTemplate(TemplateNative.ByReference tpl);
}
