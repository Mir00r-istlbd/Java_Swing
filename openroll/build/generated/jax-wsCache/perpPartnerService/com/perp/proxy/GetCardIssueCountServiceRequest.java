
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCardIssueCountServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardIssueCountServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}cardIssueCountSearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardIssueCountServiceRequest", propOrder = {
    "criteria"
})
public class GetCardIssueCountServiceRequest
    extends ServiceRequest
{

    protected CardIssueCountSearchCriteria criteria;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CardIssueCountSearchCriteria }
     *     
     */
    public CardIssueCountSearchCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIssueCountSearchCriteria }
     *     
     */
    public void setCriteria(CardIssueCountSearchCriteria value) {
        this.criteria = value;
    }

}
