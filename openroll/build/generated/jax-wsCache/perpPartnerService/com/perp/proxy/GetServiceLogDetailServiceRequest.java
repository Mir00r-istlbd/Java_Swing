
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLogDetailServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLogDetailServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceLogSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceLogSearchCriteria" minOccurs="0"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLogDetailServiceRequest", propOrder = {
    "recordCount",
    "serviceLogSearchCriteria",
    "startIndex"
})
public class GetServiceLogDetailServiceRequest
    extends ServiceRequest
{

    protected int recordCount;
    protected ServiceLogSearchCriteria serviceLogSearchCriteria;
    protected int startIndex;

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the serviceLogSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLogSearchCriteria }
     *     
     */
    public ServiceLogSearchCriteria getServiceLogSearchCriteria() {
        return serviceLogSearchCriteria;
    }

    /**
     * Sets the value of the serviceLogSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLogSearchCriteria }
     *     
     */
    public void setServiceLogSearchCriteria(ServiceLogSearchCriteria value) {
        this.serviceLogSearchCriteria = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

}
