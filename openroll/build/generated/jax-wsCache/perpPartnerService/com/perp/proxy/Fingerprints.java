
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fingerprints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fingerprints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leftIndex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftMiddle" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftPinky" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftRing" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumb" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightMiddle" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightPinky" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightRing" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumb" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fingerprints", propOrder = {
    "leftIndex",
    "leftMiddle",
    "leftPinky",
    "leftRing",
    "leftThumb",
    "rightIndex",
    "rightMiddle",
    "rightPinky",
    "rightRing",
    "rightThumb"
})
public class Fingerprints {

    protected byte[] leftIndex;
    protected byte[] leftMiddle;
    protected byte[] leftPinky;
    protected byte[] leftRing;
    protected byte[] leftThumb;
    protected byte[] rightIndex;
    protected byte[] rightMiddle;
    protected byte[] rightPinky;
    protected byte[] rightRing;
    protected byte[] rightThumb;

    /**
     * Gets the value of the leftIndex property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftIndex() {
        return leftIndex;
    }

    /**
     * Sets the value of the leftIndex property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftIndex(byte[] value) {
        this.leftIndex = value;
    }

    /**
     * Gets the value of the leftMiddle property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Sets the value of the leftMiddle property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftMiddle(byte[] value) {
        this.leftMiddle = value;
    }

    /**
     * Gets the value of the leftPinky property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftPinky() {
        return leftPinky;
    }

    /**
     * Sets the value of the leftPinky property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftPinky(byte[] value) {
        this.leftPinky = value;
    }

    /**
     * Gets the value of the leftRing property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftRing() {
        return leftRing;
    }

    /**
     * Sets the value of the leftRing property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftRing(byte[] value) {
        this.leftRing = value;
    }

    /**
     * Gets the value of the leftThumb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftThumb() {
        return leftThumb;
    }

    /**
     * Sets the value of the leftThumb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftThumb(byte[] value) {
        this.leftThumb = value;
    }

    /**
     * Gets the value of the rightIndex property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightIndex() {
        return rightIndex;
    }

    /**
     * Sets the value of the rightIndex property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightIndex(byte[] value) {
        this.rightIndex = value;
    }

    /**
     * Gets the value of the rightMiddle property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightMiddle() {
        return rightMiddle;
    }

    /**
     * Sets the value of the rightMiddle property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightMiddle(byte[] value) {
        this.rightMiddle = value;
    }

    /**
     * Gets the value of the rightPinky property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightPinky() {
        return rightPinky;
    }

    /**
     * Sets the value of the rightPinky property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightPinky(byte[] value) {
        this.rightPinky = value;
    }

    /**
     * Gets the value of the rightRing property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightRing() {
        return rightRing;
    }

    /**
     * Sets the value of the rightRing property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightRing(byte[] value) {
        this.rightRing = value;
    }

    /**
     * Gets the value of the rightThumb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightThumb() {
        return rightThumb;
    }

    /**
     * Sets the value of the rightThumb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightThumb(byte[] value) {
        this.rightThumb = value;
    }

}
