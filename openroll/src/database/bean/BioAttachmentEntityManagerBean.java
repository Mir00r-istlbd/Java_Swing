/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioAttachment;
import database.entity.Upozila;
import java.io.Serializable;
import java.math.BigInteger;
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
public class BioAttachmentEntityManagerBean extends BaseEntityManager implements Serializable {

    public BioAttachmentEntityManagerBean(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public BioAttachmentEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BioAttachment bioAttachment) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bioAttachment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(BioAttachment bioAttachment) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bioAttachment = em.merge(bioAttachment);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = bioAttachment.getId();
                if (findBioAttachment(id) == null) {
                    throw new NonexistentEntityException("The bioAttachment with id " + id + " no longer exists.");
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
            BioAttachment bioAttachment;
            try {
                bioAttachment = em.getReference(BioAttachment.class, id);
                bioAttachment.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bioAttachment with id " + id + " no longer exists.", enfe);
            }
            em.remove(bioAttachment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<BioAttachment> findBioAttachmentEntities() {
        return findBioAttachmentEntities(true, -1, -1);
    }

    public List<BioAttachment> findBioAttachmentEntities(int maxResults, int firstResult) {
        return findBioAttachmentEntities(false, maxResults, firstResult);
    }

    private List<BioAttachment> findBioAttachmentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BioAttachment.class));
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

    public BioAttachment findBioAttachment(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BioAttachment.class, id);
        } finally {
            em.close();
        }
    }

    public int getBioAttachmentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<BioAttachment> rt = cq.from(BioAttachment.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
    
    public void deleteAttachmentsByPersonId(Long personId) {
        BigInteger pid=BigInteger.valueOf(personId.longValue());
        EntityManager em=getEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("BioAttachment.deleteAllByPersonId").setParameter("personId",personId).executeUpdate();
        em.getTransaction().commit();
    }

    public List<BioAttachment> getAttachmentFindByPersonId(Long personId) {
        EntityManager em=getEntityManager();
        BigInteger pid=BigInteger.valueOf(personId.longValue());
        return em.createNamedQuery("BioAttachment.findByPersonId").setParameter("personId",pid).getResultList();
    }    
    
    
}
