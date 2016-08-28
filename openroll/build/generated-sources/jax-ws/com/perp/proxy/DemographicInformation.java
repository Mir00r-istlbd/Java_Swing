
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for demographicInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demographicInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalMouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afisStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssueReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCorporationOrMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCorporationOrMunicipalityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cityCorporationOrMunicipalityIdAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDateClient" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirthString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfDeathString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathDateOfFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathDateOfMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathDateOfSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="divisionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="divisionIdAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drivingLLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fathersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasNoFinger" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hasNoFingerAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasNoFingerPrint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hasNoFingerPrintAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeOrHoldingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifyingSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laptopId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mothersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mouzaOrMohollaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureOfDisability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureOfDisabilityOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perAdditionalMouzaOrMohollaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perAdditionalVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCityCorporationOrMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCityCorporationOrMunicipalityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="perCityCorporationOrMunicipalityIdAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perDistrictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perDivisionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="perDivisionIdAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perHomeOrHoldingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perMouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perMouzaOrMohollaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perPostOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perRmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perUnionOrWard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perUnionOrWardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perUozilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perUpozilaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perWardForUnionPorishod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="perWardForUnionPorishodAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unionOrWard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unionOrWardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uozilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="upozilaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="villageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterBirthRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterOfVoterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterPlaceOfBirthOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wardForUnionPorishod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="wardForUnionPorishodAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demographicInformation", propOrder = {
    "additionalMouzaOrMoholla",
    "additionalVillageOrRoad",
    "afisStatus",
    "bloodGroup",
    "cardIssueReferenceNo",
    "cityCorporationOrMunicipality",
    "cityCorporationOrMunicipalityId",
    "cityCorporationOrMunicipalityIdAsString",
    "creationDateClient",
    "dateOfBirth",
    "dateOfBirthString",
    "dateOfDeath",
    "dateOfDeathString",
    "deathDateOfFather",
    "deathDateOfMother",
    "deathDateOfSpouse",
    "district",
    "districtId",
    "division",
    "divisionId",
    "divisionIdAsString",
    "drivingLLicenseNo",
    "education",
    "educationOther",
    "educationSub",
    "fathersName",
    "formNo",
    "gender",
    "hasNoFinger",
    "hasNoFingerAsString",
    "hasNoFingerPrint",
    "hasNoFingerPrintAsString",
    "homeOrHoldingNo",
    "identifyingSymbol",
    "laptopId",
    "lockFlag",
    "maritalStatus",
    "mobileNo",
    "mothersName",
    "mouzaOrMoholla",
    "mouzaOrMohollaId",
    "nameBn",
    "nameEn",
    "natureOfDisability",
    "natureOfDisabilityOther",
    "nidFather",
    "nidMother",
    "nidSpouse",
    "occupation",
    "passportNo",
    "perAdditionalMouzaOrMohollaId",
    "perAdditionalVillageOrRoad",
    "perCityCorporationOrMunicipality",
    "perCityCorporationOrMunicipalityId",
    "perCityCorporationOrMunicipalityIdAsString",
    "perDistrict",
    "perDistrictId",
    "perDivision",
    "perDivisionId",
    "perDivisionIdAsString",
    "perHomeOrHoldingNo",
    "perMouzaOrMoholla",
    "perMouzaOrMohollaId",
    "perPostOffice",
    "perPostalCode",
    "perRmo",
    "perUnionOrWard",
    "perUnionOrWardId",
    "perUozilla",
    "perUpozilaId",
    "perVillageOrRoad",
    "perWardForUnionPorishod",
    "perWardForUnionPorishodAsString",
    "phoneNo",
    "pin",
    "placeOfBirth",
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
    "unionOrWardId",
    "uozilla",
    "updatedBy",
    "updatedOn",
    "upozilaId",
    "villageOrRoad",
    "voterArea",
    "voterAreaId",
    "voterBirthRegistrationNo",
    "voterId",
    "voterNo",
    "voterNoFather",
    "voterNoMother",
    "voterNoSpouse",
    "voterOfVoterArea",
    "voterPlaceOfBirthOther",
    "wardForUnionPorishod",
    "wardForUnionPorishodAsString"
})
public class DemographicInformation {

    protected String additionalMouzaOrMoholla;
    protected String additionalVillageOrRoad;
    protected String afisStatus;
    protected String bloodGroup;
    protected String cardIssueReferenceNo;
    protected String cityCorporationOrMunicipality;
    protected Long cityCorporationOrMunicipalityId;
    protected String cityCorporationOrMunicipalityIdAsString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateClient;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String dateOfBirthString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeath;
    protected String dateOfDeathString;
    protected String deathDateOfFather;
    protected String deathDateOfMother;
    protected String deathDateOfSpouse;
    protected String district;
    protected String districtId;
    protected String division;
    protected Long divisionId;
    protected String divisionIdAsString;
    protected String drivingLLicenseNo;
    protected String education;
    protected String educationOther;
    protected String educationSub;
    protected String fathersName;
    protected String formNo;
    protected String gender;
    protected Long hasNoFinger;
    protected String hasNoFingerAsString;
    protected Long hasNoFingerPrint;
    protected String hasNoFingerPrintAsString;
    protected String homeOrHoldingNo;
    protected String identifyingSymbol;
    protected String laptopId;
    protected String lockFlag;
    protected String maritalStatus;
    protected String mobileNo;
    protected String mothersName;
    protected String mouzaOrMoholla;
    protected String mouzaOrMohollaId;
    protected String nameBn;
    protected String nameEn;
    protected String natureOfDisability;
    protected String natureOfDisabilityOther;
    protected String nidFather;
    protected String nidMother;
    protected String nidSpouse;
    protected String occupation;
    protected String passportNo;
    protected String perAdditionalMouzaOrMohollaId;
    protected String perAdditionalVillageOrRoad;
    protected String perCityCorporationOrMunicipality;
    protected Long perCityCorporationOrMunicipalityId;
    protected String perCityCorporationOrMunicipalityIdAsString;
    protected String perDistrict;
    protected String perDistrictId;
    protected String perDivision;
    protected Long perDivisionId;
    protected String perDivisionIdAsString;
    protected String perHomeOrHoldingNo;
    protected String perMouzaOrMoholla;
    protected String perMouzaOrMohollaId;
    protected String perPostOffice;
    protected String perPostalCode;
    protected String perRmo;
    protected String perUnionOrWard;
    protected String perUnionOrWardId;
    protected String perUozilla;
    protected String perUpozilaId;
    protected String perVillageOrRoad;
    protected Long perWardForUnionPorishod;
    protected String perWardForUnionPorishodAsString;
    protected String phoneNo;
    protected String pin;
    protected String placeOfBirth;
    protected String postOffice;
    protected String postalCode;
    protected String religion;
    protected String religionOther;
    protected String rmo;
    protected Long serialNo;
    protected String spouseName;
    protected String status;
    protected String tag;
    protected String tinNo;
    protected String unionOrWard;
    protected String unionOrWardId;
    protected String uozilla;
    protected String updatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    protected String upozilaId;
    protected String villageOrRoad;
    protected String voterArea;
    protected String voterAreaId;
    protected String voterBirthRegistrationNo;
    protected String voterId;
    protected String voterNo;
    protected String voterNoFather;
    protected String voterNoMother;
    protected String voterNoSpouse;
    protected String voterOfVoterArea;
    protected String voterPlaceOfBirthOther;
    protected Long wardForUnionPorishod;
    protected String wardForUnionPorishodAsString;

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
     * Gets the value of the afisStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfisStatus() {
        return afisStatus;
    }

    /**
     * Sets the value of the afisStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfisStatus(String value) {
        this.afisStatus = value;
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
     * Gets the value of the cardIssueReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssueReferenceNo() {
        return cardIssueReferenceNo;
    }

    /**
     * Sets the value of the cardIssueReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssueReferenceNo(String value) {
        this.cardIssueReferenceNo = value;
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
     * Gets the value of the cityCorporationOrMunicipalityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityCorporationOrMunicipalityId() {
        return cityCorporationOrMunicipalityId;
    }

    /**
     * Sets the value of the cityCorporationOrMunicipalityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityCorporationOrMunicipalityId(Long value) {
        this.cityCorporationOrMunicipalityId = value;
    }

    /**
     * Gets the value of the cityCorporationOrMunicipalityIdAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCorporationOrMunicipalityIdAsString() {
        return cityCorporationOrMunicipalityIdAsString;
    }

    /**
     * Sets the value of the cityCorporationOrMunicipalityIdAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCorporationOrMunicipalityIdAsString(String value) {
        this.cityCorporationOrMunicipalityIdAsString = value;
    }

    /**
     * Gets the value of the creationDateClient property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateClient() {
        return creationDateClient;
    }

    /**
     * Sets the value of the creationDateClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateClient(XMLGregorianCalendar value) {
        this.creationDateClient = value;
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
     * Gets the value of the dateOfBirthString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirthString() {
        return dateOfBirthString;
    }

    /**
     * Sets the value of the dateOfBirthString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirthString(String value) {
        this.dateOfBirthString = value;
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
     * Gets the value of the dateOfDeathString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeathString() {
        return dateOfDeathString;
    }

    /**
     * Sets the value of the dateOfDeathString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeathString(String value) {
        this.dateOfDeathString = value;
    }

    /**
     * Gets the value of the deathDateOfFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDateOfFather() {
        return deathDateOfFather;
    }

    /**
     * Sets the value of the deathDateOfFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDateOfFather(String value) {
        this.deathDateOfFather = value;
    }

    /**
     * Gets the value of the deathDateOfMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDateOfMother() {
        return deathDateOfMother;
    }

    /**
     * Sets the value of the deathDateOfMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDateOfMother(String value) {
        this.deathDateOfMother = value;
    }

    /**
     * Gets the value of the deathDateOfSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDateOfSpouse() {
        return deathDateOfSpouse;
    }

    /**
     * Sets the value of the deathDateOfSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDateOfSpouse(String value) {
        this.deathDateOfSpouse = value;
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
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictId(String value) {
        this.districtId = value;
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
     * Gets the value of the divisionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the value of the divisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDivisionId(Long value) {
        this.divisionId = value;
    }

    /**
     * Gets the value of the divisionIdAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionIdAsString() {
        return divisionIdAsString;
    }

    /**
     * Sets the value of the divisionIdAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionIdAsString(String value) {
        this.divisionIdAsString = value;
    }

    /**
     * Gets the value of the drivingLLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingLLicenseNo() {
        return drivingLLicenseNo;
    }

    /**
     * Sets the value of the drivingLLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingLLicenseNo(String value) {
        this.drivingLLicenseNo = value;
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
     *     {@link Long }
     *     
     */
    public Long getHasNoFinger() {
        return hasNoFinger;
    }

    /**
     * Sets the value of the hasNoFinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHasNoFinger(Long value) {
        this.hasNoFinger = value;
    }

    /**
     * Gets the value of the hasNoFingerAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasNoFingerAsString() {
        return hasNoFingerAsString;
    }

    /**
     * Sets the value of the hasNoFingerAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasNoFingerAsString(String value) {
        this.hasNoFingerAsString = value;
    }

    /**
     * Gets the value of the hasNoFingerPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHasNoFingerPrint() {
        return hasNoFingerPrint;
    }

    /**
     * Sets the value of the hasNoFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHasNoFingerPrint(Long value) {
        this.hasNoFingerPrint = value;
    }

    /**
     * Gets the value of the hasNoFingerPrintAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasNoFingerPrintAsString() {
        return hasNoFingerPrintAsString;
    }

    /**
     * Sets the value of the hasNoFingerPrintAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasNoFingerPrintAsString(String value) {
        this.hasNoFingerPrintAsString = value;
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
     * Gets the value of the laptopId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaptopId() {
        return laptopId;
    }

    /**
     * Sets the value of the laptopId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaptopId(String value) {
        this.laptopId = value;
    }

    /**
     * Gets the value of the lockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockFlag(String value) {
        this.lockFlag = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
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
     * Gets the value of the mouzaOrMohollaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMouzaOrMohollaId() {
        return mouzaOrMohollaId;
    }

    /**
     * Sets the value of the mouzaOrMohollaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMouzaOrMohollaId(String value) {
        this.mouzaOrMohollaId = value;
    }

    /**
     * Gets the value of the nameBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameBn() {
        return nameBn;
    }

    /**
     * Sets the value of the nameBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameBn(String value) {
        this.nameBn = value;
    }

    /**
     * Gets the value of the nameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the value of the nameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
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
     * Gets the value of the nidFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNidFather() {
        return nidFather;
    }

    /**
     * Sets the value of the nidFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNidFather(String value) {
        this.nidFather = value;
    }

    /**
     * Gets the value of the nidMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNidMother() {
        return nidMother;
    }

    /**
     * Sets the value of the nidMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNidMother(String value) {
        this.nidMother = value;
    }

    /**
     * Gets the value of the nidSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNidSpouse() {
        return nidSpouse;
    }

    /**
     * Sets the value of the nidSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNidSpouse(String value) {
        this.nidSpouse = value;
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
     * Gets the value of the perAdditionalMouzaOrMohollaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerAdditionalMouzaOrMohollaId() {
        return perAdditionalMouzaOrMohollaId;
    }

    /**
     * Sets the value of the perAdditionalMouzaOrMohollaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerAdditionalMouzaOrMohollaId(String value) {
        this.perAdditionalMouzaOrMohollaId = value;
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
     * Gets the value of the perCityCorporationOrMunicipalityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerCityCorporationOrMunicipalityId() {
        return perCityCorporationOrMunicipalityId;
    }

    /**
     * Sets the value of the perCityCorporationOrMunicipalityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerCityCorporationOrMunicipalityId(Long value) {
        this.perCityCorporationOrMunicipalityId = value;
    }

    /**
     * Gets the value of the perCityCorporationOrMunicipalityIdAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerCityCorporationOrMunicipalityIdAsString() {
        return perCityCorporationOrMunicipalityIdAsString;
    }

    /**
     * Sets the value of the perCityCorporationOrMunicipalityIdAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerCityCorporationOrMunicipalityIdAsString(String value) {
        this.perCityCorporationOrMunicipalityIdAsString = value;
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
     * Gets the value of the perDistrictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerDistrictId() {
        return perDistrictId;
    }

    /**
     * Sets the value of the perDistrictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerDistrictId(String value) {
        this.perDistrictId = value;
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
     * Gets the value of the perDivisionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerDivisionId() {
        return perDivisionId;
    }

    /**
     * Sets the value of the perDivisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerDivisionId(Long value) {
        this.perDivisionId = value;
    }

    /**
     * Gets the value of the perDivisionIdAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerDivisionIdAsString() {
        return perDivisionIdAsString;
    }

    /**
     * Sets the value of the perDivisionIdAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerDivisionIdAsString(String value) {
        this.perDivisionIdAsString = value;
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
     * Gets the value of the perMouzaOrMohollaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerMouzaOrMohollaId() {
        return perMouzaOrMohollaId;
    }

    /**
     * Sets the value of the perMouzaOrMohollaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerMouzaOrMohollaId(String value) {
        this.perMouzaOrMohollaId = value;
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
     * Gets the value of the perUnionOrWardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerUnionOrWardId() {
        return perUnionOrWardId;
    }

    /**
     * Sets the value of the perUnionOrWardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerUnionOrWardId(String value) {
        this.perUnionOrWardId = value;
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
     * Gets the value of the perUpozilaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerUpozilaId() {
        return perUpozilaId;
    }

    /**
     * Sets the value of the perUpozilaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerUpozilaId(String value) {
        this.perUpozilaId = value;
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
     *     {@link Long }
     *     
     */
    public Long getPerWardForUnionPorishod() {
        return perWardForUnionPorishod;
    }

    /**
     * Sets the value of the perWardForUnionPorishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerWardForUnionPorishod(Long value) {
        this.perWardForUnionPorishod = value;
    }

    /**
     * Gets the value of the perWardForUnionPorishodAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerWardForUnionPorishodAsString() {
        return perWardForUnionPorishodAsString;
    }

    /**
     * Sets the value of the perWardForUnionPorishodAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerWardForUnionPorishodAsString(String value) {
        this.perWardForUnionPorishodAsString = value;
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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
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
     *     {@link Long }
     *     
     */
    public Long getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSerialNo(Long value) {
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
     * Gets the value of the unionOrWardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionOrWardId() {
        return unionOrWardId;
    }

    /**
     * Sets the value of the unionOrWardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionOrWardId(String value) {
        this.unionOrWardId = value;
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
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets the value of the updatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedOn(XMLGregorianCalendar value) {
        this.updatedOn = value;
    }

    /**
     * Gets the value of the upozilaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpozilaId() {
        return upozilaId;
    }

    /**
     * Sets the value of the upozilaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpozilaId(String value) {
        this.upozilaId = value;
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
     * Gets the value of the voterAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterAreaId() {
        return voterAreaId;
    }

    /**
     * Sets the value of the voterAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterAreaId(String value) {
        this.voterAreaId = value;
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
     * Gets the value of the voterNoFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNoFather() {
        return voterNoFather;
    }

    /**
     * Sets the value of the voterNoFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNoFather(String value) {
        this.voterNoFather = value;
    }

    /**
     * Gets the value of the voterNoMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNoMother() {
        return voterNoMother;
    }

    /**
     * Sets the value of the voterNoMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNoMother(String value) {
        this.voterNoMother = value;
    }

    /**
     * Gets the value of the voterNoSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNoSpouse() {
        return voterNoSpouse;
    }

    /**
     * Sets the value of the voterNoSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNoSpouse(String value) {
        this.voterNoSpouse = value;
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
     * Gets the value of the voterPlaceOfBirthOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterPlaceOfBirthOther() {
        return voterPlaceOfBirthOther;
    }

    /**
     * Sets the value of the voterPlaceOfBirthOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterPlaceOfBirthOther(String value) {
        this.voterPlaceOfBirthOther = value;
    }

    /**
     * Gets the value of the wardForUnionPorishod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWardForUnionPorishod() {
        return wardForUnionPorishod;
    }

    /**
     * Sets the value of the wardForUnionPorishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWardForUnionPorishod(Long value) {
        this.wardForUnionPorishod = value;
    }

    /**
     * Gets the value of the wardForUnionPorishodAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardForUnionPorishodAsString() {
        return wardForUnionPorishodAsString;
    }

    /**
     * Sets the value of the wardForUnionPorishodAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardForUnionPorishodAsString(String value) {
        this.wardForUnionPorishodAsString = value;
    }

}
