/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.utils;

import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class Defs {
    
    public static final boolean isDebug = true;
    public static final String IMAGE_SAVE_PATH = "F:/Project_misc/Digital_persona_fp/captured_templates/";
    public static final String PHOTO_KEY_FRONT = "PHOTO_FRONT";
    public static final String PHOTO_KEY_LEFT = "PHOTO_LEFT";
    public static final String PHOTO_KEY_RIGHT = "PHOTO_RIGHT";
    public static final String FINGER_KEY_RIGHT_THUMB = "RIGHT_THUMB";
    public static final String FINGER_KEY_RIGHT_INDEX = "RIGHT_INDEX";
    public static final String FINGER_KEY_RIGHT_MIDDLE = "RIGHT_MIDDLE";
    public static final String FINGER_KEY_RIGHT_RING = "RIGHT_RING";
    public static final String FINGER_KEY_RIGHT_PINKY = "RIGHT_PINKY";
    public static final String FINGER_KEY_LEFT_THUMB = "LEFT_THUMB";
    public static final String FINGER_KEY_LEFT_INDEX = "LEFT_INDEX";
    public static final String FINGER_KEY_LEFT_MIDDLE = "LEFT_MIDDLE";
    public static final String FINGER_KEY_LEFT_RING = "LEFT_RING";
    public static final String FINGER_KEY_LEFT_PINKY = "LEFT_PINKY";
    public static final String PARTNER_SERVICE_REQUEST_IDENTIFY = "IDENTIFY";
    public static final String PARTNER_SERVICE_REQUEST_VERIFY = "VERIFY";
    public static final String FOOTER_TEXT = "COPYRIGHT, TIGER IT BANGLADESH LTD.";
    public static final boolean IS_CROSSMATCH=false;
    public static String SEARCH_TOTAL_RECORDS_TITLE="Total Records Found : ";
    public static String dateFormString="yyyy/MM/dd";
    public static String GENDER_MALE = "Male";
    public static String GENDER_FEMALE = "Female";
    public static String GENDER_THIRD = "Third Gend";
    public static String SEARCH_BAR_TEXT = "Search using First Name, Middle Name and Last Name";
    public static String USER_SEARCH_BAR_TEXT = "Search by User Name";
    public static final SimpleDateFormat SDF=new SimpleDateFormat(dateFormString);
    
    public static final String IRIS_IDX_LEFT = "LEFT";
    public static final String IRIS_IDX_RIGHT = "RIGHT";
    
    public static final String SC_NAME_BNG = "name_bng";
    public static final String SC_NAME_ENG = "name_eng";
    public static final String SC_NAME_FATHER = "name_father";
    public static final String SC_NAME_MOTHER = "name_mother";
    public static final String SC_DOB = "date_of_birth";
    public static final String SC_VOTER_ADDRESS = "voter_address";
    public static final String SC_ISSUE_DATE = "issue_date";
    public static final String SC_NID_NEW = "nid_new";
    public static final String SC_NID_OLD = "nid_old";
    public static final String SC_NATIONALITY = "nationality";
    public static final String SC_BIRTH_PLACE = "birth_place";
    public static final String SC_BLOOD_GRP = "blood_group";
    public static final String SC_GENDER = "gender";
    public static final String SC_VOTER_AT = "voter_at";
    public static final String SC_OTHER_ADDRESS = "other_address";
    public static final String SC_PHOTO = "photo";
    public static final String SC_UIM = "unique_id_mark";
    public static final String SC_EDUCATION = "education";
    public static final String SC_PROFESSION = "profession";
    public static final String SC_RELIGION = "religion";
    public static final String SC_DISABILITY = "disability";
    public static final String SC_FATHER_NID = "nid_father";
    public static final String SC_MOTHER_NID = "nid_mother";
    public static final String SC_SPOUSE_NID = "nid_spouse";
    public static final String SC_NAME_SPOUSE = "name_spouse";
    public static final String SC_PASSPORT = "passport";
    public static final String SC_TIN = "tin";
    public static final String SC_EMAIL = "email";
    public static final String SC_TELEPHONE = "telephone";
    public static final String SC_DRIVING_LICENSE = "driving_license";
    public static final String SC_MOBILE = "mobile";
    
    
    public static final int ERROR_CODE_CREATE = 100;
    public static final int ERROR_CODE_UPDATE = 101;
    public static final int ERROR_CODE_DELETE = 102;
    
    public static final String STATUS_ACTIVE = "ACTIVE";
    public static final String STATUS_INACTIVE = "INACTIVE";
    public static final String DATE_FORMAT = "dd/mm/yyyy";
    
    //------------- ENROLLMENT DATA FIELDS --------------------
    
    //Text
    public static final String NAME_BNG = "NAME_BANGLA";
    public static final String NAME_ENG = "NAME_ENGLISH";
    public static final String GENDER = "GENDER";
    public static final String FATHER_NAME = "NAME_FATHER";
    public static final String MOTHER_NAME = "NAME_MOTHER";
    public static final String MARITAL_STATUS = "MARITAL_STATUS";
    public static final String SPOUSE_NAME = "NAME_SPOUSE";
    public static final String FATHER_NID = "NID_FATHER";
    public static final String MOTHER_NID = "NID_MOTHER";
    public static final String SPOUSE_NID = "NID_SPOUSE";
    public static final String NATIONAL_ID = "NATIONAL_ID";
    public static final String PIN_NO = "PIN_NO";
    public static final String NID_ISSUE_DATE = "NID_ISSUE_DATE";
    public static final String BIRTH_DISTRICT = "BIRTH_DISTRICT";
    public static final String DATE_OF_BIRTH = "DATE_OF_BIRTH";
    public static final String NATIONALITY = "NATIONALITY";
    public static final String BIRTH_REGISTRATION_NO = "BIRTH_REGISTRATION_NUMBER";
    public static final String BLOOD_GROUP = "BLOOD_GROUP";
    public static final String UNIQUE_IDENTIFICATION_MARK = "UNIQUE_ID_MARK";
    public static final String PRESENT_ADDRESS_DIVISION = "PRESENT_DIVISION";
    public static final String PRESENT_ADDRESS_DISTRICT = "PRESENT_DISTRICT";
    public static final String PRESENT_ADDRESS_UPOZILA = "PRESENT_UPOZILA";
    public static final String PRESENT_ADDRESS_RMO = "PRESENT_RMO";
    public static final String PRESENT_ADDRESS_CITY_CORPORATION = "PRESENT_CITY_CORP";
    public static final String PRESENT_ADDRESS_EUNION = "PRESENT_EUNION";
    public static final String PRESENT_ADDRESS_MOUZA = "PRESENT_MOUZA";
    public static final String PRESENT_ADDRESS_MOUZA_OTHER = "PRESENT_MOUZA_OTHER";
    public static final String PRESENT_ADDRESS_VILLAGE = "PRESENT_VILLAGE";
    public static final String PRESENT_ADDRESS_VILLAGE_OTHER = "PRESENT_VILLAGE OTHER";
    public static final String PRESENT_ADDRESS_HOUSE = "PRESENT_HOUSE";
    public static final String PRESENT_ADDRESS_POSTOFFICE = "PRESENT_POSTOFFICE";
    public static final String PRESENT_ADDRESS_POSTCODE = "PRESENT_POSTCODE";
    public static final String PERMANENT_ADDRESS_DIVISION = "PERMANENT_DIVISION";
    public static final String PERMANENT_ADDRESS_DISTRICT = "PERMANENT_DISTRICT";
    public static final String PERMANENT_ADDRESS_UPOZILA = "PERMANENT_UPOZILA";
    public static final String PERMANENT_ADDRESS_RMO = "PERMANENT_RMO";
    public static final String PERMANENT_ADDRESS_CITY_CORPORATION = "PERMANENT_CITY_CORP";
    public static final String PERMANENT_ADDRESS_EUNION = "PERMANENT_EUNION";
    public static final String PERMANENT_ADDRESS_MOUZA = "PERMANENT_MOUZA";
    public static final String PERMANENT_ADDRESS_MOUZA_OTHER = "PERMANENT_MOUZA_OTHER";
    public static final String PERMANENT_ADDRESS_VILLAGE = "PERMANENT_VILLAGE";
    public static final String PERMANENT_ADDRESS_VILLAGE_OTHER = "PERMANENT_VILLAGE_OTHER";
    public static final String PERMANENT_ADDRESS_HOUSE = "PERMANENT_HOUSE";
    public static final String PERMANENT_ADDRESS_POSTOFFICE = "PERMANENT_POSTOFFICE";
    public static final String PERMANENT_ADDRESS_POSTCODE = "PERMANENT_POSTCODE";
    public static final String VOTER_AT = "VOTER_AT";
    public static final String VOTER_AREA = "VOTER_AREA";
    public static final String HANDICAP_OTHER = "HANDICAP_OTHERS";
    public static final String EDUCATION = "EDUCATION";
    public static final String PROFESSION = "PROFESSION";
    public static final String RELIGION = "RELIGION";
    public static final String TELEPHONE = "TELEPHONE";
    public static final String MOBILE = "MOBILE";
    public static final String EMAIL = "EMAIL";
    public static final String PASSPORT_NO = "PASSPORT_NO";
    public static final String TIN_NO = "TIN_NO";
    public static final String DRIVING_LICENSE_NO = "DRIVING_LICENSE_NO";
    
    //biometric
    public static final String PHOTO = "PHOTO";
    public static final String EYE_LEFT = "EYE_LEFT";
    public static final String EYE_RIGHT = "EYE_RIGHT";
    public static final String SIGNATURE = "SIGNATURE";
    public static final String FINGER_PRINT_OTHER = "FP_OTHERS";
    //FINGER PRINTS ARE DEFINED ABOVE !!!! 
    
    //attachments
    
    
    
    //------------- ENROLLMENT DATA FIELDS --------------------
    
    
    public static String QualityImageFile(int value)
    {
        System.out.println("quality ="+value);
        if(value<=1000)
            return "green";
        else if(value>1000 && value<=9000)
            return "orange";
        else
            return "red";
    }
    public static String CrossmatchQualityImageFile(int value)
    {
        System.out.println("cross match quality ="+value);
        if(value==1)
            return "green";
        else if(value>1 && value<=3)
            return "orange";
        else
            return "red";
    }  
}
