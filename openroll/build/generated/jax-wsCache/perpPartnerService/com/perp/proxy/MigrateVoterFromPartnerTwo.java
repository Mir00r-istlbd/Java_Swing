
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for migrateVoterFromPartnerTwo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="migrateVoterFromPartnerTwo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}migrateVoterFromPartnerServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migrateVoterFromPartnerTwo", propOrder = {
    "request"
})
public class MigrateVoterFromPartnerTwo {

    protected MigrateVoterFromPartnerServiceRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link MigrateVoterFromPartnerServiceRequest }
     *     
     */
    public MigrateVoterFromPartnerServiceRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateVoterFromPartnerServiceRequest }
     *     
     */
    public void setRequest(MigrateVoterFromPartnerServiceRequest value) {
        this.request = value;
    }

}
