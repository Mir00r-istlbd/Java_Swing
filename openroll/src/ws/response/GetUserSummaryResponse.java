/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.response;

import business.entity.BioPerson;
import business.entity.BioUser;
import java.util.List;

/**
 *
 * @author Maverick
 */
public class GetUserSummaryResponse {
    private List<BioUser> userList;
    private BioUser singleUser;
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

    public List<BioUser> getUserList() {
        return userList;
    }

    public void setUserList(List<BioUser> userList) {
        this.userList = userList;
    }

    public BioUser getSingleUser() {
        return singleUser;
    }

    public void setSingleUser(BioUser singleUser) {
        this.singleUser = singleUser;
    }

}
