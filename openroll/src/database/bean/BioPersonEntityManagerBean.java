/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioPerson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.eclipse.persistence.config.CacheUsage;

/**
 *
 * @author Maverick
 */
public class BioPersonEntityManagerBean extends BaseEntityManager implements Serializable {

    public BioPersonEntityManagerBean(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public BioPersonEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BioPerson bioPerson) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bioPerson);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(BioPerson bioPerson) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bioPerson = em.merge(bioPerson);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = bioPerson.getId();
                if (findBioPerson(id) == null) {
                    throw new NonexistentEntityException("The bioPerson with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            BioPerson bioPerson;
            try {
                bioPerson = em.getReference(BioPerson.class, id);
                bioPerson.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bioPerson with id " + id + " no longer exists.", enfe);
            }
            em.remove(bioPerson);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<BioPerson> findBioPersonEntities() {
        return findBioPersonEntities(true, -1, -1);
    }

    public List<BioPerson> findBioPersonEntities(int maxResults, int firstResult) {
        return findBioPersonEntities(false, maxResults, firstResult);
    }

    private List<BioPerson> findBioPersonEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BioPerson.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public BioPerson findBioPerson(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BioPerson.class, id);
        } finally {
            em.close();
        }
    }

    public int getBioPersonCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<BioPerson> rt = cq.from(BioPerson.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
    public List<BioPerson> searchPerson(String query, int startIndex, int limit) {
        EntityManager em = null;
        em=getEntityManager();
        System.out.println("preparing query...");
        Query selectQuery = em.createNativeQuery(query, BioPerson.class).setFirstResult(startIndex).setMaxResults(limit);
        System.out.println("fetching started...");
        List<BioPerson> personList = selectQuery.getResultList();
        System.out.println("fetching finished...");
        return personList;
    }  
    
    public Object getMinimumPersonInfo(int startIndex, int limit,String where) {
        EntityManager em = null;
        em=getEntityManager();
        String query = "select o.id, o.pinNo, o.firstName, o.lastName, o.gender, o.dateOfBirth, o.email from BioPerson o where "+where+" o.status = 'ACTIVE'";
        System.out.println("query="+query);
        Query selectQuery = em.createQuery(query);
        return selectQuery.setHint(CacheUsage.NoCache,CacheUsage.DoNotCheckCache).setFirstResult(startIndex).setMaxResults(limit).getResultList();
    }     
    
    public long getMinimumPersonInfoCount(String where) {
        EntityManager em = null;
        em=getEntityManager();
        String query = "select count(o.id) from BioPerson o where "+where+" o.status = 'ACTIVE'";
        System.out.println("query="+query);
        Query selectQuery = em.createQuery(query);
        return ((Long)selectQuery.getSingleResult());
    }     
    
}
