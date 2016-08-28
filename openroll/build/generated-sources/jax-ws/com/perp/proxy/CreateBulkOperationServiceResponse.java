
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBulkOperationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBulkOperationServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="bulkOperationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBulkOperationServiceResponse", propOrder = {
    "bulkOperationId"
})
public class CreateBulkOperationServiceResponse
    extends ServiceResponse
{

    protected Long bulkOperationId;

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

}
