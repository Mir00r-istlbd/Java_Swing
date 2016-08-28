
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cardIssueApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardIssueApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressChange" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}cardIssueAddressChange" minOccurs="0"/>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantsContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centerDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duplicateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gdApplicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAddressChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maoReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maoReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdbReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdbReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfnReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfnReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mhReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mhReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmnReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmnReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmsReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmsReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnbReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnbReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mneReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mneReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedAreaOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedBirthRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedBlood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDob" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modifiedDrivingLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedMaritialStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedNameBn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedNidFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedNidMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedNidSibling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedNidSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedPassport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedPhoto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="modifiedPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedPostoffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedSignature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="modifiedSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedVillage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedVillageOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedWard" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mpReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpcReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpcReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpoReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpoReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msnReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msnReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mvReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mvReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mvoReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mvoReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mwReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mwReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policeContactNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policeOfficerDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policeStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polliceOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusHistoryList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}applicationStatusHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportingDocList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}supportingDoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="voterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardIssueApplication", propOrder = {
    "addressChange",
    "applicantName",
    "applicantsContact",
    "applicationDate",
    "bankId",
    "centerDeliveryDate",
    "createdBy",
    "creationDate",
    "currentStatus",
    "deliveryCenter",
    "deliveryType",
    "duplicateReason",
    "expectedDeliveryDate",
    "gdApplicationDate",
    "gdNumber",
    "id",
    "isAddressChange",
    "issueFrom",
    "issueRef",
    "issueType",
    "lastUpdateDate",
    "lastUpdatedBy",
    "maReferred",
    "maReferredApproved",
    "maoReferred",
    "maoReferredApproved",
    "mbReferred",
    "mbReferredApproved",
    "mdbReferred",
    "mdbReferredApproved",
    "meReferred",
    "meReferredApproved",
    "mfnReferred",
    "mfnReferredApproved",
    "mhReferred",
    "mhReferredApproved",
    "mmnReferred",
    "mmnReferredApproved",
    "mmsReferred",
    "mmsReferredApproved",
    "mnbReferred",
    "mnbReferredApproved",
    "mneReferred",
    "mneReferredApproved",
    "moReferred",
    "moReferredApproved",
    "modifiedArea",
    "modifiedAreaOther",
    "modifiedBirthRegistration",
    "modifiedBlood",
    "modifiedDob",
    "modifiedDrivingLicense",
    "modifiedEducation",
    "modifiedFather",
    "modifiedHouse",
    "modifiedMaritialStatus",
    "modifiedMother",
    "modifiedNameBn",
    "modifiedNameEn",
    "modifiedNidFather",
    "modifiedNidMother",
    "modifiedNidSibling",
    "modifiedNidSpouse",
    "modifiedPassport",
    "modifiedPhoto",
    "modifiedPostcode",
    "modifiedPostoffice",
    "modifiedProfession",
    "modifiedSignature",
    "modifiedSpouse",
    "modifiedTin",
    "modifiedVillage",
    "modifiedVillageOther",
    "modifiedWard",
    "mpReferred",
    "mpReferredApproved",
    "mpcReferred",
    "mpcReferredApproved",
    "mpoReferred",
    "mpoReferredApproved",
    "msReferred",
    "msReferredApproved",
    "msnReferred",
    "msnReferredApproved",
    "mvReferred",
    "mvReferredApproved",
    "mvoReferred",
    "mvoReferredApproved",
    "mwReferred",
    "mwReferredApproved",
    "nationalId",
    "note",
    "noteRef",
    "payment",
    "policeContactNo",
    "policeOfficerDesignation",
    "policeStationName",
    "polliceOfficerName",
    "receivedDate",
    "registrationNo",
    "statusHistoryList",
    "supportingDocList",
    "totalRecords",
    "transactionId",
    "voterDeliveryDate",
    "voterId",
    "voterName"
})
public class CardIssueApplication {

    protected CardIssueAddressChange addressChange;
    protected String applicantName;
    protected String applicantsContact;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    protected String bankId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar centerDeliveryDate;
    protected String createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String currentStatus;
    protected String deliveryCenter;
    protected String deliveryType;
    protected String duplicateReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gdApplicationDate;
    protected String gdNumber;
    protected Long id;
    protected String isAddressChange;
    protected String issueFrom;
    protected String issueRef;
    protected String issueType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected String lastUpdatedBy;
    protected String maReferred;
    protected String maReferredApproved;
    protected String maoReferred;
    protected String maoReferredApproved;
    protected String mbReferred;
    protected String mbReferredApproved;
    protected String mdbReferred;
    protected String mdbReferredApproved;
    protected String meReferred;
    protected String meReferredApproved;
    protected String mfnReferred;
    protected String mfnReferredApproved;
    protected String mhReferred;
    protected String mhReferredApproved;
    protected String mmnReferred;
    protected String mmnReferredApproved;
    protected String mmsReferred;
    protected String mmsReferredApproved;
    protected String mnbReferred;
    protected String mnbReferredApproved;
    protected String mneReferred;
    protected String mneReferredApproved;
    protected String moReferred;
    protected String moReferredApproved;
    protected String modifiedArea;
    protected String modifiedAreaOther;
    protected String modifiedBirthRegistration;
    protected String modifiedBlood;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDob;
    protected String modifiedDrivingLicense;
    protected String modifiedEducation;
    protected String modifiedFather;
    protected String modifiedHouse;
    protected String modifiedMaritialStatus;
    protected String modifiedMother;
    protected String modifiedNameBn;
    protected String modifiedNameEn;
    protected String modifiedNidFather;
    protected String modifiedNidMother;
    protected String modifiedNidSibling;
    protected String modifiedNidSpouse;
    protected String modifiedPassport;
    protected byte[] modifiedPhoto;
    protected String modifiedPostcode;
    protected String modifiedPostoffice;
    protected String modifiedProfession;
    protected byte[] modifiedSignature;
    protected String modifiedSpouse;
    protected String modifiedTin;
    protected String modifiedVillage;
    protected String modifiedVillageOther;
    protected Long modifiedWard;
    protected String mpReferred;
    protected String mpReferredApproved;
    protected String mpcReferred;
    protected String mpcReferredApproved;
    protected String mpoReferred;
    protected String mpoReferredApproved;
    protected String msReferred;
    protected String msReferredApproved;
    protected String msnReferred;
    protected String msnReferredApproved;
    protected String mvReferred;
    protected String mvReferredApproved;
    protected String mvoReferred;
    protected String mvoReferredApproved;
    protected String mwReferred;
    protected String mwReferredApproved;
    protected String nationalId;
    protected String note;
    protected String noteRef;
    protected String payment;
    protected String policeContactNo;
    protected String policeOfficerDesignation;
    protected String policeStationName;
    protected String polliceOfficerName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDate;
    protected String registrationNo;
    @XmlElement(nillable = true)
    protected List<ApplicationStatusHistory> statusHistoryList;
    @XmlElement(nillable = true)
    protected List<SupportingDoc> supportingDocList;
    protected long totalRecords;
    protected String transactionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voterDeliveryDate;
    protected String voterId;
    protected String voterName;

    /**
     * Gets the value of the addressChange property.
     * 
     * @return
     *     possible object is
     *     {@link CardIssueAddressChange }
     *     
     */
    public CardIssueAddressChange getAddressChange() {
        return addressChange;
    }

    /**
     * Sets the value of the addressChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIssueAddressChange }
     *     
     */
    public void setAddressChange(CardIssueAddressChange value) {
        this.addressChange = value;
    }

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantName(String value) {
        this.applicantName = value;
    }

    /**
     * Gets the value of the applicantsContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantsContact() {
        return applicantsContact;
    }

    /**
     * Sets the value of the applicantsContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantsContact(String value) {
        this.applicantsContact = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the centerDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCenterDeliveryDate() {
        return centerDeliveryDate;
    }

    /**
     * Sets the value of the centerDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCenterDeliveryDate(XMLGregorianCalendar value) {
        this.centerDeliveryDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the deliveryCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCenter() {
        return deliveryCenter;
    }

    /**
     * Sets the value of the deliveryCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCenter(String value) {
        this.deliveryCenter = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the duplicateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateReason() {
        return duplicateReason;
    }

    /**
     * Sets the value of the duplicateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateReason(String value) {
        this.duplicateReason = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the gdApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGdApplicationDate() {
        return gdApplicationDate;
    }

    /**
     * Sets the value of the gdApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGdApplicationDate(XMLGregorianCalendar value) {
        this.gdApplicationDate = value;
    }

    /**
     * Gets the value of the gdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdNumber() {
        return gdNumber;
    }

    /**
     * Sets the value of the gdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdNumber(String value) {
        this.gdNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isAddressChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAddressChange() {
        return isAddressChange;
    }

    /**
     * Sets the value of the isAddressChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAddressChange(String value) {
        this.isAddressChange = value;
    }

    /**
     * Gets the value of the issueFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueFrom() {
        return issueFrom;
    }

    /**
     * Sets the value of the issueFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueFrom(String value) {
        this.issueFrom = value;
    }

    /**
     * Gets the value of the issueRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueRef() {
        return issueRef;
    }

    /**
     * Sets the value of the issueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueRef(String value) {
        this.issueRef = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueType(String value) {
        this.issueType = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the maReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaReferred() {
        return maReferred;
    }

    /**
     * Sets the value of the maReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaReferred(String value) {
        this.maReferred = value;
    }

    /**
     * Gets the value of the maReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaReferredApproved() {
        return maReferredApproved;
    }

    /**
     * Sets the value of the maReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaReferredApproved(String value) {
        this.maReferredApproved = value;
    }

    /**
     * Gets the value of the maoReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaoReferred() {
        return maoReferred;
    }

    /**
     * Sets the value of the maoReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaoReferred(String value) {
        this.maoReferred = value;
    }

    /**
     * Gets the value of the maoReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaoReferredApproved() {
        return maoReferredApproved;
    }

    /**
     * Sets the value of the maoReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaoReferredApproved(String value) {
        this.maoReferredApproved = value;
    }

    /**
     * Gets the value of the mbReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbReferred() {
        return mbReferred;
    }

    /**
     * Sets the value of the mbReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbReferred(String value) {
        this.mbReferred = value;
    }

    /**
     * Gets the value of the mbReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbReferredApproved() {
        return mbReferredApproved;
    }

    /**
     * Sets the value of the mbReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbReferredApproved(String value) {
        this.mbReferredApproved = value;
    }

    /**
     * Gets the value of the mdbReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdbReferred() {
        return mdbReferred;
    }

    /**
     * Sets the value of the mdbReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdbReferred(String value) {
        this.mdbReferred = value;
    }

    /**
     * Gets the value of the mdbReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdbReferredApproved() {
        return mdbReferredApproved;
    }

    /**
     * Sets the value of the mdbReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdbReferredApproved(String value) {
        this.mdbReferredApproved = value;
    }

    /**
     * Gets the value of the meReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeReferred() {
        return meReferred;
    }

    /**
     * Sets the value of the meReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeReferred(String value) {
        this.meReferred = value;
    }

    /**
     * Gets the value of the meReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeReferredApproved() {
        return meReferredApproved;
    }

    /**
     * Sets the value of the meReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeReferredApproved(String value) {
        this.meReferredApproved = value;
    }

    /**
     * Gets the value of the mfnReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfnReferred() {
        return mfnReferred;
    }

    /**
     * Sets the value of the mfnReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfnReferred(String value) {
        this.mfnReferred = value;
    }

    /**
     * Gets the value of the mfnReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfnReferredApproved() {
        return mfnReferredApproved;
    }

    /**
     * Sets the value of the mfnReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfnReferredApproved(String value) {
        this.mfnReferredApproved = value;
    }

    /**
     * Gets the value of the mhReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMhReferred() {
        return mhReferred;
    }

    /**
     * Sets the value of the mhReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMhReferred(String value) {
        this.mhReferred = value;
    }

    /**
     * Gets the value of the mhReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMhReferredApproved() {
        return mhReferredApproved;
    }

    /**
     * Sets the value of the mhReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMhReferredApproved(String value) {
        this.mhReferredApproved = value;
    }

    /**
     * Gets the value of the mmnReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmnReferred() {
        return mmnReferred;
    }

    /**
     * Sets the value of the mmnReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmnReferred(String value) {
        this.mmnReferred = value;
    }

    /**
     * Gets the value of the mmnReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmnReferredApproved() {
        return mmnReferredApproved;
    }

    /**
     * Sets the value of the mmnReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmnReferredApproved(String value) {
        this.mmnReferredApproved = value;
    }

    /**
     * Gets the value of the mmsReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsReferred() {
        return mmsReferred;
    }

    /**
     * Sets the value of the mmsReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsReferred(String value) {
        this.mmsReferred = value;
    }

    /**
     * Gets the value of the mmsReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsReferredApproved() {
        return mmsReferredApproved;
    }

    /**
     * Sets the value of the mmsReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsReferredApproved(String value) {
        this.mmsReferredApproved = value;
    }

    /**
     * Gets the value of the mnbReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnbReferred() {
        return mnbReferred;
    }

    /**
     * Sets the value of the mnbReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnbReferred(String value) {
        this.mnbReferred = value;
    }

    /**
     * Gets the value of the mnbReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnbReferredApproved() {
        return mnbReferredApproved;
    }

    /**
     * Sets the value of the mnbReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnbReferredApproved(String value) {
        this.mnbReferredApproved = value;
    }

    /**
     * Gets the value of the mneReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMneReferred() {
        return mneReferred;
    }

    /**
     * Sets the value of the mneReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMneReferred(String value) {
        this.mneReferred = value;
    }

    /**
     * Gets the value of the mneReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMneReferredApproved() {
        return mneReferredApproved;
    }

    /**
     * Sets the value of the mneReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMneReferredApproved(String value) {
        this.mneReferredApproved = value;
    }

    /**
     * Gets the value of the moReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoReferred() {
        return moReferred;
    }

    /**
     * Sets the value of the moReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoReferred(String value) {
        this.moReferred = value;
    }

    /**
     * Gets the value of the moReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoReferredApproved() {
        return moReferredApproved;
    }

    /**
     * Sets the value of the moReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoReferredApproved(String value) {
        this.moReferredApproved = value;
    }

    /**
     * Gets the value of the modifiedArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedArea() {
        return modifiedArea;
    }

    /**
     * Sets the value of the modifiedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedArea(String value) {
        this.modifiedArea = value;
    }

    /**
     * Gets the value of the modifiedAreaOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedAreaOther() {
        return modifiedAreaOther;
    }

    /**
     * Sets the value of the modifiedAreaOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedAreaOther(String value) {
        this.modifiedAreaOther = value;
    }

    /**
     * Gets the value of the modifiedBirthRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBirthRegistration() {
        return modifiedBirthRegistration;
    }

    /**
     * Sets the value of the modifiedBirthRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBirthRegistration(String value) {
        this.modifiedBirthRegistration = value;
    }

    /**
     * Gets the value of the modifiedBlood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBlood() {
        return modifiedBlood;
    }

    /**
     * Sets the value of the modifiedBlood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBlood(String value) {
        this.modifiedBlood = value;
    }

    /**
     * Gets the value of the modifiedDob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDob() {
        return modifiedDob;
    }

    /**
     * Sets the value of the modifiedDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDob(XMLGregorianCalendar value) {
        this.modifiedDob = value;
    }

    /**
     * Gets the value of the modifiedDrivingLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDrivingLicense() {
        return modifiedDrivingLicense;
    }

    /**
     * Sets the value of the modifiedDrivingLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDrivingLicense(String value) {
        this.modifiedDrivingLicense = value;
    }

    /**
     * Gets the value of the modifiedEducation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedEducation() {
        return modifiedEducation;
    }

    /**
     * Sets the value of the modifiedEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedEducation(String value) {
        this.modifiedEducation = value;
    }

    /**
     * Gets the value of the modifiedFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedFather() {
        return modifiedFather;
    }

    /**
     * Sets the value of the modifiedFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedFather(String value) {
        this.modifiedFather = value;
    }

    /**
     * Gets the value of the modifiedHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedHouse() {
        return modifiedHouse;
    }

    /**
     * Sets the value of the modifiedHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedHouse(String value) {
        this.modifiedHouse = value;
    }

    /**
     * Gets the value of the modifiedMaritialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedMaritialStatus() {
        return modifiedMaritialStatus;
    }

    /**
     * Sets the value of the modifiedMaritialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedMaritialStatus(String value) {
        this.modifiedMaritialStatus = value;
    }

    /**
     * Gets the value of the modifiedMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedMother() {
        return modifiedMother;
    }

    /**
     * Sets the value of the modifiedMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedMother(String value) {
        this.modifiedMother = value;
    }

    /**
     * Gets the value of the modifiedNameBn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedNameBn() {
        return modifiedNameBn;
    }

    /**
     * Sets the value of the modifiedNameBn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedNameBn(String value) {
        this.modifiedNameBn = value;
    }

    /**
     * Gets the value of the modifiedNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedNameEn() {
        return modifiedNameEn;
    }

    /**
     * Sets the value of the modifiedNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedNameEn(String value) {
        this.modifiedNameEn = value;
    }

    /**
     * Gets the value of the modifiedNidFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedNidFather() {
        return modifiedNidFather;
    }

    /**
     * Sets the value of the modifiedNidFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedNidFather(String value) {
        this.modifiedNidFather = value;
    }

    /**
     * Gets the value of the modifiedNidMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedNidMother() {
        return modifiedNidMother;
    }

    /**
     * Sets the value of the modifiedNidMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedNidMother(String value) {
        this.modifiedNidMother = value;
    }

    /**
     * Gets the value of the modifiedNidSibling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedNidSibling() {
        return modifiedNidSibling;
    }

    /**
     * Sets the value of the modifiedNidSibling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedNidSibling(String value) {
        this.modifiedNidSibling = value;
    }

    /**
     * Gets the value of the modifiedNidSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedNidSpouse() {
        return modifiedNidSpouse;
    }

    /**
     * Sets the value of the modifiedNidSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedNidSpouse(String value) {
        this.modifiedNidSpouse = value;
    }

    /**
     * Gets the value of the modifiedPassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedPassport() {
        return modifiedPassport;
    }

    /**
     * Sets the value of the modifiedPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedPassport(String value) {
        this.modifiedPassport = value;
    }

    /**
     * Gets the value of the modifiedPhoto property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getModifiedPhoto() {
        return modifiedPhoto;
    }

    /**
     * Sets the value of the modifiedPhoto property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setModifiedPhoto(byte[] value) {
        this.modifiedPhoto = value;
    }

    /**
     * Gets the value of the modifiedPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedPostcode() {
        return modifiedPostcode;
    }

    /**
     * Sets the value of the modifiedPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedPostcode(String value) {
        this.modifiedPostcode = value;
    }

    /**
     * Gets the value of the modifiedPostoffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedPostoffice() {
        return modifiedPostoffice;
    }

    /**
     * Sets the value of the modifiedPostoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedPostoffice(String value) {
        this.modifiedPostoffice = value;
    }

    /**
     * Gets the value of the modifiedProfession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedProfession() {
        return modifiedProfession;
    }

    /**
     * Sets the value of the modifiedProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedProfession(String value) {
        this.modifiedProfession = value;
    }

    /**
     * Gets the value of the modifiedSignature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getModifiedSignature() {
        return modifiedSignature;
    }

    /**
     * Sets the value of the modifiedSignature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setModifiedSignature(byte[] value) {
        this.modifiedSignature = value;
    }

    /**
     * Gets the value of the modifiedSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedSpouse() {
        return modifiedSpouse;
    }

    /**
     * Sets the value of the modifiedSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedSpouse(String value) {
        this.modifiedSpouse = value;
    }

    /**
     * Gets the value of the modifiedTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedTin() {
        return modifiedTin;
    }

    /**
     * Sets the value of the modifiedTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedTin(String value) {
        this.modifiedTin = value;
    }

    /**
     * Gets the value of the modifiedVillage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedVillage() {
        return modifiedVillage;
    }

    /**
     * Sets the value of the modifiedVillage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedVillage(String value) {
        this.modifiedVillage = value;
    }

    /**
     * Gets the value of the modifiedVillageOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedVillageOther() {
        return modifiedVillageOther;
    }

    /**
     * Sets the value of the modifiedVillageOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedVillageOther(String value) {
        this.modifiedVillageOther = value;
    }

    /**
     * Gets the value of the modifiedWard property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModifiedWard() {
        return modifiedWard;
    }

    /**
     * Sets the value of the modifiedWard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModifiedWard(Long value) {
        this.modifiedWard = value;
    }

    /**
     * Gets the value of the mpReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpReferred() {
        return mpReferred;
    }

    /**
     * Sets the value of the mpReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpReferred(String value) {
        this.mpReferred = value;
    }

    /**
     * Gets the value of the mpReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpReferredApproved() {
        return mpReferredApproved;
    }

    /**
     * Sets the value of the mpReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpReferredApproved(String value) {
        this.mpReferredApproved = value;
    }

    /**
     * Gets the value of the mpcReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpcReferred() {
        return mpcReferred;
    }

    /**
     * Sets the value of the mpcReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpcReferred(String value) {
        this.mpcReferred = value;
    }

    /**
     * Gets the value of the mpcReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpcReferredApproved() {
        return mpcReferredApproved;
    }

    /**
     * Sets the value of the mpcReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpcReferredApproved(String value) {
        this.mpcReferredApproved = value;
    }

    /**
     * Gets the value of the mpoReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpoReferred() {
        return mpoReferred;
    }

    /**
     * Sets the value of the mpoReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpoReferred(String value) {
        this.mpoReferred = value;
    }

    /**
     * Gets the value of the mpoReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpoReferredApproved() {
        return mpoReferredApproved;
    }

    /**
     * Sets the value of the mpoReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpoReferredApproved(String value) {
        this.mpoReferredApproved = value;
    }

    /**
     * Gets the value of the msReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsReferred() {
        return msReferred;
    }

    /**
     * Sets the value of the msReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsReferred(String value) {
        this.msReferred = value;
    }

    /**
     * Gets the value of the msReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsReferredApproved() {
        return msReferredApproved;
    }

    /**
     * Sets the value of the msReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsReferredApproved(String value) {
        this.msReferredApproved = value;
    }

    /**
     * Gets the value of the msnReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsnReferred() {
        return msnReferred;
    }

    /**
     * Sets the value of the msnReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsnReferred(String value) {
        this.msnReferred = value;
    }

    /**
     * Gets the value of the msnReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsnReferredApproved() {
        return msnReferredApproved;
    }

    /**
     * Sets the value of the msnReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsnReferredApproved(String value) {
        this.msnReferredApproved = value;
    }

    /**
     * Gets the value of the mvReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvReferred() {
        return mvReferred;
    }

    /**
     * Sets the value of the mvReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvReferred(String value) {
        this.mvReferred = value;
    }

    /**
     * Gets the value of the mvReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvReferredApproved() {
        return mvReferredApproved;
    }

    /**
     * Sets the value of the mvReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvReferredApproved(String value) {
        this.mvReferredApproved = value;
    }

    /**
     * Gets the value of the mvoReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvoReferred() {
        return mvoReferred;
    }

    /**
     * Sets the value of the mvoReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvoReferred(String value) {
        this.mvoReferred = value;
    }

    /**
     * Gets the value of the mvoReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvoReferredApproved() {
        return mvoReferredApproved;
    }

    /**
     * Sets the value of the mvoReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvoReferredApproved(String value) {
        this.mvoReferredApproved = value;
    }

    /**
     * Gets the value of the mwReferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMwReferred() {
        return mwReferred;
    }

    /**
     * Sets the value of the mwReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwReferred(String value) {
        this.mwReferred = value;
    }

    /**
     * Gets the value of the mwReferredApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMwReferredApproved() {
        return mwReferredApproved;
    }

    /**
     * Sets the value of the mwReferredApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwReferredApproved(String value) {
        this.mwReferredApproved = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteRef() {
        return noteRef;
    }

    /**
     * Sets the value of the noteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteRef(String value) {
        this.noteRef = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
    }

    /**
     * Gets the value of the policeContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceContactNo() {
        return policeContactNo;
    }

    /**
     * Sets the value of the policeContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceContactNo(String value) {
        this.policeContactNo = value;
    }

    /**
     * Gets the value of the policeOfficerDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceOfficerDesignation() {
        return policeOfficerDesignation;
    }

    /**
     * Sets the value of the policeOfficerDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceOfficerDesignation(String value) {
        this.policeOfficerDesignation = value;
    }

    /**
     * Gets the value of the policeStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationName() {
        return policeStationName;
    }

    /**
     * Sets the value of the policeStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationName(String value) {
        this.policeStationName = value;
    }

    /**
     * Gets the value of the polliceOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolliceOfficerName() {
        return polliceOfficerName;
    }

    /**
     * Sets the value of the polliceOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolliceOfficerName(String value) {
        this.polliceOfficerName = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the registrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * Sets the value of the registrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNo(String value) {
        this.registrationNo = value;
    }

    /**
     * Gets the value of the statusHistoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusHistoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusHistoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationStatusHistory }
     * 
     * 
     */
    public List<ApplicationStatusHistory> getStatusHistoryList() {
        if (statusHistoryList == null) {
            statusHistoryList = new ArrayList<ApplicationStatusHistory>();
        }
        return this.statusHistoryList;
    }

    /**
     * Gets the value of the supportingDocList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingDocList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingDocList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDoc }
     * 
     * 
     */
    public List<SupportingDoc> getSupportingDocList() {
        if (supportingDocList == null) {
            supportingDocList = new ArrayList<SupportingDoc>();
        }
        return this.supportingDocList;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public long getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(long value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the voterDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoterDeliveryDate() {
        return voterDeliveryDate;
    }

    /**
     * Sets the value of the voterDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoterDeliveryDate(XMLGregorianCalendar value) {
        this.voterDeliveryDate = value;
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
     * Gets the value of the voterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterName() {
        return voterName;
    }

    /**
     * Sets the value of the voterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterName(String value) {
        this.voterName = value;
    }

}
