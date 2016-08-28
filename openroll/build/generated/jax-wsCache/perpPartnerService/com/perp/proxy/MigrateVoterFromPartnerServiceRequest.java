
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for migrateVoterFromPartnerServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="migrateVoterFromPartnerServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="demographicInformation" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}demographicInformation" minOccurs="0"/>
 *         &lt;element name="document1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="document2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fingerPrintException" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}fingerPrintException" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="upozillaUserComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migrateVoterFromPartnerServiceRequest", propOrder = {
    "demographicInformation",
    "document1",
    "document2",
    "fingerPrintException",
    "upozillaUserComment"
})
public class MigrateVoterFromPartnerServiceRequest
    extends ServiceRequest
{

    protected DemographicInformation demographicInformation;
    protected byte[] document1;
    protected byte[] document2;
    @XmlElement(nillable = true)
    protected List<FingerPrintException> fingerPrintException;
    protected String upozillaUserComment;

    /**
     * Gets the value of the demographicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicInformation }
     *     
     */
    public DemographicInformation getDemographicInformation() {
        return demographicInformation;
    }

    /**
     * Sets the value of the demographicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicInformation }
     *     
     */
    public void setDemographicInformation(DemographicInformation value) {
        this.demographicInformation = value;
    }

    /**
     * Gets the value of the document1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument1() {
        return document1;
    }

    /**
     * Sets the value of the document1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument1(byte[] value) {
        this.document1 = value;
    }

    /**
     * Gets the value of the document2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument2() {
        return document2;
    }

    /**
     * Sets the value of the document2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument2(byte[] value) {
        this.document2 = value;
    }

    /**
     * Gets the value of the fingerPrintException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fingerPrintException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFingerPrintException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FingerPrintException }
     * 
     * 
     */
    public List<FingerPrintException> getFingerPrintException() {
        if (fingerPrintException == null) {
            fingerPrintException = new ArrayList<FingerPrintException>();
        }
        return this.fingerPrintException;
    }

    /**
     * Gets the value of the upozillaUserComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpozillaUserComment() {
        return upozillaUserComment;
    }

    /**
     * Sets the value of the upozillaUserComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpozillaUserComment(String value) {
        this.upozillaUserComment = value;
    }

}
