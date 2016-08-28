/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.dao;

/**
 *
 * @author Maverick
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import business.bean.Utils;
//import com.perp.proxy.Fingerprints;
//import com.perp.proxy.GetDetailVoterInformationResponse;
//import com.perp.proxy.GetVoterInformationPartnerRequest;
//import com.perp.proxy.GetVoterInformationPartnerResponse;
//import com.perp.proxy.IdentifyServiceRequest;
//import com.perp.proxy.IdentifyServiceResponse;
//import com.perp.proxy.LoginServiceRequest;
//import com.perp.proxy.LoginServiceResponse;
//import com.perp.proxy.OperationResult;
//import com.perp.proxy.RequestHeader;
//import com.perp.proxy.ServiceError;
//import com.perp.proxy.VerifyServiceRequest;
//import com.perp.proxy.VerifyServiceResponse;
//import com.perp.proxy.VerifyTypeTwoServiceResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Maverick
 */
public class PartnerServiceManager {
/*
    private static RequestHeader reqHeader;

    public static LoginServiceResponse getLogin(String userName,String password){
        LoginServiceRequest loginRequest = new LoginServiceRequest();
        LoginServiceResponse loginResponse = new LoginServiceResponse();

        loginRequest.setUsername(userName);
        loginRequest.setPassword(password);
        
        

        try {
            loginResponse = ServiceManager.getPartnerService().login(loginRequest);
            
            if(loginResponse.getOperationResult().isSuccess())
            {
                reqHeader=new RequestHeader();
                reqHeader.setSessionUuid(loginResponse.getSessionUuid());
            }

            
        } catch (Exception exception) {
           OperationResult or=new OperationResult();
           or.setSuccess(false);
           ServiceError er=new ServiceError();
           er.setErrorMessage("Failed to process your request. Reason: "+exception.getMessage());
           or.setError(er); 
           exception.printStackTrace();
           loginResponse.setOperationResult(or);
           
        }
        return loginResponse;
    }
    public static VerifyServiceResponse getVerification(String nid,String dateOfBirth, Fingerprints fp){
        VerifyServiceRequest verifyRequest = new VerifyServiceRequest();
        VerifyServiceResponse verifyResponse = new VerifyServiceResponse();

        verifyRequest.setRequestHeader(reqHeader);
        verifyRequest.setDateOfBirth(Utils.getGregorianDate(dateOfBirth));
        verifyRequest.setNationalId(nid);
        verifyRequest.setFingerprints(fp);
        
        

        try {
            verifyResponse = ServiceManager.getPartnerService().verify(verifyRequest);
        } catch (Exception exception) {
           OperationResult or=new OperationResult();
           or.setSuccess(false);
           ServiceError er=new ServiceError();
           er.setErrorMessage("Failed to process your request. Reason: "+exception.getMessage());
           or.setError(er); 
           exception.printStackTrace();
           verifyResponse.setOperationResult(or);
           
        }
        return verifyResponse;
    }
    public static VerifyTypeTwoServiceResponse getVerificationNidDobFingers(String nid,String dateOfBirth, Fingerprints fp){
        VerifyServiceRequest verifyRequest = new VerifyServiceRequest();
        VerifyTypeTwoServiceResponse verifyResponse = new VerifyTypeTwoServiceResponse();

        verifyRequest.setRequestHeader(reqHeader);
        verifyRequest.setDateOfBirth(Utils.getGregorianDate(dateOfBirth));
        verifyRequest.setNationalId(nid);
        verifyRequest.setFingerprints(fp);
        
        

        try {
            verifyResponse = ServiceManager.getPartnerService().verifyByNidDobFingers(verifyRequest);
        } catch (Exception exception) {
           OperationResult or=new OperationResult();
           or.setSuccess(false);
           ServiceError er=new ServiceError();
           er.setErrorMessage("Failed to process your request. Reason: "+exception.getMessage());
           or.setError(er); 
           exception.printStackTrace();
           verifyResponse.setOperationResult(or);
           
        }
        return verifyResponse;
    }
    
    public static GetDetailVoterInformationResponse getInformationWithoutFP(String nid,String dateOfBirth){
        GetVoterInformationPartnerRequest verifyRequest = new GetVoterInformationPartnerRequest();
        GetDetailVoterInformationResponse verifyResponse = new GetDetailVoterInformationResponse();

        verifyRequest.setRequestHeader(reqHeader);
        verifyRequest.setDob(Utils.getGregorianDate(dateOfBirth));
        verifyRequest.setNid(nid);
        
        try {
            verifyResponse = ServiceManager.getPartnerService().getVoterInformationTypeTwo(verifyRequest);
        } catch (Exception exception) {
           OperationResult or=new OperationResult();
           or.setSuccess(false);
           ServiceError er=new ServiceError();
           er.setErrorMessage("Failed to process your request. Reason: "+exception.getMessage());
           or.setError(er); 
           exception.printStackTrace();
           verifyResponse.setOperationResult(or);
           
        }
        return verifyResponse;
    }
    
    public static IdentifyServiceResponse getIdentify(Fingerprints fp){
        IdentifyServiceRequest identifyRequest = new IdentifyServiceRequest();
        IdentifyServiceResponse identifyResponse = new IdentifyServiceResponse();

        identifyRequest.setRequestHeader(reqHeader);
        identifyRequest.setFingerprints(fp);

        try {
            identifyResponse = ServiceManager.getPartnerService().identify(identifyRequest);
        } catch (Exception exception) {
           OperationResult or=new OperationResult();
           or.setSuccess(false);
           ServiceError er=new ServiceError();
           er.setErrorMessage("Failed to process your request. Reason: "+exception.getMessage());
           or.setError(er); 
           exception.printStackTrace();
           identifyResponse.setOperationResult(or);
           
        }
        return identifyResponse;
    }    
    

*/      
}
