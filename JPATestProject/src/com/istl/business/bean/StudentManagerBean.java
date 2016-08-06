/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.business.bean;

import com.istl.business.entity.Student;
import com.istl.database.entitymanager.StudentEntityManager;
import com.istl.ws.ServiceException;

/**
 *
 * @author 2016
 */
public class StudentManagerBean {

    public Object saveStudent(Student studentBO) {

        // validation ...
        // business logic ...

        com.istl.database.entity.Student studentEO = new com.istl.database.entity.Student();

        studentEO.setId(studentBO.getId());
        studentEO.setName(studentBO.getName());
        studentEO.setClass1(studentBO.getClass1());
        studentEO.setRoll(studentBO.getRoll());

        StudentEntityManager sem = new StudentEntityManager();

        try {

            if (studentEO.getId() != null && studentEO.getId() > 0) {
                sem.edit(studentEO);
            } else {
                sem.create(studentEO);
            }
        } catch (Exception ex) {
            ServiceException serviceException=new ServiceException(ex.getMessage());
            
            return serviceException;
        }

        studentBO=new Student(studentEO);
        return studentBO;
        
    }
}
