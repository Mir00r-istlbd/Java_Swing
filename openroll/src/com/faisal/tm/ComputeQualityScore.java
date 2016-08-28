/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm;

import com.faisal.tm.CSD550E.CSD200Library;
import com.faisal.tm.data.FPData;
import com.faisal.tm.geom.FPSegment;
import com.faisal.tm.nfiq.NFIQLibrary;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 *
 * @author User
 */
public class ComputeQualityScore extends Thread {

    private IComputeQualityScore listener;

    public ComputeQualityScore(IComputeQualityScore listener) {
        this.listener = listener;
    }

    public void computeQS() throws Exception {
        int respCode = 0, i = 0;
        FPData fpData = listener.getFPData();
        NFIQLibrary nfiqlib = (NFIQLibrary) LibraryLoader.getLibrary("NFIQ2", "com.faisal.tm.nfiq.NFIQLibrary");


        FPSegment[] segments = fpData.getSegments();
        int nf = this.listener.getFingerCnt();
        
            IntByReference onfiq=null;
            FloatByReference oconf=null;
            IntByReference optflag=null;

        if (nf > 1) {
            for (i = 0; i < nf; i++) {
                respCode = nfiqlib.computeFPQuality(segments[i].getSegData(), segments[i].getSegData().length, (byte) 2, segments[i].getW(), segments[i].getH());
                segments[i].setScore(respCode);
                /*
                onfiq=new IntByReference();
                oconf=new FloatByReference();
                optflag=new IntByReference();                
                
                
                try{
                respCode=nfiqlib.comp_nfiq(onfiq,oconf,segments[i].getSegData(),segments[i].getW(),segments[i].getH(),8,-1,optflag);
                segments[i].setScore(onfiq.getValue());
                }
                catch(Exception ex)
                {
                    System.out.println("Failed to determine score!!!");
                    segments[i].setScore(999);
                }
                */
                //segments[i].saveRawSegment("w:/mrt/" + (i + 1) + "_" + segments[i].getW() + ".raw");
            }
        } else {

            int wf = this.listener.getWhichFinger();
            int whichSegmentIndex;

            switch (wf) {
                case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL: {
                    whichSegmentIndex = 0;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING: {
                    whichSegmentIndex = 1;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE: {
                    whichSegmentIndex = 2;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX: {
                    whichSegmentIndex = 3;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB: {
                    whichSegmentIndex = 0;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL: {
                    whichSegmentIndex = 3;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING: {
                    whichSegmentIndex = 2;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE: {
                    whichSegmentIndex = 1;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX: {
                    whichSegmentIndex = 0;
                }
                break;
                case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB: {
                    whichSegmentIndex = 1;
                }
                break;
                default:
                    whichSegmentIndex = 0;

            }

                respCode = nfiqlib.computeFPQuality(segments[whichSegmentIndex].getSegData(), segments[whichSegmentIndex].getSegData().length,(byte)2, segments[whichSegmentIndex].getW(), segments[whichSegmentIndex].getH());
                segments[whichSegmentIndex].setScore(respCode);                
                /*
                try{
                    System.out.println("size ="+segments[whichSegmentIndex].getSegData().length);
                    System.out.println("width ="+segments[whichSegmentIndex].getW());
                    System.out.println("height ="+segments[whichSegmentIndex].getH());
                    System.out.println("size cross check ="+segments[whichSegmentIndex].getH()*segments[whichSegmentIndex].getW());
                    respCode=nfiqlib.comp_nfiq(onfiq,oconf,segments[whichSegmentIndex].getSegData(),segments[whichSegmentIndex].getW(),segments[whichSegmentIndex].getH(),8,-1,optflag);
                    segments[whichSegmentIndex].setScore(onfiq.getValue());
                }
                catch(Exception ex)
                {
                    System.out.println("Failed to determine score .....");
                    ex.printStackTrace();
                    segments[whichSegmentIndex].setScore(999);
                }*/
//                segments[whichSegmentIndex].saveRawSegment("w:/mrt/"+(whichSegmentIndex+1)+"_"+segments[whichSegmentIndex].getW()+".raw");
        }


        fpData.setSegments(segments);
        this.listener.setFPData(fpData);
        this.listener.qualityComputeDone();

    }

    public void run() {
        try {
            computeQS();
        } catch (Exception exc) {
            if (listener != null) {
                listener.qualityComputeFailed(exc.getMessage());
                exc.printStackTrace();
            }
        }
    }
}
