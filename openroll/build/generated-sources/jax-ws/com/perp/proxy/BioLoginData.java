
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bioLoginData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bioLoginData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appletFinger" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fingerHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fingerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fingerWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bioLoginData", propOrder = {
    "appletFinger",
    "fingerHeight",
    "fingerId",
    "fingerWidth"
})
public class BioLoginData {

    protected byte[] appletFinger;
    protected int fingerHeight;
    protected int fingerId;
    protected int fingerWidth;

    /**
     * Gets the value of the appletFinger property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAppletFinger() {
        return appletFinger;
    }

    /**
     * Sets the value of the appletFinger property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAppletFinger(byte[] value) {
        this.appletFinger = value;
    }

    /**
     * Gets the value of the fingerHeight property.
     * 
     */
    public int getFingerHeight() {
        return fingerHeight;
    }

    /**
     * Sets the value of the fingerHeight property.
     * 
     */
    public void setFingerHeight(int value) {
        this.fingerHeight = value;
    }

    /**
     * Gets the value of the fingerId property.
     * 
     */
    public int getFingerId() {
        return fingerId;
    }

    /**
     * Sets the value of the fingerId property.
     * 
     */
    public void setFingerId(int value) {
        this.fingerId = value;
    }

    /**
     * Gets the value of the fingerWidth property.
     * 
     */
    public int getFingerWidth() {
        return fingerWidth;
    }

    /**
     * Sets the value of the fingerWidth property.
     * 
     */
    public void setFingerWidth(int value) {
        this.fingerWidth = value;
    }

}
