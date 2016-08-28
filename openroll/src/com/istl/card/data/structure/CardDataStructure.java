/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.data.structure;

import com.istl.card.model.ChipDirectory;
import com.istl.card.model.DataFile;
import com.istl.card.model.Field;
import com.istl.card.model.InternalFile;

/**
 *
 * @author User
 */
public class CardDataStructure 
{
    public static ChipDirectory[] DirectoriesInfo = null;
    public static Field[] Biographic = null;
    public static Field[] FingerprintSecret = null;
    public static Field[] FingerprintPublic = null;
    public static Field[] DigitalSign = null;
    public static Field[] StaticVerInfo = null;
    public static Field[] Demographic = null;
    public static Field[] ExtBiographic = null;
    public static Field[] Relationships = null;
    public static Field[] Subscriptions = null;
    public static Field[] AdditionalFingerprint = null;
    public static Field[] Iris = null;
    public static Field[] UpdatableDigitalSign = null;//
    public static Field[] UpdatableVerInfo = null;
    public static Field[] IcaoSod = null;
    public static Field[] IcaoCom = null;
    public static Field[] IcaoDg1 = null;
    public static Field[] IcaoDg2 = null;
    
    public static Field[] AdditionalDg1 = null;
    public static Field[] AdditionalDg2 = null;
    public static Field[] AdditionalDg3 = null;
    public static Field[] AdditionalDg4 = null;
    public static Field[] AdditionalDg5 = null;
    public static Field[] AdditionalDg6 = null;
    public static Field[] AdditionalDg7 = null;
    public static Field[] AdditionalDg8 = null;
    public static Field[] AdditionalDg9 = null;
    public static Field[] AdditionalDg10 = null;
    public static Field[] AdditionalDg11 = null;
    public static Field[] AdditionalDg12 = null;
    public static Field[] AdditionalDg13 = null;
    public static Field[] AdditionalDg14 = null;
    public static Field[] AdditionalDg15 = null;
    public static Field[] AdditionalDg16 = null;
    public static Field[] AdditionalDg17 = null;
    public static Field[] AdditionalDg18 = null;
    public static Field[] AdditionalDg19 = null;
    public static Field[] AdditionalDg20 = null;
    public static Field[] AdditionalDg21 = null;
    
        
    public static DataFile[] ReadOnlyDataFilesInfo = null;
    public static DataFile[] UpdatableDataFilesInfo = null; 
    public static DataFile[] AdditionalDataFileInfo = null;
            
    public static InternalFile[] InternalFilesInfo = null;
    
    
    
    static
    {
        DirectoriesInfo = new ChipDirectory[3];
        DirectoriesInfo[0] = new ChipDirectory("MF","3F00");
        DirectoriesInfo[1] = new ChipDirectory("DF","5F00");
        DirectoriesInfo[2] = new ChipDirectory("DF2","6F00");
        
                
        Biographic = new Field[14];
        
        Biographic[0] = AllFields.NewNidNo;
        Biographic[1] = AllFields.OldNidNo;
        Biographic[2] = AllFields.NameBangla;
        Biographic[3] = AllFields.NameEnglish;
        Biographic[4] = AllFields.DateBirth;
        Biographic[5] = AllFields.FathersName;
        Biographic[6] = AllFields.MothersName;
        Biographic[7] = AllFields.BloodGroup;
        Biographic[8] = AllFields.DateIssue;
        Biographic[9] = AllFields.PlaceOfBirth;
        Biographic[10] = AllFields.Nationality;
        Biographic[11] = AllFields.Gender;
        Biographic[12] = AllFields.VoterAt;
        Biographic[13] = AllFields.VoterAddress;
        
        FingerprintSecret = new Field[4];
        FingerprintSecret[0]= AllFields.SecuredFingerCode1;
        FingerprintSecret[1]= AllFields.SecuredFingerprint1;
        FingerprintSecret[2]= AllFields.SecuredFingerCode2;
        FingerprintSecret[3]= AllFields.SecuredFingerprint2;
        
        
        FingerprintPublic = new Field[4];
        FingerprintPublic[0] = AllFields.PublicFingerCode1;
        FingerprintPublic[1] = AllFields.PublicFingerprint1;
        FingerprintPublic[2] = AllFields.PublicFingerCode2;
        FingerprintPublic[3] = AllFields.PublicFingerprint2;
        
        DigitalSign = new Field[1];
        DigitalSign[0] = AllFields.StaticDataDigitalSignature;
        
        StaticVerInfo = new Field[4];
        
        StaticVerInfo[0] = AllFields.StaticDataDigitalSignaturePubKeyId;
        StaticVerInfo[1] = AllFields.StaticVerKeyId;
        StaticVerInfo[2] = AllFields.StaticEncVer;
        StaticVerInfo[3] = AllFields.IssueNumber;
        
        Demographic = new Field[3];
        Demographic[0] = AllFields.OtherAddress;
        Demographic[1] = AllFields.VoterNumber;
        Demographic[2] = AllFields.VoterSerialNumber;
        
        
        ExtBiographic = new Field[6];
        ExtBiographic[0] = AllFields.BirthRegNo;
        ExtBiographic[1] = AllFields.Qualification;
        ExtBiographic[2] = AllFields.Profession;
        ExtBiographic[3] = AllFields.Disability;
        ExtBiographic[4] = AllFields.VisibleIdentityMark;
        ExtBiographic[5] = AllFields.Religion;
        
        Relationships = new Field[5];
        
        Relationships[0] = AllFields.FathersNid;
        Relationships[1] = AllFields.MothersNid;
        Relationships[2] = AllFields.MaritalStatus;
        Relationships[3] = AllFields.SpouseName;
        Relationships[4] = AllFields.SpouseNid;
        
        Subscriptions = new Field[6];
        
        Subscriptions[0] = AllFields.TinNo;
        Subscriptions[1] = AllFields.DrivingLicenceNo;
        Subscriptions[2] = AllFields.PassportNo;
        Subscriptions[3] = AllFields.TelephoneNo;
        Subscriptions[4] = AllFields.MobileNo;
        Subscriptions[5] = AllFields.EmailAddress;
        
        AdditionalFingerprint = new Field[12];
        
        AdditionalFingerprint[0] = AllFields.AdditionalFingerCode1;
        AdditionalFingerprint[1] = AllFields.AdditionalFingerprint1;
        AdditionalFingerprint[2] = AllFields.AdditionalFingerCode2;
        AdditionalFingerprint[3] = AllFields.AdditionalFingerprint2;
        AdditionalFingerprint[4] = AllFields.AdditionalFingerCode3;
        AdditionalFingerprint[5] = AllFields.AdditionalFingerprint3;
        AdditionalFingerprint[6] = AllFields.AdditionalFingerCode4;
        AdditionalFingerprint[7] = AllFields.AdditionalFingerprint4;
        AdditionalFingerprint[8] = AllFields.AdditionalFingerCode5;
        AdditionalFingerprint[9] = AllFields.AdditionalFingerprint5;
        AdditionalFingerprint[10] = AllFields.AdditionalFingerCode6;
        AdditionalFingerprint[11] = AllFields.AdditionalFingerprint6;
        
        Iris = new Field[4];
        
        Iris[0] = AllFields.IrisCode1;
        Iris[1] = AllFields.Iris1;
        Iris[2] = AllFields.IrisCode2;
        Iris[3] = AllFields.Iris2;
        
        UpdatableDigitalSign = new Field[1];
        UpdatableDigitalSign[0] = AllFields.UpdatableDataDigitalSignature;
        
        UpdatableVerInfo = new Field[4];
        
        UpdatableVerInfo[0] = AllFields.UpdatableDataDigitalSignaturePubKeyId;
        UpdatableVerInfo[1] = AllFields.UpdatableVerKeyId;
        UpdatableVerInfo[2] = AllFields.UpdatablePersoKeyId;
        UpdatableVerInfo[3] = AllFields.UpdatableEncVer;
        
        
        IcaoSod = new Field[1];
        IcaoSod[0] = AllFields.IcaoSod;
        
        IcaoCom = new Field[1];
        IcaoCom[0] = AllFields.IcaoCom;
        
        IcaoDg1 = new Field[1];
        IcaoDg1[0] = AllFields.IcaoDg1;
        
        IcaoDg2 = new Field[1];
        IcaoDg2[0] = AllFields.IcaoDg2;
        
        
        ReadOnlyDataFilesInfo = new DataFile[9];
        
        ReadOnlyDataFilesInfo[0] = new DataFile("DG1","0101","(",101,1,IcaoDg1);
        ReadOnlyDataFilesInfo[1] = new DataFile("DG2","0102",")",10458,1,IcaoDg2);
        ReadOnlyDataFilesInfo[2] = new DataFile("FPS","0103","~",1649,1,FingerprintSecret);
        ReadOnlyDataFilesInfo[3] = new DataFile("FPP","0104","&",1649,1,FingerprintPublic);
        ReadOnlyDataFilesInfo[4] = new DataFile("SDS","0105","#",134,1,DigitalSign);
        ReadOnlyDataFilesInfo[5] = new DataFile("SVER","0106","`",37,1,StaticVerInfo);
        ReadOnlyDataFilesInfo[6] = new DataFile("BG","0107","@",1571,1,Biographic);
        ReadOnlyDataFilesInfo[7] = new DataFile("SOD","011D","-",3072,1,IcaoSod);
        ReadOnlyDataFilesInfo[8] = new DataFile("COM","011E","=",39,1,IcaoCom);
        
        
        UpdatableDataFilesInfo = new DataFile[8];
        
        UpdatableDataFilesInfo[0] = new DataFile("DEM","0101","*",1042,5,Demographic);
        UpdatableDataFilesInfo[1] = new DataFile("EXBG","0102","%",433,5,ExtBiographic);
        UpdatableDataFilesInfo[2] = new DataFile("REL","0103","|",208,5,Relationships);
        UpdatableDataFilesInfo[3] = new DataFile("SUBS","0104","?",146,5,Subscriptions);
        UpdatableDataFilesInfo[4] = new DataFile("ADFP","0105","!",4941,5,AdditionalFingerprint);
        UpdatableDataFilesInfo[5] = new DataFile("IRIS","0106","^",8017,5,Iris);
        UpdatableDataFilesInfo[6] = new DataFile("UDS","0107",":",134,5,UpdatableDigitalSign);
        UpdatableDataFilesInfo[7] = new DataFile("UVER","0108","{",43,5,UpdatableVerInfo);
    
        
        InternalFilesInfo = new InternalFile[3];
        
        InternalFilesInfo[0] = new InternalFile("PIN","4001",2,6);
        InternalFilesInfo[1] = new InternalFile("Key","4002",4,21);
        InternalFilesInfo[2] = new InternalFile("SE","4003",2,32);
        
        
        AdditionalDg1 = new Field[1];
        AdditionalDg1[0] = new Field("AdditionalDg1","@");
        
        AdditionalDg2 = new Field[1];
        AdditionalDg2[0] = new Field("AdditionalDg2","@");
        
        AdditionalDg3 = new Field[1];
        AdditionalDg3[0] = new Field("AdditionalDg3","@");
        
        AdditionalDg4 = new Field[1];
        AdditionalDg4[0] = new Field("AdditionalDg4","@");
        
        AdditionalDg5 = new Field[1];
        AdditionalDg5[0] = new Field("AdditionalDg5","@");
        
        AdditionalDg6 = new Field[1];
        AdditionalDg6[0] = new Field("AdditionalDg6","@");
        
        AdditionalDg7 = new Field[1];
        AdditionalDg7[0] = new Field("AdditionalDg7","@");
        
        AdditionalDg8 = new Field[1];
        AdditionalDg8[0] = new Field("AdditionalDg8","@");
        
        AdditionalDg9 = new Field[1];
        AdditionalDg9[0] = new Field("AdditionalDg9","@");
        
        AdditionalDg10 = new Field[1];
        AdditionalDg10[0] = new Field("AdditionalDg10","@");
        
        AdditionalDg11 = new Field[1];
        AdditionalDg11[0] = new Field("AdditionalDg11","@");
        
        AdditionalDg12 = new Field[1];
        AdditionalDg12[0] = new Field("AdditionalDg12","@");
        
        AdditionalDg13 = new Field[1];
        AdditionalDg13[0] = new Field("AdditionalDg13","@");
        
        AdditionalDg14 = new Field[1];
        AdditionalDg14[0] = new Field("AdditionalDg14","@");
        
        AdditionalDg15 = new Field[1];
        AdditionalDg15[0] = new Field("AdditionalDg15","@");
        
        AdditionalDg16 = new Field[1];
        AdditionalDg16[0] = new Field("AdditionalDg16","@");
        
        AdditionalDg17 = new Field[1];
        AdditionalDg17[0] = new Field("AdditionalDg17","@");
        
        AdditionalDg18 = new Field[1];
        AdditionalDg18[0] = new Field("AdditionalDg18","@");
        
        AdditionalDg19 = new Field[1];
        AdditionalDg19[0] = new Field("AdditionalDg19","@");
        
        AdditionalDg20 = new Field[1];
        AdditionalDg20[0] = new Field("AdditionalDg20","@");
        
        AdditionalDg21 = new Field[1];
        AdditionalDg21[0] = new Field("AdditionalDg21","@");
        
        AdditionalDataFileInfo = new DataFile[21];
        
        AdditionalDataFileInfo[0] = new DataFile("AdditionalDF","7F00","(",4096,4,AdditionalDg1);
        AdditionalDataFileInfo[1] = new DataFile("AdditionalDF","7F01","(",2048,4,AdditionalDg2);
        AdditionalDataFileInfo[2] = new DataFile("AdditionalDF","7F02","(",2048,4,AdditionalDg3);
        AdditionalDataFileInfo[3] = new DataFile("AdditionalDF","7F03","(",2048,4,AdditionalDg4);
        AdditionalDataFileInfo[4] = new DataFile("AdditionalDF","7F04","(",2048,4,AdditionalDg5);
        AdditionalDataFileInfo[5] = new DataFile("AdditionalDF","7F05","(",512,4,AdditionalDg6);
        AdditionalDataFileInfo[6] = new DataFile("AdditionalDF","7F06","(",512,4,AdditionalDg7);
        AdditionalDataFileInfo[7] = new DataFile("AdditionalDF","7F07","(",512,4,AdditionalDg8);
        AdditionalDataFileInfo[8] = new DataFile("AdditionalDF","7F08","(",512,4,AdditionalDg9);
        AdditionalDataFileInfo[9] = new DataFile("AdditionalDF","7F09","(",512,4,AdditionalDg10);
        AdditionalDataFileInfo[10] = new DataFile("AdditionalDF","7F0A","(",512,4,AdditionalDg11);
        AdditionalDataFileInfo[11] = new DataFile("AdditionalDF","7F0B","(",512,4,AdditionalDg12);
        AdditionalDataFileInfo[12] = new DataFile("AdditionalDF","7F0C","(",512,4,AdditionalDg13);
        AdditionalDataFileInfo[13] = new DataFile("AdditionalDF","7F0D","(",512,4,AdditionalDg14);
        AdditionalDataFileInfo[14] = new DataFile("AdditionalDF","7F0E","(",512,4,AdditionalDg15);
        AdditionalDataFileInfo[15] = new DataFile("AdditionalDF","7F0F","(",512,4,AdditionalDg16);
        AdditionalDataFileInfo[16] = new DataFile("AdditionalDF","7F10","(",512,4,AdditionalDg17);
        AdditionalDataFileInfo[17] = new DataFile("AdditionalDF","7F11","(",512,4,AdditionalDg18);
        AdditionalDataFileInfo[18] = new DataFile("AdditionalDF","7F12","(",512,4,AdditionalDg19);
        AdditionalDataFileInfo[19] = new DataFile("AdditionalDF","7F13","(",512,4,AdditionalDg20);
        AdditionalDataFileInfo[20] = new DataFile("AdditionalDF","7F14","(",512,4,AdditionalDg21);
                       
        
    };
}
