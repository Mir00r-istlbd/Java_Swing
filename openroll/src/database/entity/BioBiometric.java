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
@Table(name = "bio_biometric")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioBiometric.findAll", query = "SELECT b FROM BioBiometric b"),
    @NamedQuery(name = "BioBiometric.findById", query = "SELECT b FROM BioBiometric b WHERE b.id = :id"),
    @NamedQuery(name = "BioBiometric.findByFingerRemarks", query = "SELECT b FROM BioBiometric b WHERE b.fingerRemarks = :fingerRemarks"),
    @NamedQuery(name = "BioBiometric.findByAfisStatus", query = "SELECT b FROM BioBiometric b WHERE b.afisStatus = :afisStatus"),
    @NamedQuery(name = "BioBiometric.findByStatus", query = "SELECT b FROM BioBiometric b WHERE b.status = :status"),
    @NamedQuery(name = "BioBiometric.findByCreatedBy", query = "SELECT b FROM BioBiometric b WHERE b.createdBy = :createdBy"),
    @NamedQuery(name = "BioBiometric.findByCreationDate", query = "SELECT b FROM BioBiometric b WHERE b.creationDate = :creationDate"),
    @NamedQuery(name = "BioBiometric.findByLastUpdatedBy", query = "SELECT b FROM BioBiometric b WHERE b.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "BioBiometric.findByLastUpdateDate", query = "SELECT b FROM BioBiometric b WHERE b.lastUpdateDate = :lastUpdateDate")})
public class BioBiometric implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Lob
    @Column(name = "PHOTO")
    private byte[] photo;
    @Lob
    @Column(name = "EYE_LEFT")
    private byte[] eyeLeft;
    @Lob
    @Column(name = "EYE_RIGHT")
    private byte[] eyeRight;
    @Lob
    @Column(name = "SIGNATURE")
    private byte[] signature;
    @Column(name = "FINGER_REMARKS")
    private String fingerRemarks;
    @Lob
    @Column(name = "WSQ_RT")
    private byte[] wsqRt;
    @Lob
    @Column(name = "WSQ_RI")
    private byte[] wsqRi;
    @Lob
    @Column(name = "WSQ_RM")
    private byte[] wsqRm;
    @Lob
    @Column(name = "WSQ_RR")
    private byte[] wsqRr;
    @Lob
    @Column(name = "WSQ_RL")
    private byte[] wsqRl;
    @Lob
    @Column(name = "WSQ_LT")
    private byte[] wsqLt;
    @Lob
    @Column(name = "WSQ_LI")
    private byte[] wsqLi;
    @Lob
    @Column(name = "WSQ_LM")
    private byte[] wsqLm;
    @Lob
    @Column(name = "WSQ_LR")
    private byte[] wsqLr;
    @Lob
    @Column(name = "WSQ_LL")
    private byte[] wsqLl;
    @Lob
    @Column(name = "ANSI_RT")
    private byte[] ansiRt;
    @Lob
    @Column(name = "ANSI_RI")
    private byte[] ansiRi;
    @Lob
    @Column(name = "ANSI_RM")
    private byte[] ansiRm;
    @Lob
    @Column(name = "ANSI_RR")
    private byte[] ansiRr;
    @Lob
    @Column(name = "ANSI_RL")
    private byte[] ansiRl;
    @Lob
    @Column(name = "ANSI_LT")
    private byte[] ansiLt;
    @Lob
    @Column(name = "ANSI_LI")
    private byte[] ansiLi;
    @Lob
    @Column(name = "ANSI_LM")
    private byte[] ansiLm;
    @Lob
    @Column(name = "ANSI_LR")
    private byte[] ansiLr;
    @Lob
    @Column(name = "ANSI_LL")
    private byte[] ansiLl;
    @Column(name = "AFIS_STATUS")
    private String afisStatus;
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

    public BioBiometric() {
    }

    public BioBiometric(Long id) {
        this.id = id;
    }

    public BioBiometric(Long id, String status, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getEyeLeft() {
        return eyeLeft;
    }

    public void setEyeLeft(byte[] eyeLeft) {
        this.eyeLeft = eyeLeft;
    }

    public byte[] getEyeRight() {
        return eyeRight;
    }

    public void setEyeRight(byte[] eyeRight) {
        this.eyeRight = eyeRight;
    }
    
    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    public String getFingerRemarks() {
        return fingerRemarks;
    }

    public void setFingerRemarks(String fingerRemarks) {
        this.fingerRemarks = fingerRemarks;
    }

    public byte[] getWsqRt() {
        return wsqRt;
    }

    public void setWsqRt(byte[] wsqRt) {
        this.wsqRt = wsqRt;
    }

    public byte[] getWsqRi() {
        return wsqRi;
    }

    public void setWsqRi(byte[] wsqRi) {
        this.wsqRi = wsqRi;
    }

    public byte[] getWsqRm() {
        return wsqRm;
    }

    public void setWsqRm(byte[] wsqRm) {
        this.wsqRm = wsqRm;
    }

    public byte[] getWsqRr() {
        return wsqRr;
    }

    public void setWsqRr(byte[] wsqRr) {
        this.wsqRr = wsqRr;
    }

    public byte[] getWsqRl() {
        return wsqRl;
    }

    public void setWsqRl(byte[] wsqRl) {
        this.wsqRl = wsqRl;
    }

    public byte[] getWsqLt() {
        return wsqLt;
    }

    public void setWsqLt(byte[] wsqLt) {
        this.wsqLt = wsqLt;
    }

    public byte[] getWsqLi() {
        return wsqLi;
    }

    public void setWsqLi(byte[] wsqLi) {
        this.wsqLi = wsqLi;
    }

    public byte[] getWsqLm() {
        return wsqLm;
    }

    public void setWsqLm(byte[] wsqLm) {
        this.wsqLm = wsqLm;
    }

    public byte[] getWsqLr() {
        return wsqLr;
    }

    public void setWsqLr(byte[] wsqLr) {
        this.wsqLr = wsqLr;
    }

    public byte[] getWsqLl() {
        return wsqLl;
    }

    public void setWsqLl(byte[] wsqLl) {
        this.wsqLl = wsqLl;
    }

    public byte[] getAnsiRt() {
        return ansiRt;
    }

    public void setAnsiRt(byte[] ansiRt) {
        this.ansiRt = ansiRt;
    }

    public byte[] getAnsiRi() {
        return ansiRi;
    }

    public void setAnsiRi(byte[] ansiRi) {
        this.ansiRi = ansiRi;
    }

    public byte[] getAnsiRm() {
        return ansiRm;
    }

    public void setAnsiRm(byte[] ansiRm) {
        this.ansiRm = ansiRm;
    }

    public byte[] getAnsiRr() {
        return ansiRr;
    }

    public void setAnsiRr(byte[] ansiRr) {
        this.ansiRr = ansiRr;
    }

    public byte[] getAnsiRl() {
        return ansiRl;
    }

    public void setAnsiRl(byte[] ansiRl) {
        this.ansiRl = ansiRl;
    }

    public byte[] getAnsiLt() {
        return ansiLt;
    }

    public void setAnsiLt(byte[] ansiLt) {
        this.ansiLt = ansiLt;
    }

    public byte[] getAnsiLi() {
        return ansiLi;
    }

    public void setAnsiLi(byte[] ansiLi) {
        this.ansiLi = ansiLi;
    }

    public byte[] getAnsiLm() {
        return ansiLm;
    }

    public void setAnsiLm(byte[] ansiLm) {
        this.ansiLm = ansiLm;
    }

    public byte[] getAnsiLr() {
        return ansiLr;
    }

    public void setAnsiLr(byte[] ansiLr) {
        this.ansiLr = ansiLr;
    }

    public byte[] getAnsiLl() {
        return ansiLl;
    }

    public void setAnsiLl(byte[] ansiLl) {
        this.ansiLl = ansiLl;
    }

    public String getAfisStatus() {
        return afisStatus;
    }

    public void setAfisStatus(String afisStatus) {
        this.afisStatus = afisStatus;
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
        if (!(object instanceof BioBiometric)) {
            return false;
        }
        BioBiometric other = (BioBiometric) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.BioBiometric[ id=" + id + " ]";
    }
    
}
