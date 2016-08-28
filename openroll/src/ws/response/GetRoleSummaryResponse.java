/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.response;

import business.entity.BioRole;
import java.util.List;

/**
 *
 * @author Ataur Rahman
 */
public class GetRoleSummaryResponse {
    
    
    private List<BioRole> roleList;
    private BioRole singleUser;
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

    public List<BioRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<BioRole> roleList) {
        this.roleList = roleList;
    }

    public BioRole getSingleUser() {
        return singleUser;
    }

    public void setSingleUser(BioRole singleUser) {
        this.singleUser = singleUser;
    }

    
    

}
