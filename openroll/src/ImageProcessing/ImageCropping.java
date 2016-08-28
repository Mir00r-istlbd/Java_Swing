/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageProcessing;

import java.awt.Panel;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.color.*;
import java.awt.image.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maverick
 */
public class ImageCropping {

    public int row;
    public int col;
    private int[][] mmap;
    private int[][] cmmap;
    private int[][] pxls;
    private int x1, y1, x2, y2;
    public int mxHeight, mxWidth;


    public ImageCropping() {
    }

    public int[] CroppedImage(byte[] data, int w, int h) 
    {
        
        
        
        //row = 750;
        //col = 800;        
        int fill_radius=8;
        row = h;
        col = w;
        mmap = new int[row][col];
        cmmap = new int[row][col];
        pxls = new int[row][col];

        try {gridInitialization(data, col, row);} 
        catch (Exception ex) {Logger.getLogger(ImageCropping.class.getName()).log(Level.SEVERE, null, ex);}

        gridfilling(fill_radius);
        Width_cropping();        
        Height_cropping();

        try {return saveCroppedBMP(mxWidth, mxHeight);} catch (Exception ex) {return null;}
    }
    public byte[] CroppedBytes(byte[] data, int w, int h,int fr) 
    {
        //row = 750;
        //col = 800;        
        int fill_radius=fr;
        row = h;
        col = w;
        mmap = new int[row][col];
        cmmap = new int[row][col];
        pxls = new int[row][col];

        try {gridInitialization(data, col, row);} 
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        
        gridfilling(fill_radius);
        Width_cropping();        
        Height_cropping();

        try {return croppedBytes(mxWidth, mxHeight,data);} catch (Exception ex) {return null;}
    }

    /**
     * Initializing the grid
     * 
     */
    private void gridInitialization(byte[] data, int w, int h) throws Exception 
    {
        // BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_GRAY);
        int[] pixels = new int[w * h];
        String tmpS;
        int ri = 0, cj = 0;

        for (int i = 0; i < data.length; i++) 
        {
            pixels[i] = (0xFF000000 | (data[i] & 0xFF));            
            tmpS = Integer.toHexString(pixels[i]);            
            try 
            {
                mmap[ri][cj] = (tmpS.equals("ff0000ff")) ? 0 : 1;
                pxls[ri][cj] = pixels[i];
                cj++;
            } catch (Exception e) {

                System.out.println("Array Index out of bound:" + ri + " " + cj);
            }

            if (cj >= w) {
                cj = 0;
                ri++;
            }

        }
    }

// filling up the dummy grid cmmap, taking reference from original grid mmap to markout the zone to be cropped
    
    
    private void gridfilling(int bound) {
        int i, j;
        int k, m;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (mmap[i][j] == 1) {
                    for (k = i - bound; k <= i + bound; k++) {
                        if (k >= 0 && k < row) {
                            for (m = j - bound; m <= j + bound; m++) {
                                if (m >= 0 && m < col) {
                                    cmmap[k][m] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private void Width_cropping() {
        int maxWidth = 0;
        int mxX1 = 0, mxX2 = 0;
        int tmpX1 = 0, tmpX2 = 0;
        int count;
        int i, j;

        for (i = 0; i < row; i++) {
            count = 0;
            for (j = 0; j < col; j++) {
                if (cmmap[i][j] == 1) {
                    if (count == 0) {
                        tmpX1 = j;
                        tmpX2 = j;
                    }
                    count++;

                    if (j == col - 1) {
                        if (count > maxWidth) {
                            mxX1 = tmpX1;
                            mxX2 = j;
                            maxWidth = count;
                            count = 0;
                        }
                    }

                } else {
                    if (count > maxWidth) {
                        mxX1 = tmpX1;
                        mxX2 = j - 1;
                        maxWidth = count;
                        count = 0;
                    } else {
                        //tmpX1=j;
                        count = 0;
                    }
                }
            }
        }

        //System.out.println("Left X=" + mxX1 + " Right X=" + mxX2 + " Max Width=" + maxWidth);
        x1 = mxX1;
        x2 = mxX2;
        mxWidth = maxWidth;

    }

    private void Height_cropping() {
        int maxHeight = 0;
        int mxY1 = 0, mxY2 = 0;
        int tmpY1 = 0, tmpY2 = 0;
        int count;
        int i, j;

        for (i = 0; i < col; i++) {
            count = 0;
            for (j = 0; j < row; j++) {
                if (cmmap[j][i] == 1) {
                    if (count == 0) {
                        tmpY1 = j;
                        tmpY2 = j;
                    }
                    count++;

                    if (j == row - 1) {
                        if (count > maxHeight) {
                            mxY1 = tmpY1;
                            mxY2 = j;
                            maxHeight = count;
                            count = 0;
                        }
                    }

                } else {
                    if (count > maxHeight) {
                        mxY1 = tmpY1;
                        mxY2 = j - 1;
                        maxHeight = count;
                        count = 0;
                    } else {
                        count = 0;

                    }
                }
            }
        }

        //System.out.println("Top Y=" + mxY1 + " Bottom Y=" + mxY2 + " Max Height=" + maxHeight);
        y1 = mxY1;
        y2 = mxY2;
        mxHeight = maxHeight;
    }

    private int[] saveCroppedBMP(int w, int h) throws Exception {
        //BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_GRAY);
        int[] pixels = new int[w * h];
        int ri = 0, cj = 0;
        int index = 0;

        for (ri = y1; ri <= y2; ri++) {
            for (cj = x1; cj <= x2; cj++) {
                pixels[index++] = pxls[ri][cj];
            }
        }
        
        //bi.getRaster().setPixels(0, 0, w, h, pixels);
        //ImageIO.write(bi, "bmp", new File(file));
        return pixels;

    }
    
    private byte[] croppedBytes(int w, int h,byte[] data) throws Exception {
        //BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_GRAY);
        byte[] bytes = new byte[w * h];
        int ri = 0, cj = 0;
        int index = 0;

        for (ri = y1; ri <= y2; ri++) {
            for (cj = x1; cj <= x2; cj++) {
                bytes[index++] = data[(ri*col)+cj];
            }
        }
        
        //bi.getRaster().setPixels(0, 0, w, h, pixels);
        //ImageIO.write(bi, "bmp", new File(file));
        return bytes;

    }
    
    

}

