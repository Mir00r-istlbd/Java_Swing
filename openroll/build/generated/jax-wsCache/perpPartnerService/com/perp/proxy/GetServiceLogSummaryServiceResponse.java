
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLogSummaryServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLogSummaryServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="serviceLogSummaryList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceLogSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLogSummaryServiceResponse", propOrder = {
    "serviceLogSummaryList"
})
public class GetServiceLogSummaryServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<ServiceLogSummary> serviceLogSummaryList;

    /**
     * Gets the value of the serviceLogSummaryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLogSummaryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLogSummaryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLogSummary }
     * 
     * 
     */
    public List<ServiceLogSummary> getServiceLogSummaryList() {
        if (serviceLogSummaryList == null) {
            serviceLogSummaryList = new ArrayList<ServiceLogSummary>();
        }
        return this.serviceLogSummaryList;
    }

}
