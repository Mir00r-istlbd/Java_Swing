/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.processing;

import client.bean.ApplicationData;
import com.istlbd.utils.Defs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Enrollment {

    public HashMap <String, Boolean> validateApplicationData(ApplicationData applicationData) throws Exception {

//        ArrayList<String> fields = new ArrayList<String>();
        HashMap <String, Boolean> fieldsMap = new HashMap<String,Boolean>();

        if (applicationData == null) {
            return fieldsMap;
        }

        //name bangla
        if (isEmptyText(applicationData.getNameBn())) {
            fieldsMap.put(Defs.NAME_BNG, true);
        } else {
            fieldsMap.put(Defs.NAME_BNG, false);
        }
        //name english
        if (isEmptyText(applicationData.getNameEn())) {
            fieldsMap.put(Defs.NAME_ENG, true);
        } else {
            fieldsMap.put(Defs.NAME_ENG, false);
        }
        //gender
        if (isEmptyText(applicationData.getGender())) {
            fieldsMap.put(Defs.GENDER, true);
        } else {
            fieldsMap.put(Defs.GENDER, false);
        }
        //father name
        if (isEmptyText(applicationData.getFatherName())) {
            fieldsMap.put(Defs.FATHER_NAME, true);
        } else {
            fieldsMap.put(Defs.FATHER_NAME, false);
        }
        //mother name
        if (isEmptyText(applicationData.getMotherName())) {
            fieldsMap.put(Defs.MOTHER_NAME, true);
        } else {
            fieldsMap.put(Defs.MOTHER_NAME, false);
        }
        //marital status and spouse name and spouse NID
        if (isEmptyText(applicationData.getMaritalStatus())) {
            fieldsMap.put(Defs.MARITAL_STATUS, true);
        } else if (applicationData.getMaritalStatus().equalsIgnoreCase("MARRIED")) {
            fieldsMap.put(Defs.MARITAL_STATUS, false);
            if (isEmptyText(applicationData.getSpouseName())) {
                fieldsMap.put(Defs.SPOUSE_NAME, true);
            } else {
                fieldsMap.put(Defs.SPOUSE_NAME, false);
            }
            if (isEmptyText(applicationData.getSpouseNid()) || !isNumericText(applicationData.getSpouseNid())) {
                fieldsMap.put(Defs.SPOUSE_NID, true);
            } else {
                fieldsMap.put(Defs.SPOUSE_NID, false);
            }
        } else {
            fieldsMap.put(Defs.MARITAL_STATUS, false);
        }
        //father NID
        if (isEmptyText(applicationData.getFatherNid()) || !isNumericText(applicationData.getFatherNid())) {
            fieldsMap.put(Defs.FATHER_NID, true);
        } else {
            fieldsMap.put(Defs.FATHER_NID, false);
        }
        //mother NID
        if (isEmptyText(applicationData.getMotherNid()) || !isNumericText(applicationData.getMotherNid())) {
            fieldsMap.put(Defs.MOTHER_NID, true);
        } else {
            fieldsMap.put(Defs.MOTHER_NID, false);
        }
        //NID
        if (isEmptyText(applicationData.getNidNumber()) || !isNumericText(applicationData.getNidNumber()) || applicationData.getNidNumber().length() != 10) {
            fieldsMap.put(Defs.NATIONAL_ID, true);
        } else {
            fieldsMap.put(Defs.NATIONAL_ID, false);
        }
        //Pin
        
        if(!isEmptyText(applicationData.getPinNo()) && isNumericText(applicationData.getPinNo()) && (applicationData.getPinNo().length()==13 || applicationData.getPinNo().length()==17))
            fieldsMap.put(Defs.PIN_NO,false);
        else
            fieldsMap.put(Defs.PIN_NO,true);

        //NID Issue Date
        if (isEmptyText(applicationData.getNidIssueDate()) || !isValidDate(applicationData.getNidIssueDate(), false)) {
            fieldsMap.put(Defs.NID_ISSUE_DATE, true);
        } else {
            fieldsMap.put(Defs.NID_ISSUE_DATE, false);
        }
        //Birth Date
        if (isEmptyText(applicationData.getDateOfBirth()) || !isValidDate(applicationData.getDateOfBirth(), false)) {
            fieldsMap.put(Defs.DATE_OF_BIRTH, true);
        } else {
            fieldsMap.put(Defs.DATE_OF_BIRTH, false);
        }
        //Nationality
        if (isEmptyText(applicationData.getNationality())) {
            fieldsMap.put(Defs.NATIONALITY, true);
        } else {
            fieldsMap.put(Defs.NATIONALITY, false);
        }
        //Blood Group
        if (isEmptyText(applicationData.getBloodGroup())) {
            fieldsMap.put(Defs.BLOOD_GROUP, true);
        } else {
            fieldsMap.put(Defs.BLOOD_GROUP, false);
        }
        //Birth Registration No
        if (isEmptyText(applicationData.getBirthRegistrationNumber()) || !isNumericText(applicationData.getBirthRegistrationNumber())) {
            fieldsMap.put(Defs.BIRTH_REGISTRATION_NO, true);
        } else {
            fieldsMap.put(Defs.BIRTH_REGISTRATION_NO, false);
        }
        //Birth Place
        if (isEmptyText(applicationData.getBirthDistrict()) || !isNumericText(applicationData.getBirthDistrict())) {
            fieldsMap.put(Defs.BIRTH_DISTRICT, true);
        } else {
            fieldsMap.put(Defs.BIRTH_DISTRICT, false);
        }
        //Unique Id mark
//        if (isEmptyText(applicationData.getUniqueIdentificationMark())) {
//            fields.add(Defs.UNIQUE_IDENTIFICATION_MARK);
//        }
        /*------------------ PRESENT ADDRESS ------------------*/
        //Division
        if (isEmptyText(applicationData.getPresentDivision()) || !isNumericText(applicationData.getPresentDivision())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_DIVISION, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_DIVISION, false);
        }
        //District
        if (isEmptyText(applicationData.getPresentDistrict()) || !isNumericText(applicationData.getPresentDistrict())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_DISTRICT, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_DISTRICT, false);
        }
        //Upozila
        if (isEmptyText(applicationData.getPresentUpozila()) || !isNumericText(applicationData.getPresentUpozila())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_UPOZILA, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_UPOZILA, false);
        }
        //RMO
        if (isEmptyText(applicationData.getPresentRmo()) || !isNumericText(applicationData.getPresentRmo())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_RMO, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_RMO, false);
        }
        //City Corp
        if (isEmptyText(applicationData.getPresentCity()) || !isNumericText(applicationData.getPresentCity())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_CITY_CORPORATION, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_CITY_CORPORATION, false);
        }
        //Eunion
        if (isEmptyText(applicationData.getPresentEunion()) || !isNumericText(applicationData.getPresentEunion())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_EUNION, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_EUNION, false);
        }
        //Mouza
        if (isEmptyText(applicationData.getPresentMouza()) || !isNumericText(applicationData.getPresentMouza())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_MOUZA, true);
        } else if(applicationData.getPresentMouza().equalsIgnoreCase("999")){
            fieldsMap.put(Defs.PRESENT_ADDRESS_MOUZA, false);
            if (isEmptyText(applicationData.getPresentMouzaOtr())) {
                fieldsMap.put(Defs.PRESENT_ADDRESS_MOUZA_OTHER, true);
            } else {
                fieldsMap.put(Defs.PRESENT_ADDRESS_MOUZA_OTHER, false);
            }
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_MOUZA, false);
        }
        //Village
        if (isEmptyText(applicationData.getPresentVillage()) || !isNumericText(applicationData.getPresentVillage())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_VILLAGE, true);
        } else if(applicationData.getPresentVillage().equalsIgnoreCase("999")){
            fieldsMap.put(Defs.PRESENT_ADDRESS_VILLAGE, false);
            if (isEmptyText(applicationData.getPresentVillageOtr())) {
                fieldsMap.put(Defs.PRESENT_ADDRESS_VILLAGE_OTHER, true);
            } else {
                fieldsMap.put(Defs.PRESENT_ADDRESS_VILLAGE_OTHER, false);
            }
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_MOUZA, false);
        }
        
        //PostOffice
        if (isEmptyText(applicationData.getPresentPostOffice()) || !isNumericText(applicationData.getPresentPostOffice())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_POSTOFFICE, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_POSTOFFICE, false);
        }
        //PostCode
        if (isEmptyText(applicationData.getPresentPostCode()) || !isNumericText(applicationData.getPresentPostCode())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_POSTCODE, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_POSTCODE, false);
        }
        //House
        if (isEmptyText(applicationData.getPresentHouseNo())) {
            fieldsMap.put(Defs.PRESENT_ADDRESS_HOUSE, true);
        } else {
            fieldsMap.put(Defs.PRESENT_ADDRESS_HOUSE, false);
        }
        /*------------------ PERMANENT ADDRESS ------------------*/
        
        //Division
        if (isEmptyText(applicationData.getPermDivision()) || !isNumericText(applicationData.getPermDivision())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_DIVISION, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_DIVISION, false);
        }
        //District
        if (isEmptyText(applicationData.getPermDistrict()) || !isNumericText(applicationData.getPermDistrict())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_DISTRICT, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_DISTRICT, false);
        }
        //Upozila
        if (isEmptyText(applicationData.getPermUpozila()) || !isNumericText(applicationData.getPermUpozila())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_UPOZILA, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_UPOZILA, false);
        }
        //RMO
        if (isEmptyText(applicationData.getPermanentRmo()) || !isNumericText(applicationData.getPermanentRmo())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_RMO, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_RMO, false);
        }
        //City Corp
        if (isEmptyText(applicationData.getPermanentCity()) || !isNumericText(applicationData.getPermanentCity())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_CITY_CORPORATION, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_CITY_CORPORATION, false);
        }
        //Eunion
        if (isEmptyText(applicationData.getPermanentEunion()) || !isNumericText(applicationData.getPermanentEunion())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_EUNION, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_EUNION, false);
        }
        //Mouza
        if (isEmptyText(applicationData.getPermanentMouza()) || !isNumericText(applicationData.getPermanentMouza())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_MOUZA, true);
        } else if(applicationData.getPermanentMouza().equalsIgnoreCase("999")){
            fieldsMap.put(Defs.PERMANENT_ADDRESS_MOUZA, false);
            if (isEmptyText(applicationData.getPermanentMouzaOtr())) {
                fieldsMap.put(Defs.PERMANENT_ADDRESS_MOUZA_OTHER, true);
            } else {
                fieldsMap.put(Defs.PERMANENT_ADDRESS_MOUZA_OTHER, false);
            }
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_MOUZA, false);
        }
        //Village
        if (isEmptyText(applicationData.getPermanentVillage()) || !isNumericText(applicationData.getPermanentVillage())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_VILLAGE, true);
        } else if(applicationData.getPermanentVillage().equalsIgnoreCase("999")){
            fieldsMap.put(Defs.PERMANENT_ADDRESS_VILLAGE, false);
            if (isEmptyText(applicationData.getPermanentVillageOtr())) {
                fieldsMap.put(Defs.PERMANENT_ADDRESS_VILLAGE_OTHER, true);
            } else {
                fieldsMap.put(Defs.PERMANENT_ADDRESS_VILLAGE_OTHER, false);
            }
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_MOUZA, false);
        }
        
        //PostOffice
        if (isEmptyText(applicationData.getPermanentPostOffice()) || !isNumericText(applicationData.getPermanentPostOffice())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_POSTOFFICE, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_POSTOFFICE, false);
        }
        //PostCode
        if (isEmptyText(applicationData.getPermanentPostCode()) || !isNumericText(applicationData.getPermanentPostCode())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_POSTCODE, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_POSTCODE, false);
        }
        //House
        if (isEmptyText(applicationData.getPermanentHouseNo())) {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_HOUSE, true);
        } else {
            fieldsMap.put(Defs.PERMANENT_ADDRESS_HOUSE, false);
        }
        
        //Voter at
        if (isEmptyText(applicationData.getVoterAt())) {
            fieldsMap.put(Defs.VOTER_AT, true);
        } else {
            fieldsMap.put(Defs.VOTER_AT, false);
        }
        //Voter area
        if (isEmptyText(applicationData.getVoterArea()) || !isNumericText(applicationData.getVoterArea())) {
            fieldsMap.put(Defs.VOTER_AREA, true);
        } else {
            fieldsMap.put(Defs.VOTER_AREA, false);
        }
        //Education
        if (isEmptyText(applicationData.getEducationLevel())) {
            fieldsMap.put(Defs.EDUCATION, true);
        } else {
            fieldsMap.put(Defs.EDUCATION, false);
        }
        //Profession
        if (isEmptyText(applicationData.getProfession())) {
            fieldsMap.put(Defs.PROFESSION, true);
        } else {
            fieldsMap.put(Defs.PROFESSION, false);
        }
        //Religion
        if (isEmptyText(applicationData.getReligion())) {
            fieldsMap.put(Defs.RELIGION, true);
        } else {
            fieldsMap.put(Defs.RELIGION, false);
        }
        //Telephone
        if (!isEmptyText(applicationData.getPhone()) && !isNumericText(applicationData.getPhone())) {
            fieldsMap.put(Defs.TELEPHONE, true);
        } else {
            fieldsMap.put(Defs.TELEPHONE, false);
        }
        //Cellphone
        if (!isEmptyText(applicationData.getMobile()) && !isNumericText(applicationData.getMobile())) {
            fieldsMap.put(Defs.MOBILE, true);
        } else {
            fieldsMap.put(Defs.MOBILE, false);
        }
        
        //Email validation
        //Email
        if (!isEmptyText(applicationData.getEmail()) && isEmailValid(applicationData.getEmail())) {
            fieldsMap.put(Defs.EMAIL, false);
        } else {
            fieldsMap.put(Defs.EMAIL, true);
        }
        //Tin
        if (!isEmptyText(applicationData.getTin()) && !isNumericText(applicationData.getTin())) {
            fieldsMap.put(Defs.TIN_NO, true);
        } else {
            fieldsMap.put(Defs.TIN_NO, false);
        }
        
        //********* Passport and driving license format remaining *****************
        
        return fieldsMap;
    }
    

    public boolean isEmptyText(String text) throws Exception {

        if (text != null && text.length() > 0) {
            return false;
        }
        return true;
    }

    public boolean isNumericText(String text) throws Exception {

        boolean isNumeric = true;

        if (text != null && text.length() > 0) {

            for (int i = 0; i < text.length(); i++) {
                if (!String.valueOf(text.charAt(i)).matches("[0-9]")) {
                    isNumeric = false;
                    break;
                }
            }

        }
        return isNumeric;
    }

    public boolean isValidDate(String date, boolean isBirthDate) {

        boolean isValid = true;

        SimpleDateFormat dateFormat = new SimpleDateFormat(Defs.dateFormString);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date.trim());  
            //for birthdate work needed to check if the date is 18 years from the current date
        } catch (ParseException pe) {
            return false;
        }

        return isValid;
    }
    
    public boolean isEmailValid(String email) {
//        String EMAIL_REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([  \\w]+\\.)+[\\w]+[\\w]$";

        Boolean check = email.matches(EMAIL_REGEX);
        return check;
    }
}
