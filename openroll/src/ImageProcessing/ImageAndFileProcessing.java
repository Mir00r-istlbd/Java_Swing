/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageProcessing;

import com.sun.jna.Pointer;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Maverick
 */
public class ImageAndFileProcessing {
    
    
    public static boolean writeByteArrayToImageFile(byte[] ba,String filePath)
    {
        
        BufferedImage bim=ByteArrayToBufferedImage(ba);
        
        if(bim!=null)
        {
            return writeBufferedImageToFile(bim,filePath);
        }
        else
            return false;
    }
    public static boolean writeByteArrayToImageFile(byte[] ba,String filePath,int width,int height)
    {
        
        BufferedImage bim=ByteArrayToBufferedImage(ba,width,height);
        
        if(bim!=null)
        {
            return writeBufferedImageToFile(bim,filePath);
        }
        else
            return false;
    }
    
    public static boolean writeBufferedImageToFile(BufferedImage image,String filePath)
    {
        try{
        ImageIO.write(image, "BMP",new File(filePath));
        }
        catch(Exception ex)
        {
            System.out.println("Failed to write image to ="+filePath);
            System.out.println("reasons =");
            ex.printStackTrace();
            return false;
        }
        return true;
    
    }
    

    // imageType: "BMP","JPG" etc etc
    public static byte[] BufferedImageToByteArray(BufferedImage img, String imageFormat) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ImageIO.write(img, imageFormat, out);
            byte[] result = out.toByteArray();
            return result;
        } catch (IOException iOException) {
            return null;
        }

    }
    

    public static BufferedImage ByteArrayToBufferedImage(byte[] imgByte) {
        try {
            InputStream in = new ByteArrayInputStream(imgByte);
            return ImageIO.read(in);

        } catch (Exception Exception) {
            return null;
        }
    }
    
    public static BufferedImage ByteArrayToBufferedImage(byte[] temp, int width, int height) {
        try{
        if (temp != null && temp.length > 0) {
            BufferedImage bImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
            DataBuffer dataBuf = bImage.getRaster().getDataBuffer();
            for (int i = 0; i < temp.length - 4; i++) {
                int pix = temp[i] & 0xff | (temp[i + 1] & 0xff) << 8;
                dataBuf.setElem(i, pix);
            }
            return bImage;
            }
        return null;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

    public static String ByteArrayToString(byte[] byteArray) {
        String str = new String(byteArray);
        return str;
    }

    public static boolean createDirectoryIfNeeded(String directoryName) {

        try {
            File theDir = new File(directoryName);
            if (!theDir.exists()) {
                System.out.println("creating directory: " + directoryName);
                return theDir.mkdir();
            }
        } catch (Exception e) {
            return false;
        }

        return true;

    }

    public static ArrayList<String> getAllFileNameInDirectory(String path) {
        ArrayList<String> fileNames=new ArrayList<String>();
        
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0;i < listOfFiles.length;i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getName());
                fileNames.add(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    
    return fileNames;
    }
}
