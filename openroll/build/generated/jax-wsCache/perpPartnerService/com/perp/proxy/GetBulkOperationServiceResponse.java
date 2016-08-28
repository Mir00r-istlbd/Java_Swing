
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBulkOperationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBulkOperationServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="bulkOperationsList" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}bulkOperations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBulkOperationServiceResponse", propOrder = {
    "bulkOperationsList"
})
public class GetBulkOperationServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<BulkOperations> bulkOperationsList;

    /**
     * Gets the value of the bulkOperationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulkOperationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulkOperationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BulkOperations }
     * 
     * 
     */
    public List<BulkOperations> getBulkOperationsList() {
        if (bulkOperationsList == null) {
            bulkOperationsList = new ArrayList<BulkOperations>();
        }
        return this.bulkOperationsList;
    }

}
