
package com.perp.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}requestHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "requestHeader"
})
@XmlSeeAlso({
    IdentifyServiceRequest.class,
    GetBulkOperationServiceRequest.class,
    GetPartnerCardStatusRequest.class,
    SetInputFilePathBulkOperationServiceRequest.class,
    GetVoterInformationPartnerRequest.class,
    ChangePasswordServiceRequest.class,
    VerifyServiceRequest.class,
    PollingCenterTypeTwoServiceRequest.class,
    UpdateBulkOperationStatusServiceRequest.class,
    GetVoterCountFromVoterAreaServiceRequest.class,
    GetCardIssueCountServiceRequest.class,
    GetVoterInformationByVoterNoServiceRequest.class,
    QueryServiceRequest.class,
    ExpireSubUserPasswordServiceRequest.class,
    GetUserServicesServiceRequest.class,
    GetVoterInformationPartnerTypeFiveRequest.class,
    GetCardIssueApplicationsServiceRequest.class,
    ListSubUserServiceRequest.class,
    HeartbeatServiceRequest.class,
    RegenerateBulkOperationServiceRequest.class,
    GetVoterInformationTypeOneByFormNoRequest.class,
    GetVerfiyCardChangeTransactionServiceRequest.class,
    IdentifyByBiometricDataServiceRequest.class,
    UpdateSubUserServiceRequest.class,
    LogoutServiceRequest.class,
    PollingCenterServiceRequest.class,
    MigrateVoterFromPartnerServiceRequest.class,
    GetServiceLogDetailServiceRequest.class,
    CreateBulkOperationServiceRequest.class,
    CreateSubUserServiceRequest.class,
    GetUserInfoServiceRequest.class,
    IssueCardServiceRequest.class,
    IdentifyByPassportNumberServiceRequest.class,
    BulkBankTransactionServiceRequest.class,
    VerifyByNationalIdServiceRequest.class,
    IdentifyByNationalIdServiceRequest.class,
    UpdateUserInfoServiceRequest.class,
    DeleteBulkOperationServiceRequest.class,
    GetServiceLogSummaryServiceRequest.class,
    DeleteSubUserServiceRequest.class,
    BankTransactionServiceRequest.class,
    GetVoterInformationServiceRequest.class,
    ReportServiceRequest.class,
    GetVoterInformationFromVoterArea.class
})
public class ServiceRequest {

    protected RequestHeader requestHeader;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

}
