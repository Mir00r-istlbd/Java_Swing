
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLogDetailServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLogDetailServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="serviceLogDetailList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceLogDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLogDetailServiceResponse", propOrder = {
    "serviceLogDetailList"
})
public class GetServiceLogDetailServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<ServiceLogDetail> serviceLogDetailList;

    /**
     * Gets the value of the serviceLogDetailList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLogDetailList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLogDetailList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLogDetail }
     * 
     * 
     */
    public List<ServiceLogDetail> getServiceLogDetailList() {
        if (serviceLogDetailList == null) {
            serviceLogDetailList = new ArrayList<ServiceLogDetail>();
        }
        return this.serviceLogDetailList;
    }

}
