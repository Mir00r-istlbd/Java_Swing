/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client.bean;

import java.math.BigDecimal;

/**
 *
 * @author User
 */
public class ApplicationData {

    private Long id;
    private Long biometricId;
    private String pinNo;
    private String gender;
    private String nidNumber;
    private String nidIssueDate;
    private String dateOfBirth;
    private String permDivision;
    private String permDistrict;
    private String permUpozila;
    private String presentDivision;
    private String presentDistrict;
    private String presentUpozila;
    private String handicapInfo;
    private String handicapRemarks;
    private String educationLevel;
    private String email;
    private String phone;
    private String mobile;
    private String otherInfo;
    private String religion;
    private String dlNumber;
    private String passport;
    private String tin;
    private byte[] photo;
    private byte[] signature;
    private String fingerRemarks;
    private byte[] wsqRt;
    private byte[] wsqRi;
    private byte[] wsqRm;
    private byte[] wsqRr;
    private byte[] wsqRl;
    private byte[] wsqLt;
    private byte[] wsqLi;
    private byte[] wsqLm;
    private byte[] wsqLr;
    private byte[] wsqLl;
    private byte[] ansiRt;
    private byte[] ansiRi;
    private byte[] ansiRm;
    private byte[] ansiRr;
    private byte[] ansiRl;
    private byte[] ansiLt;
    private byte[] ansiLi;
    private byte[] ansiLm;
    private byte[] ansiLr;
    private byte[] ansiLl;
    private byte[] citizenshipAttachment1;
    private byte[] citizenshipAttachment2;
    private byte[] marriageAttachment1;
    private byte[] marriageAttachment2;
    private byte[] transferAttachment1;
    private byte[] transferAttachment2;
    private byte[] utilityAttachment1;
    private byte[] utilityAttachment2;
    private byte[] otherAttachment1;
    private byte[] otherAttachment2;
    private byte[] left_eye;
    private byte[] right_eye;
    private String afisStatus;
//------------------------------------ unused ------------------------------------
    private String firstName;
    private String middleName;
    private String lastName;
    private String firstNameBn;
    private String middleNameBn;
    private String lastNameBn;
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
    private String nidIssueDivision;
    private String birthDivision;
    private String birthDistrict;
    private String birthUpozila;
    private String permStreet;
    private String presentStreet;
    private String educated;
//------------------------------------ new fields --------------------------------
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
    private String presentHouseNo;
    private String presentPostOffice;
    private String presentPostCode;
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
    
    private String applicantType;
    
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
        System.out.println("get presentDivision: "+presentDivision);
        return presentDivision;
    }

    public void setPresentDivision(String presentDivision) {
        this.presentDivision = presentDivision;
        System.out.println("set presentDivision: "+presentDivision);
    }

    public String getPresentDistrict() {
        System.out.println("get presentDistrict: "+presentDistrict);
        return presentDistrict;
    }

    public void setPresentDistrict(String presentDistrict) {
        this.presentDistrict = presentDistrict;
        System.out.println("set presentDistrict: "+presentDistrict);
    }

    public String getPresentUpozila() {
        System.out.println("get presentUpozila: "+presentUpozila);
        return presentUpozila;
    }

    public void setPresentUpozila(String presentUpozila) {
        this.presentUpozila = presentUpozila;
        System.out.println("set presentUpozila: "+presentUpozila);
    }

    public String getPresentStreet() {
        System.out.println("get presentStreet: "+presentStreet);
        return presentStreet;
    }

    public void setPresentStreet(String presentStreet) {
        this.presentStreet = presentStreet;
        System.out.println("set presentStreet: "+presentStreet);
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    public String getFingerRemarks() {
        return fingerRemarks;
    }

    public void setFingerRemarks(String fingerRemarks) {
        this.fingerRemarks = fingerRemarks;
    }

    public byte[] getWsqRt() {
        return wsqRt;
    }

    public void setWsqRt(byte[] wsqRt) {
        this.wsqRt = wsqRt;
    }

    public byte[] getWsqRi() {
        return wsqRi;
    }

    public void setWsqRi(byte[] wsqRi) {
        this.wsqRi = wsqRi;
    }

    public byte[] getWsqRm() {
        return wsqRm;
    }

    public void setWsqRm(byte[] wsqRm) {
        this.wsqRm = wsqRm;
    }

    public byte[] getWsqRr() {
        return wsqRr;
    }

    public void setWsqRr(byte[] wsqRr) {
        this.wsqRr = wsqRr;
    }

    public byte[] getWsqRl() {
        return wsqRl;
    }

    public void setWsqRl(byte[] wsqRl) {
        this.wsqRl = wsqRl;
    }

    public byte[] getWsqLt() {
        return wsqLt;
    }

    public void setWsqLt(byte[] wsqLt) {
        this.wsqLt = wsqLt;
    }

    public byte[] getWsqLi() {
        return wsqLi;
    }

    public void setWsqLi(byte[] wsqLi) {
        this.wsqLi = wsqLi;
    }

    public byte[] getWsqLm() {
        return wsqLm;
    }

    public void setWsqLm(byte[] wsqLm) {
        this.wsqLm = wsqLm;
    }

    public byte[] getWsqLr() {
        return wsqLr;
    }

    public void setWsqLr(byte[] wsqLr) {
        this.wsqLr = wsqLr;
    }

    public byte[] getWsqLl() {
        return wsqLl;
    }

    public void setWsqLl(byte[] wsqLl) {
        this.wsqLl = wsqLl;
    }

    public byte[] getAnsiRt() {
        return ansiRt;
    }

    public void setAnsiRt(byte[] ansiRt) {
        this.ansiRt = ansiRt;
    }

    public byte[] getAnsiRi() {
        return ansiRi;
    }

    public void setAnsiRi(byte[] ansiRi) {
        this.ansiRi = ansiRi;
    }

    public byte[] getAnsiRm() {
        return ansiRm;
    }

    public void setAnsiRm(byte[] ansiRm) {
        this.ansiRm = ansiRm;
    }

    public byte[] getAnsiRr() {
        return ansiRr;
    }

    public void setAnsiRr(byte[] ansiRr) {
        this.ansiRr = ansiRr;
    }

    public byte[] getAnsiRl() {
        return ansiRl;
    }

    public void setAnsiRl(byte[] ansiRl) {
        this.ansiRl = ansiRl;
    }

    public byte[] getAnsiLt() {
        return ansiLt;
    }

    public void setAnsiLt(byte[] ansiLt) {
        this.ansiLt = ansiLt;
    }

    public byte[] getAnsiLi() {
        return ansiLi;
    }

    public void setAnsiLi(byte[] ansiLi) {
        this.ansiLi = ansiLi;
    }

    public byte[] getAnsiLm() {
        return ansiLm;
    }

    public void setAnsiLm(byte[] ansiLm) {
        this.ansiLm = ansiLm;
    }

    public byte[] getAnsiLr() {
        return ansiLr;
    }

    public void setAnsiLr(byte[] ansiLr) {
        this.ansiLr = ansiLr;
    }

    public byte[] getAnsiLl() {
        return ansiLl;
    }

    public void setAnsiLl(byte[] ansiLl) {
        this.ansiLl = ansiLl;
    }

    public String getAfisStatus() {
        return afisStatus;
    }

    public void setAfisStatus(String afisStatus) {
        this.afisStatus = afisStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBiometricId() {
        return biometricId;
    }

    public void setBiometricId(Long biometricId) {
        this.biometricId = biometricId;
    }

    public byte[] getCitizenshipAttachment1() {
        return citizenshipAttachment1;
    }

    public void setCitizenshipAttachment1(byte[] citizenshipAttachment1) {
        this.citizenshipAttachment1 = citizenshipAttachment1;
    }

    public byte[] getCitizenshipAttachment2() {
        return citizenshipAttachment2;
    }

    public void setCitizenshipAttachment2(byte[] citizenshipAttachment2) {
        this.citizenshipAttachment2 = citizenshipAttachment2;
    }

    public byte[] getMarriageAttachment1() {
        return marriageAttachment1;
    }

    public void setMarriageAttachment1(byte[] marriageAttachment1) {
        this.marriageAttachment1 = marriageAttachment1;
    }

    public byte[] getMarriageAttachment2() {
        return marriageAttachment2;
    }

    public void setMarriageAttachment2(byte[] marriageAttachment2) {
        this.marriageAttachment2 = marriageAttachment2;
    }

    public byte[] getTransferAttachment1() {
        return transferAttachment1;
    }

    public void setTransferAttachment1(byte[] transferAttachment1) {
        this.transferAttachment1 = transferAttachment1;
    }

    public byte[] getTransferAttachment2() {
        return transferAttachment2;
    }

    public void setTransferAttachment2(byte[] transferAttachment2) {
        this.transferAttachment2 = transferAttachment2;
    }

    public byte[] getUtilityAttachment1() {
        return utilityAttachment1;
    }

    public void setUtilityAttachment1(byte[] utilityAttachment1) {
        this.utilityAttachment1 = utilityAttachment1;
    }

    public byte[] getUtilityAttachment2() {
        return utilityAttachment2;
    }

    public void setUtilityAttachment2(byte[] utilityAttachment2) {
        this.utilityAttachment2 = utilityAttachment2;
    }

    public byte[] getOtherAttachment1() {
        return otherAttachment1;
    }

    public void setOtherAttachment1(byte[] otherAttachment1) {
        this.otherAttachment1 = otherAttachment1;
    }

    public byte[] getOtherAttachment2() {
        return otherAttachment2;
    }

    public void setOtherAttachment2(byte[] otherAttachment2) {
        this.otherAttachment2 = otherAttachment2;
    }

    public byte[] getLeft_eye() {
        return left_eye;
    }

    public void setLeft_eye(byte[] left_eye) {
        this.left_eye = left_eye;
    }

    public byte[] getRight_eye() {
        return right_eye;
    }

    public void setRight_eye(byte[] right_eye) {
        this.right_eye = right_eye;
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
        System.out.println("get presentRmo: "+presentRmo);
        return presentRmo;
    }

    public void setPresentRmo(String presentRmo) {
        this.presentRmo = presentRmo;
        System.out.println("set presentRmo: "+presentRmo);
    }

    public String getPresentCity() {
        System.out.println("Get presentCity: "+presentCity);
        return presentCity;
    }

    public void setPresentCity(String presentCity) {
        this.presentCity = presentCity;
        System.out.println("set presentCity: "+presentCity);
    }

    public String getPresentEunion() {
        System.out.println("get presentEunion: "+presentEunion);
        return presentEunion;
    }

    public void setPresentEunion(String presentEunion) {
        this.presentEunion = presentEunion;
        System.out.println("set presentEunion: "+presentEunion);
    }

    public String getPresentMouza() {
        System.out.println("get presentMouza: "+presentMouza);
        return presentMouza;
    }

    public void setPresentMouza(String presentMouza) {
        this.presentMouza = presentMouza;
        System.out.println("set presentMouza: "+presentMouza);
    }

    public String getPresentMouzaOtr() {
        System.out.println("get presentMouzaOtr: "+presentMouzaOtr);
        return presentMouzaOtr;
    }

    public void setPresentMouzaOtr(String presentMouzaOtr) {
        this.presentMouzaOtr = presentMouzaOtr;
        System.out.println("set presentMouzaOtr: "+presentMouzaOtr);
    }

    public String getPresentVillage() {
        System.out.println("get presentVillage: "+presentVillage);
        return presentVillage;
    }

    public void setPresentVillage(String presentVillage) {
        this.presentVillage = presentVillage;
        System.out.println("set presentVillage: "+presentVillage);
    }

    public String getPresentVillageOtr() {
        System.out.println("get presentVillageOtr: "+presentVillageOtr);
        return presentVillageOtr;
    }

    public void setPresentVillageOtr(String presentVillageOtr) {
        this.presentVillageOtr = presentVillageOtr;
        System.out.println("set presentVillageOtr: "+presentVillageOtr);
    }

    public String getPresentPostOffice() {
        System.out.println("get presentPostOffice: "+presentPostOffice);
        return presentPostOffice;
    }

    public void setPresentPostOffice(String presentPostOffice) {
        this.presentPostOffice = presentPostOffice;
        System.out.println("set presentPostOffice: "+presentPostOffice);
    }

    public String getPresentPostCode() {
        System.out.println("get presentPostCode: "+presentPostCode);
        return presentPostCode;
    }

    public void setPresentPostCode(String presentPostCode) {
        this.presentPostCode = presentPostCode;
        System.out.println("set presentPostCode: "+presentPostCode);
    }

    public String getPresentHouseNo() {
        System.out.println("get presentHouseNo: "+presentHouseNo);
        return presentHouseNo;
    }

    public void setPresentHouseNo(String presentHouseNo) {
        this.presentHouseNo = presentHouseNo;
        System.out.println("set presentHouseNo: "+presentHouseNo);
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

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }
    
}
