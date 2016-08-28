
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identifyByBiometricDataServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifyByBiometricDataServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="biometricData" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}biometricInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifyByBiometricDataServiceRequest", propOrder = {
    "biometricData"
})
public class IdentifyByBiometricDataServiceRequest
    extends ServiceRequest
{

    protected BiometricInformation biometricData;

    /**
     * Gets the value of the biometricData property.
     * 
     * @return
     *     possible object is
     *     {@link BiometricInformation }
     *     
     */
    public BiometricInformation getBiometricData() {
        return biometricData;
    }

    /**
     * Sets the value of the biometricData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometricInformation }
     *     
     */
    public void setBiometricData(BiometricInformation value) {
        this.biometricData = value;
    }

}
