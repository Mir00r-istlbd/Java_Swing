
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identifyServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifyServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="voterList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifyServiceResponse", propOrder = {
    "voterList"
})
public class IdentifyServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<VoterInfo> voterList;

    /**
     * Gets the value of the voterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoterInfo }
     * 
     * 
     */
    public List<VoterInfo> getVoterList() {
        if (voterList == null) {
            voterList = new ArrayList<VoterInfo>();
        }
        return this.voterList;
    }

}
