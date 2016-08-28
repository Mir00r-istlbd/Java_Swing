
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationTypeOneByFormNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationTypeOneByFormNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}getVoterInformationTypeOneByFormNoRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationTypeOneByFormNo", propOrder = {
    "request"
})
public class GetVoterInformationTypeOneByFormNo {

    protected GetVoterInformationTypeOneByFormNoRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetVoterInformationTypeOneByFormNoRequest }
     *     
     */
    public GetVoterInformationTypeOneByFormNoRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoterInformationTypeOneByFormNoRequest }
     *     
     */
    public void setRequest(GetVoterInformationTypeOneByFormNoRequest value) {
        this.request = value;
    }

}
