/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import com.istlbd.utils.Defs;
import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioUser;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.eclipse.persistence.config.CacheUsage;

/**
 *
 * @author Ataur Rahman
 */
public class UserEntityManagerBean extends BaseEntityManager implements Serializable {

    public UserEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BioUser bioUserEo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bioUserEo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void update(BioUser userEO) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            userEO = em.merge(userEO);
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
            BioUser userEO = new BioUser();
            try {
                userEO = em.getReference(BioUser.class, id);
                userEO.getId();
            } catch (EntityNotFoundException enf) {
                if (Defs.isDebug) {
                    enf.printStackTrace();
                }
                throw new EntityNotFoundException("The user with id " + id + " does not exits in database");
            }
            em.remove(userEO);
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

    public List<BioUser> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    public List<BioUser> findDistrictEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<BioUser> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BioUser.class));
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

    public Object getMinimumUserInfo(int startIndex, int limit, String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select o.id, o.username, o.fullName, o.designation, o.phoneNo, o.email, o.status from BioUser o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return selectQuery.setHint(CacheUsage.NoCache, CacheUsage.DoNotCheckCache).setFirstResult(startIndex).setMaxResults(limit).getResultList();
    }

    public long getMinimumUserInfoCount(String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select count(o.id) from BioUser o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return ((Long) selectQuery.getSingleResult());
    }

    public BioUser findBioUser(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BioUser.class, id);
        } finally {
            em.close();
        }
    }

    public BioUser findBioUser(String userName, String password) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT u FROM BioUser u WHERE u.username = :userName AND u.password = :pass");
            q.setParameter("userName", userName);
            q.setParameter("pass", password);
            BioUser user = (BioUser) q.getSingleResult();
            return user;
        } finally {
            em.close();
        }
    }
}
