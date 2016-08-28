/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm;

import ImageProcessing.ImageAndFileProcessing;
import com.faisal.tm.CSD550E.CSD200Library;
import com.faisal.tm.CSD550E.Utils;
import com.faisal.tm.data.FPData;
import com.faisal.tm.geom.FPSegment;
import com.faisal.tm.nfseg.NFSEGLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class SegmentFingerprint extends Thread
{    
    private ISegmentFingerprint segListener = null;

    public SegmentFingerprint(ISegmentFingerprint listener) 
    {
        segListener = listener;
    }
        
            
    public void segmentFP() throws Exception
    {
        FPData fpData = segListener.getFPData();
        int fgp = 0; ///unknown finger. For more info see https://github.com/lessandro/nbis/blob/master/man/man1/nfseg.1
        int fingerCount = segListener.getFingerCnt();
        int whichFinger = segListener.getWhichFinger();
        
        NFSEGLibrary nfseglib = (NFSEGLibrary)LibraryLoader.getLibrary("nfseg", "com.faisal.tm.nfseg.NFSEGLibrary");
        
                
        PointerByReference pbref = new PointerByReference();
        
        
        
        if(whichFinger == CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS)
        {
            fgp = 14;
        }else if(whichFinger == CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_FINGERS)
        {
            fgp = 13;
        }else if(whichFinger == CSD200Library.CG4ImageType.CG4_FLAT_TWO_THUMBS)
        {
            fgp = 15;
        }
        else
            fgp=15;
           
        
        int rv = nfseglib.segment_finger_prints(fpData.getImgData(), fpData.getImgWd(), fpData.getImgHt(), pbref, fingerCount,fgp, 1,1);
        
        Pointer segPtr = null; 
        NFSEGLibrary.SEGMENT[] segArray = null;
        FPSegment[] segments = null;
        
        if(rv==0)
        {
            segPtr = pbref.getValue();
            NFSEGLibrary.SEGMENT seg = new NFSEGLibrary.SEGMENT(segPtr);
            seg.read();  ////Read the first element                        
            
            segArray = (NFSEGLibrary.SEGMENT[])seg.toArray(fingerCount);
            
            segments = new FPSegment[fingerCount];
            
            for(int i=0;i<fingerCount;i++)
            {                              
                segments[i] = new FPSegment();
                segments[i].setX(segArray[i].sx);
                segments[i].setY(segArray[i].sy);
                segments[i].setW(segArray[i].sw);
                segments[i].setH(segArray[i].sh);
                
                
                System.out.println("segment width="+segArray[i].sw);
                System.out.println("segment hight="+segArray[i].sh);


                
                segments[i].setSegErr(segArray[i].err);                
            }
                        
        }else
        {
            throw new Exception("Segmentation failed with error code : "+rv);
        }
        
        if(segPtr!=null)
        {
            PointerByReference parsedImgdata = new PointerByReference();
            rv =  nfseglib.parse_segfing(parsedImgdata, fpData.getImgData() , fpData.getImgWd(), fpData.getImgHt() , segPtr , fingerCount,1);
            
            if(rv==0)
            {
                Pointer p = parsedImgdata.getValue();
                
                Pointer[] imgPtr = p.getPointerArray(0, fingerCount);
                
                for(int i=0;i<fingerCount;i++)
                {
                    byte[] tmp = new byte[segArray[i].sw*segArray[i].sh];
                    

                    
                    imgPtr[i].read(0, tmp, 0, segArray[i].sw*segArray[i].sh);
                    segments[i].setSegData(tmp);
                    segments[i].setSegDataSz(segArray[i].sw*segArray[i].sh);
                    
                    
                    
                }
                
            }
            
            if(fingerCount>1)
            {
                fpData.setSegments(segments);            
                fpData.setNf(fingerCount);
            }else
            {
                switch(whichFinger)
                {                                
                    case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL:
                        fpData.setSegment(0, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING:
                        fpData.setSegment(1, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE:
                        fpData.setSegment(2, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX:
                        fpData.setSegment(3, segments[0]);	
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB:
                        fpData.setSegment(0, segments[0]);	
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL:
                        fpData.setSegment(3, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING:
                        fpData.setSegment(2, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE:
                        fpData.setSegment(1, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX:
                        fpData.setSegment(0, segments[0]);
                    break;    
                    case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB:
                        fpData.setSegment(1, segments[0]);
                    break;    
                    default:
                    break;    
                }
            }
        }
        
        segListener.setFPData(fpData);
        segListener.segmentationDone();
        
    }
    
    public void run()
    {
        try
        {
            segmentFP();
        }catch(Throwable t)
        {
            segListener.segmentationFailed(t.getMessage());
        }
    }
}
