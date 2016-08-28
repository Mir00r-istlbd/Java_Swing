
package com.perp.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="allowedServices" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPartnerAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="locationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationLevelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginServiceResponse", propOrder = {
    "allowedServices",
    "isPartnerAdmin",
    "locationLevel",
    "locationLevelId",
    "sessionUuid",
    "userType"
})
public class LoginServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<Service> allowedServices;
    protected boolean isPartnerAdmin;
    protected String locationLevel;
    protected String locationLevelId;
    protected String sessionUuid;
    protected String userType;

    /**
     * Gets the value of the allowedServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getAllowedServices() {
        if (allowedServices == null) {
            allowedServices = new ArrayList<Service>();
        }
        return this.allowedServices;
    }

    /**
     * Gets the value of the isPartnerAdmin property.
     * 
     */
    public boolean isIsPartnerAdmin() {
        return isPartnerAdmin;
    }

    /**
     * Sets the value of the isPartnerAdmin property.
     * 
     */
    public void setIsPartnerAdmin(boolean value) {
        this.isPartnerAdmin = value;
    }

    /**
     * Gets the value of the locationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLevel() {
        return locationLevel;
    }

    /**
     * Sets the value of the locationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLevel(String value) {
        this.locationLevel = value;
    }

    /**
     * Gets the value of the locationLevelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLevelId() {
        return locationLevelId;
    }

    /**
     * Sets the value of the locationLevelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLevelId(String value) {
        this.locationLevelId = value;
    }

    /**
     * Gets the value of the sessionUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionUuid() {
        return sessionUuid;
    }

    /**
     * Sets the value of the sessionUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionUuid(String value) {
        this.sessionUuid = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
