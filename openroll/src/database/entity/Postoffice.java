/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "postoffice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postoffice.findAll", query = "SELECT p FROM Postoffice p"),
    @NamedQuery(name = "Postoffice.findById", query = "SELECT p FROM Postoffice p WHERE p.id = :id"),
    @NamedQuery(name = "Postoffice.findByDivid", query = "SELECT p FROM Postoffice p WHERE p.divid = :divid"),
    @NamedQuery(name = "Postoffice.findByDivision", query = "SELECT p FROM Postoffice p WHERE p.division = :division"),
    @NamedQuery(name = "Postoffice.findByZillaid", query = "SELECT p FROM Postoffice p WHERE p.zillaid = :zillaid"),
    @NamedQuery(name = "Postoffice.findByDistrict", query = "SELECT p FROM Postoffice p WHERE p.district = :district"),
    @NamedQuery(name = "Postoffice.findByUpazilaid", query = "SELECT p FROM Postoffice p WHERE p.upazilaid = :upazilaid"),
    @NamedQuery(name = "Postoffice.findByThana", query = "SELECT p FROM Postoffice p WHERE p.thana = :thana"),
    @NamedQuery(name = "Postoffice.findBySuboffice", query = "SELECT p FROM Postoffice p WHERE p.suboffice = :suboffice"),
    @NamedQuery(name = "Postoffice.findByPostCode", query = "SELECT p FROM Postoffice p WHERE p.postCode = :postCode"),
    @NamedQuery(name = "Postoffice.findBySubofficeBangla", query = "SELECT p FROM Postoffice p WHERE p.subofficeBangla = :subofficeBangla")})
public class Postoffice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DIVID")
    private String divid;
    @Column(name = "Division")
    private String division;
    @Column(name = "ZILLAID")
    private String zillaid;
    @Column(name = "District")
    private String district;
    @Column(name = "UPAZILAID")
    private String upazilaid;
    @Column(name = "Thana")
    private String thana;
    @Column(name = "Suboffice")
    private String suboffice;
    @Basic(optional = false)
    @Column(name = "PostCode")
    private String postCode;
    @Column(name = "SubofficeBangla")
    private String subofficeBangla;

    public Postoffice() {
    }

    public Postoffice(Integer id) {
        this.id = id;
    }

    public Postoffice(Integer id, String postCode) {
        this.id = id;
        this.postCode = postCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDivid() {
        return divid;
    }

    public void setDivid(String divid) {
        this.divid = divid;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getZillaid() {
        return zillaid;
    }

    public void setZillaid(String zillaid) {
        this.zillaid = zillaid;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getUpazilaid() {
        return upazilaid;
    }

    public void setUpazilaid(String upazilaid) {
        this.upazilaid = upazilaid;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getSuboffice() {
        return suboffice;
    }

    public void setSuboffice(String suboffice) {
        this.suboffice = suboffice;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getSubofficeBangla() {
        return subofficeBangla;
    }

    public void setSubofficeBangla(String subofficeBangla) {
        this.subofficeBangla = subofficeBangla;
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
        if (!(object instanceof Postoffice)) {
            return false;
        }
        Postoffice other = (Postoffice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.Postoffice[ id=" + id + " ]";
    }
    
}
