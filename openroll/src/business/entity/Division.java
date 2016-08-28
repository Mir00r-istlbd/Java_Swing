/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entity;

/**
 *
 * @author Maverick
 */
public class Division {
    private Integer pkId;
    private String id;
    private String name;
    private String nameEn;    

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
    
    
    
}
