
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pollingCenterServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pollingCenterServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="centerNameBng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centerNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pollingCenterServiceResponse", propOrder = {
    "centerNameBng",
    "centerNameEng",
    "name",
    "nid",
    "slno",
    "voterArea",
    "voterNo"
})
public class PollingCenterServiceResponse
    extends ServiceResponse
{

    protected String centerNameBng;
    protected String centerNameEng;
    protected String name;
    protected String nid;
    protected String slno;
    protected String voterArea;
    protected String voterNo;

    /**
     * Gets the value of the centerNameBng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterNameBng() {
        return centerNameBng;
    }

    /**
     * Sets the value of the centerNameBng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterNameBng(String value) {
        this.centerNameBng = value;
    }

    /**
     * Gets the value of the centerNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterNameEng() {
        return centerNameEng;
    }

    /**
     * Sets the value of the centerNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterNameEng(String value) {
        this.centerNameEng = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNid(String value) {
        this.nid = value;
    }

    /**
     * Gets the value of the slno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlno() {
        return slno;
    }

    /**
     * Sets the value of the slno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlno(String value) {
        this.slno = value;
    }

    /**
     * Gets the value of the voterArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterArea() {
        return voterArea;
    }

    /**
     * Sets the value of the voterArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterArea(String value) {
        this.voterArea = value;
    }

    /**
     * Gets the value of the voterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterNo() {
        return voterNo;
    }

    /**
     * Sets the value of the voterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterNo(String value) {
        this.voterNo = value;
    }

}
