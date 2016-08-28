
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationDateFilterFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationDateFilterTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bvrsUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centerDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duplicateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDateFilterFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDateFilterTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="issueRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuedFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maoReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maoReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdbReferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdbReferredApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="printDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="printDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receivedDateFilterFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receivedDateFilterTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="referTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationSearchCriteria", propOrder = {
    "applicationDate",
    "applicationDateFilterFrom",
    "applicationDateFilterTo",
    "applicationId",
    "bvrsUser",
    "centerDeliveryDate",
    "currentStatus",
    "deliveryCenter",
    "deliveryType",
    "district",
    "division",
    "duplicateReason",
    "expectedDeliveryDateFilterFrom",
    "expectedDeliveryDateFilterTo",
    "expectedDeliveryDateFrom",
    "expectedDeliveryDateTo",
    "issueRef",
    "issueType",
    "issuedFrom",
    "maReferred",
    "maReferredApproved",
    "maoReferred",
    "maoReferredApproved",
    "mbReferred",
    "mbReferredApproved",
    "mdbReferred",
    "mdbReferredApproved",
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
    "printDateFrom",
    "printDateTo",
    "receivedDate",
    "receivedDateFilterFrom",
    "receivedDateFilterTo",
    "referTo",
    "registrationNo",
    "status",
    "voterDeliveryDate"
})
public class ApplicationSearchCriteria {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDateFilterFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDateFilterTo;
    protected Long applicationId;
    protected String bvrsUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar centerDeliveryDate;
    protected String currentStatus;
    protected String deliveryCenter;
    protected String deliveryType;
    protected String district;
    protected String division;
    protected String duplicateReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDateFilterFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDateFilterTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDateTo;
    protected String issueRef;
    protected String issueType;
    protected String issuedFrom;
    protected String maReferred;
    protected String maReferredApproved;
    protected String maoReferred;
    protected String maoReferredApproved;
    protected String mbReferred;
    protected String mbReferredApproved;
    protected String mdbReferred;
    protected String mdbReferredApproved;
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
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar printDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar printDateTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateFilterFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateFilterTo;
    protected String referTo;
    protected String registrationNo;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voterDeliveryDate;

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
     * Gets the value of the applicationDateFilterFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDateFilterFrom() {
        return applicationDateFilterFrom;
    }

    /**
     * Sets the value of the applicationDateFilterFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDateFilterFrom(XMLGregorianCalendar value) {
        this.applicationDateFilterFrom = value;
    }

    /**
     * Gets the value of the applicationDateFilterTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDateFilterTo() {
        return applicationDateFilterTo;
    }

    /**
     * Sets the value of the applicationDateFilterTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDateFilterTo(XMLGregorianCalendar value) {
        this.applicationDateFilterTo = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the bvrsUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBvrsUser() {
        return bvrsUser;
    }

    /**
     * Sets the value of the bvrsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBvrsUser(String value) {
        this.bvrsUser = value;
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
     * Gets the value of the expectedDeliveryDateFilterFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDateFilterFrom() {
        return expectedDeliveryDateFilterFrom;
    }

    /**
     * Sets the value of the expectedDeliveryDateFilterFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDateFilterFrom(XMLGregorianCalendar value) {
        this.expectedDeliveryDateFilterFrom = value;
    }

    /**
     * Gets the value of the expectedDeliveryDateFilterTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDateFilterTo() {
        return expectedDeliveryDateFilterTo;
    }

    /**
     * Sets the value of the expectedDeliveryDateFilterTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDateFilterTo(XMLGregorianCalendar value) {
        this.expectedDeliveryDateFilterTo = value;
    }

    /**
     * Gets the value of the expectedDeliveryDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDateFrom() {
        return expectedDeliveryDateFrom;
    }

    /**
     * Sets the value of the expectedDeliveryDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDateFrom(XMLGregorianCalendar value) {
        this.expectedDeliveryDateFrom = value;
    }

    /**
     * Gets the value of the expectedDeliveryDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDateTo() {
        return expectedDeliveryDateTo;
    }

    /**
     * Sets the value of the expectedDeliveryDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDateTo(XMLGregorianCalendar value) {
        this.expectedDeliveryDateTo = value;
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
     * Gets the value of the issuedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedFrom() {
        return issuedFrom;
    }

    /**
     * Sets the value of the issuedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedFrom(String value) {
        this.issuedFrom = value;
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
     * Gets the value of the printDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDateFrom() {
        return printDateFrom;
    }

    /**
     * Sets the value of the printDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDateFrom(XMLGregorianCalendar value) {
        this.printDateFrom = value;
    }

    /**
     * Gets the value of the printDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDateTo() {
        return printDateTo;
    }

    /**
     * Sets the value of the printDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDateTo(XMLGregorianCalendar value) {
        this.printDateTo = value;
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
     * Gets the value of the receivedDateFilterFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDateFilterFrom() {
        return receivedDateFilterFrom;
    }

    /**
     * Sets the value of the receivedDateFilterFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDateFilterFrom(XMLGregorianCalendar value) {
        this.receivedDateFilterFrom = value;
    }

    /**
     * Gets the value of the receivedDateFilterTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDateFilterTo() {
        return receivedDateFilterTo;
    }

    /**
     * Sets the value of the receivedDateFilterTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDateFilterTo(XMLGregorianCalendar value) {
        this.receivedDateFilterTo = value;
    }

    /**
     * Gets the value of the referTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferTo() {
        return referTo;
    }

    /**
     * Sets the value of the referTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferTo(String value) {
        this.referTo = value;
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

}
