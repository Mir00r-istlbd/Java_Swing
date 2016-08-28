
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voterAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voterAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalMouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalVillageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCorporationOrMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeOrHoldingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mouzaOrMoholla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unionOrWard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upozila" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="villageOrRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wardForUnionPorishod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterAddress", propOrder = {
    "additionalMouzaOrMoholla",
    "additionalVillageOrRoad",
    "cityCorporationOrMunicipality",
    "district",
    "division",
    "homeOrHoldingNo",
    "mouzaOrMoholla",
    "postOffice",
    "postalCode",
    "rmo",
    "unionOrWard",
    "upozila",
    "villageOrRoad",
    "voterArea",
    "wardForUnionPorishod"
})
public class VoterAddress {

    protected String additionalMouzaOrMoholla;
    protected String additionalVillageOrRoad;
    protected String cityCorporationOrMunicipality;
    protected String district;
    protected String division;
    protected String homeOrHoldingNo;
    protected String mouzaOrMoholla;
    protected String postOffice;
    protected String postalCode;
    protected String rmo;
    protected String unionOrWard;
    protected String upozila;
    protected String villageOrRoad;
    protected String voterArea;
    protected Long wardForUnionPorishod;

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

}
