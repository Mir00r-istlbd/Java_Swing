/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entity;

import java.util.Date;

/**
 *
 * @author Maverick
 */
public class BioBiometric {

private Long id;
private byte[] photo;
private byte[] eyeLeft;
private byte[] eyeRight;
private byte[] signature;
private String fingerRemarks;
private byte[] wsqRt;
private byte[] wsqRi;
private byte[] wsqRm;
private byte[] wsqRr;
private byte[] wsqRl;
private byte[] wsqLt;
private byte[] wsqLi;
private byte[] wsqLm;
private byte[] wsqLr;
private byte[] wsqLl;
private byte[] ansiRt;
private byte[] ansiRi;
private byte[] ansiRm;
private byte[] ansiRr;
private byte[] ansiRl;
private byte[] ansiLt;
private byte[] ansiLi;
private byte[] ansiLm;
private byte[] ansiLr;
private byte[] ansiLl;
private String afisStatus;
private String status;
private String createdBy;
private Date creationDate;
private String lastUpdatedBy;
private Date lastUpdateDate;
    
    
    public BioBiometric()
    {}
    
    public BioBiometric(database.entity.BioBiometric biometricEO)
    {
        if(biometricEO!=null){
        this.id=biometricEO.getId();
        this.photo=biometricEO.getPhoto();
        this.eyeLeft=biometricEO.getEyeLeft();
        this.eyeRight=biometricEO.getEyeRight();
        this.signature=biometricEO.getSignature();
        this.fingerRemarks=biometricEO.getFingerRemarks();
        this.wsqRt=biometricEO.getWsqRt();
        this.wsqRi=biometricEO.getWsqRi();
        this.wsqRm=biometricEO.getWsqRm();
        this.wsqRr=biometricEO.getWsqRr();
        this.wsqRl=biometricEO.getWsqRl();
        this.wsqLt=biometricEO.getWsqLt();
        this.wsqLi=biometricEO.getWsqLi();
        this.wsqLm=biometricEO.getWsqLm();
        this.wsqLr=biometricEO.getWsqLr();
        this.wsqLl=biometricEO.getWsqLl();
        }
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

}
