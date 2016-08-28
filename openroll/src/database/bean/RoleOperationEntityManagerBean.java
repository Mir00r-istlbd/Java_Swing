/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import com.istlbd.utils.Defs;
import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioRoleOperation;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import org.eclipse.persistence.config.CacheUsage;

/**
 *
 * @author Ataur Rahman
 */
public class RoleOperationEntityManagerBean extends BaseEntityManager implements Serializable {

    public RoleOperationEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(List<BioRoleOperation> bioRoleOperationEOList) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            for (BioRoleOperation op : bioRoleOperationEOList) {
                em.persist(op);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void update(List<BioRoleOperation> bioRoleOperationEOList) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            String query = "delete from  BioRoleOperation o where o.roleId = " + bioRoleOperationEOList.get(0).getRoleId() + " and o.status = 'ACTIVE'";
            System.out.println("query=" + query);
            int result = em.createQuery(query).executeUpdate();
            for (BioRoleOperation op : bioRoleOperationEOList) {
                if(op.getOperationId()!= 0L)
                em.persist(op);
            }
            //bioRoleOperationEO = em.merge(bioRoleOperationEO);
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
            BioRoleOperation bioRoleOperationEO = new BioRoleOperation();
            try {
                bioRoleOperationEO = em.getReference(BioRoleOperation.class, id);
                bioRoleOperationEO.getId();
            } catch (EntityNotFoundException enf) {
                if (Defs.isDebug) {
                    enf.printStackTrace();
                }
                throw new EntityNotFoundException("The user with id " + id + " does not exits in database");
            }
            em.remove(bioRoleOperationEO);
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

    public Object createRoleOperation(int startIndex, int limit, String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select o.id, o.username, o.fullName, o.designation, o.phoneNo, o.email, o.status from BioUser o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return selectQuery.setHint(CacheUsage.NoCache, CacheUsage.DoNotCheckCache).setFirstResult(startIndex).setMaxResults(limit).getResultList();
    }

    public Object getMinimumRoleOperationInfo(int startIndex, int limit, String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select o.id, o.roleId, o.operationId, o.status from BioRoleOperation o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return selectQuery.setHint(CacheUsage.NoCache, CacheUsage.DoNotCheckCache).setFirstResult(startIndex).setMaxResults(limit).getResultList();
    }

    public long getMinimumRoleOperationInfoCount(String where) {
        EntityManager em = null;
        em = getEntityManager();
        String query = "select count(o.id) from BioRoleOperation o where " + where + " o.status = 'ACTIVE'";
        System.out.println("query=" + query);
        Query selectQuery = em.createQuery(query);
        return ((Long) selectQuery.getSingleResult());
    }
}
