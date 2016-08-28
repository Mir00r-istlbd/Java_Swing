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
import javax.persistence.Lob;
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
@Table(name = "bio_attachment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioAttachment.findAll", query = "SELECT b FROM BioAttachment b"),
    @NamedQuery(name = "BioAttachment.findById", query = "SELECT b FROM BioAttachment b WHERE b.id = :id"),
    @NamedQuery(name = "BioAttachment.findByPersonId", query = "SELECT b FROM BioAttachment b WHERE b.personId = :personId"),
    @NamedQuery(name = "BioAttachment.findByAttachmentType", query = "SELECT b FROM BioAttachment b WHERE b.attachmentType = :attachmentType"),
    @NamedQuery(name = "BioAttachment.findByStatus", query = "SELECT b FROM BioAttachment b WHERE b.status = :status"),
    @NamedQuery(name = "BioAttachment.findByCreatedBy", query = "SELECT b FROM BioAttachment b WHERE b.createdBy = :createdBy"),
    @NamedQuery(name = "BioAttachment.findByCreationDate", query = "SELECT b FROM BioAttachment b WHERE b.creationDate = :creationDate"),
    @NamedQuery(name = "BioAttachment.findByLastUpdatedBy", query = "SELECT b FROM BioAttachment b WHERE b.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "BioAttachment.findByLastUpdateDate", query = "SELECT b FROM BioAttachment b WHERE b.lastUpdateDate = :lastUpdateDate")})
    @NamedQuery(name = "BioAttachment.deleteAllByPersonId", query = "DELETE FROM BioAttachment b WHERE b.personId = :personId")
public class BioAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PERSON_ID")
    private BigInteger personId;
    @Basic(optional = false)
    @Column(name = "ATTACHMENT_TYPE")
    private String attachmentType;
    @Lob
    @Column(name = "ATTACHMENT_ONE")
    private byte[] attachmentOne;
    @Lob
    @Column(name = "ATTACHMENT_TWO")
    private byte[] attachmentTwo;
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

    public BioAttachment() {
    }

    public BioAttachment(Long id) {
        this.id = id;
    }

    public BioAttachment(Long id, String attachmentType, String status, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
        this.id = id;
        this.attachmentType = attachmentType;
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

    public BigInteger getPersonId() {
        return personId;
    }

    public void setPersonId(BigInteger personId) {
        this.personId = personId;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public byte[] getAttachmentOne() {
        return attachmentOne;
    }

    public void setAttachmentOne(byte[] attachmentOne) {
        this.attachmentOne = attachmentOne;
    }

    public byte[] getAttachmentTwo() {
        return attachmentTwo;
    }

    public void setAttachmentTwo(byte[] attachmentTwo) {
        this.attachmentTwo = attachmentTwo;
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
        if (!(object instanceof BioAttachment)) {
            return false;
        }
        BioAttachment other = (BioAttachment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.BioAttachment[ id=" + id + " ]";
    }
    
}
