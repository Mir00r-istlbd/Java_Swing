/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.istl.business.entity;

/**
 *
 * @author 2016
 */
public class Student {

    private Integer id;
    private String name;
    private String roll;
    private String class1;    

    public Student()
    {}
    
    public Student(Integer id, String name, String roll, String class1) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.class1 = class1;
    }
    
    public Student(com.istl.database.entity.Student studentEO) {
        this.id = studentEO.getId();
        this.name = studentEO.getName();
        this.roll = studentEO.getRoll();
        this.class1 = studentEO.getClass1();
    }    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }
    
    
    

}
