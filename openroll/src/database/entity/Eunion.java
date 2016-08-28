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
@Table(name = "eunion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eunion.findAll", query = "SELECT e FROM Eunion e"),
    @NamedQuery(name = "Eunion.findByPkId", query = "SELECT e FROM Eunion e WHERE e.pkId = :pkId"),
    @NamedQuery(name = "Eunion.findById", query = "SELECT e FROM Eunion e WHERE e.id = :id"),
    @NamedQuery(name = "Eunion.findByUpozila", query = "SELECT e FROM Eunion e WHERE e.upozila = :upozila"),
    @NamedQuery(name = "Eunion.findByCity", query = "SELECT e FROM Eunion e WHERE e.city = :city"),
    @NamedQuery(name = "Eunion.findByCode", query = "SELECT e FROM Eunion e WHERE e.code = :code"),
    @NamedQuery(name = "Eunion.findByName", query = "SELECT e FROM Eunion e WHERE e.name = :name"),
    @NamedQuery(name = "Eunion.findByNameEn", query = "SELECT e FROM Eunion e WHERE e.nameEn = :nameEn"),
    @NamedQuery(name = "Eunion.findByUpozilaAndCity", query = "SELECT e FROM Eunion e WHERE e.city = :city AND e.upozila = :upozila"),
    @NamedQuery(name = "Eunion.findByConstituency", query = "SELECT e FROM Eunion e WHERE e.constituency = :constituency")})
public class Eunion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_ID")
    private Integer pkId;
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "UPOZILA")
    private Integer upozila;
    @Column(name = "CITY")
    private Integer city;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NAME_EN")
    private String nameEn;
    @Column(name = "CONSTITUENCY")
    private String constituency;

    public Eunion() {
    }

    public Eunion(Integer pkId) {
        this.pkId = pkId;
    }

    public Eunion(Integer pkId, String id) {
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

    public Integer getUpozila() {
        return upozila;
    }

    public void setUpozila(Integer upozila) {
        this.upozila = upozila;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
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

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
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
        if (!(object instanceof Eunion)) {
            return false;
        }
        Eunion other = (Eunion) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.Eunion[ pkId=" + pkId + " ]";
    }
    
}
