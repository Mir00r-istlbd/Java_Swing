
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVerfiyCardChangeTransactionServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVerfiyCardChangeTransactionServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="cardChangeTransactionStatus" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}cardChangeTransactionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVerfiyCardChangeTransactionServiceResponse", propOrder = {
    "cardChangeTransactionStatus"
})
public class GetVerfiyCardChangeTransactionServiceResponse
    extends ServiceResponse
{

    protected CardChangeTransactionStatus cardChangeTransactionStatus;

    /**
     * Gets the value of the cardChangeTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardChangeTransactionStatus }
     *     
     */
    public CardChangeTransactionStatus getCardChangeTransactionStatus() {
        return cardChangeTransactionStatus;
    }

    /**
     * Sets the value of the cardChangeTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardChangeTransactionStatus }
     *     
     */
    public void setCardChangeTransactionStatus(CardChangeTransactionStatus value) {
        this.cardChangeTransactionStatus = value;
    }

}
