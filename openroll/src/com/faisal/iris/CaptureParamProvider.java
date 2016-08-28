/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.iris;

/**
 *
 * @author User
 */
public interface CaptureParamProvider 
{
    int getCommType();
    int getImageFormat();
    int getISOImageFormat();
    int getImageKind();
    int whichEye();
}
