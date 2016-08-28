/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Maverick
 */
public class BaseEntityManager {
    
    private static EntityManagerFactory emf;
    
    public EntityManagerFactory getEntityManagerFactory()
    {
        if(emf==null)
            emf=Persistence.createEntityManagerFactory("DPFPClientPU");
    
        return emf;
    }
    
}
