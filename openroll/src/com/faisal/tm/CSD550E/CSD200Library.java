/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.CSD550E;

import com.faisal.tm.FPView;
import com.faisal.tm.ICaptureObserver;
import com.faisal.tm.MyCanvas;
import com.faisal.tm.SegmentFingerprint;
import com.faisal.tm.data.FPData;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;
import java.awt.image.BufferedImage;
import java.io.File;



import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public interface CSD200Library extends StdCallLibrary
{
 
    /*===============================API====================================*/    
    public int CG4_Main_GetConnectedScanner(IntByReference scannerExist);    
    public int CG4_Main_GetAPIVersion(CG4ApiVersion.ByReference info);    
    public int CG4_Main_GetRunningInfo(CG4RunningInfo.ByReference info);    
    public int CG4_Main_Initialize(int ScannerType);    
    public int CG4_Main_DeInitialize();    
    public int CG4_Main_FastStartup(int ScannerType);    
    public int CG4_Main_StandBy();    
    public int CG4_Main_GetDeviceInfo(CG4PropertyInfo.ByReference info);    
    public int CG4_Capture_SetMode(int imageType, int imageResolution, byte AutoCapture, byte AutoContrast, IntByReference resultWidth, IntByReference resultHeight, IntByReference baseResolutionX, IntByReference baseResolutionY);    
    public int CG4_Capture_Start(int numberOfObjects, byte AutoAcquireResultImage);    
    public int CG4_Capture_Abort();    
    public int CG4_Capture_TakeResultImage();    
    public int CG4_Capture_AcquireResultImage();    
    public int CG4_Capture_OptimizeContrast();    
    public int CG4_Controls_SetStateLEDs(int CapTypeApi, ByteByReference StateLEDs);    
    public int CG4_Controls_SetLEDs(int ledType, int ledValue);    
    public int CG4_Controls_GetLEDs(int ledType, IntByReference ledValue);    
    public int CG4_Controls_Beeper(int BeepMode);    
    public int CG4_Capture_SetCaptureOK();    
    public int CG4_Capture_SetStartRollingFlag(byte flag);    
    public int CG4_Capture_GetRollParameters(CgRollParameters.ByReference para);    
    public int CG4_Capture_SetRollParameters(CgRollParameters para);    
    public int CG4_Capture_Calibration();    
    public int CG4_Controls_RegisterFootSwitchInfo(Pointer hWnd, int Msg);    
    
    public int CG4_Capture_RegisterCallbackPreviewImage(ICG4_CallbackPreviewImage callback, Pointer Context);    
    public int CG4_Capture_RegisterCallbackResultImage(ICG4_CallbackResultImage callback, Pointer Context);    
    
    public int CG4_Capture_RegisterCallbackTakingResultImage(ICG4_CallbackTakingResultImage callback, Pointer Context);        
    public int CG4_Capture_RegisterCallbackFootSwitch(ICG4_CallbackResultImage callback, Pointer Context);    
    public int CG4_Capture_RegisterCallbackKeypad(ICG4_CallbackResultImage callback,Pointer Context);    
    public int CG4_Capture_RegisterCallbackObjectQuality(ICG4_CallbackObjectQuality callback, Pointer Context);    
    public int CG4_Capture_RegisterCallbackDeviceIsConnected(ICG4_CallbackDeviceIsConnected callback, Pointer Context);    
    
    public int CG4_Capture_GetImageMask(ByteByReference pImageMask);    
    public int CG4_Capture_SetAutoCapInfo(CG4AutoCapInfo para);    
    public int CG4_Capture_SetAutoCapArea(byte bAutoCapArea, int xPos, int yPos, int width, int height);    
    public int CG4_Capture_SetAutoCapFinMask(int nFinMask);    
    
    public int CG4_M_Main_GetConnectedScanner(CG4MScannerExist.ByReference scannerExist);    
    public int CG4_M_Main_GetAPIVersion(CG4ApiVersion.ByReference info);    
    public int CG4_M_Main_GetRunningInfo(int handle, CG4RunningInfo.ByReference info);   
    public int CG4_M_Main_Initialize(int deviceIndex, IntByReference handle);    
    public int CG4_M_Main_DeInitialize(int handle);    
    public int CG4_M_Main_DeInitializeAll();    
    public int CG4_M_Main_IsInitialized(int handle);    
    public int CG4_M_Main_GetDeviceInfo(int handle, CG4PropertyInfo.ByReference info);    
    public int CG4_M_Capture_SetMode(int handle, int imageType, int imageResolution, byte AutoCapture, byte AutoContrast, IntByReference resultWidth, IntByReference resultHeight, IntByReference baseResolutionX, IntByReference baseResolutionY);    
    public int CG4_M_Capture_Start(int handle, int numberOfObjects, byte AutoAcquireResultImage);    
    public int CG4_M_Capture_Abort(int handle);    
    public int CG4_M_Capture_TakeResultImage(int handle);    
    public int CG4_M_Capture_AcquireResultImage(int handle);    
    public int CG4_M_Controls_SetStateLEDs(int handle, int CapTypeApi, ByteByReference StateLEDs);    
    public int CG4_M_Controls_SetLEDs(int handle, int ledType, int ledValue);    
    public int CG4_M_Controls_GetLEDs(int handle, int ledType, IntByReference ledValue);    
    public int CG4_M_Controls_Beeper(int handle, int BeepMode);    
    public int CG4_M_Capture_SetCaptureOK(int handle);    
    public int CG4_M_Capture_SetStartRollingFlag(int handle, byte flag);    
    public int CG4_M_Capture_GetRollParameters(int handle, CgRollParameters.ByReference para);    
    public int CG4_M_Capture_SetRollParameters(int handle, CgRollParameters para);    
    public int CG4_M_Capture_Calibration(int handle);    
    public int CG4_M_Controls_RegisterFootSwitchInfo(int handle, Pointer hWnd, int Msg);   
    
    public int CG4_M_Capture_RegisterCallbackPreviewImage(int handle, ICG4_CallbackPreviewImage callback, Pointer Context);    
    public int CG4_M_Capture_RegisterCallbackResultImage(int handle, ICG4_CallbackResultImage callback, Pointer Context);    
    
    public int CG4_M_Capture_RegisterCallbackTakingResultImage(int handle, ICG4_CallbackTakingResultImage callback, Pointer Context);        
    public int CG4_M_Capture_RegisterCallbackFootSwitch(int handle, ICG4_CallbackFootSwitch callback, Pointer Context);    
    public int CG4_M_Capture_RegisterCallbackKeypad(int handle, ICG4_CallbackKeypad callback, Pointer Context);    
    public int CG4_M_Capture_RegisterCallbackObjectQuality(int handle, ICG4_CallbackObjectQuality callback, Pointer Context);    
    public int CG4_M_Capture_RegisterCallbackDeviceIsConnected(int handle, ICG4_CallbackDeviceIsConnected callback, Pointer Context);    
    
    public int CG4_M_Capture_GetImageMask(int handle, ByteByReference pImageMask);   
    public int CG4_M_Capture_SetAutoCapInfo(int handle, CG4AutoCapInfo para);    
    public int CG4_M_Capture_SetAutoCapArea(int handle, byte bAutoCapArea, int xPos, int yPos, int width, int height);    
    public int CG4_M_Capture_SetAutoCapFinMask(int handle, int nFinMask);
    
    /*======================================================================*/
    
    /*================================ENUMS=================================*/
    public interface CG4ImageResolution 
    {
        final int CG4_IMAGE_RESOLUTION_500=500;
        final int CG4_IMAGE_RESOLUTION_1000=1000;        
    }
    
    public interface CG4ImageType 
    {
        final int CG4_ROLL_SINGLE_FINGER=0;
        final int CG4_FLAT_SINGLE_FINGER=1;
        final int CG4_FLAT_RIGHT_FINGERS=2;
        final int CG4_FLAT_LEFT_FINGERS=3;
        final int CG4_FLAT_TWO_THUMBS=4;
        final int CG4_ROLL_RIGHT_THUMB=5;
        final int CG4_ROLL_LEFT_THUMB=6;
        final int CG4_PALM_RIGHT_FULL=7;
        final int CG4_PALM_RIGHT_WRITERS=8;
        final int CG4_PALM_RIGHT_LOWER=9;
        final int CG4_PALM_RIGHT_UPPER=10;
        final int CG4_PALM_LEFT_FULL=11;
        final int CG4_PALM_LEFT_WRITERS=12;
        final int CG4_PALM_LEFT_LOWER=13;
        final int CG4_PALM_LEFT_UPPER=14;
        final int CG4_ROLL_RIGHT_INDEX=15;
        final int CG4_ROLL_RIGHT_MIDDLE=16;
        final int CG4_ROLL_RIGHT_RING=17;
        final int CG4_ROLL_RIGHT_SMALL=18;
        final int CG4_ROLL_LEFT_INDEX=19;
        final int CG4_ROLL_LEFT_MIDDLE=20;
        final int CG4_ROLL_LEFT_RING=21;
        final int CG4_ROLL_LEFT_SMALL=22;
        final int CG4_FLAT_RIGHT_THUMB=23;
        final int CG4_FLAT_RIGHT_INDEX=24;
        final int CG4_FLAT_RIGHT_MIDDLE=25;
        final int CG4_FLAT_RIGHT_RING=26;
        final int CG4_FLAT_RIGHT_SMALL=27;
        final int CG4_FLAT_LEFT_THUMB=28;
        final int CG4_FLAT_LEFT_INDEX=29;
        final int CG4_FLAT_LEFT_MIDDLE=30;
        final int CG4_FLAT_LEFT_RING=31;
        final int CG4_FLAT_LEFT_SMALL=32;
        final int CG4_TYPE_NONE=33;
    }
    
    public interface CG4KeypadType 
    {
        final int CG4_KEYPAD_C_KEYS=0;
        final int CG4_KEYPAD_D_KEYS=1;
        final int CG4_KEYPAD_NONE=2;
    }
    
    public interface CG4LedType 
    {
        final int CG4_LED_FINGER=0;
        final int CG4_LED_STATUS=1;
        final int CG4_LED_EXTEND=2;
        final int CG4_LED_NONE=3;
    }
    
    public interface CG4ObjectCountState 
    {
        final int CG4_OBJECT_COUNT_OK=0;
        final int CG4_TOO_MANY_OBJECTS=1;
        final int CG4_TOO_FEW_OBJECTS=2;
    }
    
    public interface CG4ObjectQualityState 
    {
        final int CG4_OBJECT_NOT_PRESENT=0;
        final int CG4_OBJECT_GOOD=1;
        final int CG4_OBJECT_TOO_LIGHT=2;
        final int CG4_OBJECT_TOO_DARK=3;
        final int CG4_OBJECT_BAD_SHAPE=4;
        final int CG4_OBJECT_POSITION_NOT_OK=5;
        final int CG4_OBJECT_POSITION_TOO_LEFT=6;
        final int CG4_OBJECT_POSITION_TOO_RIGHT=7;
        final int CG4_OBJECT_CORE_NOT_PRESENT=8;
        final int CG4_OBJECT_TRACKING_NOT_OK=9;
    }
    
    public interface CG4ScannerType 
    {
        final int CG4_SCANNER_NULL = -1;
        final int CG4_SCANNER_ONE_FINGER=300;
        final int CG4_SCANNER_CSD301=301;
        final int CG4_SCANNER_CSD330 = 302;
        final int CG4_SCANNER_CSD200 = 303;
        final int CG4_SCANNER_CSD100 = 304;
        final int CG4_SCANNER_CSD301L = 305;
        final int CG4_SCANNER_CSD301B = 306;
        final int CG4_SCANNER_TWO_FINGER = 400;
        final int CG4_SCANNER_CSD450 = 401;
        final int CG4_SCANNER_CSD450K = 402;
        final int CG4_SCANNER_FOUR_FINGER = 500;
        final int CG4_SCANNER_CS500I = 501;
        final int CG4_SCANNER_CS500E = 502;
        final int CG4_SCANNER_CS1000E = 503;
        final int CG4_SCANNER_PALM = 600;
        final int CG4_SCANNER_CS500P = 601;
        final int CG4_SCANNER_CS1000P = 602;
        final int CG4_SCANNER_PENDING = 800;
        final int CG4_SCANNER_CS801B = 801;
        
    }
    
    public interface ImageFormat 
    {
        final int IMG_FORMAT_GRAY=0;
        final int IMG_FORMAT_RGB24=1;
        final int IMG_FORMAT_RGB32=2;
    }
    
    public interface ReturnCodes 
    {
        final int CG4_ERR_MOSAIC_TooManyDefectedLines=-841;
        final int CG4_ERR_MOSAIC_Saturated=-840;
        final int CG4_ERR_MOSAIC_FingerIsLeaving = -839;
        final int CG4_ERR_MOSAIC_DirtySensorWindow1 = -838;
        final int CG4_ERR_MOSAIC_WetFinger = -837;
        final int CG4_ERR_MOSAIC_DryFinger = -836;
        final int CG4_ERR_MOSAIC_MosaickedImageQualityTooLow = -835;
        final int CG4_ERR_MOSAIC_MosaickedImageCenterTooHigh = -834;
        final int CG4_ERR_MOSAIC_MosaickedImageCenterTooLow = -833;
        final int CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmallEarlyAbort = -832;
        final int CG4_ERR_MOSAIC_MosaickedForeGoundHeightTooSmall = -831;
        final int CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmall = -830;
        final int CG4_ERR_MOSAIC_MosaickedImageForeGoundTooSmall = -829;
        final int CG4_ERR_MOSAIC_Sliding = -828;
        final int CG4_ERR_MOSAIC_RollBack = -827;
        final int CG4_ERR_MOSAIC_TooSlow = -826;
        final int CG4_ERR_MOSAIC_TooFast = -825;
        final int CG4_ERR_MOSAIC_SmallVar = -824;
        final int CG4_ERR_MOSAIC_SmallDynamicRange = -823;
        final int CG4_ERR_MOSAIC_TooDark = -822;
        final int CG4_ERR_MOSAIC_TooWhite = -821;
        final int CG4_ERR_MOSAIC_LowBrightness = -820;
        final int CG4_ERR_MOSAIC_LowExplosure = -819;
        final int CG4_ERR_MOSAIC_LowContrast = -818;
        final int CG4_ERR_MOSAIC_DirtySensorWindow = -817;
        final int CG4_ERR_MOSAIC_CannotOpenCaptureDevice = -816;
        final int CG4_ERR_MOSAIC_CannotReadImageData = -815;
        final int CG4_ERR_MOSAIC_CannotOpenImageFile = -814;
        final int CG4_ERR_MOSAIC_CannotOpenFile = -813;
        final int CG4_ERR_MOSAIC_CannotAllocateMemory = -812;
        final int CG4_ERR_MOSAIC_InvalidInputPointer = -811;
        final int CG4_ERR_MOSAIC_InvalidInputParameters9 = -810;
        final int CG4_ERR_MOSAIC_InvalidInputParameters8 = -809;
        final int CG4_ERR_MOSAIC_InvalidInputParameters7 = -808;
        final int CG4_ERR_MOSAIC_InvalidInputParameters6 = -807;
        final int CG4_ERR_MOSAIC_InvalidInputParameters5 = -806;
        final int CG4_ERR_MOSAIC_InvalidInputParameters4 = -805;
        final int CG4_ERR_MOSAIC_InvalidInputParameters3 = -804;
        final int CG4_ERR_MOSAIC_InvalidInputParameters2 = -803;
        final int CG4_ERR_MOSAIC_InvalidInputParameters1 = -802;
        final int CG4_ERR_MOSAIC_InvalidInputParameters = -801;
        final int CG4_MOSAIC_ERR = -800;
        final int CG4_ERR_USB_VERSION_NO_SUPPORT = -629;
        final int CG4_ERR_SETUP_DI_ENUM_DEVICE_INFO = -628;
        final int CG4_ERR_SET_EXPOSURE_FAILED = -627;
        final int CG4_ERR_SET_VIDEO_PROP = -626;
        final int CG4_ERR_STUFF_AND_RUN_STREAM = -625;
        final int CG4_ERR_STILL_INFORMATION_SET = -624;
        final int CG4_ERR_CONTROL_STREAM = -623;
        final int CG4_ERR_CAPTURE_PALMMOVING = -622;
        final int CG4_ERR_NOT_CAPTURING = -621;
        final int CG4_ERR_AUTO_CAP_AREA_INFO = -620;
        final int CG4_ERR_HANDLE_NOT_MATCH = -619;
        final int CG4_ERR_HANDLE_INVALID = -618;
        final int CG4_ERR_DEVICE_EXCEED_MAX = -617;
        final int CG4_ERR_DEVICE_NO_SUPPORT = -616;
        final int CG4_ERR_IS_CAPTUREING = -615;
        final int CG4_ERR_DEVICE_WRONG_OPERATION_MODE = -614;
        final int CG4_ERR_DEVICE_INSUFFICIENT_MEMORY = -613;
        final int CG4_ERR_DEVICE_INVALID_PARAM = -612;
        final int CG4_ERR_DEVICE_WRITE_PARAM = -611;
        final int CG4_ERR_DEVICE_READ_PARAM = -610;
        final int CG4_ERR_NO_HARDWARE_SUPPORT = -609;
        final int CG4_ERR_DEVICE_BUSY = -608;
        final int CG4_ERR_IS_INITIALIZED = -607;
        final int CG4_ERR_NOT_INITIALIZED = -606;
        final int CG4_ERR_DEVICE_ACTIVE = -605;
        final int CG4_ERR_NO_MATCHING_DEVICE = -604;
        final int CG4_ERR_NO_DEVICE = -603;
        final int CG4_ERR_COMMAND_TIMEOUT = -602;
        final int CG4_ERR_COMMAND_FAILED = -601;
        final int CG4_DEVICE_ERR = -600;
        final int CG4_ERR_DEVICE_IO = -600;
        final int CG4_ERR_FILE_WRITE = -12;
        final int CG4_ERR_DIRECTORY_CREATE = -11;
        final int CG4_ERR_LOG_DIRECTORY_IS_NO_EXIST = -10;
        final int CG4_ERR_LOG_LEVEL_LOW = -9;
        final int CG4_ERR_EVENT_CREATE_ERR = -8;
        final int CG4_ERR_THREAD_CREATE_ERR = -7;
        final int CG4_ERR_THREAD_RESUME_ERR = -6;
        final int CG4_ERR_FILE_READ = -5;
        final int CG4_ERR_FILE_OPEN = -4;
        final int CG4_ERR_NOT_SUPPORTED = -3;
        final int CG4_ERR_MEM_ALLOC = -2;
        final int CG4_ERR_INVALID_PARAM_VALUE = -1;
        final int CG4_GENERIC_ERR = 0;
        final int CG4_STATUS_OK = 0;          


    }

    /*======================================================================*/
     
    /*=========================STRUCTURES===================================*/
    
    public static class CG4ApiVersion extends Structure
    {   
        public static class ByReference extends CG4ApiVersion implements Structure.ByReference {}

        public char[] Product = new char[128];
        public char[] SdkVer = new char[128];
        public char[] MosaicVer = new char[128]; 
    }
    
    public static class CG4AutoCapInfo extends Structure
    {
        public static class ByReference extends CG4AutoCapInfo implements Structure.ByReference {}

        public int nLiveRes;
        public int nAutoCap_GreyLevel;
        public double dAutoCap_SquarePecent;
        public int nAutoCap_Qua;
        public int nAutoCap_NoMoveFrames;
        public int nAutoCap_MaxDevCentX;
        public int nAutoCap_MaxDevCentY;
        public int nAutoCap_MaxDevGrey;
        public int nAutoCap_MaxDevSquare;
    }

    public static class CG4MScannerExist extends Structure
    {
          public static class ByReference extends CG4MScannerExist implements Structure.ByReference {}
          
          public int nDevConnected;
          public int nCS500i;
          public int nCS500e;
          public int nCSD450;
          public int nCSD330;
          public int nCSD200;
          public int nCS500p;
          public int nCS1000p;
          public int nCSD100;
          public int nCSD450k;
          public int nCS1000e;
          public int nCSD301L;
          public int nCSD301B;

          public int[] scannerType = new int[10];
    }

    public static class CG4PropertyInfo extends Structure
    {
        public static class ByReference extends CG4PropertyInfo implements Structure.ByReference {}

        public int nResolution;

        public char[] szMaker = new char[128];
        public char[] szModel = new char[128];
        public char[] szInterfaceType = new char[128];
        public char[] szSerial = new char[128];
        public char[] szVer = new char[128];
        public char[] szManDate = new char[128];
        public char[] szServDate = new char[128];
    }
    
    public static class CG4RunningInfo extends Structure
    {
        public static class ByReference extends CG4RunningInfo implements Structure.ByReference {}

        public byte bIsInitialized;
        public byte bIsCapturing;
        public byte bIsCaptureAbort;
        public byte bAutoCapture;
        public byte bAutoContrast;
        public byte bStartPreview;
        public byte bIsCaptureOK;
        public byte bIsStartRolling;
        public int nErrorCode;
    }
    
    public static class CG4ScannerExist extends Structure
    {
        public static class ByReference extends CG4ScannerExist implements Structure.ByReference {}

        public int nDevConnected;
        public byte bCS500i;
        public byte bCS500e;
        public byte bCSD450;
        public byte bCSD330;
        public byte bCSD200;
        public byte bCS500p;
        public byte bCS1000p;
        public byte bCSD100;
        public byte bCSD450k;
        public byte bCS1000e;
    }

    public static class CgRollParameters extends Structure
    {
        public static class ByReference extends CG4AutoCapInfo implements Structure.ByReference {}

        public int MaxFrameNumber;
        public int SlideDetectionStatus;
        public int SlidingPixelCounter;
        public float SlidingPercentageThreshold;
        public int SlidingSADMeanThreshlod;
        public int RollBackThreshold;
        public int CheckSensorThreshold;
    }
    
    public class ImageData extends Structure implements Structure.ByValue
    {               
        public Pointer Buffer; 
        public int Width;                
        public int Height; 
        public double ResolutionX; 
        public double ResolutionY; 
        public double FrameTime; 
        public int Pitch;
        public byte BitsPerPixel;        
        public int Format;                 
        public byte IsFinal;                                                                                  
        
        public ImageData()
        {                            
        }
    }

    
    /*======================================================================*/
    
    /*=========================CALLBACKS===================================*/
    
    public interface ICG4_CallbackDeviceIsConnected  extends Callback
    {
        void invoke(Pointer Context, byte bIsExist);        
    }
    public class CG4_CallbackDeviceIsConnected implements ICG4_CallbackDeviceIsConnected
    {
        @Override
        public void invoke(Pointer Context, byte bIsExist) 
        {
                System.out.println("");
        }
    }
    
    public interface ICG4_CallbackFootSwitch extends Callback
    {
        void invoke(Pointer Context);
        
    }

    public class CG4_CallbackFootSwitch implements ICG4_CallbackFootSwitch
    {
        @Override
        public void invoke(Pointer Context) 
        {
                System.out.println("");
        }
    }
    
    public interface ICG4_CallbackKeypad  extends Callback
    {
        void invoke(Pointer Context, int keypadType);        
    }

    public class CG4_CallbackKeypad implements ICG4_CallbackKeypad
    {
        @Override
        public void invoke(Pointer Context, int keypadType) 
        {
                System.out.println("");
        }
    }
    
    public interface ICG4_CallbackObjectQuality extends Callback
    {
        void invoke(Pointer Context, int fingerCountState, IntByReference QualityArray, int qualityCount);       
    }
    
    public class CG4_CallbackObjectQuality implements ICG4_CallbackObjectQuality
    {
        @Override
        public void invoke(Pointer Context, int fingerCountState, IntByReference qualityArray, int qualityCount) 
        {
            ////TODO: ADD CODE FOR OBJECT QUALITY
        }
    }
    
    public interface ICG4_CallbackPreviewImage extends Callback
    {
        void invoke(Pointer Context, ImageData image);        
    }    
    
    public class CG4_CallbackPreviewImage implements ICG4_CallbackPreviewImage 
    {
        private ICaptureObserver observer=null;
        private CSD200Library csdLibrary = null;
                
        public CG4_CallbackPreviewImage(ICaptureObserver observer,CSD200Library csdLibrary)
        {
           this.observer = observer; 
           this.csdLibrary = csdLibrary;
        }

        @Override
        public void invoke(Pointer Context, ImageData image) 
        {
            try
            {
                if( (image.Width>0) && (image.Height>0) && (image.BitsPerPixel>0) )
                {
                    int sz = image.Width*image.Height*(image.BitsPerPixel/8);                                                                                
                    byte[] data = image.Buffer.getByteArray(0, sz);
                    BufferedImage bi = Utils.getGrayscale(image.Width, image.Height, data);
                    observer.setFPImagePreview(bi);
                }
            }catch(Exception exc)
            {
                System.err.println(exc.getMessage());
            }                               
        }
    }
    
    public interface ICG4_CallbackResultImage extends Callback
    {
        void invoke(Pointer Context, int imageStatus, ImageData image, int imageType, int detectedObjects);       
    }
    
    public  class CG4_CallbackResultImage implements ICG4_CallbackResultImage
    {
        private ICaptureObserver observer=null;
        private CSD200Library csdLibrary=null;
        public CG4_CallbackResultImage(ICaptureObserver observer,CSD200Library csdLibrary)
        {
           this.observer = observer; 
           this.csdLibrary = csdLibrary;
        }
        
        @Override
        public void invoke(Pointer Context, int imageStatus, ImageData image, int imageType, int detectedObjects) 
        {
                
                csdLibrary.CG4_Controls_Beeper(3);
                try
                {
                    if( (image.Width>0) && (image.Height>0) && (image.BitsPerPixel>0) )
                    {
                        FPData fpData = observer.getFPData();
                        
                        int sz = image.Width*image.Height*(image.BitsPerPixel/8);                                                                                
                        byte[] data = image.Buffer.getByteArray(0, sz);
                        
                        BufferedImage bi = Utils.getGrayscale(image.Width, image.Height, data);
                        
                        fpData.setImgData(data);
                        fpData.setImgSZ(sz);
                        fpData.setImgWd(image.Width);
                        fpData.setImgHt(image.Height);
                        fpData.setImgBPP(image.BitsPerPixel);
                        fpData.setImgType(imageType);
                        fpData.setNf(observer.getFingerCnt());
                        observer.setFPData(fpData);
                        
                        observer.setFPImageFinal(bi);
                        observer.setCaptureDone();
                        
//                        System.out.println("detectedObjects >>> "+detectedObjects); 
//                        final SegmentFingerprint siq = new SegmentFingerprint();
//                        SwingUtilities.invokeLater(new Runnable(){
//                                public void run()
//                                {
//                                    try
//                                    {
//                                        ////siq.segmentFP();
//                                    }catch(Exception exc)
//                                    {
//                                        exc.printStackTrace();
//                                    }
//                                }
//                        
//                        });
                        ////try{ImageIO.write(bi, "BMP", new File("g:/faisal.bmp"));}catch(Exception exc){}

                    }
                }catch(Throwable t)
                {
                }
                csdLibrary.CG4_Controls_SetLEDs(CG4LedType.CG4_LED_EXTEND, 0);
        }
    }
    
    public interface ICG4_CallbackTakingResultImage extends Callback
    {
        void invoke(Pointer Context);       
    }
    
    public class CG4_CallbackTakingResultImage implements ICG4_CallbackTakingResultImage 
    {
        @Override
        public void invoke(Pointer Context) 
        {
                System.out.println("");
        }
    }

    /*=====================================================================*/
    
}
