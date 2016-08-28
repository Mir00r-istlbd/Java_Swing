/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wsq.wrapper;


import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;

/**
 *
 * @author Maverick
 */

public interface WSQLibrary extends StdCallLibrary
{
    public int wsq_encode(PointerByReference odata,IntByReference olen,float r_bitrate,ByteByReference idata,int w, int h, int d,int ppi, String comment); ///unsigned char **odata, int *olen, const float r_bitrate,unsigned char *idata, const int w, const int h,const int d, const int ppi, char *comment_text
}
