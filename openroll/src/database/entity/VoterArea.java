/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "voter_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VoterArea.findAll", query = "SELECT v FROM VoterArea v"),
    @NamedQuery(name = "VoterArea.findByPkId", query = "SELECT v FROM VoterArea v WHERE v.pkId = :pkId"),
    @NamedQuery(name = "VoterArea.findById", query = "SELECT v FROM VoterArea v WHERE v.id = :id"),
    @NamedQuery(name = "VoterArea.findByEunion", query = "SELECT v FROM VoterArea v WHERE v.eunion = :eunion"),
    @NamedQuery(name = "VoterArea.findByName", query = "SELECT v FROM VoterArea v WHERE v.name = :name")})
public class VoterArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_ID")
    private Integer pkId;
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "EUNION")
    private String eunion;
    @Column(name = "NAME")
    private String name;

    public VoterArea() {
    }

    public VoterArea(Integer pkId) {
        this.pkId = pkId;
    }

    public VoterArea(Integer pkId, String id) {
        this.pkId = pkId;
        this.id = id;
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEunion() {
        return eunion;
    }

    public void setEunion(String eunion) {
        this.eunion = eunion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkId != null ? pkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VoterArea)) {
            return false;
        }
        VoterArea other = (VoterArea) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.VoterArea[ pkId=" + pkId + " ]";
    }
    
}
