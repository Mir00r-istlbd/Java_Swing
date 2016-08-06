/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpatestproject;

import com.istl.business.bean.StudentManagerBean;
import com.istl.business.entity.Student;
import com.istl.ws.ServiceException;

/**
 *
 * @author 2016
 */
public class JPATestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JPATestProject jPATestProject=new JPATestProject();
        jPATestProject.save();
        
        
    }
    
    private void save()
    {
        Student studentBO=new Student(12,"shakilrazzak","012","1");
        
        StudentManagerBean smb=new StudentManagerBean();
        Object wsResponse=smb.saveStudent(studentBO);
        
        if(wsResponse!=null && wsResponse instanceof Student)
        {
            studentBO=(Student)wsResponse;
            System.out.println("enroll successfull : id obtained ="+studentBO.getId());
        
        }
        else if(wsResponse !=null && wsResponse instanceof ServiceException)
        {
            
            ServiceException sExc=(ServiceException)wsResponse;
            System.out.println("error occurred, message follows:");
            System.out.println(sExc.getMsg());
        
        }
    }
   
}
