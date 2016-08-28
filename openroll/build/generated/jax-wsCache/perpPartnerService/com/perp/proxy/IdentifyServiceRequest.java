
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identifyServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifyServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="fingerprints" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}fingerprints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifyServiceRequest", propOrder = {
    "fingerprints"
})
public class IdentifyServiceRequest
    extends ServiceRequest
{

    protected Fingerprints fingerprints;

    /**
     * Gets the value of the fingerprints property.
     * 
     * @return
     *     possible object is
     *     {@link Fingerprints }
     *     
     */
    public Fingerprints getFingerprints() {
        return fingerprints;
    }

    /**
     * Sets the value of the fingerprints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fingerprints }
     *     
     */
    public void setFingerprints(Fingerprints value) {
        this.fingerprints = value;
    }

}
