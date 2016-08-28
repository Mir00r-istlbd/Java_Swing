
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCardIssueApplicationsServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardIssueApplicationsServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="cardIssueApplicationList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}cardIssueApplication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardIssueApplicationsServiceResponse", propOrder = {
    "cardIssueApplicationList"
})
public class GetCardIssueApplicationsServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<CardIssueApplication> cardIssueApplicationList;

    /**
     * Gets the value of the cardIssueApplicationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardIssueApplicationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardIssueApplicationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardIssueApplication }
     * 
     * 
     */
    public List<CardIssueApplication> getCardIssueApplicationList() {
        if (cardIssueApplicationList == null) {
            cardIssueApplicationList = new ArrayList<CardIssueApplication>();
        }
        return this.cardIssueApplicationList;
    }

}
