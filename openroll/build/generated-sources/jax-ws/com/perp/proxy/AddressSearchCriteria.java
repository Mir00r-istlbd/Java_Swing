
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherVillage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postoffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="union" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upozila" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "addressSearchCriteria", propOrder = {
    "area",
    "city",
    "district",
    "division",
    "house",
    "otherArea",
    "otherVillage",
    "postcode",
    "postoffice",
    "rmo",
    "union",
    "upozila",
    "village",
    "voterArea",
    "voterAt",
    "ward"
})
public class AddressSearchCriteria {

    protected String area;
    protected String city;
    protected String district;
    protected String division;
    protected String house;
    protected String otherArea;
    protected String otherVillage;
    protected String postcode;
    protected String postoffice;
    protected String rmo;
    protected String union;
    protected String upozila;
    protected String village;
    protected String voterArea;
    protected String voterAt;
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
     * Gets the value of the otherArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherArea() {
        return otherArea;
    }

    /**
     * Sets the value of the otherArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherArea(String value) {
        this.otherArea = value;
    }

    /**
     * Gets the value of the otherVillage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherVillage() {
        return otherVillage;
    }

    /**
     * Sets the value of the otherVillage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherVillage(String value) {
        this.otherVillage = value;
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
     * Gets the value of the union property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnion() {
        return union;
    }

    /**
     * Sets the value of the union property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnion(String value) {
        this.union = value;
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
     * Gets the value of the voterAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterAt() {
        return voterAt;
    }

    /**
     * Sets the value of the voterAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterAt(String value) {
        this.voterAt = value;
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
