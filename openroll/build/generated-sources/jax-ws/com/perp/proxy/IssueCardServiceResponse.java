
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for issueCardServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issueCardServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="cardIssueApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="registrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueCardServiceResponse", propOrder = {
    "cardIssueApplicationId",
    "registrationNo"
})
public class IssueCardServiceResponse
    extends ServiceResponse
{

    protected Long cardIssueApplicationId;
    protected String registrationNo;

    /**
     * Gets the value of the cardIssueApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardIssueApplicationId() {
        return cardIssueApplicationId;
    }

    /**
     * Sets the value of the cardIssueApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardIssueApplicationId(Long value) {
        this.cardIssueApplicationId = value;
    }

    /**
     * Gets the value of the registrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * Sets the value of the registrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNo(String value) {
        this.registrationNo = value;
    }

}
