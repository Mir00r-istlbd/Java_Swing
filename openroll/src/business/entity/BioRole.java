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
public class BioRole {
    
    private Long id;
    private String rolename;
    private String roleDescription;
    private String status;
    private String createdBy;
    private String creationDate;
    private String lastUpdatedBy;
    private String lastUpdateDate;
    
    public BioRole(){
    }
    
    public BioRole(database.entity.BioRole bioRoleEO){
        this.id = bioRoleEO.getId();
        this.rolename = bioRoleEO.getRolename();
        this.roleDescription = bioRoleEO.getRolename();
        this.status = bioRoleEO.getStatus();
        this.createdBy = bioRoleEO.getCreatedBy();
        this.creationDate = Utils.getDateToString(bioRoleEO.getCreationDate());
        this.lastUpdatedBy = bioRoleEO.getLastUpdatedBy();
        this.lastUpdateDate = Utils.getDateToString(bioRoleEO.getLastUpdateDate());
     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
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
