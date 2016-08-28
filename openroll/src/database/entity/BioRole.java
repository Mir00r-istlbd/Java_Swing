/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.entity;

import java.io.Serializable;
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
@Table(name = "bio_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioRole.findAll", query = "SELECT b FROM BioRole b"),
    @NamedQuery(name = "BioRole.findById", query = "SELECT b FROM BioRole b WHERE b.id = :id"),
    @NamedQuery(name = "BioRole.findByRolename", query = "SELECT b FROM BioRole b WHERE b.rolename = :rolename"),
    @NamedQuery(name = "BioRole.findByRoleDescription", query = "SELECT b FROM BioRole b WHERE b.roleDescription = :roleDescription"),
    @NamedQuery(name = "BioRole.findByStatus", query = "SELECT b FROM BioRole b WHERE b.status = :status"),
    @NamedQuery(name = "BioRole.findByCreatedBy", query = "SELECT b FROM BioRole b WHERE b.createdBy = :createdBy"),
    @NamedQuery(name = "BioRole.findByCreationDate", query = "SELECT b FROM BioRole b WHERE b.creationDate = :creationDate"),
    @NamedQuery(name = "BioRole.findByLastUpdatedBy", query = "SELECT b FROM BioRole b WHERE b.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "BioRole.findByLastUpdateDate", query = "SELECT b FROM BioRole b WHERE b.lastUpdateDate = :lastUpdateDate")})
public class BioRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ROLENAME")
    private String rolename;
    @Column(name = "ROLE_DESCRIPTION")
    private String roleDescription;
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

    public BioRole() {
    }

    public BioRole(Long id) {
        this.id = id;
    }

    public BioRole(Long id, String status, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
        this.id = id;
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
        if (!(object instanceof BioRole)) {
            return false;
        }
        BioRole other = (BioRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.BioRole[ id=" + id + " ]";
    }
    
}
