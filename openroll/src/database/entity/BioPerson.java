/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "bio_person")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioPerson.findAll", query = "SELECT b FROM BioPerson b"),
    @NamedQuery(name = "BioPerson.findById", query = "SELECT b FROM BioPerson b WHERE b.id = :id"),
    @NamedQuery(name = "BioPerson.findByBiometricId", query = "SELECT b FROM BioPerson b WHERE b.biometric = :biometricId"),
    @NamedQuery(name = "BioPerson.findByPinNo", query = "SELECT b FROM BioPerson b WHERE b.pinNo = :pinNo"),
    @NamedQuery(name = "BioPerson.findByFirstName", query = "SELECT b FROM BioPerson b WHERE b.firstName = :firstName"),
    @NamedQuery(name = "BioPerson.findByMiddleName", query = "SELECT b FROM BioPerson b WHERE b.middleName = :middleName"),
    @NamedQuery(name = "BioPerson.findByLastName", query = "SELECT b FROM BioPerson b WHERE b.lastName = :lastName"),
    @NamedQuery(name = "BioPerson.findByFirstNameBn", query = "SELECT b FROM BioPerson b WHERE b.firstNameBn = :firstNameBn"),
    @NamedQuery(name = "BioPerson.findByMiddleNameBn", query = "SELECT b FROM BioPerson b WHERE b.middleNameBn = :middleNameBn"),
    @NamedQuery(name = "BioPerson.findByLastNameBn", query = "SELECT b FROM BioPerson b WHERE b.lastNameBn = :lastNameBn"),
    @NamedQuery(name = "BioPerson.findByGender", query = "SELECT b FROM BioPerson b WHERE b.gender = :gender"),
    @NamedQuery(name = "BioPerson.findBySpouseFirstName", query = "SELECT b FROM BioPerson b WHERE b.spouseFirstName = :spouseFirstName"),
    @NamedQuery(name = "BioPerson.findBySpouseMiddleName", query = "SELECT b FROM BioPerson b WHERE b.spouseMiddleName = :spouseMiddleName"),
    @NamedQuery(name = "BioPerson.findBySpouseLastName", query = "SELECT b FROM BioPerson b WHERE b.spouseLastName = :spouseLastName"),
    @NamedQuery(name = "BioPerson.findByMotherFirstName", query = "SELECT b FROM BioPerson b WHERE b.motherFirstName = :motherFirstName"),
    @NamedQuery(name = "BioPerson.findByMotherMiddleName", query = "SELECT b FROM BioPerson b WHERE b.motherMiddleName = :motherMiddleName"),
    @NamedQuery(name = "BioPerson.findByMotherLastName", query = "SELECT b FROM BioPerson b WHERE b.motherLastName = :motherLastName"),
    @NamedQuery(name = "BioPerson.findByFatherFirstName", query = "SELECT b FROM BioPerson b WHERE b.fatherFirstName = :fatherFirstName"),
    @NamedQuery(name = "BioPerson.findByFatherMiddleName", query = "SELECT b FROM BioPerson b WHERE b.fatherMiddleName = :fatherMiddleName"),
    @NamedQuery(name = "BioPerson.findByFatherLastName", query = "SELECT b FROM BioPerson b WHERE b.fatherLastName = :fatherLastName"),
    @NamedQuery(name = "BioPerson.findByGrandFatherFirstName", query = "SELECT b FROM BioPerson b WHERE b.grandFatherFirstName = :grandFatherFirstName"),
    @NamedQuery(name = "BioPerson.findByGrandFatherMiddleName", query = "SELECT b FROM BioPerson b WHERE b.grandFatherMiddleName = :grandFatherMiddleName"),
    @NamedQuery(name = "BioPerson.findByGrandFatherLastName", query = "SELECT b FROM BioPerson b WHERE b.grandFatherLastName = :grandFatherLastName"),
    @NamedQuery(name = "BioPerson.findByFullNameBn", query = "SELECT b FROM BioPerson b WHERE b.fullNameBn = :fullNameBn"),
    @NamedQuery(name = "BioPerson.findByFullName", query = "SELECT b FROM BioPerson b WHERE b.fullName = :fullName"),
    @NamedQuery(name = "BioPerson.findByFatherName", query = "SELECT b FROM BioPerson b WHERE b.fatherName = :fatherName"),
    @NamedQuery(name = "BioPerson.findByMotherName", query = "SELECT b FROM BioPerson b WHERE b.motherName = :motherName"),
    @NamedQuery(name = "BioPerson.findByMaritalStatus", query = "SELECT b FROM BioPerson b WHERE b.maritalStatus = :maritalStatus"),
    @NamedQuery(name = "BioPerson.findBySpouseName", query = "SELECT b FROM BioPerson b WHERE b.spouseName = :spouseName"),
    @NamedQuery(name = "BioPerson.findByNidNumber", query = "SELECT b FROM BioPerson b WHERE b.nidNumber = :nidNumber"),
    @NamedQuery(name = "BioPerson.findByOldNid", query = "SELECT b FROM BioPerson b WHERE b.oldNid = :oldNid"),
    @NamedQuery(name = "BioPerson.findByFatherNid", query = "SELECT b FROM BioPerson b WHERE b.fatherNid = :fatherNid"),
    @NamedQuery(name = "BioPerson.findByMotherNid", query = "SELECT b FROM BioPerson b WHERE b.motherNid = :motherNid"),
    @NamedQuery(name = "BioPerson.findBySpouseNid", query = "SELECT b FROM BioPerson b WHERE b.spouseNid = :spouseNid"),
    @NamedQuery(name = "BioPerson.findByBirthRegNo", query = "SELECT b FROM BioPerson b WHERE b.birthRegNo = :birthRegNo"),
    @NamedQuery(name = "BioPerson.findByNationality", query = "SELECT b FROM BioPerson b WHERE b.nationality = :nationality"),
    @NamedQuery(name = "BioPerson.findByBloodGrp", query = "SELECT b FROM BioPerson b WHERE b.bloodGrp = :bloodGrp"),
    @NamedQuery(name = "BioPerson.findByUniqueIdMark", query = "SELECT b FROM BioPerson b WHERE b.uniqueIdMark = :uniqueIdMark"),
    @NamedQuery(name = "BioPerson.findByNidIssueDate", query = "SELECT b FROM BioPerson b WHERE b.nidIssueDate = :nidIssueDate"),
    @NamedQuery(name = "BioPerson.findByDateOfBirth", query = "SELECT b FROM BioPerson b WHERE b.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "BioPerson.findByNidIssueDivision", query = "SELECT b FROM BioPerson b WHERE b.nidIssueDivision = :nidIssueDivision"),
    @NamedQuery(name = "BioPerson.findByBirthDivision", query = "SELECT b FROM BioPerson b WHERE b.birthDivision = :birthDivision"),
    @NamedQuery(name = "BioPerson.findByBirthDistrict", query = "SELECT b FROM BioPerson b WHERE b.birthDistrict = :birthDistrict"),
    @NamedQuery(name = "BioPerson.findByBirthUpozila", query = "SELECT b FROM BioPerson b WHERE b.birthUpozila = :birthUpozila"),
    @NamedQuery(name = "BioPerson.findByPermDivision", query = "SELECT b FROM BioPerson b WHERE b.permDivision = :permDivision"),
    @NamedQuery(name = "BioPerson.findByPermDistrict", query = "SELECT b FROM BioPerson b WHERE b.permDistrict = :permDistrict"),
    @NamedQuery(name = "BioPerson.findByPermUpozila", query = "SELECT b FROM BioPerson b WHERE b.permUpozila = :permUpozila"),
    @NamedQuery(name = "BioPerson.findByPermRmo", query = "SELECT b FROM BioPerson b WHERE b.permRmo = :permRmo"),
    @NamedQuery(name = "BioPerson.findByPermCity", query = "SELECT b FROM BioPerson b WHERE b.permCity = :permCity"),
    @NamedQuery(name = "BioPerson.findByPermEunion", query = "SELECT b FROM BioPerson b WHERE b.permEunion = :permEunion"),
    @NamedQuery(name = "BioPerson.findByPermArea", query = "SELECT b FROM BioPerson b WHERE b.permArea = :permArea"),
    @NamedQuery(name = "BioPerson.findByPermVillage", query = "SELECT b FROM BioPerson b WHERE b.permVillage = :permVillage"),
    @NamedQuery(name = "BioPerson.findByPermPostOffice", query = "SELECT b FROM BioPerson b WHERE b.permPostOffice = :permPostOffice"),
    @NamedQuery(name = "BioPerson.findByPermPostCode", query = "SELECT b FROM BioPerson b WHERE b.permPostCode = :permPostCode"),
    @NamedQuery(name = "BioPerson.findByPermAreaOtr", query = "SELECT b FROM BioPerson b WHERE b.permAreaOtr = :permAreaOtr"),
    @NamedQuery(name = "BioPerson.findByPermVillageOtr", query = "SELECT b FROM BioPerson b WHERE b.permVillageOtr = :permVillageOtr"),
    @NamedQuery(name = "BioPerson.findByPermHome", query = "SELECT b FROM BioPerson b WHERE b.permHome = :permHome"),
    @NamedQuery(name = "BioPerson.findByVoterAt", query = "SELECT b FROM BioPerson b WHERE b.voterAt = :voterAt"),
    @NamedQuery(name = "BioPerson.findByVoterArea", query = "SELECT b FROM BioPerson b WHERE b.voterArea = :voterArea"),
    @NamedQuery(name = "BioPerson.findByPermStreet", query = "SELECT b FROM BioPerson b WHERE b.permStreet = :permStreet"),
    @NamedQuery(name = "BioPerson.findByPresentDivision", query = "SELECT b FROM BioPerson b WHERE b.presentDivision = :presentDivision"),
    @NamedQuery(name = "BioPerson.findByPresentDistrict", query = "SELECT b FROM BioPerson b WHERE b.presentDistrict = :presentDistrict"),
    @NamedQuery(name = "BioPerson.findByPresentUpozila", query = "SELECT b FROM BioPerson b WHERE b.presentUpozila = :presentUpozila"),
    @NamedQuery(name = "BioPerson.findByPresentRmo", query = "SELECT b FROM BioPerson b WHERE b.presentRmo = :presentRmo"),
    @NamedQuery(name = "BioPerson.findByPresentCity", query = "SELECT b FROM BioPerson b WHERE b.presentCity = :presentCity"),
    @NamedQuery(name = "BioPerson.findByPresentEunion", query = "SELECT b FROM BioPerson b WHERE b.presentEunion = :presentEunion"),
    @NamedQuery(name = "BioPerson.findByPresentArea", query = "SELECT b FROM BioPerson b WHERE b.presentArea = :presentArea"),
    @NamedQuery(name = "BioPerson.findByPresentVillage", query = "SELECT b FROM BioPerson b WHERE b.presentVillage = :presentVillage"),
    @NamedQuery(name = "BioPerson.findByPresentPostOffice", query = "SELECT b FROM BioPerson b WHERE b.presentPostOffice = :presentPostOffice"),
    @NamedQuery(name = "BioPerson.findByPresentPostCode", query = "SELECT b FROM BioPerson b WHERE b.presentPostCode = :presentPostCode"),
    @NamedQuery(name = "BioPerson.findByPresentAreaOtr", query = "SELECT b FROM BioPerson b WHERE b.presentAreaOtr = :presentAreaOtr"),
    @NamedQuery(name = "BioPerson.findByPresentVillageOtr", query = "SELECT b FROM BioPerson b WHERE b.presentVillageOtr = :presentVillageOtr"),
    @NamedQuery(name = "BioPerson.findByPresentHome", query = "SELECT b FROM BioPerson b WHERE b.presentHome = :presentHome"),
    @NamedQuery(name = "BioPerson.findByPresentStreet", query = "SELECT b FROM BioPerson b WHERE b.presentStreet = :presentStreet"),
    @NamedQuery(name = "BioPerson.findByHandicapInfo", query = "SELECT b FROM BioPerson b WHERE b.handicapInfo = :handicapInfo"),
    @NamedQuery(name = "BioPerson.findByHandicapRemarks", query = "SELECT b FROM BioPerson b WHERE b.handicapRemarks = :handicapRemarks"),
    @NamedQuery(name = "BioPerson.findByEducated", query = "SELECT b FROM BioPerson b WHERE b.educated = :educated"),
    @NamedQuery(name = "BioPerson.findByEducationLevel", query = "SELECT b FROM BioPerson b WHERE b.educationLevel = :educationLevel"),
    @NamedQuery(name = "BioPerson.findByProfession", query = "SELECT b FROM BioPerson b WHERE b.profession = :profession"),
    @NamedQuery(name = "BioPerson.findByEmail", query = "SELECT b FROM BioPerson b WHERE b.email = :email"),
    @NamedQuery(name = "BioPerson.findByPhone", query = "SELECT b FROM BioPerson b WHERE b.phone = :phone"),
    @NamedQuery(name = "BioPerson.findByMobile", query = "SELECT b FROM BioPerson b WHERE b.mobile = :mobile"),
    @NamedQuery(name = "BioPerson.findByOtherInfo", query = "SELECT b FROM BioPerson b WHERE b.otherInfo = :otherInfo"),
    @NamedQuery(name = "BioPerson.findByReligion", query = "SELECT b FROM BioPerson b WHERE b.religion = :religion"),
    @NamedQuery(name = "BioPerson.findByDlNumber", query = "SELECT b FROM BioPerson b WHERE b.dlNumber = :dlNumber"),
    @NamedQuery(name = "BioPerson.findByPassport", query = "SELECT b FROM BioPerson b WHERE b.passport = :passport"),
    @NamedQuery(name = "BioPerson.findByTin", query = "SELECT b FROM BioPerson b WHERE b.tin = :tin"),
    @NamedQuery(name = "BioPerson.findByStatus", query = "SELECT b FROM BioPerson b WHERE b.status = :status"),
    @NamedQuery(name = "BioPerson.findByCreatedBy", query = "SELECT b FROM BioPerson b WHERE b.createdBy = :createdBy"),
    @NamedQuery(name = "BioPerson.findByCreationDate", query = "SELECT b FROM BioPerson b WHERE b.creationDate = :creationDate"),
    @NamedQuery(name = "BioPerson.findByLastUpdatedBy", query = "SELECT b FROM BioPerson b WHERE b.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "BioPerson.findByLastUpdateDate", query = "SELECT b FROM BioPerson b WHERE b.lastUpdateDate = :lastUpdateDate"), 
    @NamedQuery(name = "BioPerson.findByApplicantType", query = "SELECT b FROM BioPerson b WHERE b.applicantType = :applicantType") })

public class BioPerson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="BIOMETRIC_ID")
    private BioBiometric biometric;
    @Basic(optional = false)
    @Column(name = "PIN_NO")
    private String pinNo;
    //@Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    //@Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    //@Basic(optional = false)
    @Column(name = "FIRST_NAME_BN")
    private String firstNameBn;
    @Column(name = "MIDDLE_NAME_BN")
    private String middleNameBn;
    //@Basic(optional = false)
    @Column(name = "LAST_NAME_BN")
    private String lastNameBn;
    //@Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "SPOUSE_FIRST_NAME")
    private String spouseFirstName;
    @Column(name = "SPOUSE_MIDDLE_NAME")
    private String spouseMiddleName;
    @Column(name = "SPOUSE_LAST_NAME")
    private String spouseLastName;
    @Column(name = "MOTHER_FIRST_NAME")
    private String motherFirstName;
    @Column(name = "MOTHER_MIDDLE_NAME")
    private String motherMiddleName;
    @Column(name = "MOTHER_LAST_NAME")
    private String motherLastName;
    @Column(name = "FATHER_FIRST_NAME")
    private String fatherFirstName;
    @Column(name = "FATHER_MIDDLE_NAME")
    private String fatherMiddleName;
    @Column(name = "FATHER_LAST_NAME")
    private String fatherLastName;
    @Column(name = "GRAND_FATHER_FIRST_NAME")
    private String grandFatherFirstName;
    @Column(name = "GRAND_FATHER_MIDDLE_NAME")
    private String grandFatherMiddleName;
    @Column(name = "GRAND_FATHER_LAST_NAME")
    private String grandFatherLastName;
    @Column(name = "FULL_NAME_BN")
    private String fullNameBn;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "FATHER_NAME")
    private String fatherName;
    @Column(name = "MOTHER_NAME")
    private String motherName;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "SPOUSE_NAME")
    private String spouseName;
    @Column(name = "NID_NUMBER")
    private String nidNumber;
    @Column(name = "OLD_NID")
    private String oldNid;
    @Column(name = "FATHER_NID")
    private String fatherNid;
    @Column(name = "MOTHER_NID")
    private String motherNid;
    @Column(name = "SPOUSE_NID")
    private String spouseNid;
    @Column(name = "BIRTH_REG_NO")
    private String birthRegNo;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "BLOOD_GRP")
    private String bloodGrp;
    @Column(name = "UNIQUE_ID_MARK")
    private String uniqueIdMark;
    //@Basic(optional = false)
    @Column(name = "NID_ISSUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date nidIssueDate;
    @Basic(optional = false)
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "NID_ISSUE_DIVISION")
    private String nidIssueDivision;
    @Column(name = "BIRTH_DIVISION")
    private String birthDivision;
    @Column(name = "BIRTH_DISTRICT")
    private String birthDistrict;
    @Column(name = "BIRTH_UPOZILA")
    private String birthUpozila;
    @Column(name = "PERM_DIVISION")
    private String permDivision;
    @Column(name = "PERM_DISTRICT")
    private String permDistrict;
    @Column(name = "PERM_UPOZILA")
    private String permUpozila;
    @Column(name = "PERM_RMO")
    private String permRmo;
    @Column(name = "PERM_CITY")
    private String permCity;
    @Column(name = "PERM_EUNION")
    private String permEunion;
    @Column(name = "PERM_AREA")
    private String permArea;
    @Column(name = "PERM_VILLAGE")
    private String permVillage;
    @Column(name = "PERM_POST_OFFICE")
    private String permPostOffice;
    @Column(name = "PERM_POST_CODE")
    private String permPostCode;
    @Column(name = "PERM_AREA_OTR")
    private String permAreaOtr;
    @Column(name = "PERM_VILLAGE_OTR")
    private String permVillageOtr;
    @Column(name = "PERM_HOME")
    private String permHome;
    @Column(name = "VOTER_AT")
    private String voterAt;
    @Column(name = "VOTER_AREA")
    private String voterArea;
    @Column(name = "PERM_STREET")
    private String permStreet;
    @Column(name = "PRESENT_DIVISION")
    private String presentDivision;
    @Column(name = "PRESENT_DISTRICT")
    private String presentDistrict;
    @Column(name = "PRESENT_UPOZILA")
    private String presentUpozila;
    @Column(name = "PRESENT_RMO")
    private String presentRmo;
    @Column(name = "PRESENT_CITY")
    private String presentCity;
    @Column(name = "PRESENT_EUNION")
    private String presentEunion;
    @Column(name = "PRESENT_AREA")
    private String presentArea;
    @Column(name = "PRESENT_VILLAGE")
    private String presentVillage;
    @Column(name = "PRESENT_POST_OFFICE")
    private String presentPostOffice;
    @Column(name = "PRESENT_POST_CODE")
    private String presentPostCode;
    @Column(name = "PRESENT_AREA_OTR")
    private String presentAreaOtr;
    @Column(name = "PRESENT_VILLAGE_OTR")
    private String presentVillageOtr;
    @Column(name = "PRESENT_HOME")
    private String presentHome;
    @Column(name = "PRESENT_STREET")
    private String presentStreet;
    @Column(name = "HANDICAP_INFO")
    private String handicapInfo;
    @Column(name = "HANDICAP_REMARKS")
    private String handicapRemarks;
    @Column(name = "EDUCATED")
    private String educated;
    @Column(name = "EDUCATION_LEVEL")
    private String educationLevel;
    @Column(name = "PROFESSION")
    private String profession;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "OTHER_INFO")
    private String otherInfo;
    @Column(name = "RELIGION")
    private String religion;
    @Column(name = "DL_NUMBER")
    private String dlNumber;
    @Column(name = "PASSPORT")
    private String passport;
    @Column(name = "TIN")
    private String tin;
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
    
    @Column(name = "APPLICANT_TYPE")
    private String applicantType;
    
    public BioPerson() {
    }

    public BioPerson(Long id) {
        this.id = id;
    }

    public BioPerson(Long id, String firstName, String lastName, String firstNameBn, String lastNameBn, String gender, Date nidIssueDate, Date dateOfBirth, String status, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstNameBn = firstNameBn;
        this.lastNameBn = lastNameBn;
        this.gender = gender;
        this.nidIssueDate = nidIssueDate;
        this.dateOfBirth = dateOfBirth;
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

    public BioBiometric getBiometric() {
        return biometric;
    }

    public void setBiometric(BioBiometric biometric) {
        this.biometric = biometric;
    }

    public String getPinNo() {
        return pinNo;
    }

    public void setPinNo(String pinNo) {
        this.pinNo = pinNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNameBn() {
        return firstNameBn;
    }

    public void setFirstNameBn(String firstNameBn) {
        this.firstNameBn = firstNameBn;
    }

    public String getMiddleNameBn() {
        return middleNameBn;
    }

    public void setMiddleNameBn(String middleNameBn) {
        this.middleNameBn = middleNameBn;
    }

    public String getLastNameBn() {
        return lastNameBn;
    }

    public void setLastNameBn(String lastNameBn) {
        this.lastNameBn = lastNameBn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    public void setSpouseMiddleName(String spouseMiddleName) {
        this.spouseMiddleName = spouseMiddleName;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getGrandFatherFirstName() {
        return grandFatherFirstName;
    }

    public void setGrandFatherFirstName(String grandFatherFirstName) {
        this.grandFatherFirstName = grandFatherFirstName;
    }

    public String getGrandFatherMiddleName() {
        return grandFatherMiddleName;
    }

    public void setGrandFatherMiddleName(String grandFatherMiddleName) {
        this.grandFatherMiddleName = grandFatherMiddleName;
    }

    public String getGrandFatherLastName() {
        return grandFatherLastName;
    }

    public void setGrandFatherLastName(String grandFatherLastName) {
        this.grandFatherLastName = grandFatherLastName;
    }

    public String getFullNameBn() {
        return fullNameBn;
    }

    public void setFullNameBn(String fullNameBn) {
        this.fullNameBn = fullNameBn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getOldNid() {
        return oldNid;
    }

    public void setOldNid(String oldNid) {
        this.oldNid = oldNid;
    }

    public String getFatherNid() {
        return fatherNid;
    }

    public void setFatherNid(String fatherNid) {
        this.fatherNid = fatherNid;
    }

    public String getMotherNid() {
        return motherNid;
    }

    public void setMotherNid(String motherNid) {
        this.motherNid = motherNid;
    }

    public String getSpouseNid() {
        return spouseNid;
    }

    public void setSpouseNid(String spouseNid) {
        this.spouseNid = spouseNid;
    }

    public String getBirthRegNo() {
        return birthRegNo;
    }

    public void setBirthRegNo(String birthRegNo) {
        this.birthRegNo = birthRegNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getUniqueIdMark() {
        return uniqueIdMark;
    }

    public void setUniqueIdMark(String uniqueIdMark) {
        this.uniqueIdMark = uniqueIdMark;
    }

    public Date getNidIssueDate() {
        return nidIssueDate;
    }

    public void setNidIssueDate(Date nidIssueDate) {
        this.nidIssueDate = nidIssueDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNidIssueDivision() {
        return nidIssueDivision;
    }

    public void setNidIssueDivision(String nidIssueDivision) {
        this.nidIssueDivision = nidIssueDivision;
    }

    public String getBirthDivision() {
        return birthDivision;
    }

    public void setBirthDivision(String birthDivision) {
        this.birthDivision = birthDivision;
    }

    public String getBirthDistrict() {
        return birthDistrict;
    }

    public void setBirthDistrict(String birthDistrict) {
        this.birthDistrict = birthDistrict;
    }

    public String getBirthUpozila() {
        return birthUpozila;
    }

    public void setBirthUpozila(String birthUpozila) {
        this.birthUpozila = birthUpozila;
    }

    public String getPermDivision() {
        return permDivision;
    }

    public void setPermDivision(String permDivision) {
        this.permDivision = permDivision;
    }

    public String getPermDistrict() {
        return permDistrict;
    }

    public void setPermDistrict(String permDistrict) {
        this.permDistrict = permDistrict;
    }

    public String getPermUpozila() {
        return permUpozila;
    }

    public void setPermUpozila(String permUpozila) {
        this.permUpozila = permUpozila;
    }

    public String getPermRmo() {
        return permRmo;
    }

    public void setPermRmo(String permRmo) {
        this.permRmo = permRmo;
    }

    public String getPermCity() {
        return permCity;
    }

    public void setPermCity(String permCity) {
        this.permCity = permCity;
    }

    public String getPermEunion() {
        return permEunion;
    }

    public void setPermEunion(String permEunion) {
        this.permEunion = permEunion;
    }

    public String getPermArea() {
        return permArea;
    }

    public void setPermArea(String permArea) {
        this.permArea = permArea;
    }

    public String getPermVillage() {
        return permVillage;
    }

    public void setPermVillage(String permVillage) {
        this.permVillage = permVillage;
    }

    public String getPermPostOffice() {
        return permPostOffice;
    }

    public void setPermPostOffice(String permPostOffice) {
        this.permPostOffice = permPostOffice;
    }

    public String getPermPostCode() {
        return permPostCode;
    }

    public void setPermPostCode(String permPostCode) {
        this.permPostCode = permPostCode;
    }

    public String getPermAreaOtr() {
        return permAreaOtr;
    }

    public void setPermAreaOtr(String permAreaOtr) {
        this.permAreaOtr = permAreaOtr;
    }

    public String getPermVillageOtr() {
        return permVillageOtr;
    }

    public void setPermVillageOtr(String permVillageOtr) {
        this.permVillageOtr = permVillageOtr;
    }

    public String getPermHome() {
        return permHome;
    }

    public void setPermHome(String permHome) {
        this.permHome = permHome;
    }

    public String getVoterAt() {
        return voterAt;
    }

    public void setVoterAt(String voterAt) {
        this.voterAt = voterAt;
    }

    public String getVoterArea() {
        return voterArea;
    }

    public void setVoterArea(String voterArea) {
        this.voterArea = voterArea;
    }

    public String getPermStreet() {
        return permStreet;
    }

    public void setPermStreet(String permStreet) {
        this.permStreet = permStreet;
    }

    public String getPresentDivision() {
        return presentDivision;
    }

    public void setPresentDivision(String presentDivision) {
        this.presentDivision = presentDivision;
    }

    public String getPresentDistrict() {
        return presentDistrict;
    }

    public void setPresentDistrict(String presentDistrict) {
        this.presentDistrict = presentDistrict;
    }

    public String getPresentUpozila() {
        return presentUpozila;
    }

    public void setPresentUpozila(String presentUpozila) {
        this.presentUpozila = presentUpozila;
    }

    public String getPresentRmo() {
        return presentRmo;
    }

    public void setPresentRmo(String presentRmo) {
        this.presentRmo = presentRmo;
    }

    public String getPresentCity() {
        return presentCity;
    }

    public void setPresentCity(String presentCity) {
        this.presentCity = presentCity;
    }

    public String getPresentEunion() {
        return presentEunion;
    }

    public void setPresentEunion(String presentEunion) {
        this.presentEunion = presentEunion;
    }

    public String getPresentArea() {
        return presentArea;
    }

    public void setPresentArea(String presentArea) {
        this.presentArea = presentArea;
    }

    public String getPresentVillage() {
        return presentVillage;
    }

    public void setPresentVillage(String presentVillage) {
        this.presentVillage = presentVillage;
    }

    public String getPresentPostOffice() {
        return presentPostOffice;
    }

    public void setPresentPostOffice(String presentPostOffice) {
        this.presentPostOffice = presentPostOffice;
    }

    public String getPresentPostCode() {
        return presentPostCode;
    }

    public void setPresentPostCode(String presentPostCode) {
        this.presentPostCode = presentPostCode;
    }

    public String getPresentAreaOtr() {
        return presentAreaOtr;
    }

    public void setPresentAreaOtr(String presentAreaOtr) {
        this.presentAreaOtr = presentAreaOtr;
    }

    public String getPresentVillageOtr() {
        return presentVillageOtr;
    }

    public void setPresentVillageOtr(String presentVillageOtr) {
        this.presentVillageOtr = presentVillageOtr;
    }

    public String getPresentHome() {
        return presentHome;
    }

    public void setPresentHome(String presentHome) {
        this.presentHome = presentHome;
    }

    public String getPresentStreet() {
        return presentStreet;
    }

    public void setPresentStreet(String presentStreet) {
        this.presentStreet = presentStreet;
    }

    public String getHandicapInfo() {
        return handicapInfo;
    }

    public void setHandicapInfo(String handicapInfo) {
        this.handicapInfo = handicapInfo;
    }

    public String getHandicapRemarks() {
        return handicapRemarks;
    }

    public void setHandicapRemarks(String handicapRemarks) {
        this.handicapRemarks = handicapRemarks;
    }

    public String getEducated() {
        return educated;
    }

    public void setEducated(String educated) {
        this.educated = educated;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
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

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
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
        if (!(object instanceof BioPerson)) {
            return false;
        }
        BioPerson other = (BioPerson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.entity.BioPerson[ id=" + id + " ]";
    }
    
}
