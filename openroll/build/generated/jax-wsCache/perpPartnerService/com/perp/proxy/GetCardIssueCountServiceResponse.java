
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCardIssueCountServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardIssueCountServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="cardIssueInfo" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}cardIssueSum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardIssueCountServiceResponse", propOrder = {
    "cardIssueInfo"
})
public class GetCardIssueCountServiceResponse
    extends ServiceResponse
{

    protected CardIssueSum cardIssueInfo;

    /**
     * Gets the value of the cardIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardIssueSum }
     *     
     */
    public CardIssueSum getCardIssueInfo() {
        return cardIssueInfo;
    }

    /**
     * Sets the value of the cardIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIssueSum }
     *     
     */
    public void setCardIssueInfo(CardIssueSum value) {
        this.cardIssueInfo = value;
    }

}
