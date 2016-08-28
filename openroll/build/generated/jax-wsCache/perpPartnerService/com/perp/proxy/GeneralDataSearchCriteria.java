
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalDataSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalDataSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afisStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statuses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalDataSearchCriteria", propOrder = {
    "afisStatus",
    "formNumbers",
    "pins",
    "serialNumbers",
    "statuses",
    "tags",
    "voterNumbers"
})
public class GeneralDataSearchCriteria {

    protected String afisStatus;
    protected String formNumbers;
    protected String pins;
    protected String serialNumbers;
    protected String statuses;
    protected String tags;
    protected String voterNumbers;

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
     * Gets the value of the formNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumbers() {
        return formNumbers;
    }

    /**
     * Sets the value of the formNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumbers(String value) {
        this.formNumbers = value;
    }

    /**
     * Gets the value of the pins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPins() {
        return pins;
    }

    /**
     * Sets the value of the pins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPins(String value) {
        this.pins = value;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumbers(String value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatuses(String value) {
        this.statuses = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Gets the value of the voterNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNumbers() {
        return voterNumbers;
    }

    /**
     * Sets the value of the voterNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNumbers(String value) {
        this.voterNumbers = value;
    }

}
