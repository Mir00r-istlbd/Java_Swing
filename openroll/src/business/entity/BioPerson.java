/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entity;

import business.bean.Utils;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Maverick
 */
public class BioPerson {

    private Long id;
    private BioBiometric biometric;
    private String pinNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String firstNameBn;
    private String middleNameBn;
    private String lastNameBn;
    private String gender;
    private String spouseFirstName;
    private String spouseMiddleName;
    private String spouseLastName;
    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;
    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;
    private String grandFatherFirstName;
    private String grandFatherMiddleName;
    private String grandFatherLastName;
    private String nidNumber;
    private String nidIssueDate;
    private String dateOfBirth;
    private String nidIssueDivision;
    private String birthDivision;
    private String birthDistrict;
    private String birthUpozila;
    private String permDivision;
    private String permDistrict;
    private String permUpozila;
    private String permStreet;
    private String presentDivision;
    private String presentDistrict;
    private String presentUpozila;
    private String presentStreet;
    private String handicapInfo;
    private String handicapRemarks;
    private String educated;
    private String educationLevel;
    private String email;
    private String phone;
    private String mobile;
    private String otherInfo;
    private String religion;
    private String dlNumber;
    private String passport;
    private String tin;
    private String status;
    private String createdBy;
    private String creationDate;
    private String lastUpdatedBy;
    private String lastUpdateDate;
    
    private String applicantType;

    //-------------------------------------------------- new fields ------------------------------
    
    private String nameEn;
    private String nameBn;
    private String fatherName;
    private String motherName;
    private String spouseName;
    private String maritalStatus;
    private String bloodGroup;
    private String fatherNid;
    private String motherNid;
    private String spouseNid;
    private String nationality;
    private String birthRegistrationNumber;
    private String uniqueIdentificationMark;
    private String presentRmo;
    private String presentCity;
    private String presentEunion;
    private String presentMouza;
    private String presentMouzaOtr;
    private String presentVillage;
    private String presentVillageOtr;
    private String presentPostOffice;
    private String presentPostCode;
    private String presentHouseNo;
    private String permanentRmo;
    private String permanentCity;
    private String permanentEunion;
    private String permanentMouza;
    private String permanentMouzaOtr;
    private String permanentVillage;
    private String permanentVillageOtr;
    private String permanentPostOffice;
    private String permanentPostCode;
    private String permanentHouseNo;
    private String voterAt;
    private String voterArea;
    private String profession;
    
    public BioPerson() {
    }

    public BioPerson(database.entity.BioPerson personEO) {
        this.id = personEO.getId();
        this.biometric = new BioBiometric(personEO.getBiometric());
        this.id = personEO.getId();
        this.pinNo = personEO.getPinNo();
        this.firstName = personEO.getFirstName();
        this.middleName = personEO.getMiddleName();
        this.lastName = personEO.getLastName();
        this.firstNameBn = personEO.getFirstNameBn();
        this.middleNameBn = personEO.getMiddleNameBn();
        this.lastNameBn = personEO.getLastNameBn();
        this.gender = personEO.getGender();
        this.spouseFirstName = personEO.getSpouseFirstName();
        this.spouseMiddleName = personEO.getSpouseMiddleName();
        this.spouseLastName = personEO.getSpouseLastName();
        this.motherFirstName = personEO.getMotherFirstName();
        this.motherMiddleName = personEO.getMotherMiddleName();
        this.motherLastName = personEO.getMotherLastName();
        this.fatherFirstName = personEO.getFatherFirstName();
        this.fatherMiddleName = personEO.getFatherMiddleName();
        this.fatherLastName = personEO.getFatherLastName();
        this.grandFatherFirstName = personEO.getGrandFatherFirstName();
        this.grandFatherMiddleName = personEO.getGrandFatherMiddleName();
        this.grandFatherLastName = personEO.getGrandFatherLastName();
        this.nidNumber = personEO.getNidNumber();
        this.nidIssueDate = Utils.getDateToString(personEO.getNidIssueDate());
        this.dateOfBirth = Utils.getDateToString(personEO.getDateOfBirth());
        this.nidIssueDivision = personEO.getNidIssueDivision();
        this.birthDivision = personEO.getBirthDivision();
        this.birthDistrict = personEO.getBirthDistrict();
        this.birthUpozila = personEO.getBirthUpozila();
        this.permDivision = personEO.getPermDivision();
        this.permDistrict = personEO.getPermDistrict();
        this.permUpozila = personEO.getPermUpozila();
        this.permStreet = personEO.getPermStreet();
        this.presentDivision = personEO.getPresentDivision();
        this.presentDistrict = personEO.getPresentDistrict();
        this.presentUpozila = personEO.getPresentUpozila();
        this.presentStreet = personEO.getPresentStreet();
        this.handicapInfo = personEO.getHandicapInfo();
        this.handicapRemarks = personEO.getHandicapRemarks();
        this.educated = personEO.getEducated();
        this.educationLevel = personEO.getEducationLevel();
        this.email = personEO.getEmail();
        this.phone = personEO.getPhone();
        this.mobile = personEO.getMobile();
        this.otherInfo = personEO.getOtherInfo();
        this.religion = personEO.getReligion();
        this.dlNumber = personEO.getDlNumber();
        this.passport = personEO.getPassport();
        this.tin = personEO.getTin();
        this.status = personEO.getStatus();
        this.createdBy = personEO.getCreatedBy();
        this.creationDate = Utils.getDateToString(personEO.getCreationDate());
        this.lastUpdatedBy = personEO.getLastUpdatedBy();
        this.lastUpdateDate = Utils.getDateToString(personEO.getLastUpdateDate());
        
        this.applicantType = personEO.getApplicantType();
        
        //--------------------------- new -----------------------------------------

        this.nameEn = personEO.getFullName();
        this.nameBn = personEO.getFullNameBn();
        this.fatherName = personEO.getFatherName();
        this.motherName = personEO.getMotherName();
        this.spouseName = personEO.getSpouseName();
        this.fatherNid = personEO.getFatherNid();
        this.motherNid = personEO.getMotherNid();
        this.spouseNid = personEO.getSpouseNid();
        this.maritalStatus = personEO.getMaritalStatus();
        this.bloodGroup = personEO.getBloodGrp();
        this.nationality = personEO.getNationality();
        this.uniqueIdentificationMark = personEO.getUniqueIdMark();
        this.birthRegistrationNumber = personEO.getBirthRegNo();
        this.presentRmo = personEO.getPresentRmo();
        this.presentCity = personEO.getPresentCity();
        this.presentEunion = personEO.getPresentEunion();
        this.presentMouza = personEO.getPresentArea();
        this.presentMouzaOtr = personEO.getPresentAreaOtr();
        this.presentVillage = personEO.getPresentVillage();
        this.presentVillageOtr = personEO.getPresentVillageOtr();
        this.presentPostOffice = personEO.getPresentPostOffice();
        this.presentPostCode = personEO.getPresentPostCode();
        this.presentHouseNo = personEO.getPresentStreet();
        this.permanentRmo = personEO.getPermRmo();
        this.permanentCity = personEO.getPermCity();
        this.permanentEunion = personEO.getPermEunion();
        this.permanentMouza = personEO.getPermArea();
        this.permanentMouzaOtr = personEO.getPermAreaOtr();
        this.permanentVillage = personEO.getPermVillage();
        this.permanentVillageOtr = personEO.getPermVillageOtr();
        this.permanentPostOffice = personEO.getPermPostOffice();
        this.permanentPostCode = personEO.getPermPostCode();
        this.permanentHouseNo = personEO.getPermStreet();
        this.voterAt = personEO.getVoterAt();
        this.voterArea = personEO.getVoterArea();
        this.profession = personEO.getProfession();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BioBiometric getBiometric() {
        return biometric;
    }

    public void setBiometric(BioBiometric biometric) {
        this.biometric = biometric;
    }

    public String getPinNo() {
        return pinNo;
    }

    public void setPinNo(String pinNo) {
        this.pinNo = pinNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNameBn() {
        return firstNameBn;
    }

    public void setFirstNameBn(String firstNameBn) {
        this.firstNameBn = firstNameBn;
    }

    public String getMiddleNameBn() {
        return middleNameBn;
    }

    public void setMiddleNameBn(String middleNameBn) {
        this.middleNameBn = middleNameBn;
    }

    public String getLastNameBn() {
        return lastNameBn;
    }

    public void setLastNameBn(String lastNameBn) {
        this.lastNameBn = lastNameBn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    public void setSpouseMiddleName(String spouseMiddleName) {
        this.spouseMiddleName = spouseMiddleName;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getGrandFatherFirstName() {
        return grandFatherFirstName;
    }

    public void setGrandFatherFirstName(String grandFatherFirstName) {
        this.grandFatherFirstName = grandFatherFirstName;
    }

    public String getGrandFatherMiddleName() {
        return grandFatherMiddleName;
    }

    public void setGrandFatherMiddleName(String grandFatherMiddleName) {
        this.grandFatherMiddleName = grandFatherMiddleName;
    }

    public String getGrandFatherLastName() {
        return grandFatherLastName;
    }

    public void setGrandFatherLastName(String grandFatherLastName) {
        this.grandFatherLastName = grandFatherLastName;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getNidIssueDate() {
        return nidIssueDate;
    }

    public void setNidIssueDate(String nidIssueDate) {
        this.nidIssueDate = nidIssueDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNidIssueDivision() {
        return nidIssueDivision;
    }

    public void setNidIssueDivision(String nidIssueDivision) {
        this.nidIssueDivision = nidIssueDivision;
    }

    public String getBirthDivision() {
        return birthDivision;
    }

    public void setBirthDivision(String birthDivision) {
        this.birthDivision = birthDivision;
    }

    public String getBirthDistrict() {
        return birthDistrict;
    }

    public void setBirthDistrict(String birthDistrict) {
        this.birthDistrict = birthDistrict;
    }

    public String getBirthUpozila() {
        return birthUpozila;
    }

    public void setBirthUpozila(String birthUpozila) {
        this.birthUpozila = birthUpozila;
    }

    public String getPermDivision() {
        return permDivision;
    }

    public void setPermDivision(String permDivision) {
        this.permDivision = permDivision;
    }

    public String getPermDistrict() {
        return permDistrict;
    }

    public void setPermDistrict(String permDistrict) {
        this.permDistrict = permDistrict;
    }

    public String getPermUpozila() {
        return permUpozila;
    }

    public void setPermUpozila(String permUpozila) {
        this.permUpozila = permUpozila;
    }

    public String getPermStreet() {
        return permStreet;
    }

    public void setPermStreet(String permStreet) {
        this.permStreet = permStreet;
    }

    public String getPresentDivision() {
        return presentDivision;
    }

    public void setPresentDivision(String presentDivision) {
        this.presentDivision = presentDivision;
    }

    public String getPresentDistrict() {
        return presentDistrict;
    }

    public void setPresentDistrict(String presentDistrict) {
        this.presentDistrict = presentDistrict;
    }

    public String getPresentUpozila() {
        return presentUpozila;
    }

    public void setPresentUpozila(String presentUpozila) {
        this.presentUpozila = presentUpozila;
    }

    public String getPresentStreet() {
        return presentStreet;
    }

    public void setPresentStreet(String presentStreet) {
        this.presentStreet = presentStreet;
    }

    public String getHandicapInfo() {
        return handicapInfo;
    }

    public void setHandicapInfo(String handicapInfo) {
        this.handicapInfo = handicapInfo;
    }

    public String getHandicapRemarks() {
        return handicapRemarks;
    }

    public void setHandicapRemarks(String handicapRemarks) {
        this.handicapRemarks = handicapRemarks;
    }

    public String getEducated() {
        return educated;
    }

    public void setEducated(String educated) {
        this.educated = educated;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }
    
    
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameBn() {
        return nameBn;
    }

    public void setNameBn(String nameBn) {
        this.nameBn = nameBn;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getFatherNid() {
        return fatherNid;
    }

    public void setFatherNid(String fatherNid) {
        this.fatherNid = fatherNid;
    }

    public String getMotherNid() {
        return motherNid;
    }

    public void setMotherNid(String motherNid) {
        this.motherNid = motherNid;
    }

    public String getSpouseNid() {
        return spouseNid;
    }

    public void setSpouseNid(String spouseNid) {
        this.spouseNid = spouseNid;
    }
    
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthRegistrationNumber() {
        return birthRegistrationNumber;
    }

    public void setBirthRegistrationNumber(String birthRegistrationNumber) {
        this.birthRegistrationNumber = birthRegistrationNumber;
    }

    public String getUniqueIdentificationMark() {
        return uniqueIdentificationMark;
    }

    public void setUniqueIdentificationMark(String uniqueIdentificationMark) {
        this.uniqueIdentificationMark = uniqueIdentificationMark;
    }

    public String getPresentRmo() {
        return presentRmo;
    }

    public void setPresentRmo(String presentRmo) {
        this.presentRmo = presentRmo;
    }

    public String getPresentCity() {
        return presentCity;
    }

    public void setPresentCity(String presentCity) {
        this.presentCity = presentCity;
    }

    public String getPresentEunion() {
        return presentEunion;
    }

    public void setPresentEunion(String presentEunion) {
        this.presentEunion = presentEunion;
    }

    public String getPresentMouza() {
        return presentMouza;
    }

    public void setPresentMouza(String presentMouza) {
        this.presentMouza = presentMouza;
    }

    public String getPresentMouzaOtr() {
        return presentMouzaOtr;
    }

    public void setPresentMouzaOtr(String presentMouzaOtr) {
        this.presentMouzaOtr = presentMouzaOtr;
    }

    public String getPresentVillage() {
        return presentVillage;
    }

    public void setPresentVillage(String presentVillage) {
        this.presentVillage = presentVillage;
    }

    public String getPresentVillageOtr() {
        return presentVillageOtr;
    }

    public void setPresentVillageOtr(String presentVillageOtr) {
        this.presentVillageOtr = presentVillageOtr;
    }

    public String getPresentPostOffice() {
        return presentPostOffice;
    }

    public void setPresentPostOffice(String presentPostOffice) {
        this.presentPostOffice = presentPostOffice;
    }

    public String getPresentPostCode() {
        return presentPostCode;
    }

    public void setPresentPostCode(String presentPostCode) {
        this.presentPostCode = presentPostCode;
    }

    public String getPresentHouseNo() {
        return presentHouseNo;
    }

    public void setPresentHouseNo(String presentHouseNo) {
        this.presentHouseNo = presentHouseNo;
    }

    public String getPermanentRmo() {
        return permanentRmo;
    }

    public void setPermanentRmo(String permanentRmo) {
        this.permanentRmo = permanentRmo;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }

    public String getPermanentEunion() {
        return permanentEunion;
    }

    public void setPermanentEunion(String permanentEunion) {
        this.permanentEunion = permanentEunion;
    }

    public String getPermanentMouza() {
        return permanentMouza;
    }

    public void setPermanentMouza(String permanentMouza) {
        this.permanentMouza = permanentMouza;
    }

    public String getPermanentMouzaOtr() {
        return permanentMouzaOtr;
    }

    public void setPermanentMouzaOtr(String permanentMouzaOtr) {
        this.permanentMouzaOtr = permanentMouzaOtr;
    }

    public String getPermanentVillage() {
        return permanentVillage;
    }

    public void setPermanentVillage(String permanentVillage) {
        this.permanentVillage = permanentVillage;
    }

    public String getPermanentVillageOtr() {
        return permanentVillageOtr;
    }

    public void setPermanentVillageOtr(String permanentVillageOtr) {
        this.permanentVillageOtr = permanentVillageOtr;
    }

    public String getPermanentPostOffice() {
        return permanentPostOffice;
    }

    public void setPermanentPostOffice(String permanentPostOffice) {
        this.permanentPostOffice = permanentPostOffice;
    }

    public String getPermanentPostCode() {
        return permanentPostCode;
    }

    public void setPermanentPostCode(String permanentPostCode) {
        this.permanentPostCode = permanentPostCode;
    }

    public String getPermanentHouseNo() {
        return permanentHouseNo;
    }

    public void setPermanentHouseNo(String permanentHouseNo) {
        this.permanentHouseNo = permanentHouseNo;
    }

    public String getVoterAt() {
        return voterAt;
    }

    public void setVoterAt(String voterAt) {
        this.voterAt = voterAt;
    }

    public String getVoterArea() {
        return voterArea;
    }

    public void setVoterArea(String voterArea) {
        this.voterArea = voterArea;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
}
