
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biometricInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biometricInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthCertificateDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="formDocumentPageOne" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="formDocumentPageTwo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leftIndex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftIndexISO" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftIndexMOD" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftIndexWSQ" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumb" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumbISO" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumbMOD" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="leftThumbWSQ" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="passportDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndexISO" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndexMOD" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightIndexWSQ" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumb" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumbISO" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumbMOD" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rightThumbWSQ" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="specialFormDocumentPageOne" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="specialFormDocumentPageTwo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biometricInformation", propOrder = {
    "birthCertificateDocument",
    "formDocumentPageOne",
    "formDocumentPageTwo",
    "id",
    "leftIndex",
    "leftIndexISO",
    "leftIndexMOD",
    "leftIndexWSQ",
    "leftThumb",
    "leftThumbISO",
    "leftThumbMOD",
    "leftThumbWSQ",
    "passportDocument",
    "photo",
    "rightIndex",
    "rightIndexISO",
    "rightIndexMOD",
    "rightIndexWSQ",
    "rightThumb",
    "rightThumbISO",
    "rightThumbMOD",
    "rightThumbWSQ",
    "signature",
    "specialFormDocumentPageOne",
    "specialFormDocumentPageTwo"
})
public class BiometricInformation {

    protected byte[] birthCertificateDocument;
    protected byte[] formDocumentPageOne;
    protected byte[] formDocumentPageTwo;
    protected String id;
    protected byte[] leftIndex;
    protected byte[] leftIndexISO;
    protected byte[] leftIndexMOD;
    protected byte[] leftIndexWSQ;
    protected byte[] leftThumb;
    protected byte[] leftThumbISO;
    protected byte[] leftThumbMOD;
    protected byte[] leftThumbWSQ;
    protected byte[] passportDocument;
    protected byte[] photo;
    protected byte[] rightIndex;
    protected byte[] rightIndexISO;
    protected byte[] rightIndexMOD;
    protected byte[] rightIndexWSQ;
    protected byte[] rightThumb;
    protected byte[] rightThumbISO;
    protected byte[] rightThumbMOD;
    protected byte[] rightThumbWSQ;
    protected byte[] signature;
    protected byte[] specialFormDocumentPageOne;
    protected byte[] specialFormDocumentPageTwo;

    /**
     * Gets the value of the birthCertificateDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBirthCertificateDocument() {
        return birthCertificateDocument;
    }

    /**
     * Sets the value of the birthCertificateDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBirthCertificateDocument(byte[] value) {
        this.birthCertificateDocument = value;
    }

    /**
     * Gets the value of the formDocumentPageOne property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFormDocumentPageOne() {
        return formDocumentPageOne;
    }

    /**
     * Sets the value of the formDocumentPageOne property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFormDocumentPageOne(byte[] value) {
        this.formDocumentPageOne = value;
    }

    /**
     * Gets the value of the formDocumentPageTwo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFormDocumentPageTwo() {
        return formDocumentPageTwo;
    }

    /**
     * Sets the value of the formDocumentPageTwo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFormDocumentPageTwo(byte[] value) {
        this.formDocumentPageTwo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the leftIndexISO property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftIndexISO() {
        return leftIndexISO;
    }

    /**
     * Sets the value of the leftIndexISO property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftIndexISO(byte[] value) {
        this.leftIndexISO = value;
    }

    /**
     * Gets the value of the leftIndexMOD property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftIndexMOD() {
        return leftIndexMOD;
    }

    /**
     * Sets the value of the leftIndexMOD property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftIndexMOD(byte[] value) {
        this.leftIndexMOD = value;
    }

    /**
     * Gets the value of the leftIndexWSQ property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftIndexWSQ() {
        return leftIndexWSQ;
    }

    /**
     * Sets the value of the leftIndexWSQ property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftIndexWSQ(byte[] value) {
        this.leftIndexWSQ = value;
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
     * Gets the value of the leftThumbISO property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftThumbISO() {
        return leftThumbISO;
    }

    /**
     * Sets the value of the leftThumbISO property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftThumbISO(byte[] value) {
        this.leftThumbISO = value;
    }

    /**
     * Gets the value of the leftThumbMOD property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftThumbMOD() {
        return leftThumbMOD;
    }

    /**
     * Sets the value of the leftThumbMOD property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftThumbMOD(byte[] value) {
        this.leftThumbMOD = value;
    }

    /**
     * Gets the value of the leftThumbWSQ property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLeftThumbWSQ() {
        return leftThumbWSQ;
    }

    /**
     * Sets the value of the leftThumbWSQ property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLeftThumbWSQ(byte[] value) {
        this.leftThumbWSQ = value;
    }

    /**
     * Gets the value of the passportDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPassportDocument() {
        return passportDocument;
    }

    /**
     * Sets the value of the passportDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPassportDocument(byte[] value) {
        this.passportDocument = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = value;
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
     * Gets the value of the rightIndexISO property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightIndexISO() {
        return rightIndexISO;
    }

    /**
     * Sets the value of the rightIndexISO property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightIndexISO(byte[] value) {
        this.rightIndexISO = value;
    }

    /**
     * Gets the value of the rightIndexMOD property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightIndexMOD() {
        return rightIndexMOD;
    }

    /**
     * Sets the value of the rightIndexMOD property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightIndexMOD(byte[] value) {
        this.rightIndexMOD = value;
    }

    /**
     * Gets the value of the rightIndexWSQ property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightIndexWSQ() {
        return rightIndexWSQ;
    }

    /**
     * Sets the value of the rightIndexWSQ property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightIndexWSQ(byte[] value) {
        this.rightIndexWSQ = value;
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

    /**
     * Gets the value of the rightThumbISO property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightThumbISO() {
        return rightThumbISO;
    }

    /**
     * Sets the value of the rightThumbISO property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightThumbISO(byte[] value) {
        this.rightThumbISO = value;
    }

    /**
     * Gets the value of the rightThumbMOD property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightThumbMOD() {
        return rightThumbMOD;
    }

    /**
     * Sets the value of the rightThumbMOD property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightThumbMOD(byte[] value) {
        this.rightThumbMOD = value;
    }

    /**
     * Gets the value of the rightThumbWSQ property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRightThumbWSQ() {
        return rightThumbWSQ;
    }

    /**
     * Sets the value of the rightThumbWSQ property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRightThumbWSQ(byte[] value) {
        this.rightThumbWSQ = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the specialFormDocumentPageOne property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSpecialFormDocumentPageOne() {
        return specialFormDocumentPageOne;
    }

    /**
     * Sets the value of the specialFormDocumentPageOne property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSpecialFormDocumentPageOne(byte[] value) {
        this.specialFormDocumentPageOne = value;
    }

    /**
     * Gets the value of the specialFormDocumentPageTwo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSpecialFormDocumentPageTwo() {
        return specialFormDocumentPageTwo;
    }

    /**
     * Sets the value of the specialFormDocumentPageTwo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSpecialFormDocumentPageTwo(byte[] value) {
        this.specialFormDocumentPageTwo = value;
    }

}
