/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.data;

import com.faisal.tm.geom.FPSegment;

/**
 *
 * @author User
 */
public class FPData 
{
    private byte[] imgData;
    private int imgSZ;
    private int imgWd;
    private int imgHt;
    private int imgBPP;
    private int imgType;
    private FPSegment[] segments;
    private int nf;    
    
    public FPData() 
    {
        this.imgData = null;
        this.imgSZ = 0;
        this.imgWd = 0;
        this.imgHt = 0;
        this.imgBPP = 0;
        this.imgType = 0;
        this.nf = 0;
        segments = new FPSegment[4];        
    }
            
    public FPData(byte[] imgData, int imgSZ, int imgWd, int imgHt, int imgBPP, int imgType) 
    {
        this.imgData = imgData;
        this.imgSZ = imgSZ;
        this.imgWd = imgWd;
        this.imgHt = imgHt;
        this.imgBPP = imgBPP;
        this.imgType = imgType;
        this.nf = 0;
        segments = new FPSegment[4];
    }

    public FPData(byte[] imgData, int imgSZ, int imgWd, int imgHt, int imgBPP, int imgType, FPSegment[] segments, int nf) 
    {
        this.imgData = imgData;
        this.imgSZ = imgSZ;
        this.imgWd = imgWd;
        this.imgHt = imgHt;
        this.imgBPP = imgBPP;
        this.imgType = imgType;
        this.segments = segments;
        this.nf = nf;
        ////segments = new FPSegment[4];
    }

    public byte[] getImgData() 
    {
        return imgData;
    }

    public void setImgData(byte[] imgData) 
    {
        this.imgData = imgData;
    }

    public int getImgSZ() 
    {
        return imgSZ;
    }

    public void setImgSZ(int imgSZ) 
    {
        this.imgSZ = imgSZ;
    }

    public int getImgWd() 
    {
        return imgWd;
    }

    public void setImgWd(int imgWd) 
    {
        this.imgWd = imgWd;
    }

    public int getImgHt() 
    {
        return imgHt;
    }

    public void setImgHt(int imgHt) 
    {
        this.imgHt = imgHt;
    }

    public int getImgBPP() 
    {
        return imgBPP;
    }

    public void setImgBPP(int imgBPP) 
    {
        this.imgBPP = imgBPP;
    }

    public int getImgType() 
    {
        return imgType;
    }

    public void setImgType(int imgType) 
    {
        this.imgType = imgType;
    }

    public FPSegment[] getSegments() 
    {
        return segments;
    }

    public void setSegments(FPSegment[] segments) 
    {
        this.segments = segments;
    }
    
    public void setSegment(int pos , FPSegment segment) 
    {        
        this.segments[pos] = segment;
    }
    
    public FPSegment getSegment(int pos) 
    {        
        return this.segments[pos];
    }
    
    public int getNf() 
    {
        return nf;
    }

    public void setNf(int nf) 
    {
        this.nf = nf;
    }                    
}
