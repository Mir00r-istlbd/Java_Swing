/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.istl.database.entitymanager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 2016
 */
public class BaseEntityManager {
    public static EntityManagerFactory emf;
    
    public EntityManagerFactory getEntityManagerFactory()
    {
        if(emf==null)
        {
            emf=Persistence.createEntityManagerFactory("JPATestProjectPU");
        }

        return emf;
    }

}
