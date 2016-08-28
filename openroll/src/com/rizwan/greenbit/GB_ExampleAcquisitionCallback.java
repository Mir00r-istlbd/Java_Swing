/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizwan.greenbit;

import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_AcquisitionProcessDefines.GBMSAPI_JAVA_AcquisitionEvents;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_ErrorCodesDefines.GBMSAPI_JAVA_ErrorCodes;
import GBMSAPI_JAVA_LibraryFunctions.GBMSAPI_JAVA_AcquisitionEventsManagerCallbackInterface;
import GBMSAPI_JAVA_LibraryFunctions.GBMSAPI_JAVA_DLL_WRAPPER;
import ImageProcessing.ImageAndFileProcessing;
import ImageProcessing.ImageCropping;
import com.faisal.tm.CSD550E.Utils;
import com.faisal.tm.ICaptureObserver;
import com.faisal.tm.data.FPData;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;

//import com.rizwan.greenbit.FingerPrintForm;
//import static com.rizwan.greenbit.FingerPrintForm.FrameIsRe;
/**
 *
 * @author Maverick
 */
public class GB_ExampleAcquisitionCallback implements GBMSAPI_JAVA_AcquisitionEventsManagerCallbackInterface {

    private ICaptureObserver observer = null;

    public GB_ExampleAcquisitionCallback(ICaptureObserver obs) {
        this.observer = obs;
    }

    public int invoke(
            int OccurredEventCode,
            int GetFrameErrorCode,
            int EventInfo,
            Pointer FramePtr,
            int FrameSizeX,
            int FrameSizeY,
            double CurrentFrameRate,
            double NominalFrameRate,
            int GB_Diagnostic,
            Pointer UserDefinedParameters) {
        if (OccurredEventCode == GBMSAPI_JAVA_AcquisitionEvents.GBMSAPI_JAVA_AE_VALID_FRAME_ACQUIRED) {
            if (GB_Diagnostic != 0) {
//		System.out.println("Diagnostic: " + GB_Diagnostic);
                GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_VUI_LED_BlinkDuringAcquisition(1);
                //GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_SetAutoCaptureBlocking(1);
            } else {
                GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_VUI_LED_BlinkDuringAcquisition(0);
                GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_SetAutoCaptureBlocking(0);
            }
            //////////////////////////////////////////////
            // Following contrast calculation shows how
            // the fact that in Java unsigned types don't
            // exist should be treated and the
            // 2-complement calculation for a byte
            //////////////////////////////////////////////
            ByteByReference pContrast = new ByteByReference();
            GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_GetFingerprintContrast(pContrast);
            int Contrast;
            if (pContrast.getValue() >= 0) {
                Contrast = pContrast.getValue();
            } else {
                Contrast = 256 + pContrast.getValue();
            }
            FingerPrintForm.imgSx = FrameSizeX;
            FingerPrintForm.imgSy = FrameSizeY;

            FingerPrintForm.imgFromScanner = FingerPrintForm.getImageFromFramePtr(FramePtr, FrameSizeX, FrameSizeY);
            FingerPrintForm.FrameIsReady = true;

            IntByReference ibr = new IntByReference();
            IntByReference ibr1 = new IntByReference();
            IntByReference ibr2 = new IntByReference();
            IntByReference ibr3 = new IntByReference();

            GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_GetClippingRegionPosition(ibr, ibr1, ibr2, ibr3);

//            System.out.println("^^^^^^^^^^^^^^^ ibr ="+ibr.getValue());
//            System.out.println("^^^^^^^^^^^^^^^ ibr1 ="+ibr1.getValue());
//            System.out.println("^^^^^^^^^^^^^^^ ibr2 ="+ibr2.getValue());
//            System.out.println("^^^^^^^^^^^^^^^ ibr3 ="+ibr3.getValue());            




        } else if (OccurredEventCode == GBMSAPI_JAVA_AcquisitionEvents.GBMSAPI_JAVA_AE_ACQUISITION_END) {

            if (FingerPrintForm.manualClick) {
                System.out.println("I am called forcefully");
                System.out.println("Manual Click Detected ... abort processing");
//                FingerPrintForm.manualClick=false;
                FingerPrintForm.AcquisitionEnded = true;
                FingerPrintForm.manualClick = false;
                return GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_ACQUISITION_THREAD;
            } else {
                System.out.println("I am called automatically");
                FingerPrintForm.manualClick = false;
            }

            System.out.println("Acquisition end!");

            IntByReference ibr = new IntByReference();
            IntByReference ibr1 = new IntByReference();
            IntByReference ibr2 = new IntByReference();
            IntByReference ibr3 = new IntByReference();

            GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_GetClippingRegionPosition(ibr, ibr1, ibr2, ibr3);

            System.out.println("^^^^^^^^^^^^^^^ ibr =" + ibr.getValue());
            System.out.println("^^^^^^^^^^^^^^^ ibr1 =" + ibr1.getValue());
            System.out.println("^^^^^^^^^^^^^^^ ibr2 =" + ibr2.getValue());
            System.out.println("^^^^^^^^^^^^^^^ ibr3 =" + ibr3.getValue());


            GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_ImageFinalization(FramePtr);
            FingerPrintForm.imgSx = FrameSizeX;
            FingerPrintForm.imgSy = FrameSizeY;
            FingerPrintForm.imgFromScanner = FingerPrintForm.getImageFromFramePtr(FramePtr, FrameSizeX, FrameSizeY);


            //UTIL
            FingerPrintForm.imageFileName = "D:/seg/"+System.currentTimeMillis() + "_fp";
            
            byte[] temp = FramePtr.getByteArray(0L, FrameSizeX * FrameSizeY);
            try{
            FileUtils.writeByteArrayToFile(new File(FingerPrintForm.imageFileName+"_raw_w"+FrameSizeX+"h_"+FrameSizeY), temp);
            }
            catch(Exception ex)
            {
                System.out.println("Error Writing to file ...");
                ex.printStackTrace();
            }
            ImageAndFileProcessing.writeBufferedImageToFile(FingerPrintForm.imgFromScanner, FingerPrintForm.imageFileName + "_raw.BMP");
            //UTIL

            FPData fpData = observer.getFPData();

//                        int sz = image.Width*image.Height*(image.BitsPerPixel/8);                                                                                
            byte[] data = FramePtr.getByteArray(0L, FrameSizeX * FrameSizeY);


// START these codes came from csdlibrary for all single flat fingers as segmentation dll was failing to crop them perfectly thus needed to do this manual segmentation                        
            byte[] croppedBytes = null;
            ImageCropping ic = new ImageCropping();


            if (FingerPrintForm.imageType > 22 && FingerPrintForm.imageType < 33) {
                try {
                    croppedBytes = ic.CroppedBytes(data, FrameSizeX, FrameSizeY, 3);
                    //UTIL
                    ImageAndFileProcessing.writeByteArrayToImageFile(croppedBytes, FingerPrintForm.imageFileName + "_cropped.BMP",ic.mxWidth,ic.mxHeight);
                    //UTIL
                } catch (Exception ex) {
                    System.out.println("############## error occured while cropping");
                    ex.printStackTrace();
                }
            }


// END these codes came from csdlibrary for all single flat fingers as segmentation dll was failing to crop them perfectly thus needed to do this manual segmentation                        

            int BitsPerPixel = 8;
            int sz = FrameSizeX * FrameSizeY * (BitsPerPixel / 8);
            BufferedImage bi = Utils.getGrayscale(FrameSizeX, FrameSizeY, data);


            if (FingerPrintForm.imageType < 23 || FingerPrintForm.imageType > 32 || croppedBytes == null) {
                fpData.setImgData(data);
                fpData.setImgSZ(sz);
                fpData.setImgWd(FrameSizeX);
                fpData.setImgHt(FrameSizeY);
            
///*            
            } else {
                if (ic != null && croppedBytes != null) {
                    sz = ic.mxWidth * ic.mxHeight;
                    fpData.setImgData(croppedBytes);
                    fpData.setImgSZ(sz);
                    fpData.setImgWd(ic.mxWidth);
                    fpData.setImgHt(ic.mxHeight);
                }
            }
//*/            

            fpData.setImgBPP(BitsPerPixel);
            fpData.setImgType(observer.getWhichFinger());
            fpData.setNf(observer.getFingerCnt());
            observer.setFPData(fpData);
            observer.setFPImageFinal(bi);
            observer.setCaptureDone();

            FingerPrintForm.FrameIsReady = true;
            FingerPrintForm.AcquisitionEnded = true;
        } else if (OccurredEventCode == GBMSAPI_JAVA_AcquisitionEvents.GBMSAPI_JAVA_AE_ACQUISITION_ERROR) {
            System.out.println("Acquisition error!");
            FingerPrintForm.acquisitionState = FingerPrintForm.scannerError;
        } else if (OccurredEventCode == GBMSAPI_JAVA_AcquisitionEvents.GBMSAPI_JAVA_AE_PREVIEW_PHASE_END) {
            GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_Sound((byte) 12, (byte) 2, (byte) 1);
            FingerPrintForm.acquisitionState = FingerPrintForm.acquisition;
        } else if (OccurredEventCode == GBMSAPI_JAVA_AcquisitionEvents.GBMSAPI_JAVA_AE_SCANNER_STARTED) {
            FingerPrintForm.acquisitionState = FingerPrintForm.preview;
        } else {
            return 0;
        }

        return 1;
    }
}
