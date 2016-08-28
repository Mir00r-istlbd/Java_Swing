
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationByVoterNoServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationByVoterNoServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="voterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationByVoterNoServiceRequest", propOrder = {
    "voterNo"
})
public class GetVoterInformationByVoterNoServiceRequest
    extends ServiceRequest
{

    protected String voterNo;

    /**
     * Gets the value of the voterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNo() {
        return voterNo;
    }

    /**
     * Sets the value of the voterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNo(String value) {
        this.voterNo = value;
    }

}
