/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client.bean;

import business.entity.BioOperations;
import business.entity.BioRoleOperation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ataur Rahman
 */
public class UserSession {

    private String userName;
    private String password;
    private Long roleId;
    private List<BioRoleOperation> roleOperationList = new ArrayList<BioRoleOperation>();
    private List<BioOperations> userOperationList = new ArrayList<BioOperations>();
    public UserSession(){
    }
    
    public UserSession(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public List<BioRoleOperation> getRoleOperationList() {
        return roleOperationList;
    }

    public void setRoleOperationList(List<BioRoleOperation> roleOperationList) {
        this.roleOperationList = roleOperationList;
    }

    public List<BioOperations> getUserOperationList() {
        return userOperationList;
    }

    public void setUserOperationList(List<BioOperations> userOperationList) {
        this.userOperationList = userOperationList;
    }

}
