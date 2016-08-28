/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.response;

import business.entity.BioPerson;

/**
 *
 * @author Maverick
 */
public class AddBioPersonResponse {
    private boolean operationStatus;
    private boolean dataUpdateStatus;
    private boolean biometricDataStatus;
    private String errorMessage;
    private BioPerson bioPerson;

    public boolean isOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(boolean operationStatus) {
        this.operationStatus = operationStatus;
    }

    public boolean isDataUpdateStatus() {
        return dataUpdateStatus;
    }

    public void setDataUpdateStatus(boolean dataUpdateStatus) {
        this.dataUpdateStatus = dataUpdateStatus;
    }

    public boolean isBiometricDataStatus() {
        return biometricDataStatus;
    }

    public void setBiometricDataStatus(boolean biometricDataStatus) {
        this.biometricDataStatus = biometricDataStatus;
    }
    
    
    public BioPerson getBioPerson() {
        return bioPerson;
    }

    public void setBioPerson(BioPerson bioPerson) {
        this.bioPerson = bioPerson;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    
    
    
    
    
}
