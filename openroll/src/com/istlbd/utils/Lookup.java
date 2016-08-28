/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.utils;

import business.entity.BioOperations;
import business.entity.BioRole;
import business.entity.BioRoleOperation;
import business.entity.BioUser;
import business.entity.Item;
import client.bean.ApplicationData;

import database.entity.District;
import database.entity.Division;
import database.entity.Upozila;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maverick
 */
public class Lookup {

//    public static ApplicationData applicationData;
    public static BioUser userData;
    public static BioRole roleData;
    public static List<String> checkedOperationList; 
    public static List<BioOperations> OPERATION_LIST;
    public static List<BioRoleOperation> ROLE_OPERATION_LIST;
    public static List<Division> DIVISION_LIST;
    public static List<District> DISTRICT_LIST;
    //new variable for Upozilla
    public static List<Upozila> UPOZILA_LIST;
    public static List<Item> EDUCATION_LIST;
    public static List<Item> PROFESSION_LIST;
    public static List<Item> RELIGION_LIST;
    public static List<Item> ATTACHMENT_LIST;
    public static List<Item> MARITAL_STATUS_LIST;
    public static List<Item> BLOOD_GRP_LIST;
    public static List<Item> VOTER_AT_LIST;
    public static List<Item> RMO_LIST;
    public static List<database.entity.BioRole> ROLE_LIST;
    public static final String EDUCATED="YES";
    public static final String ILLITERATE="NO";
    public static final String MALE="Male";
    public static final String FEMALE="Female";
    public static final String THIRD_GENDER="Third";    

    static {

        EDUCATION_LIST=new ArrayList<Item>();
        
        EDUCATION_LIST.add(new Item<String>("", "EDUCATION"));
        EDUCATION_LIST.add(new Item<String>("NONE", "NONE"));
        EDUCATION_LIST.add(new Item<String>("PRIMARY", "PRIMARY"));
        EDUCATION_LIST.add(new Item<String>("JUNIOR", "JUNIOR SCHOOL/CLASS 8"));
        EDUCATION_LIST.add(new Item<String>("SSC", "SSC"));
        EDUCATION_LIST.add(new Item<String>("HSC", "HSC"));
        EDUCATION_LIST.add(new Item<String>("GRAD", "GRADUATION"));
        EDUCATION_LIST.add(new Item<String>("MASTERS", "POST GRADUATION"));
        EDUCATION_LIST.add(new Item<String>("PHD", "PHD"));
        EDUCATION_LIST.add(new Item<String>("POSTPHD", "POSTDOCTORATE"));

        RELIGION_LIST=new ArrayList<Item>();

        RELIGION_LIST.add(new Item<String>("", "RELIGION"));
        RELIGION_LIST.add(new Item<String>("ISLAM", "ISLAM"));
        RELIGION_LIST.add(new Item<String>("HINDUISM", "HINDUISM"));
        RELIGION_LIST.add(new Item<String>("BUDDHISM", "BUDDISM"));
        RELIGION_LIST.add(new Item<String>("CHRISTIAN", "CHRISTIAN"));

        ATTACHMENT_LIST=new ArrayList<Item>();

        ATTACHMENT_LIST.add(new Item<String>("", "RELIGION"));
        ATTACHMENT_LIST.add(new Item<String>("ISLAM", "ISLAM"));
        ATTACHMENT_LIST.add(new Item<String>("HINDUISM", "HINDUISM"));
        ATTACHMENT_LIST.add(new Item<String>("BUDDHISM", "BUDDISM"));
        ATTACHMENT_LIST.add(new Item<String>("CHRISTIAN", "CHRISTIAN"));

        MARITAL_STATUS_LIST=new ArrayList<Item>();

        MARITAL_STATUS_LIST.add(new Item<String>("", "MARITAL STATUS"));
        MARITAL_STATUS_LIST.add(new Item<String>("UNMARRIED", "UNMARRIED"));
        //any modification to the field below must be refereneced in 'com.istlbd.processing.Enrollment' validateApplicationData method
        MARITAL_STATUS_LIST.add(new Item<String>("MARRIED", "MARRIED"));
        MARITAL_STATUS_LIST.add(new Item<String>("DIVORCED", "DIVORCED"));
        MARITAL_STATUS_LIST.add(new Item<String>("WIDOW", "WIDOW"));
        MARITAL_STATUS_LIST.add(new Item<String>("WIDOWER", "WIDOWER"));
        
        BLOOD_GRP_LIST=new ArrayList<Item>();

        BLOOD_GRP_LIST.add(new Item<String>("", "BLOOD GROUP"));
        BLOOD_GRP_LIST.add(new Item<String>("A+", "A+"));
        BLOOD_GRP_LIST.add(new Item<String>("A-", "A-"));
        BLOOD_GRP_LIST.add(new Item<String>("B+", "B+"));
        BLOOD_GRP_LIST.add(new Item<String>("B-", "B-"));
        BLOOD_GRP_LIST.add(new Item<String>("O+", "O+"));
        BLOOD_GRP_LIST.add(new Item<String>("O-", "O-"));
        BLOOD_GRP_LIST.add(new Item<String>("AB+", "AB+"));
        BLOOD_GRP_LIST.add(new Item<String>("AB-", "AB- "));
        
        VOTER_AT_LIST=new ArrayList<Item>();

        VOTER_AT_LIST.add(new Item<String>("", "VOTER OF"));
        VOTER_AT_LIST.add(new Item<String>("PRESENT", "PRESENT"));
        VOTER_AT_LIST.add(new Item<String>("PERMANENT", "PERMANENT"));
        
        RMO_LIST=new ArrayList<Item>();

        RMO_LIST.add(new Item<String>("", "R.M.O"));
        RMO_LIST.add(new Item<String>("1", "PALLI"));
        RMO_LIST.add(new Item<String>("2", "POUROSHOVA"));
        RMO_LIST.add(new Item<String>("9", "CITY CORP."));
        RMO_LIST.add(new Item<String>("3", "TOWN"));
        RMO_LIST.add(new Item<String>("4", "OTHER"));
        
        PROFESSION_LIST=new ArrayList<Item>();
        
        PROFESSION_LIST.add(new Item<String>("", "PROFESSION"));
        PROFESSION_LIST.add(new Item<String>("DOCTOR", "DOCTOR"));
        PROFESSION_LIST.add(new Item<String>("ENGINEER", "ENGINEER"));
        PROFESSION_LIST.add(new Item<String>("DOCTOR", "DOCTOR"));
        PROFESSION_LIST.add(new Item<String>("LAWYER", "LAWYER"));
        PROFESSION_LIST.add(new Item<String>("FERMER", "FERMER"));
        PROFESSION_LIST.add(new Item<String>("TEACHER", "TEACHER"));
        PROFESSION_LIST.add(new Item<String>("BUSSINESSMAN", "BUSSINESSMAN"));
        PROFESSION_LIST.add(new Item<String>("GSH", "GOVT. SERVICE HOLDER"));
        PROFESSION_LIST.add(new Item<String>("PSH", "PVT. SERVICE HOLDER"));
        PROFESSION_LIST.add(new Item<String>("DRIVER", "DRIVER"));
        PROFESSION_LIST.add(new Item<String>("OTHER", "OTHER"));
    }
}
