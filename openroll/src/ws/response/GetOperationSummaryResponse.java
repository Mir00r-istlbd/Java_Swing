/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.response;


import business.entity.BioOperations;
import java.util.List;

/**
 *
 * @author Ataur Rahman
 */
public class GetOperationSummaryResponse {
    
    private List<BioOperations> operationList;
    private BioOperations singleOperation;
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

    public List<BioOperations> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<BioOperations> operationList) {
        this.operationList = operationList;
    }

    public BioOperations getSingleOperation() {
        return singleOperation;
    }

    public void setSingleOperation(BioOperations singleOperation) {
        this.singleOperation = singleOperation;
    }



   

}
