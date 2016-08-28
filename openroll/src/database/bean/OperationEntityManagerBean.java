/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import com.istlbd.utils.Defs;
import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioOperation;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import org.eclipse.persistence.config.CacheUsage;

/**
 *
 * @author Ataur Rahman
 */
public class OperationEntityManagerBean extends BaseEntityManager implements Serializable {

    public OperationEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BioOperation bioOperationEO) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bioOperationEO);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void update(BioOperation bioOperationEO) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bioOperationEO = em.merge(bioOperationEO);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void delete(Integer id) throws EntityNotFoundException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            BioOperation bioOperationEO = new BioOperation();
            try {
                bioOperationEO = em.getReference(BioOperation.class, id);
                bioOperationEO.getId();
            } catch (EntityNotFoundException enf) {
                if (Defs.isDebug) {
                    enf.printStackTrace();
                }
                throw new EntityNotFoundException("The user with id " + id + " does not exits in database");
            }
            em.remove(bioOperationEO);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object getMinimumOperationInfo(int startIndex, int limit, String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select o.id, o.operationName, o.operationDescription, o.status from BioOperation o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return selectQuery.setHint(CacheUsage.NoCache, CacheUsage.DoNotCheckCache).setFirstResult(startIndex).setMaxResults(limit).getResultList();
    }

    public long getMinimumOperationInfoCount(String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select count(o.id) from BioOperation o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return ((Long) selectQuery.getSingleResult());
    }
    
    
    public BioOperation findBioOperation(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BioOperation.class, id);
        } finally {
            em.close();
        }
    }
}
