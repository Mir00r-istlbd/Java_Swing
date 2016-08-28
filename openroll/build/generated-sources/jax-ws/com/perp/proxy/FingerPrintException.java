
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fingerPrintException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fingerPrintException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalFinger" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}fingerIndex" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substituteFinger" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}fingerIndex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fingerPrintException", propOrder = {
    "originalFinger",
    "reason",
    "remarks",
    "substituteFinger"
})
public class FingerPrintException {

    protected FingerIndex originalFinger;
    protected String reason;
    protected String remarks;
    protected FingerIndex substituteFinger;

    /**
     * Gets the value of the originalFinger property.
     * 
     * @return
     *     possible object is
     *     {@link FingerIndex }
     *     
     */
    public FingerIndex getOriginalFinger() {
        return originalFinger;
    }

    /**
     * Sets the value of the originalFinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerIndex }
     *     
     */
    public void setOriginalFinger(FingerIndex value) {
        this.originalFinger = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the substituteFinger property.
     * 
     * @return
     *     possible object is
     *     {@link FingerIndex }
     *     
     */
    public FingerIndex getSubstituteFinger() {
        return substituteFinger;
    }

    /**
     * Sets the value of the substituteFinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerIndex }
     *     
     */
    public void setSubstituteFinger(FingerIndex value) {
        this.substituteFinger = value;
    }

}
