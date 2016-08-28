/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author Maverick
 */
@Entity
@Table(name = "bio_lookup_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioLookupData.findAll", query = "SELECT b FROM BioLookupData b"),
    @NamedQuery(name = "BioLookupData.findById", query = "SELECT b FROM BioLookupData b WHERE b.id = :id"),
    @NamedQuery(name = "BioLookupData.findByType", query = "SELECT b FROM BioLookupData b WHERE b.type = :type"),
    @NamedQuery(name = "BioLookupData.findByCode", query = "SELECT b FROM BioLookupData b WHERE b.code = :code"),
    @NamedQuery(name = "BioLookupData.findByValueEn", query = "SELECT b FROM BioLookupData b WHERE b.valueEn = :valueEn"),
    @NamedQuery(name = "BioLookupData.findByValueBn", query = "SELECT b FROM BioLookupData b WHERE b.valueBn = :valueBn"),
    @NamedQuery(name = "BioLookupData.findBySystemFlag", query = "SELECT b FROM BioLookupData b WHERE b.systemFlag = :systemFlag"),
    @NamedQuery(name = "BioLookupData.findByStatus", query = "SELECT b FROM BioLookupData b WHERE b.status = :status"),
    @NamedQuery(name = "BioLookupData.findByCreatedBy", query = "SELECT b FROM BioLookupData b WHERE b.createdBy = :createdBy"),
    @NamedQuery(name = "BioLookupData.findByCreationDate", query = "SELECT b FROM BioLookupData b WHERE b.creationDate = :creationDate"),
    @NamedQuery(name = "BioLookupData.findByLastUpdatedBy", query = "SELECT b FROM BioLookupData b WHERE b.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "BioLookupData.findByLastUpdateDate", query = "SELECT b FROM BioLookupData b WHERE b.lastUpdateDate = :lastUpdateDate"),
    @NamedQuery(name = "BioLookupData.findByObjectVersionId", query = "SELECT b FROM BioLookupData b WHERE b.objectVersionId = :objectVersionId")})
public class BioLookupData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "VALUE_EN")
    private String valueEn;
    @Column(name = "VALUE_BN")
    private String valueBn;
    @Basic(optional = false)
    @Column(name = "SYSTEM_FLAG")
    private String systemFlag;
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
    @Column(name = "OBJECT_VERSION_ID")
    private BigInteger objectVersionId;

    public BioLookupData() {
    }

    public BioLookupData(Long id) {
        this.id = id;
    }

    public BioLookupData(Long id, String type, String code, String systemFlag, String status, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
        this.id = id;
        this.type = type;
        this.code = code;
        this.systemFlag = systemFlag;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValueEn() {
        return valueEn;
    }

    public void setValueEn(String valueEn) {
        this.valueEn = valueEn;
    }

    public String getValueBn() {
        return valueBn;
    }

    public void setValueBn(String valueBn) {
        this.valueBn = valueBn;
    }

    public String getSystemFlag() {
        return systemFlag;
    }

    public void setSystemFlag(String systemFlag) {
        this.systemFlag = systemFlag;
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

    public BigInteger getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(BigInteger objectVersionId) {
        this.objectVersionId = objectVersionId;
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
        if (!(object instanceof BioLookupData)) {
            return false;
        }
        BioLookupData other = (BioLookupData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.BioLookupData[ id=" + id + " ]";
    }
    
}
