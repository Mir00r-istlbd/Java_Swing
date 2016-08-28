
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identifyByPassportNumberServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifyByPassportNumberServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="voterInfo" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifyByPassportNumberServiceResponse", propOrder = {
    "voterInfo"
})
public class IdentifyByPassportNumberServiceResponse
    extends ServiceResponse
{

    protected VoterInfo voterInfo;

    /**
     * Gets the value of the voterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VoterInfo }
     *     
     */
    public VoterInfo getVoterInfo() {
        return voterInfo;
    }

    /**
     * Sets the value of the voterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterInfo }
     *     
     */
    public void setVoterInfo(VoterInfo value) {
        this.voterInfo = value;
    }

}
