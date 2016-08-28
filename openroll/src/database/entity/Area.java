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
@Table(name = "area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a"),
    @NamedQuery(name = "Area.findByPkId", query = "SELECT a FROM Area a WHERE a.pkId = :pkId"),
    @NamedQuery(name = "Area.findById", query = "SELECT a FROM Area a WHERE a.id = :id"),
    @NamedQuery(name = "Area.findByEunion", query = "SELECT a FROM Area a WHERE a.eunion = :eunion"),
    @NamedQuery(name = "Area.findByCode", query = "SELECT a FROM Area a WHERE a.code = :code"),
    @NamedQuery(name = "Area.findByName", query = "SELECT a FROM Area a WHERE a.name = :name"),
    @NamedQuery(name = "Area.findByNameEn", query = "SELECT a FROM Area a WHERE a.nameEn = :nameEn")})
public class Area implements Serializable {
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
    private Integer eunion;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NAME_EN")
    private String nameEn;

    public Area() {
    }

    public Area(Integer pkId) {
        this.pkId = pkId;
    }

    public Area(Integer pkId, String id) {
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

    public Integer getEunion() {
        return eunion;
    }

    public void setEunion(Integer eunion) {
        this.eunion = eunion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
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
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.Area[ pkId=" + pkId + " ]";
    }
    
}
