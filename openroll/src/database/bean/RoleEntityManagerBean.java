/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import com.istlbd.utils.Defs;
import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioRole;
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
public class RoleEntityManagerBean extends BaseEntityManager implements Serializable {

    public RoleEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BioRole bioRoleEO) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bioRoleEO);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void update(BioRole bioRoleEO) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bioRoleEO = em.merge(bioRoleEO);
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
            BioRole roleEO = new BioRole();
            try {
                roleEO = em.getReference(BioRole.class, id);
                roleEO.getId();
            } catch (EntityNotFoundException enf) {
                if (Defs.isDebug) {
                    enf.printStackTrace();
                }
                throw new EntityNotFoundException("The user with id " + id + " does not exits in database");
            }
            em.remove(roleEO);
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
    /*
     INSERT INTO `bio_enroll`.`bio_role` (`ID`, `ROLENAME`, `ROLE_DESCRIPTION`, `STATUS`, `CREATED_BY`, `CREATION_DATE`, `LAST_UPDATED_BY`, `LAST_UPDATE_DATE`) 
     VALUES ('1', 'Admin', 'Admin', 'ACTIVE', 'Munna', CURRENT_TIMESTAMP, 'CURRENT_TIMESTAMP', 'CURRENT_TIMESTAMP');
 
     */

    public Object getMinimumRoleInfo(int startIndex, int limit, String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select o.id, o.rolename, o.roleDescription, o.status from BioRole o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return selectQuery.setHint(CacheUsage.NoCache, CacheUsage.DoNotCheckCache).setFirstResult(startIndex).setMaxResults(limit).getResultList();
    }

    public long getMinimumRoleInfoCount(String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select count(o.id) from BioRole o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return ((Long) selectQuery.getSingleResult());
    }

    public Object findBioRoleByName(String roleName) {
        EntityManager em = getEntityManager();
        try {
            String query = "select o.id, o.rolename, o.role_description, o.status from BioRole o where o.rolename = '" + roleName + "' and o.status = 'ACTIVE'";
            System.out.println("query=" + query);
            Query selectQuery = em.createQuery(query);
            return selectQuery.setHint(CacheUsage.NoCache, CacheUsage.DoNotCheckCache).getSingleResult();
        } finally {
            em.close();
        }
    }

    private List<BioRole> findRoleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BioRole.class));
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

    public List<BioRole> findRoleEntities() {
        return findRoleEntities(true, -1, -1);
    }

    public BioRole findBioRole(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BioRole.class, id);
        } finally {
            em.close();
        }
    }
}
