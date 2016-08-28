/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import database.bean.exceptions.NonexistentEntityException;
import database.entity.Upozila;
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
public class UpozilaJpaController implements Serializable {

    public UpozilaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Upozila upozila) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(upozila);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Upozila upozila) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            upozila = em.merge(upozila);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = upozila.getPkId();
                if (findUpozila(id) == null) {
                    throw new NonexistentEntityException("The upozila with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Upozila upozila;
            try {
                upozila = em.getReference(Upozila.class, id);
                upozila.getPkId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The upozila with id " + id + " no longer exists.", enfe);
            }
            em.remove(upozila);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Upozila> findUpozilaEntities() {
        return findUpozilaEntities(true, -1, -1);
    }

    public List<Upozila> findUpozilaEntities(int maxResults, int firstResult) {
        return findUpozilaEntities(false, maxResults, firstResult);
    }

    private List<Upozila> findUpozilaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Upozila.class));
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

    public Upozila findUpozila(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Upozila.class, id);
        } finally {
            em.close();
        }
    }

    public int getUpozilaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Upozila> rt = cq.from(Upozila.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
