
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voterInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voterInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biometricInformation" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterBiometricInformation" minOccurs="0"/>
 *         &lt;element name="demographicInformation" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterDemographicInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterInformation", propOrder = {
    "biometricInformation",
    "demographicInformation"
})
@XmlSeeAlso({
    VoterInfoDetail.class
})
public class VoterInformation {

    protected VoterBiometricInformation biometricInformation;
    protected VoterDemographicInformation demographicInformation;

    /**
     * Gets the value of the biometricInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VoterBiometricInformation }
     *     
     */
    public VoterBiometricInformation getBiometricInformation() {
        return biometricInformation;
    }

    /**
     * Sets the value of the biometricInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterBiometricInformation }
     *     
     */
    public void setBiometricInformation(VoterBiometricInformation value) {
        this.biometricInformation = value;
    }

    /**
     * Gets the value of the demographicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VoterDemographicInformation }
     *     
     */
    public VoterDemographicInformation getDemographicInformation() {
        return demographicInformation;
    }

    /**
     * Sets the value of the demographicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterDemographicInformation }
     *     
     */
    public void setDemographicInformation(VoterDemographicInformation value) {
        this.demographicInformation = value;
    }

}
