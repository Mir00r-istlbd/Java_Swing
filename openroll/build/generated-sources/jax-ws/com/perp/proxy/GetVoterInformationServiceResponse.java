
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="voterInformation" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationServiceResponse", propOrder = {
    "voterInformation"
})
public class GetVoterInformationServiceResponse
    extends ServiceResponse
{

    protected VoterInformation voterInformation;

    /**
     * Gets the value of the voterInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VoterInformation }
     *     
     */
    public VoterInformation getVoterInformation() {
        return voterInformation;
    }

    /**
     * Sets the value of the voterInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterInformation }
     *     
     */
    public void setVoterInformation(VoterInformation value) {
        this.voterInformation = value;
    }

}
