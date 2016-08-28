/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.entity;

import business.bean.Security;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rezwan
 */
@Entity
@Table(name = "bio_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioUser.findAll", query = "SELECT b FROM BioUser b"),
    @NamedQuery(name = "BioUser.findById", query = "SELECT b FROM BioUser b WHERE b.id = :id"),
    @NamedQuery(name = "BioUser.findByUsername", query = "SELECT b FROM BioUser b WHERE b.username = :username"),
    @NamedQuery(name = "BioUser.findByPassword", query = "SELECT b FROM BioUser b WHERE b.password = :password"),
    @NamedQuery(name = "BioUser.findByRoleId", query = "SELECT b FROM BioUser b WHERE b.roleId = :roleId"),
    @NamedQuery(name = "BioUser.findByFullName", query = "SELECT b FROM BioUser b WHERE b.fullName = :fullName"),
    @NamedQuery(name = "BioUser.findByDesignation", query = "SELECT b FROM BioUser b WHERE b.designation = :designation"),
    @NamedQuery(name = "BioUser.findByPhoneNo", query = "SELECT b FROM BioUser b WHERE b.phoneNo = :phoneNo"),
    @NamedQuery(name = "BioUser.findByEmail", query = "SELECT b FROM BioUser b WHERE b.email = :email"),
    @NamedQuery(name = "BioUser.findByNationalIdNo", query = "SELECT b FROM BioUser b WHERE b.nationalIdNo = :nationalIdNo"),
    @NamedQuery(name = "BioUser.findByStatus", query = "SELECT b FROM BioUser b WHERE b.status = :status"),
    @NamedQuery(name = "BioUser.findByCreatedBy", query = "SELECT b FROM BioUser b WHERE b.createdBy = :createdBy"),
    @NamedQuery(name = "BioUser.findByCreationDate", query = "SELECT b FROM BioUser b WHERE b.creationDate = :creationDate"),
    @NamedQuery(name = "BioUser.findByLastUpdatedBy", query = "SELECT b FROM BioUser b WHERE b.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "BioUser.findByLastUpdateDate", query = "SELECT b FROM BioUser b WHERE b.lastUpdateDate = :lastUpdateDate")})
public class BioUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ROLE_ID")
    private BigInteger roleId;
    @Basic(optional = false)
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "PHONE_NO")
    private String phoneNo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NATIONAL_ID_NO")
    private String nationalIdNo;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;
    @Basic(optional = false)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Basic(optional = false)
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Basic(optional = false)
    @Column(name = "LAST_UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;

    public BioUser() {
    }

    public BioUser(Long id) {
        this.id = id;
    }

    public BioUser(Long id, String username, String password, String fullName, String status, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdateDate = lastUpdateDate;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws NoSuchAlgorithmException {
        Security security = new Security();
        this.password = security.convertMD5(password);
    }

    public BigInteger getRoleId() {
        return roleId;
    }

    public void setRoleId(BigInteger roleId) {
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BioUser)) {
            return false;
        }
        BioUser other = (BioUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.BioUser[ id=" + id + " ]";
    }
    
}
