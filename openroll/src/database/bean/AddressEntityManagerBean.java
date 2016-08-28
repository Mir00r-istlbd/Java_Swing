/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.bean;

import database.bean.exceptions.NonexistentEntityException;
import database.entity.*;
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
public class AddressEntityManagerBean extends BaseEntityManager implements Serializable {

    public AddressEntityManagerBean() {
        this.emf = getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Division division) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(division);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editDivision(Division division) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            division = em.merge(division);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = division.getPkId();
                if (findDivision(id) == null) {
                    throw new NonexistentEntityException("The division with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroyDivision(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Division division;
            try {
                division = em.getReference(Division.class, id);
                division.getPkId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The division with id " + id + " no longer exists.", enfe);
            }
            em.remove(division);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Division> findDivisionEntities() {
        return findDivisionEntities(true, -1, -1);
    }

    public List<Division> findDivisionEntities(int maxResults, int firstResult) {
        return findDivisionEntities(false, maxResults, firstResult);
    }

    private List<Division> findDivisionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Division.class));
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

    public Division findDivision(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Division.class, id);
        } finally {
            em.close();
        }
    }

    public int getDivisionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Division> rt = cq.from(Division.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
 
    
    public List<District> getDistrictFindByDivisionId(Integer divisionId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("District.findByDivision").setParameter("division", divisionId).getResultList();
    }
    
    //new function for finding village id by name
        public String getVilageIdFindByVillageName(String name) {
        if(name.equals("")){
            return "";
        }else{
            name=name.toUpperCase();
            EntityManager em=getEntityManager();
        String str=em.createNamedQuery("Village.findByName").setParameter("name", name).getResultList().toString();
        String str_test=str.replaceAll("[^0-9]","");
        if(str_test.equals("")){
           str=em.createNamedQuery("Village.findByNameEn").setParameter("nameEn", name).getResultList().toString();
        }
        
        String [] list=str.split(",");
        //this is to replace all the other things except number
        list[0]=list[0].replaceAll("[^0-9]","");
        if(list[0].equals(""))
        {
            return "99999999999999";
        }else{
            return list[0];
        }
        
        }
            
    }
    
    
    public List<Upozila> getUpozilaFindByDistrictId(Integer districtId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("Upozila.findByDistrict").setParameter("district", districtId).getResultList();
    }

    public List<District> findDistrictEntities() {
        return findDistrictEntities(true, -1, -1);
    }
    
    private List<District> findDistrictEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(District.class));
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
    
    public List<City> getCityFindByDistUpoAndRmo(String districtId, String upozilaId, String Rmo) {
        EntityManager em=getEntityManager();
//        Query q = em.createQuery("SELECT c FROM City c WHERE c.name = :name");
//        q.setParameter("name", "a");
        return em.createNamedQuery("City.findByDistrictUpozilaRmo")
                .setParameter("district", districtId.trim())
                .setParameter("upozila", upozilaId.trim())
                .setParameter("rmo", Rmo.trim())
                .getResultList();
    }
    
    public List<Eunion> getEunionByUpoAndCity(Integer upozilaId, Integer cityId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("Eunion.findByUpozilaAndCity")
                .setParameter("upozila", upozilaId)
                .setParameter("city", cityId)
                .getResultList();
    }
    
    public List<Area> getMouzaByEunion(Integer eunionId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("Area.findByEunion")
                .setParameter("eunion", eunionId)
                .getResultList();
    }
    
    public List<Village> getVillageByMouza(String mouzaId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("Village.findByArea")
                .setParameter("area", mouzaId.trim())
                .getResultList();
    }
    
    public List<Postoffice> getPostOfficeByDistrict(String districtId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("Postoffice.findByZillaid")
                .setParameter("zillaid", districtId.trim())
                .getResultList();
    }
    
    public List<Postoffice> getPostCodeByPostOffice(Integer postofficeId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("Postoffice.findById")
                .setParameter("id", postofficeId)
                .getResultList();
    }
    
    public List<VoterArea> getVoterAreaByEunion(String eunionId) {
        EntityManager em=getEntityManager();
        return em.createNamedQuery("VoterArea.findByEunion")
                .setParameter("eunion", eunionId)
                .getResultList();
    }
    
}
