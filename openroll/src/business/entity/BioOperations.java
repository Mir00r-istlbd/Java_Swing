/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entity;

import business.bean.Utils;

/**
 *
 * @author Ataur Rahman
 */
public class BioOperations {
    
    private Long id;
    private String operationName;
    private String operationDescription;
    private String status;
    private String createdBy;
    private String creationDate;
    private String lastUpdatedBy;
    private String lastUpdateDate;
    
    public BioOperations(){
    }
    
    public BioOperations(database.entity.BioOperation bioOperationsEO){
        this.id = bioOperationsEO.getId();
        this.operationName = bioOperationsEO.getOperationName();
        this.operationDescription = bioOperationsEO.getOperationDescription();
        this.status=bioOperationsEO.getStatus();
        this.createdBy=bioOperationsEO.getCreatedBy();
        this.creationDate=Utils.getDateToString(bioOperationsEO.getCreationDate());
        this.lastUpdatedBy=bioOperationsEO.getLastUpdatedBy();
        this.lastUpdateDate=Utils.getDateToString(bioOperationsEO.getLastUpdateDate()); 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
