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
@Table(name = "village")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Village.findAll", query = "SELECT v FROM Village v"),
    @NamedQuery(name = "Village.findByPkId", query = "SELECT v FROM Village v WHERE v.pkId = :pkId"),
    @NamedQuery(name = "Village.findById", query = "SELECT v FROM Village v WHERE v.id = :id"),
    @NamedQuery(name = "Village.findByArea", query = "SELECT v FROM Village v WHERE v.area = :area"),
    @NamedQuery(name = "Village.findByName", query = "SELECT v FROM Village v WHERE v.name = :name"),
    @NamedQuery(name = "Village.findByNameEn", query = "SELECT v FROM Village v WHERE v.nameEn = :nameEn")})
public class Village implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_ID")
    private Integer pkId;
    @Column(name = "ID")
    private String id;
    @Column(name = "AREA")
    private String area;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NAME_EN")
    private String nameEn;

    public Village() {
    }

    public Village(Integer pkId) {
        this.pkId = pkId;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
        if (!(object instanceof Village)) {
            return false;
        }
        Village other = (Village) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.Village[ pkId=" + pkId + " ]";
    }
    
}
