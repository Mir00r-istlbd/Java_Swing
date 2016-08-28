
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBulkOperationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBulkOperationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="bulkOperationSearchCriteria" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}bulkOperationSearchCriteria" minOccurs="0"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBulkOperationServiceRequest", propOrder = {
    "bulkOperationSearchCriteria",
    "recordCount",
    "startIndex",
    "totalRecords"
})
public class GetBulkOperationServiceRequest
    extends ServiceRequest
{

    protected BulkOperationSearchCriteria bulkOperationSearchCriteria;
    protected int recordCount;
    protected int startIndex;
    protected boolean totalRecords;

    /**
     * Gets the value of the bulkOperationSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BulkOperationSearchCriteria }
     *     
     */
    public BulkOperationSearchCriteria getBulkOperationSearchCriteria() {
        return bulkOperationSearchCriteria;
    }

    /**
     * Sets the value of the bulkOperationSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkOperationSearchCriteria }
     *     
     */
    public void setBulkOperationSearchCriteria(BulkOperationSearchCriteria value) {
        this.bulkOperationSearchCriteria = value;
    }

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

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public boolean isTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(boolean value) {
        this.totalRecords = value;
    }

}
