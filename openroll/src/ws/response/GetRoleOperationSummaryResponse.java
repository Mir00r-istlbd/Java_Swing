/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.response;

import business.entity.BioRoleOperation;
import java.util.List;

/**
 *
 * @author Ataur Rahman
 */
public class GetRoleOperationSummaryResponse {
    
    
    private List<BioRoleOperation> roleOperationList;
    private BioRoleOperation singleUser;
    private Long totalResult;
    private boolean operationStatus;
    private String errorMessage;

    public Long getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

    public boolean isOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(boolean operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<BioRoleOperation> getRoleOperationList() {
        return roleOperationList;
    }

    public void setRoleOperationList(List<BioRoleOperation> roleOperationList) {
        this.roleOperationList = roleOperationList;
    }

    public BioRoleOperation getSingleUser() {
        return singleUser;
    }

    public void setSingleUser(BioRoleOperation singleUser) {
        this.singleUser = singleUser;
    }

   

}
