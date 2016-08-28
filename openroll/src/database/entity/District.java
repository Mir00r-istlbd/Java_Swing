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
 * @author Maverick
 */
@Entity
@Table(name = "district")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "District.findAll", query = "SELECT d FROM District d"),
    @NamedQuery(name = "District.findByPkId", query = "SELECT d FROM District d WHERE d.pkId = :pkId"),
    @NamedQuery(name = "District.findById", query = "SELECT d FROM District d WHERE d.id = :id"),
    @NamedQuery(name = "District.findByDivision", query = "SELECT d FROM District d WHERE d.division = :division"),
    @NamedQuery(name = "District.findByCode", query = "SELECT d FROM District d WHERE d.code = :code"),
    @NamedQuery(name = "District.findByName", query = "SELECT d FROM District d WHERE d.name = :name"),
    @NamedQuery(name = "District.findByNameEn", query = "SELECT d FROM District d WHERE d.nameEn = :nameEn"),
    @NamedQuery(name = "District.findByRegion", query = "SELECT d FROM District d WHERE d.region = :region")})
public class District implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_ID")
    private Integer pkId;
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "DIVISION")
    private Integer division;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NAME_EN")
    private String nameEn;
    @Column(name = "REGION")
    private Integer region;

    public District() {
    }

    public District(Integer pkId) {
        this.pkId = pkId;
    }

    public District(Integer pkId, String id) {
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

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
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

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
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
        if (!(object instanceof District)) {
            return false;
        }
        District other = (District) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.District[ pkId=" + pkId + " ]";
    }
    
}
