/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.dao;

import business.bean.Utils;
//import com.perp.proxy.Fingerprints;
//import com.perp.proxy.GetDetailVoterInformationResponse;
//import com.perp.proxy.IdentifyServiceResponse;
//import com.perp.proxy.VerifyServiceResponse;
//import com.perp.proxy.VerifyTypeTwoServiceResponse;
//import com.perp.proxy.VoterInfo;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maverick
 */
public class LocalDaoImpl {
/*
    private boolean operationStatus;
    private String errorMessage;

    private void respVoterInfo(boolean op, String eMsg) {
        this.operationStatus = op;
        this.errorMessage = eMsg;

    }

// verify request with fingerprint
    public VoterInformation verifyVoterInfo(String nid, String dob, Fingerprints fingerPrints) {
        VoterInfo voterInfo = null;


        if (nid == null || nid.isEmpty()) {
            respVoterInfo(false, "NID can not be empty");
            return null;
        }
        if (nid.length() == 13 || nid.length() == 17); else {
            respVoterInfo(false, "Invalid nid length provided");
            return null;
        }

        if (dob == null || dob.isEmpty()) {
            respVoterInfo(false, "Date of birth can not be empty");
        }
        if (!dob.matches(Utils.DATE_FORMAT_REGEX)) {
            respVoterInfo(false, "Invalid Date of Birth");
        }


        if (fingerPrints == null) {
            respVoterInfo(false, "Fingerprint not provided");
        } else {
            Utils.writeWsqInFileSystem(fingerPrints.getLeftThumb(), "D:/img/lt");
            Utils.writeWsqInFileSystem(fingerPrints.getLeftIndex(), "D:/img/li");
            Utils.writeWsqInFileSystem(fingerPrints.getRightIndex(), "D:/img/ri");
            Utils.writeWsqInFileSystem(fingerPrints.getRightThumb(), "D:/img/rt");
        }




        VerifyServiceResponse vr = new VerifyServiceResponse();
        vr = PartnerServiceManager.getVerification(nid, dob, fingerPrints);


        if (vr.getOperationResult().isSuccess()) {
            respVoterInfo(true, "");
            voterInfo = vr.getVoterInfo();
        } else {
            respVoterInfo(false, vr.getOperationResult().getError().getErrorMessage());
            return null;
        }

        VoterInformation vi = null;
        if (voterInfo != null) {
            vi = new VoterInformation(voterInfo);
        } else {
            return null;
        }

        return vi;
    }

// verify request with fingerprint
    public VoterInformation verifyVoterInfoNidDobFinger1(String nid, String dob, Fingerprints fingerPrints) {
        VoterInfo voterInfo = null;


        if (nid == null || nid.isEmpty()) {
            respVoterInfo(false, "NID can not be empty");
            return null;
        }
        if (nid.length() == 13 || nid.length() == 17); else {
            respVoterInfo(false, "Invalid nid length provided");
            return null;
        }

        if (dob == null || dob.isEmpty()) {
            respVoterInfo(false, "Date of birth can not be empty");
        }
        if (!dob.matches(Utils.DATE_FORMAT_REGEX)) {
            respVoterInfo(false, "Invalid Date of Birth");
        }


        FileInputStream fis = null;
        byte[] rt;
        try {

            fis = new FileInputStream("d:/finger_print_rt.wsq");
            rt = new byte[fis.available()];
            fis.read(rt);
            fis.close();
            fingerPrints.setRightThumb(rt);

            fis = new FileInputStream("d:/finger_print_ri.wsq");
            rt = new byte[fis.available()];
            fis.read(rt);
            fis.close();
            fingerPrints.setRightIndex(rt);

            fis = new FileInputStream("d:/finger_print_lt.wsq");
            rt = new byte[fis.available()];
            fis.read(rt);
            fis.close();
            fingerPrints.setLeftThumb(rt);

            fis = new FileInputStream("d:/finger_print_li.wsq");
            rt = new byte[fis.available()];
            fis.read(rt);
            fis.close();
            fingerPrints.setLeftIndex(rt);


        } catch (Exception fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }








        if (fingerPrints == null) {
            respVoterInfo(false, "Fingerprint not provided");
        }

        VerifyTypeTwoServiceResponse vr = new VerifyTypeTwoServiceResponse();
        vr = PartnerServiceManager.getVerificationNidDobFingers(nid, dob, fingerPrints);


        if (vr.getOperationResult().isSuccess()) {
            respVoterInfo(true, "");
            System.out.println("response ---------------------=" + vr.getMessage());
        } else {
            respVoterInfo(false, vr.getOperationResult().getError().getErrorMessage());
            return null;
        }

//        VoterInformation vi=null;
//        if(voterInfo!=null)
//            vi=new VoterInformation(voterInfo);
//        else
//            return null;
        return new VoterInformation();
//        return vi;
    }

// verify request without fingerprint    
    public VoterInformation verifyVoterInfoNoFP(String nid, String dob) {


        if (nid == null || nid.isEmpty()) {
            respVoterInfo(false, "NID can not be empty");
            return null;
        }
        if (nid.length() == 13 || nid.length() == 17); else {
            respVoterInfo(false, "Invalid nid length provided");
            return null;
        }

        if (dob == null || dob.isEmpty()) {
            respVoterInfo(false, "Date of birth can not be empty");
            return null;
        }
        if (!dob.matches(Utils.DATE_FORMAT_REGEX)) {
            respVoterInfo(false, "Invalid Date of Birth");
            return null;
        }

        GetDetailVoterInformationResponse vr = new GetDetailVoterInformationResponse();
        vr = PartnerServiceManager.getInformationWithoutFP(nid, dob);


        if (vr.getOperationResult().isSuccess()) {
            respVoterInfo(true, "");
        } else {
            respVoterInfo(false, vr.getOperationResult().getError().getErrorMessage());
            return null;
        }

        VoterInformation voterInformation = new VoterInformation(vr);
        return voterInformation;
    }

    // identify
    public List<VoterInformation> identifyVoter(Fingerprints fingerPrints) {

        if (fingerPrints == null) {
            respVoterInfo(false, "Fingerprint not provided");
        }

        IdentifyServiceResponse vr = new IdentifyServiceResponse();
        vr = PartnerServiceManager.getIdentify(fingerPrints);


        if (vr.getOperationResult().isSuccess() && vr.getVoterList() != null && vr.getVoterList().size() > 0) {
            respVoterInfo(true, "");
        } else {
            respVoterInfo(false, vr.getOperationResult().getError().getErrorMessage());
            return null;
        }

        List<VoterInformation> voterInfoList = new ArrayList<VoterInformation>();
        VoterInformation tmp = null;
        for (VoterInfo vi : vr.getVoterList()) {
            tmp = new VoterInformation(vi);
            voterInfoList.add(tmp);
        }
        return voterInfoList;
    }

    public boolean isOperationStatus() {
        return operationStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
*/
}
