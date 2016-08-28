/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.dao;

//import com.perp.proxy.GetDetailVoterInformationResponse;
//import com.perp.proxy.VoterInfo;
import java.util.List;

/**
 *
 * @author Maverick
 */
public class VoterInformation {
/*
    public String bloodGroup;
    public String dateOfBirth;
    public String disability;
    public String drivingLicense;
    public String education;
    public String father;
    public String formNo;
    public List<String> fpNames;
    public String gender;
    public String identificationMark;
    public String maritalStatus;
    public Double matchPercentage;
    public String mobile;
    public String mother;
    public String nameBangla;
    public String nameEnglish;
    public String nationalId;
    public String occupation;
    public String passportNumber;
    public String phone;
    public byte[] photo;
    public String placeOfBirth;
    public String religion;
    public Long slno;
    public String spouse;
    public String tin;
    public String voterArea;
    public String voterAreaCode;
    public String voterNo;
    public String perm_additionalMouzaOrMoholla;
    public String perm_additionalVillageOrRoad;
    public String perm_cityCorporationOrMunicipality;
    public String perm_district;
    public String perm_division;
    public String perm_homeOrHoldingNo;
    public String perm_mouzaOrMoholla;
    public String perm_postOffice;
    public String perm_postalCode;
    public String perm_rmo;
    public String perm_unionOrWard;
    public String perm_upozila;
    public String perm_villageOrRoad;
    public String perm_voterArea;
    public Long perm_wardForUnionPorishod;
    public String present_additionalMouzaOrMoholla;
    public String present_additionalVillageOrRoad;
    public String present_cityCorporationOrMunicipality;
    public String present_district;
    public String present_division;
    public String present_homeOrHoldingNo;
    public String present_mouzaOrMoholla;
    public String present_postOffice;
    public String present_postalCode;
    public String present_rmo;
    public String present_unionOrWard;
    public String present_upozila;
    public String present_villageOrRoad;
    public String present_voterArea;
    public Long present_wardForUnionPorishod;
    
    
    public String permFullAddress;
    public String presentFullAddress;
    
    public VoterInformation()
    {}

    public VoterInformation(VoterInfo voterInfo) {
        bloodGroup = voterInfo.getBloodGroup();
        dateOfBirth = voterInfo.getDateOfBirth().toString();
        disability = voterInfo.getDisability();
        drivingLicense = voterInfo.getDrivingLicense();
        education = voterInfo.getEducation();
        father = voterInfo.getFather();
        formNo = voterInfo.getFormNo();
        gender = voterInfo.getGender();
        identificationMark = voterInfo.getIdentificationMark();
        maritalStatus = voterInfo.getMaritalStatus();
        matchPercentage = voterInfo.getMatchPercentage();
        mobile = voterInfo.getMobile();
        mother = voterInfo.getMother();
        nameBangla = voterInfo.getNameBangla();
        nameEnglish = voterInfo.getNameEnglish();
        nationalId = voterInfo.getNationalId();
        occupation = voterInfo.getOccupation();
        passportNumber = voterInfo.getPassportNumber();
        phone = voterInfo.getPhone();
        photo = voterInfo.getPhoto();
        placeOfBirth = voterInfo.getPlaceOfBirth();
        religion = voterInfo.getReligion();
        slno = voterInfo.getSlno();
        spouse = voterInfo.getSpouse();
        tin = voterInfo.getTin();
        voterArea = voterInfo.getVoterArea();
        voterAreaCode = voterInfo.getVoterAreaCode();
        voterNo = voterInfo.getVoterNo();

        try {
            perm_additionalMouzaOrMoholla = voterInfo.getPermanentAddress().getAdditionalMouzaOrMoholla();
            perm_additionalVillageOrRoad = voterInfo.getPermanentAddress().getAdditionalVillageOrRoad();
            perm_cityCorporationOrMunicipality = voterInfo.getPermanentAddress().getCityCorporationOrMunicipality();
            perm_district = voterInfo.getPermanentAddress().getDistrict();
            perm_division = voterInfo.getPermanentAddress().getDivision();
            perm_homeOrHoldingNo = voterInfo.getPermanentAddress().getHomeOrHoldingNo();
            perm_mouzaOrMoholla = voterInfo.getPermanentAddress().getMouzaOrMoholla();
            perm_postOffice = voterInfo.getPermanentAddress().getPostOffice();
            perm_postalCode = voterInfo.getPermanentAddress().getPostalCode();
            perm_rmo = voterInfo.getPermanentAddress().getRmo();
            perm_unionOrWard = voterInfo.getPermanentAddress().getUnionOrWard();
            perm_upozila = voterInfo.getPermanentAddress().getUpozila();
            perm_villageOrRoad = voterInfo.getPermanentAddress().getVillageOrRoad();
            perm_voterArea = voterInfo.getPermanentAddress().getVoterArea();
            perm_wardForUnionPorishod = voterInfo.getPermanentAddress().getWardForUnionPorishod();
        } catch (Exception e) {
        }

        try {
            present_additionalMouzaOrMoholla = voterInfo.getPresentAddress().getAdditionalMouzaOrMoholla();
            present_additionalVillageOrRoad = voterInfo.getPresentAddress().getAdditionalVillageOrRoad();
            present_cityCorporationOrMunicipality = voterInfo.getPresentAddress().getCityCorporationOrMunicipality();
            present_district = voterInfo.getPresentAddress().getDistrict();
            present_division = voterInfo.getPresentAddress().getDivision();
            present_homeOrHoldingNo = voterInfo.getPresentAddress().getHomeOrHoldingNo();
            present_mouzaOrMoholla = voterInfo.getPresentAddress().getMouzaOrMoholla();
            present_postOffice = voterInfo.getPresentAddress().getPostOffice();
            present_postalCode = voterInfo.getPresentAddress().getPostalCode();
            present_rmo = voterInfo.getPresentAddress().getRmo();
            present_unionOrWard = voterInfo.getPresentAddress().getUnionOrWard();
            present_upozila = voterInfo.getPresentAddress().getUpozila();
            present_villageOrRoad = voterInfo.getPresentAddress().getVillageOrRoad();
            present_voterArea = voterInfo.getPresentAddress().getVoterArea();
            present_wardForUnionPorishod = voterInfo.getPresentAddress().getWardForUnionPorishod();
        } catch (Exception e) {
        }
        
        permFullAddress="";
        presentFullAddress="";

    }
    public VoterInformation(GetDetailVoterInformationResponse voterInfo) {
        dateOfBirth = voterInfo.getDob().toString();
        father = voterInfo.getFather();
        gender = voterInfo.getGender();
        mother = voterInfo.getMother();
        nameBangla = voterInfo.getName();
        nameEnglish = voterInfo.getNameEn();
        nationalId = voterInfo.getNid();
        photo = voterInfo.getPhoto();
        spouse = voterInfo.getSpouse();
        permFullAddress=voterInfo.getPermanentAddress();
        presentFullAddress=voterInfo.getPresentAddress();
    }
    */ 
}
