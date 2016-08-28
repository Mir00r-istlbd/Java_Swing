/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entity;

import business.bean.Utils;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Date;


/**
 *
 * @author Ataur Rahman
 */
public class BioUser {

private Long id;
private String username;
private String password;
private Long roleId;
private String fullName;
private String designation;
private String phoneNo;
private String email;
private String nationalIdNo;
private String status;
private String createdBy;
private String creationDate;
private String lastUpdatedBy;
private String lastUpdateDate;


public BioUser()
{

}

public database.entity.BioUser convertToEO() throws NoSuchAlgorithmException
{
    database.entity.BioUser eo=new database.entity.BioUser();
    
    eo.setId(this.id);
    eo.setCreatedBy(this.createdBy);
    eo.setCreationDate(Utils.getStringToDate(this.creationDate));
    eo.setLastUpdateDate(Utils.getStringToDate(this.lastUpdateDate));
    eo.setLastUpdatedBy(this.lastUpdatedBy);
    eo.setUsername(this.username);
    eo.setPassword(this.password);
    eo.setFullName(this.fullName);
    eo.setDesignation(this.designation);
    eo.setEmail(this.email);
    eo.setPhoneNo(this.phoneNo);
    eo.setNationalIdNo(this.nationalIdNo);
    eo.setStatus(this.status);
    
    return eo;
}


public BioUser(database.entity.BioUser bioUserEO)
{
    this.id=bioUserEO.getId();
    this.username=bioUserEO.getUsername();
    this.password = bioUserEO.getPassword();
    try{this.roleId=bioUserEO.getRoleId().longValue();}catch(Exception ex){}
    
    this.fullName=bioUserEO.getFullName();
    this.designation=bioUserEO.getDesignation();
    this.phoneNo=bioUserEO.getPhoneNo();
    this.email=bioUserEO.getEmail();
    this.nationalIdNo=bioUserEO.getNationalIdNo();
    this.status=bioUserEO.getStatus();
    this.createdBy=bioUserEO.getCreatedBy();
    this.creationDate=Utils.getDateToString(bioUserEO.getCreationDate());
    this.lastUpdatedBy=bioUserEO.getLastUpdatedBy();
    this.lastUpdateDate=Utils.getDateToString(bioUserEO.getLastUpdateDate());    
}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalIdNo() {
        return nationalIdNo;
    }

    public void setNationalIdNo(String nationalIdNo) {
        this.nationalIdNo = nationalIdNo;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
