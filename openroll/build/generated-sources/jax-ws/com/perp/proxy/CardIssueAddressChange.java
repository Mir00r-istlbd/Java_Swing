
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardIssueAddressChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardIssueAddressChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eunion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postoffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upozila" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="villageOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardIssueAddressChange", propOrder = {
    "area",
    "areaOther",
    "city",
    "district",
    "division",
    "eunion",
    "house",
    "id",
    "postcode",
    "postoffice",
    "rmo",
    "upozila",
    "village",
    "villageOther",
    "ward"
})
public class CardIssueAddressChange {

    protected String area;
    protected String areaOther;
    protected String city;
    protected String district;
    protected String division;
    protected String eunion;
    protected String house;
    protected Long id;
    protected String postcode;
    protected String postoffice;
    protected String rmo;
    protected String upozila;
    protected String village;
    protected String villageOther;
    protected String ward;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the areaOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaOther() {
        return areaOther;
    }

    /**
     * Sets the value of the areaOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaOther(String value) {
        this.areaOther = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the eunion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEunion() {
        return eunion;
    }

    /**
     * Sets the value of the eunion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEunion(String value) {
        this.eunion = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
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
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the postoffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostoffice() {
        return postoffice;
    }

    /**
     * Sets the value of the postoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostoffice(String value) {
        this.postoffice = value;
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
     * Gets the value of the upozila property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpozila() {
        return upozila;
    }

    /**
     * Sets the value of the upozila property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpozila(String value) {
        this.upozila = value;
    }

    /**
     * Gets the value of the village property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the value of the village property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVillage(String value) {
        this.village = value;
    }

    /**
     * Gets the value of the villageOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVillageOther() {
        return villageOther;
    }

    /**
     * Sets the value of the villageOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVillageOther(String value) {
        this.villageOther = value;
    }

    /**
     * Gets the value of the ward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWard() {
        return ward;
    }

    /**
     * Sets the value of the ward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWard(String value) {
        this.ward = value;
    }

}
