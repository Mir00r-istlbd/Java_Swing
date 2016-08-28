
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterCountFromVoterAreaServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterCountFromVoterAreaServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slNoEnd" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="slNoStart" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="voterAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterCountFromVoterAreaServiceRequest", propOrder = {
    "gender",
    "slNoEnd",
    "slNoStart",
    "voterAreaId"
})
public class GetVoterCountFromVoterAreaServiceRequest
    extends ServiceRequest
{

    protected String gender;
    protected Long slNoEnd;
    protected Long slNoStart;
    protected String voterAreaId;

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the slNoEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlNoEnd() {
        return slNoEnd;
    }

    /**
     * Sets the value of the slNoEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlNoEnd(Long value) {
        this.slNoEnd = value;
    }

    /**
     * Gets the value of the slNoStart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlNoStart() {
        return slNoStart;
    }

    /**
     * Sets the value of the slNoStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlNoStart(Long value) {
        this.slNoStart = value;
    }

    /**
     * Gets the value of the voterAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterAreaId() {
        return voterAreaId;
    }

    /**
     * Sets the value of the voterAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterAreaId(String value) {
        this.voterAreaId = value;
    }

}
