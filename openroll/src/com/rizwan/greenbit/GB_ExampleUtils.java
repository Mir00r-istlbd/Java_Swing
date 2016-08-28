/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizwan.greenbit;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.Callback;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.DoubleByReference;

import GBMSAPI_JAVA_LibraryFunctions.GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library;
import GBMSAPI_JAVA_LibraryFunctions.*;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_ErrorCodesDefines.GBMSAPI_JAVA_ErrorCodes;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_DeviceCharacteristicsDefines.*;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_AcquisitionProcessDefines.*;
import java.util.Date;

/**
 *
 * @author andrea
 */
public class GB_ExampleUtils {

	public static Byte Global_DevID = 0;
	public static String Global_DevSerialNumber = "";
	public static Boolean Global_RollScannable = false;
	public static Boolean Global_FlatSingleScannable = false;
	public static Boolean Global_LEDAvailable = false;
	public static Boolean Global_LCDAvailable = false;
	public static Boolean Global_SoundAvailable = false;
	public static Boolean Global_PedalAvailable = false;
	public static int Global_ImageSizeX = 0;
	public static int Global_ImageSizeY = 0;
	public static int Global_AcquisitionStateVal_Idle = 0;
	public static int Global_AcquisitionStateVal_Starting = 1;
	public static int Global_AcquisitionStateVal_Preview = 2;
	public static int Global_AcquisitionStateVal_Acquisition = 3;
	public static int Global_AcquisitionState = 0;
	public static int Global_AcquisitionValFrameCounter = 0;
	public static byte[] FrameBuffer = null;

	public static Boolean Global_GetCurrentDevice() {
		int RetVal;
		/////////////////////////////
		// Get Device List
		///////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING DEVICE LIST *****************");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		IntByReference pNumOfAttachedDevices = new IntByReference();
		IntByReference pUSBErrorCode = new IntByReference();

		GBMSAPI_JAVA_DeviceInfoStruct MyFirst = new GBMSAPI_JAVA_DeviceInfoStruct();

		GBMSAPI_JAVA_DeviceInfoStruct[] AttachedDeviceList =
				(GBMSAPI_JAVA_DeviceInfoStruct[]) MyFirst.toArray(
				GBMSAPI_JAVA_DeviceInfoConstants.GBMSAPI_JAVA_MAX_PLUGGED_DEVICE_NUM);


		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetAttachedDeviceList(
				AttachedDeviceList, pNumOfAttachedDevices, pUSBErrorCode);

		System.out.println("GBMSAPI_GetAttachedDeviceList: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}

		System.out.println("Number of attached devices "
				+ pNumOfAttachedDevices.getValue());
		for (int i = 0; i < pNumOfAttachedDevices.getValue(); i++) {
			String s = new String(AttachedDeviceList[i].DeviceSerialNumber);
			System.out.println("Device " + (i + 1) + " " + s);
		}
		System.out.println();
		System.out.println();

		if (pNumOfAttachedDevices.getValue() <= 0) {
			System.out.println("No attached devices, exit");
			return false;
		}

		///////////////////////////////
		// Set device
		///////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** SETTING CURRENT DEVICE **************");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		Byte DevID = AttachedDeviceList[0].DeviceID;
		String s = new String(AttachedDeviceList[0].DeviceSerialNumber);

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_SetCurrentDevice(DevID, s);
		System.out.println("GBMSAPI_SetCurrentDevice: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}

		System.out.println();
		System.out.println();

		/////////////////////////////////
		// GetCurrentDevice
		/////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING CURRENT DEVICE ID and SN ****");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		byte[] CurrDev = new byte[GBMSAPI_JAVA_DeviceInfoConstants.GBMSAPI_JAVA_MAX_SN_LENGHT];
		ByteByReference CurrDevID = new ByteByReference();
		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetCurrentDevice(CurrDevID, CurrDev);
		System.out.println("GBMSAPI_GetCurrentDevice: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}
		System.out.println("Current device ID: " + CurrDevID.getValue());
		System.out.println("Current device SN: " + new String(CurrDev));

		Global_DevID = CurrDevID.getValue();
		Global_DevSerialNumber = new String(CurrDev);

		System.out.println();
		System.out.println();

		///////////////////////////////////////////
		// Get Scanner statistics
		///////////////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING DEVICE STATISTICS ***********");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		IntByReference Counter = new IntByReference(0),
				ProductionDateInSec = new IntByReference(0);
		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetScannerStatistics(Counter,
				ProductionDateInSec);
		System.out.println("GBMSAPI_GetScannerStatistics: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}
		System.out.println("Device Number of use: " + Counter.getValue());
		System.out.println("Device Production Date in seconds: " + ProductionDateInSec.getValue());
		System.out.println("Device Production Date in seconds: " + (long) ProductionDateInSec.getValue());
		Date ProductionDate = new Date(((long) ProductionDateInSec.getValue()) * 1000);
		System.out.println("Device Production Date: "
				+ ProductionDate.toString());

		System.out.println();
		System.out.println();

		return true;
	}

	public static Boolean Global_GetScannerFeatures() {
		//////////////////////////////////
		// GetScannableTypes
		//////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING SCANNABLE TYPES *************");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		int RetVal;
		IntByReference pScannableTypesMask = new IntByReference();

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetScannableTypes(
				pScannableTypesMask);
		System.out.println("GBMSAPI_GetScannableTypes: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if ((pScannableTypesMask.getValue()
				& GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_ROLL_SINGLE_FINGER)
				== GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_ROLL_SINGLE_FINGER) {
			System.out.println("Roll: y");
			Global_RollScannable = true;
		} else {
			System.out.println("Roll: n");
			Global_RollScannable = false;
		}
		if ((pScannableTypesMask.getValue()
				& GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER)
				== GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER) {
			System.out.println("Flat single: y");
			Global_FlatSingleScannable = true;
		} else {
			System.out.println("Flat single: n");
			Global_FlatSingleScannable = false;
		}

		System.out.println();
		System.out.println();


		//////////////////////////////////
		// GBMSAPI_GetDeviceFeatures
		//////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING DEVICE FEATURES *************");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		IntByReference pDeviceFeatures = new IntByReference();

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetDeviceFeatures(
				pDeviceFeatures);
		System.out.println("GBMSAPI_GetDeviceFeatures: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if ((pDeviceFeatures.getValue()
				& GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_MULTIPLE_USB_CONNECTIONS_ALLOWED)
				== GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_MULTIPLE_USB_CONNECTIONS_ALLOWED) {
			System.out.println("USB Multiple: y");
		} else {
			System.out.println("USB Multiple: n");
		}
		if ((pDeviceFeatures.getValue()
				& GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_1000DPI_RESOLUTION)
				== GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_1000DPI_RESOLUTION) {
			System.out.println("1000 DPI: y");
		} else {
			System.out.println("1000 DPI: n");
		}
		if ((pDeviceFeatures.getValue()
				& GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_AUTO_CAPTURE_BLOCKING)
				== GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_AUTO_CAPTURE_BLOCKING) {
			System.out.println("Auto-Capture Block: y");
		} else {
			System.out.println("Auto-Capture Block: n");
		}
		if ((pDeviceFeatures.getValue()
				& GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_FRAME_RATE_SETTING)
				== GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_FRAME_RATE_SETTING) {
			System.out.println("Frame Rate setting capability: y");
			DoubleByReference MaxFr = new DoubleByReference(0.0),
					MinFr = new DoubleByReference(0.0),
					DefFr = new DoubleByReference(0.0);
			RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetFrameRateRange(
					GBMSAPI_JAVA_FrameRateOptions.GBMSAPI_JAVA_FRO_FLAT_OBJECT_ON_ROLL_AREA,
					MaxFr, MinFr, DefFr);
			System.out.println("GBMSAPI_GetFrameRateRange: " + RetVal);
			if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
				System.out.println("FAILURE, exit");
				return false;
			}
			System.out.println("Max Frame Rate = " + MaxFr.getValue());
			System.out.println("Min Frame Rate = " + MinFr.getValue());
			System.out.println("Default Frame Rate = " + DefFr.getValue());

		} else {
			System.out.println("Frame Rate setting capability: n");
		}
		if ((pDeviceFeatures.getValue()
				& GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_FW_INFO_RETRIEVE)
				== GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_FW_INFO_RETRIEVE) {
			System.out.println("Firmware Info Retrieving capability: y");
			char[] DevNamAndVer = new char[GBMSAPI_JAVA_DeviceInfoConstants.GBMSAPI_JAVA_MAX_CHARS_IN_DEVICE_NAME_AND_INFO];

			RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetDeviceNameAndVersion(DevNamAndVer);
			System.out.println("GBMSAPI_GetDeviceNameAndVersion: " + RetVal);
			if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
				System.out.println("FAILURE, exit");
				return false;
			}
			System.out.println("device name and version: " + new String(DevNamAndVer));
		} else {
			System.out.println("Firmware Info Retrieving capability: n");
		}
		if ((pDeviceFeatures.getValue()
				& GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_PERMANENT_USER_DATA_STORAGE)
				== GBMSAPI_JAVA_DeviceFeatures.GBMSAPI_JAVA_DF_PERMANENT_USER_DATA_STORAGE) {
			System.out.println("Eeprom data storage capability: y");

			IntByReference UserDataSize = new IntByReference(0);
			RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetUserDataSize(UserDataSize);
			System.out.println("GBMSAPI_GetUserDataSize: " + RetVal);
			if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
				System.out.println("FAILURE, exit");
				return false;
			}
			System.out.println("User data size: " + UserDataSize.getValue());
			byte[] DataToBeRead = new byte[UserDataSize.getValue()];


			java.io.FileInputStream fis;
			java.io.DataInputStream dis;

			try {
				fis = new java.io.FileInputStream("EepromStore.bin");
				dis = new java.io.DataInputStream(fis);
				dis.read(DataToBeRead);
			} catch (Exception ex) {
				System.out.println("Exception in Global_GetScannerFeatures: "
						+ ex.getMessage());
			}

			RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_WriteUserData(
					0, UserDataSize.getValue(), DataToBeRead);
			System.out.println("GBMSAPI_WriteUserData: " + RetVal);
			if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
				System.out.println("FAILURE, exit");
				return false;
			}



			RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_ReadUserData(
					0, UserDataSize.getValue(), DataToBeRead);
			System.out.println("GBMSAPI_ReadUserData: " + RetVal);
			if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
				System.out.println("FAILURE, exit");
				return false;
			}
			java.io.FileOutputStream fos;
			java.io.DataOutputStream ds;


			try {
				// save on file
				fos = new java.io.FileOutputStream("EepromDump.bin");

				// Wrap the FileOutputStream with a
				// DataOutputStream to obtain its writeInt()
				// method.
				ds = new java.io.DataOutputStream(fos);
				ds.write(DataToBeRead);

			} catch (Exception ex) {
				System.out.println("Exception in Global_GetScannerFeatures: "
						+ ex.getMessage());
			}
		} else {
			System.out.println("Eeprom data storage capability: n");
		}

		System.out.println();
		System.out.println();


		//////////////////////////////////
		// GBMSAPI_GetOptionalExternalEquipment
		//////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("** GETTING OPTIONAL EXTERNAL EQUIPMENT ***");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		IntByReference pOptionalExternalEquipment = new IntByReference();

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetOptionalExternalEquipment(
				pOptionalExternalEquipment);
		System.out.println("GBMSAPI_GetOptionalExternalEquipment: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if ((pOptionalExternalEquipment.getValue()
				& GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_SOUND)
				== GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_SOUND) {
			System.out.println("Sound: y");
			Global_SoundAvailable = true;
		} else {
			System.out.println("Sound: n");
			Global_SoundAvailable = false;
		}
		if ((pOptionalExternalEquipment.getValue()
				& GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_VUI_LED)
				== GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_VUI_LED) {
			System.out.println("LED: y");
			Global_LEDAvailable = true;
		} else {
			System.out.println("LED: n");
			Global_LEDAvailable = false;
		}
		if ((pOptionalExternalEquipment.getValue()
				& GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_VUI_LCD)
				== GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_VUI_LCD) {
			System.out.println("LCD: y");
			Global_LCDAvailable = true;
		} else {
			System.out.println("LCD: n");
			Global_LCDAvailable = false;
		}
		if ((pOptionalExternalEquipment.getValue()
				& GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_PEDAL)
				== GBMSAPI_JAVA_OptionalExternalEquipment.GBMSAPI_JAVA_OED_PEDAL) {
			System.out.println("Pedal: y");
			Global_PedalAvailable = true;
		} else {
			System.out.println("Pedal: n");
			Global_PedalAvailable = false;
		}

		System.out.println();
		System.out.println();
		return true;
	}

	public static Boolean Global_GetImageInfo() {
		int RetVal;
		//////////////////////////////////
		// GBMSAPI_GetAvailableImageInfo
		//////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING AVAILABLE IMAGE INFO ********");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		IntByReference pAvailableImageInfo = new IntByReference();

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetAvailableImageInfo(
				GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER,
				pAvailableImageInfo);
		System.out.println("GBMSAPI_GetAvailableImageInfo: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_OBJECT_TYPE_NOT_SUPPORTED) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if (RetVal == GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			if ((pAvailableImageInfo.getValue()
					& GBMSAPI_JAVA_AvailableImageInfo.GBMSAPI_JAVA_AII_FINGERPRINT_SIZE)
					== GBMSAPI_JAVA_AvailableImageInfo.GBMSAPI_JAVA_AII_FINGERPRINT_SIZE) {
				System.out.println("Flat Single Finger size: y");
			} else {
				System.out.println("Flat Single Finger size: n");
			}
			if ((pAvailableImageInfo.getValue()
					& GBMSAPI_JAVA_AvailableImageInfo.GBMSAPI_JAVA_AII_FINGERPRINT_CONTRAST)
					== GBMSAPI_JAVA_AvailableImageInfo.GBMSAPI_JAVA_AII_FINGERPRINT_CONTRAST) {
				System.out.println("Flat Single Finger contrast: y");
			} else {
				System.out.println("Flat Single Finger contrast: n");
			}
		}

		System.out.println();
		System.out.println();

		//////////////////////////////////
		// GBMSAPI_GetImageSize
		//////////////////////////////////
		System.out.println("//////////////////////////////////////////");
		System.out.println("**** GETTING IMAGE SIZE ******************");
		System.out.println("//////////////////////////////////////////");
		System.out.println();
		IntByReference pImageSizeX = new IntByReference();
		IntByReference pImageSizeY = new IntByReference();

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetImageSize(
				GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER,
				1, // flat area
				1, // preview
				pImageSizeX,
				pImageSizeY);
		System.out.println("GBMSAPI_GetImageSize: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_OBJECT_TYPE_NOT_SUPPORTED
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_SCAN_AREA_NOT_SUPPORTED) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if (RetVal == GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("Flat Single Finger SX,Flat area, Preview: " + pImageSizeX.getValue());
			System.out.println("Flat Single Finger SY,Flat area, Preview: " + pImageSizeY.getValue());
		}

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetImageSize(
				GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER,
				0, // flat area
				1, // preview
				pImageSizeX,
				pImageSizeY);
		System.out.println("GBMSAPI_GetImageSize: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_OBJECT_TYPE_NOT_SUPPORTED
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_SCAN_AREA_NOT_SUPPORTED) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if (RetVal == GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("Flat Single Finger SX,Roll area, Preview: " + pImageSizeX.getValue());
			System.out.println("Flat Single Finger SY,Roll area, Preview: " + pImageSizeY.getValue());
		}

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetImageSize(
				GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER,
				1, // flat area
				0, // preview
				pImageSizeX,
				pImageSizeY);
		System.out.println("GBMSAPI_GetImageSize: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_OBJECT_TYPE_NOT_SUPPORTED
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_SCAN_AREA_NOT_SUPPORTED) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if (RetVal == GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("Flat Single Finger SX,Flat area, Full resolution: " + pImageSizeX.getValue());
			System.out.println("Flat Single Finger SY,Flat area, Full resolution: " + pImageSizeY.getValue());
		}

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetImageSize(
				GBMSAPI_JAVA_ScannableBiometricTypes.GBMSAPI_JAVA_SBT_FLAT_SINGLE_FINGER,
				0, // flat area
				0, // preview
				pImageSizeX,
				pImageSizeY);
		System.out.println("GBMSAPI_GetImageSize: " + RetVal);

		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_OBJECT_TYPE_NOT_SUPPORTED
				&& RetVal
				!= GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_SCAN_AREA_NOT_SUPPORTED) {
			System.out.println("FAILURE, exit");
			return false;
		}
		if (RetVal == GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("Flat Single Finger SX,Roll area, Full resolution: " + pImageSizeX.getValue());
			System.out.println("Flat Single Finger SY,Roll area, Full resolution: " + pImageSizeY.getValue());
		}

		RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_GetMaxImageSize(
				pImageSizeX,
				pImageSizeY);
		System.out.println("GBMSAPI_GetMaxImageSize: " + RetVal);
		if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
			System.out.println("FAILURE, exit");
			return false;
		}
		System.out.println("Max SX: " + pImageSizeX.getValue());
		System.out.println("Max SY: " + pImageSizeY.getValue());

		Global_ImageSizeX = pImageSizeX.getValue();
		Global_ImageSizeY = pImageSizeY.getValue();


		System.out.println();
		System.out.println();
		return true;
	}
//	public static GB_ExampleAcquisitionCallback AcqCallb = new GB_ExampleAcquisitionCallback();
/*
	public static Boolean Global_AcquireImage() {
		try {
			int RetVal = 0;

			GB_ExampleUtils.Global_AcquisitionState =
					GB_ExampleUtils.Global_AcquisitionStateVal_Starting;

			RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_StartAcquisition(
					GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_LEFT_INDEX,
					GBMSAPI_JAVA_AcquisitionOptions.GBMSAPI_JAVA_AO_AUTOCAPTURE,
					(GBMSAPI_JAVA_AcquisitionEventsManagerCallbackInterface) AcqCallb, Pointer.NULL,
					0, (byte) 0, (byte) 0);

			if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
				System.out.println("FAILURE in GBMSAPI_StartAcquisition, exit");
				return false;
			}

			while (GB_ExampleUtils.Global_AcquisitionState
					!= GB_ExampleUtils.Global_AcquisitionStateVal_Idle) {
				Thread.sleep(10);
				if (GB_ExampleUtils.Global_AcquisitionValFrameCounter > 50) {
					GBMSAPI_Library.INSTANCE.GBMSAPI_StopAcquisition();
				}
			}

			return true;
		} catch (Exception ex) {
			System.out.println("Exception in Global_AcquireImage: "
					+ ex.getMessage());
			return false;
		}
	}
        */
}