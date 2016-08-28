
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for voterDemographicInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voterDemographicInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalMouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCorporationOrMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deathYearOfFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathYearOfMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathYearOfSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drivingLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fathersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasNoFinger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasNoFingerPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homeOrHoldingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifyingSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritialStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mothersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameBangla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalIdOfFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalIdOfMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalIdOfSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureOfDisability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureOfDisabilityOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perAdditionalMouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perAdditionalVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCityCorporationOrMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perHomeOrHoldingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perMouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perPostOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perRmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perUnionOrWard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perUozilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perWardForUnionPorishod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfBirthOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unionOrWard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uozilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="villageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterBirthRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoOfFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoOfMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoOfSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterOfVoterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wardForUnionPorishod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterDemographicInformation", propOrder = {
    "additionalMouzaOrMoholla",
    "additionalVillageOrRoad",
    "bloodGroup",
    "cityCorporationOrMunicipality",
    "dateOfBirth",
    "dateOfDeath",
    "deathYearOfFather",
    "deathYearOfMother",
    "deathYearOfSpouse",
    "district",
    "division",
    "drivingLicenseNo",
    "education",
    "educationOther",
    "educationSub",
    "fathersName",
    "formNo",
    "gender",
    "hasNoFinger",
    "hasNoFingerPrint",
    "homeOrHoldingNo",
    "identifyingSymbol",
    "maritialStatus",
    "mobileNo",
    "mothersName",
    "mouzaOrMoholla",
    "nameBangla",
    "nameEnglish",
    "nationalId",
    "nationalIdOfFather",
    "nationalIdOfMother",
    "nationalIdOfSpouse",
    "natureOfDisability",
    "natureOfDisabilityOther",
    "occupation",
    "passportNo",
    "perAdditionalMouzaOrMoholla",
    "perAdditionalVillageOrRoad",
    "perCityCorporationOrMunicipality",
    "perDistrict",
    "perDivision",
    "perHomeOrHoldingNo",
    "perMouzaOrMoholla",
    "perPostOffice",
    "perPostalCode",
    "perRmo",
    "perUnionOrWard",
    "perUozilla",
    "perVillageOrRoad",
    "perWardForUnionPorishod",
    "phoneNo",
    "placeOfBirth",
    "placeOfBirthOther",
    "postOffice",
    "postalCode",
    "religion",
    "religionOther",
    "rmo",
    "serialNo",
    "spouseName",
    "status",
    "tag",
    "tinNo",
    "unionOrWard",
    "uozilla",
    "villageOrRoad",
    "voterArea",
    "voterBirthRegistrationNo",
    "voterId",
    "voterNo",
    "voterNoOfFather",
    "voterNoOfMother",
    "voterNoOfSpouse",
    "voterOfVoterArea",
    "wardForUnionPorishod"
})
public class VoterDemographicInformation {

    protected String additionalMouzaOrMoholla;
    protected String additionalVillageOrRoad;
    protected String bloodGroup;
    protected String cityCorporationOrMunicipality;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeath;
    protected String deathYearOfFather;
    protected String deathYearOfMother;
    protected String deathYearOfSpouse;
    protected String district;
    protected String division;
    protected String drivingLicenseNo;
    protected String education;
    protected String educationOther;
    protected String educationSub;
    protected String fathersName;
    protected String formNo;
    protected String gender;
    protected Boolean hasNoFinger;
    protected Boolean hasNoFingerPrint;
    protected String homeOrHoldingNo;
    protected String identifyingSymbol;
    protected String maritialStatus;
    protected String mobileNo;
    protected String mothersName;
    protected String mouzaOrMoholla;
    protected String nameBangla;
    protected String nameEnglish;
    protected String nationalId;
    protected String nationalIdOfFather;
    protected String nationalIdOfMother;
    protected String nationalIdOfSpouse;
    protected String natureOfDisability;
    protected String natureOfDisabilityOther;
    protected String occupation;
    protected String passportNo;
    protected String perAdditionalMouzaOrMoholla;
    protected String perAdditionalVillageOrRoad;
    protected String perCityCorporationOrMunicipality;
    protected String perDistrict;
    protected String perDivision;
    protected String perHomeOrHoldingNo;
    protected String perMouzaOrMoholla;
    protected String perPostOffice;
    protected String perPostalCode;
    protected String perRmo;
    protected String perUnionOrWard;
    protected String perUozilla;
    protected String perVillageOrRoad;
    protected String perWardForUnionPorishod;
    protected String phoneNo;
    protected String placeOfBirth;
    protected String placeOfBirthOther;
    protected String postOffice;
    protected String postalCode;
    protected String religion;
    protected String religionOther;
    protected String rmo;
    protected String serialNo;
    protected String spouseName;
    protected String status;
    protected String tag;
    protected String tinNo;
    protected String unionOrWard;
    protected String uozilla;
    protected String villageOrRoad;
    protected String voterArea;
    protected String voterBirthRegistrationNo;
    protected String voterId;
    protected String voterNo;
    protected String voterNoOfFather;
    protected String voterNoOfMother;
    protected String voterNoOfSpouse;
    protected String voterOfVoterArea;
    protected String wardForUnionPorishod;

    /**
     * Gets the value of the additionalMouzaOrMoholla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalMouzaOrMoholla() {
        return additionalMouzaOrMoholla;
    }

    /**
     * Sets the value of the additionalMouzaOrMoholla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalMouzaOrMoholla(String value) {
        this.additionalMouzaOrMoholla = value;
    }

    /**
     * Gets the value of the additionalVillageOrRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalVillageOrRoad() {
        return additionalVillageOrRoad;
    }

    /**
     * Sets the value of the additionalVillageOrRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalVillageOrRoad(String value) {
        this.additionalVillageOrRoad = value;
    }

    /**
     * Gets the value of the bloodGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Sets the value of the bloodGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodGroup(String value) {
        this.bloodGroup = value;
    }

    /**
     * Gets the value of the cityCorporationOrMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCorporationOrMunicipality() {
        return cityCorporationOrMunicipality;
    }

    /**
     * Sets the value of the cityCorporationOrMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCorporationOrMunicipality(String value) {
        this.cityCorporationOrMunicipality = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the deathYearOfFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathYearOfFather() {
        return deathYearOfFather;
    }

    /**
     * Sets the value of the deathYearOfFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathYearOfFather(String value) {
        this.deathYearOfFather = value;
    }

    /**
     * Gets the value of the deathYearOfMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathYearOfMother() {
        return deathYearOfMother;
    }

    /**
     * Sets the value of the deathYearOfMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathYearOfMother(String value) {
        this.deathYearOfMother = value;
    }

    /**
     * Gets the value of the deathYearOfSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathYearOfSpouse() {
        return deathYearOfSpouse;
    }

    /**
     * Sets the value of the deathYearOfSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathYearOfSpouse(String value) {
        this.deathYearOfSpouse = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the drivingLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    /**
     * Sets the value of the drivingLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingLicenseNo(String value) {
        this.drivingLicenseNo = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * Gets the value of the educationOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOther() {
        return educationOther;
    }

    /**
     * Sets the value of the educationOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOther(String value) {
        this.educationOther = value;
    }

    /**
     * Gets the value of the educationSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationSub() {
        return educationSub;
    }

    /**
     * Sets the value of the educationSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationSub(String value) {
        this.educationSub = value;
    }

    /**
     * Gets the value of the fathersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFathersName() {
        return fathersName;
    }

    /**
     * Sets the value of the fathersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFathersName(String value) {
        this.fathersName = value;
    }

    /**
     * Gets the value of the formNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNo() {
        return formNo;
    }

    /**
     * Sets the value of the formNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNo(String value) {
        this.formNo = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hasNoFinger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNoFinger() {
        return hasNoFinger;
    }

    /**
     * Sets the value of the hasNoFinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNoFinger(Boolean value) {
        this.hasNoFinger = value;
    }

    /**
     * Gets the value of the hasNoFingerPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNoFingerPrint() {
        return hasNoFingerPrint;
    }

    /**
     * Sets the value of the hasNoFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNoFingerPrint(Boolean value) {
        this.hasNoFingerPrint = value;
    }

    /**
     * Gets the value of the homeOrHoldingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeOrHoldingNo() {
        return homeOrHoldingNo;
    }

    /**
     * Sets the value of the homeOrHoldingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeOrHoldingNo(String value) {
        this.homeOrHoldingNo = value;
    }

    /**
     * Gets the value of the identifyingSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifyingSymbol() {
        return identifyingSymbol;
    }

    /**
     * Sets the value of the identifyingSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifyingSymbol(String value) {
        this.identifyingSymbol = value;
    }

    /**
     * Gets the value of the maritialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritialStatus() {
        return maritialStatus;
    }

    /**
     * Sets the value of the maritialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritialStatus(String value) {
        this.maritialStatus = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the mothersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersName() {
        return mothersName;
    }

    /**
     * Sets the value of the mothersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersName(String value) {
        this.mothersName = value;
    }

    /**
     * Gets the value of the mouzaOrMoholla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMouzaOrMoholla() {
        return mouzaOrMoholla;
    }

    /**
     * Sets the value of the mouzaOrMoholla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMouzaOrMoholla(String value) {
        this.mouzaOrMoholla = value;
    }

    /**
     * Gets the value of the nameBangla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameBangla() {
        return nameBangla;
    }

    /**
     * Sets the value of the nameBangla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameBangla(String value) {
        this.nameBangla = value;
    }

    /**
     * Gets the value of the nameEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEnglish() {
        return nameEnglish;
    }

    /**
     * Sets the value of the nameEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEnglish(String value) {
        this.nameEnglish = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the nationalIdOfFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdOfFather() {
        return nationalIdOfFather;
    }

    /**
     * Sets the value of the nationalIdOfFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdOfFather(String value) {
        this.nationalIdOfFather = value;
    }

    /**
     * Gets the value of the nationalIdOfMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdOfMother() {
        return nationalIdOfMother;
    }

    /**
     * Sets the value of the nationalIdOfMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdOfMother(String value) {
        this.nationalIdOfMother = value;
    }

    /**
     * Gets the value of the nationalIdOfSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdOfSpouse() {
        return nationalIdOfSpouse;
    }

    /**
     * Sets the value of the nationalIdOfSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdOfSpouse(String value) {
        this.nationalIdOfSpouse = value;
    }

    /**
     * Gets the value of the natureOfDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfDisability() {
        return natureOfDisability;
    }

    /**
     * Sets the value of the natureOfDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfDisability(String value) {
        this.natureOfDisability = value;
    }

    /**
     * Gets the value of the natureOfDisabilityOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfDisabilityOther() {
        return natureOfDisabilityOther;
    }

    /**
     * Sets the value of the natureOfDisabilityOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfDisabilityOther(String value) {
        this.natureOfDisabilityOther = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the perAdditionalMouzaOrMoholla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerAdditionalMouzaOrMoholla() {
        return perAdditionalMouzaOrMoholla;
    }

    /**
     * Sets the value of the perAdditionalMouzaOrMoholla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerAdditionalMouzaOrMoholla(String value) {
        this.perAdditionalMouzaOrMoholla = value;
    }

    /**
     * Gets the value of the perAdditionalVillageOrRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerAdditionalVillageOrRoad() {
        return perAdditionalVillageOrRoad;
    }

    /**
     * Sets the value of the perAdditionalVillageOrRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerAdditionalVillageOrRoad(String value) {
        this.perAdditionalVillageOrRoad = value;
    }

    /**
     * Gets the value of the perCityCorporationOrMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerCityCorporationOrMunicipality() {
        return perCityCorporationOrMunicipality;
    }

    /**
     * Sets the value of the perCityCorporationOrMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerCityCorporationOrMunicipality(String value) {
        this.perCityCorporationOrMunicipality = value;
    }

    /**
     * Gets the value of the perDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerDistrict() {
        return perDistrict;
    }

    /**
     * Sets the value of the perDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerDistrict(String value) {
        this.perDistrict = value;
    }

    /**
     * Gets the value of the perDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerDivision() {
        return perDivision;
    }

    /**
     * Sets the value of the perDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerDivision(String value) {
        this.perDivision = value;
    }

    /**
     * Gets the value of the perHomeOrHoldingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerHomeOrHoldingNo() {
        return perHomeOrHoldingNo;
    }

    /**
     * Sets the value of the perHomeOrHoldingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerHomeOrHoldingNo(String value) {
        this.perHomeOrHoldingNo = value;
    }

    /**
     * Gets the value of the perMouzaOrMoholla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerMouzaOrMoholla() {
        return perMouzaOrMoholla;
    }

    /**
     * Sets the value of the perMouzaOrMoholla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerMouzaOrMoholla(String value) {
        this.perMouzaOrMoholla = value;
    }

    /**
     * Gets the value of the perPostOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerPostOffice() {
        return perPostOffice;
    }

    /**
     * Sets the value of the perPostOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerPostOffice(String value) {
        this.perPostOffice = value;
    }

    /**
     * Gets the value of the perPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerPostalCode() {
        return perPostalCode;
    }

    /**
     * Sets the value of the perPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerPostalCode(String value) {
        this.perPostalCode = value;
    }

    /**
     * Gets the value of the perRmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerRmo() {
        return perRmo;
    }

    /**
     * Sets the value of the perRmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerRmo(String value) {
        this.perRmo = value;
    }

    /**
     * Gets the value of the perUnionOrWard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerUnionOrWard() {
        return perUnionOrWard;
    }

    /**
     * Sets the value of the perUnionOrWard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerUnionOrWard(String value) {
        this.perUnionOrWard = value;
    }

    /**
     * Gets the value of the perUozilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerUozilla() {
        return perUozilla;
    }

    /**
     * Sets the value of the perUozilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerUozilla(String value) {
        this.perUozilla = value;
    }

    /**
     * Gets the value of the perVillageOrRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerVillageOrRoad() {
        return perVillageOrRoad;
    }

    /**
     * Sets the value of the perVillageOrRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerVillageOrRoad(String value) {
        this.perVillageOrRoad = value;
    }

    /**
     * Gets the value of the perWardForUnionPorishod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerWardForUnionPorishod() {
        return perWardForUnionPorishod;
    }

    /**
     * Sets the value of the perWardForUnionPorishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerWardForUnionPorishod(String value) {
        this.perWardForUnionPorishod = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirthOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirthOther() {
        return placeOfBirthOther;
    }

    /**
     * Sets the value of the placeOfBirthOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirthOther(String value) {
        this.placeOfBirthOther = value;
    }

    /**
     * Gets the value of the postOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOffice() {
        return postOffice;
    }

    /**
     * Sets the value of the postOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOffice(String value) {
        this.postOffice = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Gets the value of the religionOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionOther() {
        return religionOther;
    }

    /**
     * Sets the value of the religionOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionOther(String value) {
        this.religionOther = value;
    }

    /**
     * Gets the value of the rmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmo() {
        return rmo;
    }

    /**
     * Sets the value of the rmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmo(String value) {
        this.rmo = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the tinNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinNo() {
        return tinNo;
    }

    /**
     * Sets the value of the tinNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinNo(String value) {
        this.tinNo = value;
    }

    /**
     * Gets the value of the unionOrWard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionOrWard() {
        return unionOrWard;
    }

    /**
     * Sets the value of the unionOrWard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionOrWard(String value) {
        this.unionOrWard = value;
    }

    /**
     * Gets the value of the uozilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUozilla() {
        return uozilla;
    }

    /**
     * Sets the value of the uozilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUozilla(String value) {
        this.uozilla = value;
    }

    /**
     * Gets the value of the villageOrRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVillageOrRoad() {
        return villageOrRoad;
    }

    /**
     * Sets the value of the villageOrRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVillageOrRoad(String value) {
        this.villageOrRoad = value;
    }

    /**
     * Gets the value of the voterArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterArea() {
        return voterArea;
    }

    /**
     * Sets the value of the voterArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterArea(String value) {
        this.voterArea = value;
    }

    /**
     * Gets the value of the voterBirthRegistrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterBirthRegistrationNo() {
        return voterBirthRegistrationNo;
    }

    /**
     * Sets the value of the voterBirthRegistrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterBirthRegistrationNo(String value) {
        this.voterBirthRegistrationNo = value;
    }

    /**
     * Gets the value of the voterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterId() {
        return voterId;
    }

    /**
     * Sets the value of the voterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterId(String value) {
        this.voterId = value;
    }

    /**
     * Gets the value of the voterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNo() {
        return voterNo;
    }

    /**
     * Sets the value of the voterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNo(String value) {
        this.voterNo = value;
    }

    /**
     * Gets the value of the voterNoOfFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNoOfFather() {
        return voterNoOfFather;
    }

    /**
     * Sets the value of the voterNoOfFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNoOfFather(String value) {
        this.voterNoOfFather = value;
    }

    /**
     * Gets the value of the voterNoOfMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNoOfMother() {
        return voterNoOfMother;
    }

    /**
     * Sets the value of the voterNoOfMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNoOfMother(String value) {
        this.voterNoOfMother = value;
    }

    /**
     * Gets the value of the voterNoOfSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNoOfSpouse() {
        return voterNoOfSpouse;
    }

    /**
     * Sets the value of the voterNoOfSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNoOfSpouse(String value) {
        this.voterNoOfSpouse = value;
    }

    /**
     * Gets the value of the voterOfVoterArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterOfVoterArea() {
        return voterOfVoterArea;
    }

    /**
     * Sets the value of the voterOfVoterArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterOfVoterArea(String value) {
        this.voterOfVoterArea = value;
    }

    /**
     * Gets the value of the wardForUnionPorishod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardForUnionPorishod() {
        return wardForUnionPorishod;
    }

    /**
     * Sets the value of the wardForUnionPorishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardForUnionPorishod(String value) {
        this.wardForUnionPorishod = value;
    }

}
