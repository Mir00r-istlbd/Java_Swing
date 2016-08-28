
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherDataSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherDataSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfDeathFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfDeathMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfDeathSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laptop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noFinger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noFingerprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoFather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoMother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNoSpouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherDataSearchCriteria", propOrder = {
    "bloodGroup",
    "clientCreationDate",
    "dateOfDeath",
    "dateOfDeathFather",
    "dateOfDeathMother",
    "dateOfDeathSpouse",
    "driving",
    "education",
    "educationOther",
    "educationSub",
    "enrollmentDate",
    "identification",
    "laptop",
    "lockFlag",
    "mobile",
    "nidFather",
    "nidMother",
    "nidSpouse",
    "noFinger",
    "noFingerprint",
    "passport",
    "phone",
    "religion",
    "religionOther",
    "tin",
    "voterNoFather",
    "voterNoMother",
    "voterNoSpouse"
})
public class OtherDataSearchCriteria {

    protected String bloodGroup;
    protected String clientCreationDate;
    protected String dateOfDeath;
    protected String dateOfDeathFather;
    protected String dateOfDeathMother;
    protected String dateOfDeathSpouse;
    protected String driving;
    protected String education;
    protected String educationOther;
    protected String educationSub;
    protected String enrollmentDate;
    protected String identification;
    protected String laptop;
    protected String lockFlag;
    protected String mobile;
    protected String nidFather;
    protected String nidMother;
    protected String nidSpouse;
    protected String noFinger;
    protected String noFingerprint;
    protected String passport;
    protected String phone;
    protected String religion;
    protected String religionOther;
    protected String tin;
    protected String voterNoFather;
    protected String voterNoMother;
    protected String voterNoSpouse;

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
     * Gets the value of the clientCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCreationDate() {
        return clientCreationDate;
    }

    /**
     * Sets the value of the clientCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCreationDate(String value) {
        this.clientCreationDate = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeath(String value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the dateOfDeathFather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeathFather() {
        return dateOfDeathFather;
    }

    /**
     * Sets the value of the dateOfDeathFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeathFather(String value) {
        this.dateOfDeathFather = value;
    }

    /**
     * Gets the value of the dateOfDeathMother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeathMother() {
        return dateOfDeathMother;
    }

    /**
     * Sets the value of the dateOfDeathMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeathMother(String value) {
        this.dateOfDeathMother = value;
    }

    /**
     * Gets the value of the dateOfDeathSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeathSpouse() {
        return dateOfDeathSpouse;
    }

    /**
     * Sets the value of the dateOfDeathSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeathSpouse(String value) {
        this.dateOfDeathSpouse = value;
    }

    /**
     * Gets the value of the driving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriving() {
        return driving;
    }

    /**
     * Sets the value of the driving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriving(String value) {
        this.driving = value;
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
     * Gets the value of the enrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the value of the enrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentDate(String value) {
        this.enrollmentDate = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the laptop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaptop() {
        return laptop;
    }

    /**
     * Sets the value of the laptop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaptop(String value) {
        this.laptop = value;
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
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Gets the value of the noFinger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoFinger() {
        return noFinger;
    }

    /**
     * Sets the value of the noFinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoFinger(String value) {
        this.noFinger = value;
    }

    /**
     * Gets the value of the noFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoFingerprint() {
        return noFingerprint;
    }

    /**
     * Sets the value of the noFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoFingerprint(String value) {
        this.noFingerprint = value;
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassport(String value) {
        this.passport = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
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

}
