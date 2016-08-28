/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

import database.bean.AddressEntityManagerBean;
import business.entity.BioPerson;
import business.entity.GetPersonSummaryRequest;
import client.bean.ApplicationData;
import database.bean.BioAttachmentEntityManagerBean;
import database.bean.BioBiometricEntityManagerBean;
import database.bean.BioPersonEntityManagerBean;
import database.entity.BioAttachment;
import com.istlbd.gui.Scanner;
import com.istlbd.utils.Lookup;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ws.response.AddBioPersonResponse;
import ws.response.GetPersonSummaryResponse;

/**
 *
 * @author Maverick
 */
public class PersonManagerBean {

    public PersonManagerBean() {
    }

    public List<BioPerson> searchPerson(GetPersonSummaryRequest searchCriteria) {
        String mainQuery = "Select * from bio_person where ";
        mainQuery += Utils.buildLikeQuery("FIRST_NAME", searchCriteria.getPerson().getFirstName());
        mainQuery += Utils.buildLikeQuery("LAST_NAME", searchCriteria.getPerson().getLastName());
        mainQuery += Utils.buildLikeQuery("GENDER", searchCriteria.getPerson().getGender());
        mainQuery += Utils.buildLikeQuery("PIN_NO", searchCriteria.getPerson().getPinNo());

        // TODO no required now, will complete it later



        return new ArrayList<BioPerson>();
    }

    public GetPersonSummaryResponse getMinimumPersonInfo(Long startIndex, Long limit, BioPerson person) {
        GetPersonSummaryResponse resp = new GetPersonSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioPerson> personInfo = new ArrayList<BioPerson>();

            BioPersonEntityManagerBean bpm = new BioPersonEntityManagerBean();

            String where = "";
            where += Utils.buildJPQLLikeQuery("o.firstName", person.getFirstName());
            where += Utils.buildJPQLLikeQuery("o.lastName", person.getLastName());
            where += Utils.buildJPQLLikeQuery("o.gender", person.getGender());
            where += Utils.buildJPQLLikeQuery("o.pinNo", person.getPinNo());


            Object object = bpm.getMinimumPersonInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioPerson info = new BioPerson();
                    info.setId((Long) objArr[0]);
                    try {
                        info.setPinNo((String) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setFirstName((String) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setLastName((String) objArr[3]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setGender((String) objArr[4]);
                    } catch (Exception e) {
                    }

                    try {
                        Date dob = (Date) objArr[5];
                        info.setDateOfBirth(Utils.getDateToString(dob));
                    } catch (Exception e) {
                    }

                    try {
                        info.setEmail((String) objArr[6]);
                    } catch (Exception e) {
                    }
                    personInfo.add(info);
                }
            }




            Long totalResult = bpm.getMinimumPersonInfoCount(where);
            resp.setPersonList(personInfo);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setPersonList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }

    public GetPersonSummaryResponse getSinglePersonInfo(String id) {
        GetPersonSummaryResponse resp = new GetPersonSummaryResponse();
        BioPerson personInfo = null;
        try {

            System.out.println("Id: " + id);
            BioPersonEntityManagerBean bpm = new BioPersonEntityManagerBean();
            database.entity.BioPerson personEO = bpm.findBioPerson(Long.parseLong(id));
            if (personEO != null) {
                personInfo = new BioPerson(personEO);
                System.out.println("singleton if");
                System.out.println("Name: " + personInfo.getFirstName() + "Div: " + personInfo.getPresentDivision() + " Dist: " + personInfo.getPresentDistrict()
                        + " Upo: " + personInfo.getPresentUpozila());

            }

            resp.setSinglePerson(personInfo);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
        }
        return resp;
    }

    public AddBioPersonResponse insertUpdatePerson(BioPerson personBO) {
        boolean isUpdate = false;
        AddBioPersonResponse resp = new AddBioPersonResponse();
        database.entity.BioBiometric biometricEO = new database.entity.BioBiometric();
        try {
            database.entity.BioPerson personEO = new database.entity.BioPerson();

            if (personBO.getBiometric() != null) {
                if (personBO.getBiometric().getId() != null && personBO.getBiometric().getId().intValue() > 0) {
                    biometricEO.setId(personBO.getBiometric().getId());
                    isUpdate = true;
                }

                biometricEO.setPhoto(personBO.getBiometric().getPhoto());
                biometricEO.setSignature(personBO.getBiometric().getSignature());
                biometricEO.setFingerRemarks(personBO.getBiometric().getFingerRemarks());

                biometricEO.setWsqRt(personBO.getBiometric().getWsqRt());
                biometricEO.setWsqRi(personBO.getBiometric().getWsqRi());
                biometricEO.setWsqRm(personBO.getBiometric().getWsqRm());
                biometricEO.setWsqRr(personBO.getBiometric().getWsqRr());
                biometricEO.setWsqRl(personBO.getBiometric().getWsqRl());

                biometricEO.setWsqLt(personBO.getBiometric().getWsqLt());
                biometricEO.setWsqLi(personBO.getBiometric().getWsqLi());
                biometricEO.setWsqLm(personBO.getBiometric().getWsqLm());
                biometricEO.setWsqLr(personBO.getBiometric().getWsqLr());
                biometricEO.setWsqLl(personBO.getBiometric().getWsqLl());

                biometricEO.setEyeLeft(personBO.getBiometric().getEyeLeft());
                biometricEO.setEyeRight(personBO.getBiometric().getEyeRight());

                biometricEO.setAfisStatus(personBO.getBiometric().getAfisStatus());
                biometricEO.setCreatedBy("mofiz");
                biometricEO.setLastUpdatedBy("rohim");
                biometricEO.setStatus("ACTIVE");


                personEO.setBiometric(biometricEO);
                
                personEO.setApplicantType(personBO.getApplicantType());

            } else {
                personEO.setBiometric(null);
            }


            if (personBO.getId() != null && personBO.getId().intValue() > 0) {
                personEO.setId(personBO.getId());
            }

            //these are set by default as their database fields have a constraint of not null
            String default_val = "DEFAULT";
            personEO.setFirstName(default_val);
            personEO.setLastName(default_val);
            personEO.setFirstNameBn(default_val);
            personEO.setLastNameBn(default_val);
            //---------------------------------------------------------------------------------

            personEO.setPinNo(personBO.getPinNo());
            personEO.setFullName(personBO.getNameEn());
            personEO.setFullNameBn(personBO.getNameBn());
            personEO.setGender(personBO.getGender());

            personEO.setSpouseName(personBO.getSpouseName());
            personEO.setSpouseNid(personBO.getSpouseNid());
            personEO.setMaritalStatus(personBO.getMaritalStatus());

            personEO.setMotherName(personBO.getMotherName());
            personEO.setMotherNid(personBO.getMotherNid());

            personEO.setFatherName(personBO.getFatherName());
            personEO.setFatherNid(personBO.getFatherNid());

            personEO.setNidNumber(personBO.getNidNumber());
            personEO.setNidIssueDate(Utils.getStringToDate(personBO.getNidIssueDate()));
            personEO.setDateOfBirth(Utils.getStringToDate(personBO.getDateOfBirth()));
            personEO.setBirthDistrict(personBO.getBirthDistrict());
            personEO.setNationality(personBO.getNationality());
            personEO.setBirthRegNo(personBO.getBirthRegistrationNumber());
            personEO.setBloodGrp(personBO.getBloodGroup());
            personEO.setUniqueIdMark(personBO.getUniqueIdentificationMark());

            personEO.setPresentDivision(personBO.getPresentDivision());
            personEO.setPresentDistrict(personBO.getPresentDistrict());
            personEO.setPresentUpozila(personBO.getPresentUpozila());
            personEO.setPresentRmo(personBO.getPresentRmo());
            personEO.setPresentCity(personBO.getPresentCity());
            personEO.setPresentEunion(personBO.getPresentEunion());
            personEO.setPresentArea(personBO.getPresentMouza());
            personEO.setPresentAreaOtr(personBO.getPresentMouzaOtr());
            personEO.setPresentVillage(personBO.getPresentVillage());
            personEO.setPresentVillageOtr(personBO.getPresentVillageOtr());
            personEO.setPresentPostOffice(personBO.getPresentPostOffice());
            personEO.setPresentPostCode(personBO.getPresentPostCode());
            personEO.setPresentStreet(personBO.getPresentHouseNo());

            personEO.setPermDivision(personBO.getPermDivision());
            personEO.setPermDistrict(personBO.getPermDistrict());
            personEO.setPermUpozila(personBO.getPermUpozila());
            personEO.setPermRmo(personBO.getPermanentRmo());
            personEO.setPermCity(personBO.getPermanentCity());
            personEO.setPermEunion(personBO.getPermanentEunion());
            personEO.setPermArea(personBO.getPermanentMouza());
            personEO.setPermAreaOtr(personBO.getPermanentMouzaOtr());
            personEO.setPermVillage(personBO.getPermanentVillage());
            personEO.setPermVillageOtr(personBO.getPermanentVillageOtr());
            personEO.setPermPostOffice(personBO.getPermanentPostOffice());
            personEO.setPermPostCode(personBO.getPermanentPostCode());
            personEO.setPermStreet(personBO.getPermanentHouseNo());

            personEO.setVoterAt(personBO.getVoterAt());
            personEO.setVoterArea(personBO.getVoterArea());

            personEO.setHandicapInfo(personBO.getHandicapInfo());
            personEO.setHandicapRemarks(personBO.getHandicapRemarks());

            personEO.setProfession(personBO.getProfession());
            personEO.setEducationLevel(personBO.getEducationLevel());
            personEO.setReligion(personBO.getReligion());

            personEO.setPhone(personBO.getPhone());
            personEO.setMobile(personBO.getMobile());
            personEO.setEmail(personBO.getEmail());

            personEO.setPassport(personBO.getPassport());
            personEO.setTin(personBO.getTin());
            personEO.setDlNumber(personBO.getDlNumber());

            personEO.setStatus(personBO.getStatus());
            personEO.setCreatedBy(personBO.getCreatedBy());
            personEO.setLastUpdatedBy(personBO.getLastUpdatedBy());

            personEO.setCreationDate(new Date());
            personEO.setLastUpdateDate(new Date());

            personEO.setCreatedBy("silverslash");
            personEO.setLastUpdatedBy("silverslash");
            personEO.setStatus("ACTIVE");
            
            personEO.setApplicantType(personBO.getApplicantType());

            BioPersonEntityManagerBean bpm = new BioPersonEntityManagerBean();
            BioBiometricEntityManagerBean bbm = new BioBiometricEntityManagerBean();

            if (!isUpdate) {
                bpm.create(personEO);
                resp.setDataUpdateStatus(false);
                resp.setBiometricDataStatus(false);
            } else {
                if (biometricEO.getId() != null && biometricEO.getId().intValue() > 0) {
                    System.out.println("Person EO ashtese ->" +personEO.getId());
                    bbm.edit(biometricEO);
                    resp.setDataUpdateStatus(true);
                    resp.setBiometricDataStatus(true);
                    System.out.println("biometric table a dhukese -> " +personBO.getApplicantType());
                }
                
                System.out.println("bioperson table a dhukse1 -> " +personEO.getApplicantType());
                bpm.edit(personEO);
                resp.setDataUpdateStatus(true);
                System.out.println("bioperson table a dhukse2 -> " +personEO.getApplicantType());
            }
            System.out.println("id df=" + personEO.getId());
            System.out.println("biodf  id =" + personEO.getBiometric().getId());

            personBO.setId(personEO.getId());
            if (personBO.getBiometric() != null) {
                personBO.getBiometric().setId(personEO.getBiometric().getId());
            }

        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            return resp;
        }
        resp.setOperationStatus(true);
        resp.setErrorMessage(null);
        resp.setBioPerson(personBO);
        return resp;
    }

    public GetPersonSummaryResponse getAdvancedSearchPersonInfo(Long startIndex, Long limit, BioPerson person) {
        GetPersonSummaryResponse resp = new GetPersonSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioPerson> personInfo = new ArrayList<BioPerson>();

            BioPersonEntityManagerBean bpm = new BioPersonEntityManagerBean();

            String where = "";

            where += Utils.buildJPQLLikeQuery("o.firstNameBn", person.getFirstNameBn());
            where += Utils.buildJPQLLikeQuery("o.middleNameBn", person.getMiddleNameBn());
            where += Utils.buildJPQLLikeQuery("o.lastNameBn", person.getLastNameBn());

            where += Utils.buildJPQLLikeQuery("o.firstName", person.getFirstName());
            where += Utils.buildJPQLLikeQuery("o.middleName", person.getMiddleName());
            where += Utils.buildJPQLLikeQuery("o.lastName", person.getLastName());

            where += Utils.buildJPQLLikeQuery2("o.gender", person.getGender());

            where += Utils.buildJPQLLikeQuery("o.spouseFirstName", person.getSpouseFirstName());
            where += Utils.buildJPQLLikeQuery("o.spouseMiddleName", person.getSpouseMiddleName());
            where += Utils.buildJPQLLikeQuery("o.spouseLastName", person.getSpouseLastName());

            where += Utils.buildJPQLLikeQuery("o.fatherFirstName", person.getFatherFirstName());
            where += Utils.buildJPQLLikeQuery("o.fatherMiddleName", person.getFatherMiddleName());
            where += Utils.buildJPQLLikeQuery("o.fatherLastName", person.getFatherLastName());

            where += Utils.buildJPQLLikeQuery("o.motherFirstName", person.getMotherFirstName());
            where += Utils.buildJPQLLikeQuery("o.motherMiddleName", person.getMotherMiddleName());
            where += Utils.buildJPQLLikeQuery("o.motherLastName", person.getMotherLastName());

            where += Utils.buildJPQLLikeQuery("o.grandFatherFirstName", person.getGrandFatherFirstName());
            where += Utils.buildJPQLLikeQuery("o.grandFatherMiddleName", person.getGrandFatherMiddleName());
            where += Utils.buildJPQLLikeQuery("o.grandFatherLastName", person.getFatherLastName());

            where += Utils.buildJPQLLikeQuery2("o.pinNo", person.getPinNo());

            //new code for handicapped disabled
            where += Utils.buildJPQLLikeQuery2("o.handicapInfo", person.getHandicapInfo());

            where += Utils.buildJPQLLikeQuery2("o.nidIssueDate", person.getNidIssueDate());
            where += Utils.buildJPQLLikeQuery2("o.dateOfBirth", person.getDateOfBirth());
            where += Utils.buildJPQLLikeQuery("o.nidIssueDivision", person.getNidIssueDivision());
            where += Utils.buildJPQLLikeQuery("o.presentDivision", person.getPresentDivision());
            where += Utils.buildJPQLLikeQuery("o.presentDistrict", person.getPresentDistrict());
            where += Utils.buildJPQLLikeQuery("o.presentUpozila", person.getPresentUpozila());

            //new code for Citizen stree,village address
         /*   AddressEntityManagerBean bean = new AddressEntityManagerBean();
            where += Utils.buildJPQLLikeQuery2("o.presentStreet", bean.getVilageIdFindByVillageName(person.getPresentStreet()));

            where += Utils.buildJPQLLikeQuery("o.permDivision", person.getPermDivision());
            where += Utils.buildJPQLLikeQuery("o.permDistrict", person.getPermDistrict());
            where += Utils.buildJPQLLikeQuery("o.permUpozila", person.getPermUpozila());
            //Edited for PermVIllageID
            where += Utils.buildJPQLLikeQuery2("o.permStreet", bean.getVilageIdFindByVillageName(person.getPermStreet()));



            where += Utils.buildJPQLLikeQuery("o.educated", person.getEducated());
            where += Utils.buildJPQLLikeQuery("o.educationLevel", person.getEducationLevel());
            where += Utils.buildJPQLLikeQuery("o.religion", person.getReligion());

            where += Utils.buildJPQLLikeQuery2("o.phone", person.getPhone());
            where += Utils.buildJPQLLikeQuery2("o.mobile", person.getMobile());
            where += Utils.buildJPQLLikeQuery2("o.email", person.getEmail());

            where += Utils.buildJPQLLikeQuery2("o.passport", person.getPassport());
            where += Utils.buildJPQLLikeQuery2("o.tin", person.getTin());
            where += Utils.buildJPQLLikeQuery2("o.dlNumber", person.getDlNumber()); */


            Object object = bpm.getMinimumPersonInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioPerson info = new BioPerson();
                    info.setId((Long) objArr[0]);
                    try {
                        info.setPinNo((String) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setFirstName((String) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setLastName((String) objArr[3]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setGender((String) objArr[4]);
                    } catch (Exception e) {
                    }

                    try {
                        Date dob = (Date) objArr[5];
                        info.setDateOfBirth(Utils.getDateToString(dob));
                    } catch (Exception e) {
                    }

                    try {
                        info.setEmail((String) objArr[6]);
                    } catch (Exception e) {
                    }
                    personInfo.add(info);
                }
            }




            Long totalResult = bpm.getMinimumPersonInfoCount(where);
            resp.setPersonList(personInfo);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setPersonList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }

    public GetPersonSummaryResponse getIntelisenseSearchPersonInfo(Long startIndex, Long limit, String searchText) {
        GetPersonSummaryResponse resp = new GetPersonSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioPerson> personInfo = new ArrayList<BioPerson>();

            BioPersonEntityManagerBean bpm = new BioPersonEntityManagerBean();

            String where = "";

//            where += Utils.buildJPQLLikeQuery("o.firstNameBn", person.getFirstName());
//            where += Utils.buildJPQLLikeQuery("o.middleNameBn", person.getMiddleName());
//            where += Utils.buildJPQLLikeQuery("o.lastNameBn", person.getLastName());

            where += Utils.buildJPQLLikeQueryOR("o.firstName", searchText, false);
            where += Utils.buildJPQLLikeQueryOR("o.middleName", searchText, false);
            where += Utils.buildJPQLLikeQueryOR("o.lastName", searchText, true);

//            where += Utils.buildJPQLLikeQuery("o.gender", person.getGender());
//            
//            where += Utils.buildJPQLLikeQuery("o.spouseFirstName", person.getSpouseFirstName());
//            where += Utils.buildJPQLLikeQuery("o.spouseMiddleName", person.getSpouseMiddleName());
//            where += Utils.buildJPQLLikeQuery("o.spouseLastName", person.getSpouseLastName());
//            
//            where += Utils.buildJPQLLikeQuery("o.fatherFirstName", person.getFatherFirstName());
//            where += Utils.buildJPQLLikeQuery("o.fatherMiddleName", person.getFatherMiddleName());
//            where += Utils.buildJPQLLikeQuery("o.fatherLastName", person.getFatherLastName());
//            
//            where += Utils.buildJPQLLikeQuery("o.motherFirstName", person.getMotherFirstName());
//            where += Utils.buildJPQLLikeQuery("o.motherMiddleName", person.getMotherMiddleName());
//            where += Utils.buildJPQLLikeQuery("o.motherLastName", person.getMotherLastName());
//            
//            where += Utils.buildJPQLLikeQuery("o.grandFatherFirstName", person.getGrandFatherFirstName());
//            where += Utils.buildJPQLLikeQuery("o.grandFatherMiddleName", person.getGrandFatherMiddleName());
//            where += Utils.buildJPQLLikeQuery("o.grandFatherLastName", person.getFatherLastName());
//            
//            where += Utils.buildJPQLLikeQuery("o.pinNo", person.getPinNo());
//            
//            where += Utils.buildJPQLLikeQuery("o.nidIssueDate", person.getNidIssueDate());
//            where += Utils.buildJPQLLikeQuery("o.dateOfBirth", person.getDateOfBirth());
//            where += Utils.buildJPQLLikeQuery("o.nidIssueDivision", person.getNidIssueDivision());
//            where += Utils.buildJPQLLikeQuery("o.presentDivision", person.getPresentDivision());
//            where += Utils.buildJPQLLikeQuery("o.presentDistrict", person.getPresentDistrict());
//            where += Utils.buildJPQLLikeQuery("o.presentUpozila", person.getPresentUpozila());
//            
//            where += Utils.buildJPQLLikeQuery("o.permDivision", person.getPermDivision());
//            where += Utils.buildJPQLLikeQuery("o.permDistrict", person.getPermDistrict());
//            where += Utils.buildJPQLLikeQuery("o.permUpozila", person.getPermUpozila());
//            where += Utils.buildJPQLLikeQuery("o.permStreet", person.getPermStreet());
//            
//            
//            where += Utils.buildJPQLLikeQuery("o.educated", person.getEducated());
//            where += Utils.buildJPQLLikeQuery("o.educationLevel", person.getEducationLevel());
//            where += Utils.buildJPQLLikeQuery("o.religion", person.getReligion());
//            
//            where += Utils.buildJPQLLikeQuery("o.phone", person.getPhone());
//            where += Utils.buildJPQLLikeQuery("o.mobile", person.getMobile());
//            where += Utils.buildJPQLLikeQuery("o.email", person.getEmail());
//            
//            where += Utils.buildJPQLLikeQuery("o.passport", person.getPassport());
//            where += Utils.buildJPQLLikeQuery("o.tin", person.getTin());
//            where += Utils.buildJPQLLikeQuery("o.dlNumber", person.getDlNumber());


            Object object = bpm.getMinimumPersonInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioPerson info = new BioPerson();
                    info.setId((Long) objArr[0]);
                    try {
                        info.setPinNo((String) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setFirstName((String) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setLastName((String) objArr[3]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setGender((String) objArr[4]);
                    } catch (Exception e) {
                    }

                    try {
                        Date dob = (Date) objArr[5];
                        info.setDateOfBirth(Utils.getDateToString(dob));
                    } catch (Exception e) {
                    }

                    try {
                        info.setEmail((String) objArr[6]);
                    } catch (Exception e) {
                    }
                    personInfo.add(info);
                }
            }




            Long totalResult = bpm.getMinimumPersonInfoCount(where);
            resp.setPersonList(personInfo);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setPersonList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }

    public void deleteAndInsertAttachment(ApplicationData appData) {
        BioAttachmentEntityManagerBean att = new BioAttachmentEntityManagerBean();
        att.deleteAttachmentsByPersonId(appData.getId());

        if (appData.getCitizenshipAttachment1() != null || appData.getCitizenshipAttachment2() != null) {
            insertAttachment(appData.getCitizenshipAttachment1(), appData.getCitizenshipAttachment2(), Scanner.TYPE_CITIZENSHIP, appData.getId());
        }
        if (appData.getMarriageAttachment1() != null || appData.getMarriageAttachment2() != null) {
            insertAttachment(appData.getMarriageAttachment1(), appData.getMarriageAttachment2(), Scanner.TYPE_MARRIAGE, appData.getId());
        }
        if (appData.getOtherAttachment1() != null || appData.getOtherAttachment2() != null) {
            insertAttachment(appData.getOtherAttachment1(), appData.getOtherAttachment2(), Scanner.TYPE_OTHER, appData.getId());
        }
        if (appData.getTransferAttachment1() != null || appData.getTransferAttachment2() != null) {
            insertAttachment(appData.getTransferAttachment1(), appData.getTransferAttachment2(), Scanner.TYPE_TRANSFER, appData.getId());
        }
        if (appData.getUtilityAttachment1() != null || appData.getUtilityAttachment2() != null) {
            insertAttachment(appData.getUtilityAttachment1(), appData.getUtilityAttachment2(), Scanner.TYPE_UTILITY, appData.getId());
        }
    }

    private void insertAttachment(byte[] side1, byte[] side2, String type, Long personId) {
        try {
            BioAttachment attachmentEO = new BioAttachment(null, type, "ACTIVE", "mrt", new Date(), "mrt", new Date());

            attachmentEO.setAttachmentType(type);

            BigInteger pid = BigInteger.valueOf(personId.longValue());
            attachmentEO.setPersonId(pid);
            if (side1 != null) {
                attachmentEO.setAttachmentOne(side1);
            }
            if (side2 != null) {
                attachmentEO.setAttachmentTwo(side2);
            }

            BioAttachmentEntityManagerBean bmb = new BioAttachmentEntityManagerBean();
            bmb.create(attachmentEO);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
