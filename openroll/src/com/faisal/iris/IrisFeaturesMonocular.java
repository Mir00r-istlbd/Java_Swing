package com.faisal.iris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.faisal.iris.IrisUtils;
import com.iritech.iddk.standard.*;
import com.istlbd.gui.IrisForm;

public class IrisFeaturesMonocular 
{

    /* The current handle to device, this handle can be initialized by using get_device_handle() */
    public static String g_binDir;
    Iddk2000Apis apis = null;
    
    int error_level = -1;
    
    boolean g_deviceSleep = false;
    boolean g_deviceDeepSleep = false;
    
    int RIGHT_EYE_IDX = 0;
    int LEFT_EYE_IDX = 1;
    
    boolean g_isUsbDevice = true;
    
    private DeviceEventConsumer consumer = null;
    
    private IddkEyeSubtype g_selectEyeMode = new IddkEyeSubtype(IddkEyeSubtype.IDDK_UNKNOWN_EYE);    
    ///private IddkImageFormat imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000);
    private IddkImageFormat imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_RAW);
    private IddkImageKind imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K1);
    private IddkIsoRevision isoRevision = new IddkIsoRevision(IddkIsoRevision.IDDK_IISO_2005);
    
    private int comStd = 0;

    public IrisFeaturesMonocular(DeviceEventConsumer consumer) 
    {
        this.consumer = consumer;
    }

    void reset_error_level(IddkResult result) 
    {
        if (result.getValue() == IddkResult.IDDK_OK) 
        {
            error_level = -1;
            if (g_deviceSleep) 
            {
                g_deviceSleep = false;
            }
            if (g_deviceDeepSleep) 
            {
                g_deviceDeepSleep = false;
            }
        }
    }

    /**
     * ***********************************************************************
     * After each operation, users should clear any current captured iris image
     * so as to protect your iris from other person usage
	************************************************************************
     */
    public void clear_capture() 
    {
        IddkResult iRet = new IddkResult();
        IddkEyeSubtype eyeSubtype = new IddkEyeSubtype(IddkEyeSubtype.IDDK_UNKNOWN_EYE);


        iRet = apis.clearCapture(eyeSubtype);
        if (iRet.getValue() == IddkResult.IDDK_OK) 
        {
            //System.out.print("Clear capture successfully\n");
        } 
        else 
        {
            consumer.updateLabel("Clear capture failed\n");
            handle_error(iRet);
        }
    }

    /**
     * ***********************************************************************
     * /* This function check the quality of the current captured images /*
     * forEnrollment: true if the captured image is for enrollment, otherwise it
     * is for verification/identification. /* isGrayZone: The output parameter
     * that receives true if at least one eye has quality in the grayzone /*
     * numAcceptableEyes: The output parameter to receive the number of iris
     * images that have acceptable qualities /* Return: false if there is no
     * iris image with acceptable quality.
	/************************************************************************
     */
    boolean check_image_quality(boolean forEnrollment, boolean isGrayZone, int numAcceptableEyes) 
    {
        boolean bRet = false;
        ArrayList<IddkIrisQuality> qualities = new ArrayList<IddkIrisQuality>();
        numAcceptableEyes = 0;
        int nBadTotalScore = forEnrollment ? 50 : 30;
        int nBadUsableArea = forEnrollment ? 50 : 30;
        int nGoodTotalScore = 70;
        int nGoodUsableArea = 70;

        IddkResult iRet = apis.getResultQuality(qualities);

        if (iRet.getValue() == IddkResult.IDDK_OK || iRet.getValue() == IddkResult.IDDK_SE_LEFT_FRAME_UNQUALIFIED || iRet.getValue() == IddkResult.IDDK_SE_RIGHT_FRAME_UNQUALIFIED) 
        {
            if (forEnrollment) 
            {
                // at least one eye's quality is in grayzone
                isGrayZone = ((qualities.get(RIGHT_EYE_IDX).getTotalScore() > nBadTotalScore && qualities.get(RIGHT_EYE_IDX).getUsableArea() > nBadUsableArea && (qualities.get(RIGHT_EYE_IDX).getTotalScore() <= nGoodTotalScore || qualities.get(RIGHT_EYE_IDX).getUsableArea() <= nGoodUsableArea)));
            } 
            else 
            {
                //For verification there is no grayzone, just one threshold (30) 
                isGrayZone = false;
            }

            // number of eyes with acceptable quality (not bad)
            if (qualities.get(RIGHT_EYE_IDX).getTotalScore() > nBadTotalScore && qualities.get(RIGHT_EYE_IDX).getUsableArea() > nBadUsableArea) 
            {
                numAcceptableEyes++;
            }

            if (numAcceptableEyes == 0) 
            {
                //Clear all captured iris images in the camera device
                apis.clearCapture(new IddkEyeSubtype(0));
                System.out.print("\nNo captured iris image has acceptable quality for the " + (forEnrollment ? "enrollment" : "matching") + ". Please try to capture your iris(es) again!\n");
                reset_error_level(iRet);
                return false;
            }
        } 
        else 
        {
            reset_error_level(iRet);
            return false;
        }

        bRet = true;
        reset_error_level(iRet);
        return bRet;
    }

    /**
     * *********************************************************************************************
     * This function demonstrates how to access to an attached device. At first,
     * it asks user about the device information such as: USB or UART, Baudrate
     * in case UART is in use. It changes the SDK default config with user
     * inputs by using setSdkConfig. Finally, it opens the attached device to
     * acquire the device handle, g_hDevice. These functions are taken into
     * account: - setSdkConfig - scanDevices - openDevice Note: This function is
     * called only once before user trying to access to device
	***********************************************************************************************
     */
    public void open_device() throws Exception 
    {
        int i = 0;
        IddkConfig config = new IddkConfig();
        IddkResult iRet = new IddkResult(IddkResult.IDDK_OK);
        ArrayList<String> ppDeviceDescs = new ArrayList<String>();

        apis = new Iddk2000Apis();

        /* We should get the current configuration before setting new one */
        iRet = Iddk2000Apis.getSdkConfig(config);
        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            /* Oops ! Something wrong happens */
            handle_error(iRet);
            return;
        }

        config.setCommStd(IddkCommStd.IDDK_COMM_USB);


        /* Set new configuration */
        iRet = Iddk2000Apis.setSdkConfig(config);
        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            consumer.updateLabel("Failed to set new configuration !");
            handle_error(iRet);
        }

        /* Now, we can open device */
        /* If USB, we should scan devices first */

        consumer.updateLabel("\nScan devices ... ");
        iRet = Iddk2000Apis.scanDevices(ppDeviceDescs);
        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            if (iRet.getValue() == IddkResult.IDDK_DEVICE_NOT_FOUND) 
            {
                consumer.updateLabel("No IriTech devices found.");
            }
            handle_error(iRet);

            throw new Exception(iRet.toString());
        }

        consumer.updateLabel(ppDeviceDescs.size() + " devices found !\n");

        for (i = 0; i < ppDeviceDescs.size(); i++) 
        {
            System.out.println("\t" + (i + 1) + ". " + ppDeviceDescs.get(i));
        }

        /* Open the first found device */
        consumer.updateLabel("Open device " + ppDeviceDescs.get(0) + " ... ");

        iRet = apis.openDevice(ppDeviceDescs.get(0));
        if (iRet.getValue() == IddkResult.IDDK_OK) 
        {
            consumer.updateLabel("Done.");
        } 
        else 
        {
            consumer.updateLabel("Failed.");
            throw new Exception(iRet.toString());
        }

        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            handle_error(iRet);
        }

        reset_error_level(iRet);
    }

    /**
     * ******************************************************************************************
     * This function shows example to get the result image from the camera
     * device after it finishes capturing best iris image
	********************************************************************************************
     */
    void get_result_image() 
    {
        /* For result image */
        ArrayList<IddkImage> resultImage = new ArrayList<IddkImage>();
        int nCompressRatio = 1;

        ///IddkImageFormat imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000);
        ///IddkImageKind imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K1);

        IddkImage imageData = new IddkImage();

        /* Other params */
        IddkResult iRet = new IddkResult(IddkResult.IDDK_OK);

        iRet = apis.getResultImage(imageKind, imageFormat, (byte) nCompressRatio, resultImage);

        if (iRet.getValue() != IddkResult.IDDK_OK && iRet.getValue() != IddkResult.IDDK_SE_RIGHT_FRAME_UNQUALIFIED && iRet.getValue() != IddkResult.IDDK_SE_LEFT_FRAME_UNQUALIFIED) 
        {
            /* Oops, no qualified image at all */
            System.out.print("Cannot get result image !\n");
            handle_error(iRet);
        } 
        else 
        {
            if (iRet.getValue() == IddkResult.IDDK_SE_LEFT_FRAME_UNQUALIFIED) 
            {
                consumer.updateLabel("Only right image is qualified.");
            } 
            else if (iRet.getValue() == IddkResult.IDDK_SE_RIGHT_FRAME_UNQUALIFIED) 
            {
                consumer.updateLabel("Only left image is qualified.");
            }

            reset_error_level(iRet);

            IddkEyeSubtype[] eyeSubtype = {new IddkEyeSubtype(1), new IddkEyeSubtype(2)};

            if (resultImage.size() == 1) 
            {
                eyeSubtype[0].setValue(0);
            }

            for (int eyeIdx = 0; eyeIdx < resultImage.size(); eyeIdx++) 
            {
                if (resultImage.get(eyeIdx) != null) 
                {
                    imageData = resultImage.get(eyeIdx);
                    consumer.setImage(g_selectEyeMode.intValue(), imageData);
                }
            }
        }

    }

    /**
     * ******************************************************************************************
     * This function is a helper one. It is used by capturing_process to
     * getResultISOImage after making a capture.
	********************************************************************************************
     */
    void get_result_ISO_image() 
    {
        ///IddkImageFormat imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000);
        ///IddkImageKind imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K1);
        IddkDataBuffer pIsoImage = new IddkDataBuffer();
        ////IddkIsoRevision isoRevision = new IddkIsoRevision(IddkIsoRevision.IDDK_IISO_2005);

        IddkResult iRet = new IddkResult(IddkResult.IDDK_OK);

        int nCompressRatio = 1;

        ///IddkEyeSubtype eyeSubtype = new IddkEyeSubtype(0);
        ///eyeSubtype.setValue(IddkEyeSubtype.IDDK_LEFT_EYE);

        iRet = apis.getResultIsoImage(isoRevision, imageFormat, imageKind, (byte) nCompressRatio, g_selectEyeMode, pIsoImage);

        if (iRet.getValue() == IddkResult.IDDK_OK || (g_selectEyeMode.getValue() == IddkEyeSubtype.IDDK_UNKNOWN_EYE && iRet.getValue() == IddkResult.IDDK_SE_LEFT_FRAME_UNQUALIFIED) || (g_selectEyeMode.getValue() == IddkEyeSubtype.IDDK_UNKNOWN_EYE && iRet.getValue() == IddkResult.IDDK_SE_RIGHT_FRAME_UNQUALIFIED)) 
        {
            consumer.setISOImage(g_selectEyeMode.intValue(), pIsoImage.getData(), pIsoImage.getDataSize());
            consumer.updateLabel("Done.");
            reset_error_level(iRet);
        } 
        else 
        {
            System.out.print("\nCannot get result ISO image !\n");
            handle_error(iRet);
        }


    }

    /**
     * ******************************************************************************************
     * This function demonstrates how to capture user's eyes, get the result
     * image, and save to specified folder. These functions are taken into
     * account: - initCamera - startCapture - getCaptureStatus - getStreamImage
     * - getResultImage - getImageData - getResultIsoImage - deinitCamera
     *
     * @params: - bDefaultParams: set the default params for StartCapture
     * function or not - bMultiple: check whether we want to capture many times
     * or just only once - bProcessResult: after capturing we get result image,
     * so disable this flag to bypass this
	*********************************************************************************************
     */
    void capturing_process(boolean bDefaultParams, boolean bMultiple, boolean bProcessResult) 
    {
        /* For streaming images */
        ArrayList<IddkImage> images = new ArrayList<IddkImage>();

        /* Parameters for capturing */
        IddkCaptureMode captureMode = new IddkCaptureMode(IddkCaptureMode.IDDK_TIMEBASED);
        IddkQualityMode qualityMode = new IddkQualityMode(IddkQualityMode.IDDK_QUALITY_NORMAL);
        boolean bAutoLeds = true;
        IddkInteger iCount = new IddkInteger(3);
        IddkEyeSubtype eyeSubtype = new IddkEyeSubtype(0);

        /* Other params */
        IddkResult iRet = new IddkResult(IddkResult.IDDK_OK);

        IddkCaptureStatus captureStatus = new IddkCaptureStatus(IddkCaptureStatus.IDDK_IDLE);

        boolean bRun = true;
        IddkInteger imageWidth = new IddkInteger();
        IddkInteger imageHeight = new IddkInteger();
        int i = 0;
        boolean eyeDetected = false;

        int times = 0;
        IddkDeviceConfig devConfig = new IddkDeviceConfig();

        ArrayList<IddkIrisQuality> qualities = new ArrayList<IddkIrisQuality>();

        /* We have to init camera first */
        consumer.updateLabel("Initializing Camera");
        
        try
        {
        
        iRet = apis.initCamera(imageWidth, imageHeight);

        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            System.out.print("\nFailed to initialize camera\n");
            consumer.updateLabel("Failed to initialize camera");
            handle_error(iRet);
            return;
        }


        /* Init variables in inner loop */
        i = 0;
        bRun = true;
        eyeDetected = false;
        times++;
        IrisUtils.prepare_param_for_capturing(captureMode, qualityMode, iCount, null);
        bAutoLeds = true;


        iRet = apis.getDeviceConfig(devConfig);


        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            handle_error(iRet);
            apis.deinitCamera();
            apis=null;
            reset_error_level(iRet);
            return;
        }

        reset_error_level(iRet);

        /* Now, we capture user's eyes */
        consumer.updateLabel("Put your eyes in front of the camera");
        /* Note that streamFormat and nCompressRatio just work with UART in StartCapture */
        iRet = apis.startCapture(captureMode, iCount.getValue(), qualityMode, new IddkCaptureOperationMode(IddkCaptureOperationMode.IDDK_AUTO_CAPTURE), eyeSubtype, bAutoLeds, null);
        /* If you want to use captureProc, use this code instead  */

        /*CaptureProc captureProc = new CaptureProc();
         iRet = apis.startCapture(captureMode, iCount.getValue(), qualityMode, new IddkCaptureOperationMode(IddkCaptureOperationMode.IDDK_AUTO_CAPTURE), eyeSubtype, bAutoLeds, captureProc);*/

        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            /* Remember to deinit camera */
            handle_error(iRet);
            apis.deinitCamera();
            apis=null;
            return;
        }

        /*	Start a loop to check the device status.
         (You can use CaptureProc instead of this while loop).
         */
        consumer.updateLabel("Scanning for eyes");

        while (bRun) 
        {
            if (devConfig.isEnableStream()) 
            {
                iRet = apis.getStreamImage(images, captureStatus);

                if (iRet.getValue() == IddkResult.IDDK_OK) 
                {
                    for (int eyeIdx = 0; eyeIdx < images.size(); eyeIdx++) 
                    {
                        if (images.get(eyeIdx) != null) 
                        {
                            consumer.setImage(g_selectEyeMode.intValue(), images.get(eyeIdx));
                        }
                    }

                } 
                else if (iRet.getValue() == IddkResult.IDDK_SE_NO_FRAME_AVAILABLE) 
                {                    
                    iRet = apis.getCaptureStatus(captureStatus);
                }
            } 
            else 
            {
                iRet = apis.getCaptureStatus(captureStatus);
            }
            
            /* If GetStreamImage and GetCaptureStatus cause no error, process the capture status.*/
            if (iRet.getValue() == IddkResult.IDDK_OK) 
            {
                if (captureStatus.getValue() == IddkCaptureStatus.IDDK_CAPTURING) 
                {
                    /* Do something when camera detects your eye */
                    if (!eyeDetected) 
                    {
                        consumer.updateLabel("Eye detected");
                        eyeDetected = true;
                    }
                } 
                else if (captureStatus.getValue() == IddkCaptureStatus.IDDK_COMPLETE) 
                {
                    /* capture has finished */
                    bRun = false;
                } 
                else if (captureStatus.getValue() == IddkCaptureStatus.IDDK_ABORT) 
                {
                    /* capture has been aborted */
                    consumer.updateLabel("Capture aborted.");
                    bRun = false;
                } 
                else 
                {
                    
                    /* We set up a counter to break the loop if user doesn't place the eyes in front of the camera */
                    i++;
                    if (i > 300) 
                    {
                        bRun = false;
                        System.out.print("\n\tOops! No eyes detected for so long. Abort the current capture.\n");
                    }
                }

                if (!devConfig.isEnableStream()) 
                {                    
                    try 
                    {
                        Thread.sleep(60);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
            } 
            else 
            {
                /* handle error and terminate this capture */
                bRun = false;
            }
        }

        /* Try to stop capturing for sure even though it might be stopped */
        iRet = apis.stopCapture();

        if (iRet.getValue() != IddkResult.IDDK_OK) 
        {
            handle_error(iRet);
            apis.deinitCamera();
            apis=null;
            reset_error_level(iRet);
            return;
        }

        iRet = apis.getResultQuality(qualities);
        if (iRet.getValue() == IddkResult.IDDK_OK || iRet.getValue() == IddkResult.IDDK_SE_RIGHT_FRAME_UNQUALIFIED || iRet.getValue() == IddkResult.IDDK_SE_LEFT_FRAME_UNQUALIFIED) 
        {

            if (qualities.size() == 1) 
            {
                if (qualities.get(0) != null) 
                {
//                    System.out.print("Quality of the current captured image:\n");
//                    System.out.print("Total score: " + qualities.get(0).getTotalScore() + "\n");
//                    System.out.print("Usable area: " + qualities.get(0).getUsableArea() + "\n");
                    
                    byte scre = qualities.get(0).getTotalScore();
                    byte usea = qualities.get(0).getUsableArea();
                    
                    IrisForm.inp_capture_score.setText(Byte.toString(scre));
                    IrisForm.inp_capture_ua.setText(Byte.toString(usea));
                    
                }
            }

        } 
        else 
        {
            handle_error(iRet);
            apis.deinitCamera();
            apis=null;
            reset_error_level(iRet);
            return;
        }

        if (bProcessResult && (captureStatus.getValue() == IddkCaptureStatus.IDDK_COMPLETE)) 
        {
            get_result_image();
            get_result_ISO_image();
            get_result_template();
        }

        /* iris_recognition calls, we break the loop */
        }finally
        {
            if(apis!=null)
            {
                try{apis.deinitCamera();}catch(Exception exc){}
            }
        }
                
    }

    /**
     * ******************************************************************************************
     * This function is a helper one. It is used by iris_recognition to
     * getResultTemplate after making a capture.
	********************************************************************************************
     */
    void get_result_template() {
        IddkResult iRet = new IddkResult(IddkResult.IDDK_OK);
        IddkCaptureStatus captureStatus = new IddkCaptureStatus(IddkCaptureStatus.IDDK_IDLE);
        IddkDataBuffer pTemplate = new IddkDataBuffer();


        /* We check the camera status */
        iRet = apis.getCaptureStatus(captureStatus);

        if (iRet.getValue() == IddkResult.IDDK_OK
                || iRet.getValue() == IddkResult.IDDK_SE_LEFT_FRAME_UNQUALIFIED
                || iRet.getValue() == IddkResult.IDDK_SE_RIGHT_FRAME_UNQUALIFIED) {
            reset_error_level(iRet);
            if (captureStatus.getValue() == IddkCaptureStatus.IDDK_COMPLETE) {
                /* Do main job here */
                consumer.updateLabel("Get result template ...");

                iRet = apis.getResultTemplate(pTemplate);

                if (iRet.getValue() == IddkResult.IDDK_OK) {
                    consumer.setTemplate(g_selectEyeMode.intValue(), pTemplate.getData(), pTemplate.getDataSize());
                    consumer.updateLabel("Complete");
                } else {
                    handle_error(iRet);
                }
            } else {
                consumer.updateLabel("No iris image is captured. Start a capture first!");
            }
        } else {
            /* It is abnormal here */
            handle_error(iRet);
        }
    }

    /**
     * *****************************************************************************************
     * This function just finalizes device in a safe way. It supports other
     * functions in this sample code. 
	*******************************************************************************************
     */
    public void finalize_device() {
        IddkResult iRet = new IddkResult(IddkResult.IDDK_OK);

        consumer.updateLabel("Close device ... ");
        if ((apis.closeDevice()).getValue() == IddkResult.IDDK_OK) {
            consumer.updateLabel("Done");
        } else {
            consumer.updateLabel("Failed");
            handle_error(iRet);
//            System.exit(IrisUtils.ERROR);
        }
    }

    public void handle_error(IddkResult error) {
        consumer.updateLabel(error.toString());

        System.out.println(error.toString());
    }

    public int getComStd() {
        return comStd;
    }

    public void setComStd(int comStd) {
        if (comStd == 1) {
            this.g_isUsbDevice = true;
        } else if (comStd == 2) {
            this.g_isUsbDevice = false;
        }

    }

    public IddkImageFormat getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(int imageFormat) {
        switch (imageFormat) {
            case 1:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_RAW);
                break;
            case 2:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_JPEG);
                break;
            case 3:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000);
                break;
            case 4:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_PNG);
                break;
            case 5:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_IRITECH_RAW);
                break;
            case 6:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_IRITECH_JPEG2000);
                break;
            default:
                this.imageFormat = new IddkImageFormat(IddkImageFormat.IDDK_IFORMAT_MONO_JPEG2000);
                break;
        }
    }

    public IddkImageKind getImageKind() {
        return imageKind;
    }

    public void setImageKind(int imgKind) {

        switch (imgKind) {
            case 1:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K1);
                break;
            case 2:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K2);
                break;
            case 3:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K3);
                break;
            case 4:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K7);
                break;
            case 5:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K7_1_5);
                break;
            case 6:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K7_2_5);
                break;
            case 7:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K7_3_5);
                break;
            case 8:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_K7_5_0);
                break;
            default:
                imageKind = new IddkImageKind(IddkImageKind.IDDK_IKIND_UNKNOWN);
                break;
        }

    }

    public IddkIsoRevision getIsoRevision() {
        return isoRevision;
    }

    public void setIsoRevision(int isoRev) {
        switch (isoRev) {
            case 1:
                isoRevision = new IddkIsoRevision(IddkIsoRevision.IDDK_IISO_UNKNOWN);
                break;
            case 2:
                isoRevision = new IddkIsoRevision(IddkIsoRevision.IDDK_IISO_2005);
                break;
            case 3:
                isoRevision = new IddkIsoRevision(IddkIsoRevision.IDDK_IISO_2011);
                break;
            default:
                isoRevision = new IddkIsoRevision(IddkIsoRevision.IDDK_IISO_2005);
                break;
        }

    }

    public IddkEyeSubtype getWhichEye() {
        return g_selectEyeMode;
    }

    public void setWhichEye(int whichEye) {
        switch (whichEye) {
            case 1:
                this.g_selectEyeMode = new IddkEyeSubtype(IddkEyeSubtype.IDDK_UNKNOWN_EYE);
                break;
            case 2:
                this.g_selectEyeMode = new IddkEyeSubtype(IddkEyeSubtype.IDDK_RIGHT_EYE);
                break;
            case 3:
                this.g_selectEyeMode = new IddkEyeSubtype(IddkEyeSubtype.IDDK_LEFT_EYE);
                break;
            case 4:
                this.g_selectEyeMode = new IddkEyeSubtype(IddkEyeSubtype.IDDK_BOTH_EYE);
                break;
            default:
                this.g_selectEyeMode = new IddkEyeSubtype(IddkEyeSubtype.IDDK_UNKNOWN_EYE);
                break;
        }
    }
}
