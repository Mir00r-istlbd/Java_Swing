
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setInputFilePathBulkOperationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setInputFilePathBulkOperationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inputFileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setInputFilePathBulkOperationServiceRequest", propOrder = {
    "id",
    "inputFileExtension",
    "inputFilePath"
})
public class SetInputFilePathBulkOperationServiceRequest
    extends ServiceRequest
{

    protected Long id;
    protected String inputFileExtension;
    protected String inputFilePath;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the inputFileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFileExtension() {
        return inputFileExtension;
    }

    /**
     * Sets the value of the inputFileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFileExtension(String value) {
        this.inputFileExtension = value;
    }

    /**
     * Gets the value of the inputFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFilePath() {
        return inputFilePath;
    }

    /**
     * Sets the value of the inputFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFilePath(String value) {
        this.inputFilePath = value;
    }

}
