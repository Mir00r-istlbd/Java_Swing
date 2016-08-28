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
public class BioRoleOperation {
    
    private Long id;
    private long roleId;
    private long operationId;
    private String status;
    private String createdBy;
    private String creationDate;
    private String lastUpdatedBy;
    private String lastUpdateDate;
    
    public BioRoleOperation(){
    }
    
    public BioRoleOperation(database.entity.BioRoleOperation bioRoleOperationEO){
        this.id = bioRoleOperationEO.getId();
        this.roleId = bioRoleOperationEO.getRoleId();
        this.operationId = bioRoleOperationEO.getOperationId();
        
        this.status = bioRoleOperationEO.getStatus();
        this.createdBy = bioRoleOperationEO.getCreatedBy();
        this.creationDate = Utils.getDateToString(bioRoleOperationEO.getCreationDate());
        this.lastUpdatedBy = bioRoleOperationEO.getLastUpdatedBy();
        this.lastUpdateDate = Utils.getDateToString(bioRoleOperationEO.getLastUpdateDate());
    }
    
    public database.entity.BioRoleOperation getDatabaseEntityBioRoleOperation(BioRoleOperation op){
        database.entity.BioRoleOperation bioOperationEO = new database.entity.BioRoleOperation();
        bioOperationEO.setId(op.getId());
        bioOperationEO.setRoleId(op.getRoleId());
        bioOperationEO.setOperationId(op.getOperationId());
        bioOperationEO.setCreatedBy(op.getCreatedBy());
        bioOperationEO.setCreationDate(Utils.getStringToDate(op.getCreationDate()));
        bioOperationEO.setLastUpdatedBy(op.getLastUpdatedBy());
        bioOperationEO.setLastUpdateDate(Utils.getStringToDate(op.getLastUpdateDate()));
        
        return bioOperationEO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
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
