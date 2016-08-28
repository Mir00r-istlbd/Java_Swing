/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.nfseg;

import com.faisal.tm.CSD550E.CSD200Library;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;

/**
 *
 * @author User
 */
public interface NFSEGLibrary extends StdCallLibrary
{
    public static class SEGMENT extends Structure
    {   
        public SEGMENT()
        {
            super();
        }
        public SEGMENT(Pointer p)
        {
            super(p);            
        }
        
        public static class ByReference extends SEGMENT implements Structure.ByReference {}
        public static class ByVal extends SEGMENT implements Structure.ByValue {}
        
        public int tlx;
        public int tly;
        public int tRightX;
        public int tRightY;
        public int blx;
        public int bly;
        public int brx;
        public int bry;
        public int sx;
        public int sy;
        public int sw;
        public int sh;
        public int nrsw;
        public int nrsh;
        public float theta;
        public int dty;
        public int dby;
        public int dlx;
        public int drx;
        public int err;
    }
    
    public int segment_finger_prints(byte[] idata , int iw , int ih , PointerByReference ofing_boxes , int nf , int fgp , int bthr_adj , int rot_search );
    public int segment_fingers(byte[] idata , int iw , int ih , PointerByReference ofing_boxes , int nf , int fgp , int bthr_adj , int rot);
    public int parse_segfing(PointerByReference parsed_idata, byte[] idata , int iw, int ih , Pointer segRecords , int nf, int rot);
    public void scale_seg_fingers(Pointer fing_boxes, int nf,int w, int h, int zm);
}
