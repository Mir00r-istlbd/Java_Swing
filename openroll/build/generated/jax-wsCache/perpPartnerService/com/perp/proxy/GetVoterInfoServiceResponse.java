
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInfoServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInfoServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="voterInfo" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterInfoDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInfoServiceResponse", propOrder = {
    "voterInfo"
})
public class GetVoterInfoServiceResponse
    extends ServiceResponse
{

    protected VoterInfoDetail voterInfo;

    /**
     * Gets the value of the voterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VoterInfoDetail }
     *     
     */
    public VoterInfoDetail getVoterInfo() {
        return voterInfo;
    }

    /**
     * Sets the value of the voterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterInfoDetail }
     *     
     */
    public void setVoterInfo(VoterInfoDetail value) {
        this.voterInfo = value;
    }

}
