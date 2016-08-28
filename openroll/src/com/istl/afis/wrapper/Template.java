/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.afis.wrapper;

/**
 *
 * @author User
 */
public class Template 
{
    private int              quality;   
    private int              nativeSize; 
    private byte[]            nativeTemplate;
    private int              isoSize;
    private byte[]            isoTemplate;
    private int              minexSize;
    private byte[]            minexTemplate;

    public int getIsoSize() {
        return isoSize;
    }

    public void setIsoSize(int isoSize) {
        this.isoSize = isoSize;
    }

    public byte[] getIsoTemplate() {
        return isoTemplate;
    }

    public void setIsoTemplate(byte[] isoTemplate) {
        this.isoTemplate = isoTemplate;
    }

    public int getMinexSize() {
        return minexSize;
    }

    public void setMinexSize(int minexSize) {
        this.minexSize = minexSize;
    }

    public byte[] getMinexTemplate() {
        return minexTemplate;
    }

    public void setMinexTemplate(byte[] minexTemplate) {
        this.minexTemplate = minexTemplate;
    }

    public int getNativeSize() {
        return nativeSize;
    }

    public void setNativeSize(int nativeSize) {
        this.nativeSize = nativeSize;
    }

    public byte[] getNativeTemplate() {
        return nativeTemplate;
    }

    public void setNativeTemplate(byte[] nativeTemplate) {
        this.nativeTemplate = nativeTemplate;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
}
