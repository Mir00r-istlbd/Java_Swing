/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entity;

/**
 *
 * @author Maverick
 */
public class GetPersonSummaryRequest {
    private BioPerson person;
    private Integer startIndex;
    private Integer limit;

    public BioPerson getPerson() {
        return person;
    }

    public void setPerson(BioPerson person) {
        this.person = person;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
