/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.response;

import business.entity.BioPerson;
import java.util.List;

/**
 *
 * @author Maverick
 */
public class GetPersonSummaryResponse {
    private List<BioPerson> personList;
    private BioPerson singlePerson;
    private Long totalResult;
    private boolean operationStatus;
    private String errorMessage;

    public List<BioPerson> getPersonList() {
        return personList;
    }

    public void setPersonList(List<BioPerson> personList) {
        this.personList = personList;
    }

    public Long getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

    public boolean isOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(boolean operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public BioPerson getSinglePerson() {
        System.out.println("getSinglePerson");
        System.out.println(singlePerson.getPresentDivision());
        System.out.println(singlePerson.getPresentDistrict());
        System.out.println(singlePerson.getPresentUpozila());
        System.out.println(singlePerson.getPresentRmo());
        System.out.println(singlePerson.getPresentMouza());
        System.out.println(singlePerson.getPresentCity());
        return singlePerson;
    }

    public void setSinglePerson(BioPerson singlePerson) {
        this.singlePerson = singlePerson;
        System.out.println("setSinglePerson");
        System.out.println(singlePerson.getPresentDivision());
        System.out.println(singlePerson.getPresentDistrict());
        System.out.println(singlePerson.getPresentUpozila());
        System.out.println(singlePerson.getPresentRmo());
        System.out.println(singlePerson.getPresentMouza());
        System.out.println(singlePerson.getPresentCity());
    }
    
    
    
}
