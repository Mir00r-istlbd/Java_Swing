/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioBiometric;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Maverick
 */
public class BioBiometricEntityManagerBean extends BaseEntityManager implements Serializable {

    public BioBiometricEntityManagerBean(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public BioBiometricEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BioBiometric bioBiometric) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bioBiometric);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(BioBiometric bioBiometric) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bioBiometric = em.merge(bioBiometric);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = bioBiometric.getId();
                if (findBioBiometric(id) == null) {
                    throw new NonexistentEntityException("The bioBiometric with id " + id + " no longer exists.");
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
            BioBiometric bioBiometric;
            try {
                bioBiometric = em.getReference(BioBiometric.class, id);
                bioBiometric.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bioBiometric with id " + id + " no longer exists.", enfe);
            }
            em.remove(bioBiometric);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<BioBiometric> findBioBiometricEntities() {
        return findBioBiometricEntities(true, -1, -1);
    }

    public List<BioBiometric> findBioBiometricEntities(int maxResults, int firstResult) {
        return findBioBiometricEntities(false, maxResults, firstResult);
    }

    private List<BioBiometric> findBioBiometricEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BioBiometric.class));
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

    public BioBiometric findBioBiometric(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BioBiometric.class, id);
        } finally {
            em.close();
        }
    }

    public int getBioBiometricCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<BioBiometric> rt = cq.from(BioBiometric.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
