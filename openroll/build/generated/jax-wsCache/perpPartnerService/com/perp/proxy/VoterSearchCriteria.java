
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voterSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voterSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentAddressSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}addressSearchCriteria" minOccurs="0"/>
 *         &lt;element name="generalDataSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}generalDataSearchCriteria" minOccurs="0"/>
 *         &lt;element name="otherSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}otherDataSearchCriteria" minOccurs="0"/>
 *         &lt;element name="permanentAddressSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}addressSearchCriteria" minOccurs="0"/>
 *         &lt;element name="personalDataSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}personalDataSearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterSearchCriteria", propOrder = {
    "currentAddressSearchCriteria",
    "generalDataSearchCriteria",
    "otherSearchCriteria",
    "permanentAddressSearchCriteria",
    "personalDataSearchCriteria"
})
public class VoterSearchCriteria {

    protected AddressSearchCriteria currentAddressSearchCriteria;
    protected GeneralDataSearchCriteria generalDataSearchCriteria;
    protected OtherDataSearchCriteria otherSearchCriteria;
    protected AddressSearchCriteria permanentAddressSearchCriteria;
    protected PersonalDataSearchCriteria personalDataSearchCriteria;

    /**
     * Gets the value of the currentAddressSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchCriteria }
     *     
     */
    public AddressSearchCriteria getCurrentAddressSearchCriteria() {
        return currentAddressSearchCriteria;
    }

    /**
     * Sets the value of the currentAddressSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchCriteria }
     *     
     */
    public void setCurrentAddressSearchCriteria(AddressSearchCriteria value) {
        this.currentAddressSearchCriteria = value;
    }

    /**
     * Gets the value of the generalDataSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralDataSearchCriteria }
     *     
     */
    public GeneralDataSearchCriteria getGeneralDataSearchCriteria() {
        return generalDataSearchCriteria;
    }

    /**
     * Sets the value of the generalDataSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralDataSearchCriteria }
     *     
     */
    public void setGeneralDataSearchCriteria(GeneralDataSearchCriteria value) {
        this.generalDataSearchCriteria = value;
    }

    /**
     * Gets the value of the otherSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OtherDataSearchCriteria }
     *     
     */
    public OtherDataSearchCriteria getOtherSearchCriteria() {
        return otherSearchCriteria;
    }

    /**
     * Sets the value of the otherSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherDataSearchCriteria }
     *     
     */
    public void setOtherSearchCriteria(OtherDataSearchCriteria value) {
        this.otherSearchCriteria = value;
    }

    /**
     * Gets the value of the permanentAddressSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchCriteria }
     *     
     */
    public AddressSearchCriteria getPermanentAddressSearchCriteria() {
        return permanentAddressSearchCriteria;
    }

    /**
     * Sets the value of the permanentAddressSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchCriteria }
     *     
     */
    public void setPermanentAddressSearchCriteria(AddressSearchCriteria value) {
        this.permanentAddressSearchCriteria = value;
    }

    /**
     * Gets the value of the personalDataSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataSearchCriteria }
     *     
     */
    public PersonalDataSearchCriteria getPersonalDataSearchCriteria() {
        return personalDataSearchCriteria;
    }

    /**
     * Sets the value of the personalDataSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataSearchCriteria }
     *     
     */
    public void setPersonalDataSearchCriteria(PersonalDataSearchCriteria value) {
        this.personalDataSearchCriteria = value;
    }

}
