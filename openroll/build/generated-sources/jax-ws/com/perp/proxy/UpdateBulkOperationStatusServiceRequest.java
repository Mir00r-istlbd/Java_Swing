
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateBulkOperationStatusServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateBulkOperationStatusServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="bulkOperationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="failedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBulkOperationStatusServiceRequest", propOrder = {
    "bulkOperationId",
    "failedReason",
    "operationStatus",
    "outputFilePath"
})
public class UpdateBulkOperationStatusServiceRequest
    extends ServiceRequest
{

    protected Long bulkOperationId;
    protected String failedReason;
    protected String operationStatus;
    protected String outputFilePath;

    /**
     * Gets the value of the bulkOperationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBulkOperationId() {
        return bulkOperationId;
    }

    /**
     * Sets the value of the bulkOperationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBulkOperationId(Long value) {
        this.bulkOperationId = value;
    }

    /**
     * Gets the value of the failedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedReason() {
        return failedReason;
    }

    /**
     * Sets the value of the failedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedReason(String value) {
        this.failedReason = value;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationStatus(String value) {
        this.operationStatus = value;
    }

    /**
     * Gets the value of the outputFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFilePath() {
        return outputFilePath;
    }

    /**
     * Sets the value of the outputFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFilePath(String value) {
        this.outputFilePath = value;
    }

}
