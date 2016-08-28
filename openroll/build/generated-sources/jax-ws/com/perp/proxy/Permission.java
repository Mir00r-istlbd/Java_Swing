
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="permissionOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionOnId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permission", propOrder = {
    "id",
    "permissionOn",
    "permissionOnId"
})
public class Permission {

    protected long id;
    protected String permissionOn;
    protected long permissionOnId;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the permissionOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionOn() {
        return permissionOn;
    }

    /**
     * Sets the value of the permissionOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionOn(String value) {
        this.permissionOn = value;
    }

    /**
     * Gets the value of the permissionOnId property.
     * 
     */
    public long getPermissionOnId() {
        return permissionOnId;
    }

    /**
     * Sets the value of the permissionOnId property.
     * 
     */
    public void setPermissionOnId(long value) {
        this.permissionOnId = value;
    }

}
