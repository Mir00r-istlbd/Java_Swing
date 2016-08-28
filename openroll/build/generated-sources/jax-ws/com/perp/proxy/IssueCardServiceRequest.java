
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for issueCardServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issueCardServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cardIssueApplication" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}cardIssueApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueCardServiceRequest", propOrder = {
    "cardIssueApplication"
})
public class IssueCardServiceRequest
    extends ServiceRequest
{

    protected CardIssueApplication cardIssueApplication;

    /**
     * Gets the value of the cardIssueApplication property.
     * 
     * @return
     *     possible object is
     *     {@link CardIssueApplication }
     *     
     */
    public CardIssueApplication getCardIssueApplication() {
        return cardIssueApplication;
    }

    /**
     * Sets the value of the cardIssueApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIssueApplication }
     *     
     */
    public void setCardIssueApplication(CardIssueApplication value) {
        this.cardIssueApplication = value;
    }

}
