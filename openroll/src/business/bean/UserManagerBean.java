/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

import business.entity.BioUser;
import com.istlbd.utils.Defs;
import database.bean.UserEntityManagerBean;
import database.bean.exceptions.NonexistentEntityException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import remote.dao.ServiceException;
import ws.response.GetUserSummaryResponse;


/**
 *
 * @author Ataur Rahman
 */
public class UserManagerBean {
    
    public Object createUpdateUser(BioUser bioUserBO) throws ServiceException, NoSuchAlgorithmException 
    {
        boolean isUpdate=false;
        UserEntityManagerBean uem=new UserEntityManagerBean();
        
        database.entity.BioUser bioUserEO=new database.entity.BioUser();
        
        if(bioUserBO.getId()!=null && bioUserBO.getId()>0)
        {
            bioUserEO.setId(bioUserBO.getId());
            isUpdate=true;
        }
        bioUserEO.setUsername(bioUserBO.getUsername());
        bioUserEO.setFullName(bioUserBO.getFullName());
        bioUserEO.setPassword(bioUserBO.getPassword());
        bioUserEO.setEmail(bioUserBO.getEmail());
        bioUserEO.setPhoneNo(bioUserBO.getPhoneNo());
        bioUserEO.setDesignation(bioUserBO.getDesignation());
        bioUserEO.setNationalIdNo(bioUserBO.getNationalIdNo());
        bioUserEO.setStatus(Defs.STATUS_ACTIVE);
        bioUserEO.setCreatedBy(bioUserBO.getCreatedBy());
        if(bioUserBO.getRoleId()!= null)
            bioUserEO.setRoleId(BigInteger.valueOf(bioUserBO.getRoleId()));
        else 
            bioUserEO.setRoleId(null);
        
        if(bioUserBO.getCreationDate()== null || bioUserBO.getCreationDate().isEmpty())
            bioUserEO.setCreationDate(new Date());
        else 
            bioUserEO.setCreationDate(Utils.getStringToDate(bioUserBO.getCreationDate()));
        
        bioUserEO.setLastUpdatedBy(bioUserBO.getLastUpdatedBy());
        if(bioUserBO.getLastUpdateDate() == null || bioUserBO.getLastUpdateDate().isEmpty())
            bioUserEO.setLastUpdateDate(new Date());
        else
            bioUserEO.setLastUpdateDate(Utils.getStringToDate(bioUserBO.getLastUpdateDate()));
        
        
        if(bioUserBO.getCreatedBy()==null || bioUserBO.getCreatedBy().isEmpty())
        {
            bioUserBO.setCreatedBy("modhu");
            bioUserEO.setCreatedBy("modhu");
        }
        if(bioUserBO.getLastUpdatedBy()==null || bioUserBO.getLastUpdatedBy().isEmpty())
        {
            bioUserBO.setLastUpdatedBy("modhu");
            bioUserEO.setLastUpdatedBy("modhu");
        }
        
        Date curDate=new Date();
        if(!isUpdate)
        {
            
            bioUserEO.setCreationDate(curDate);
            bioUserBO.setCreationDate(Utils.getDateToString(curDate));
        }
        
        bioUserEO.setLastUpdateDate(curDate);
        bioUserBO.setLastUpdateDate(Utils.getDateToString(curDate));        
        
        bioUserBO.setStatus("ACTIVE");
        bioUserEO.setStatus("ACTIVE");
      
//
        
        if(isUpdate)
        {
            try{
                uem.update(bioUserEO);
            }catch (NonexistentEntityException ne){
                if(Defs.isDebug)
                    ne.printStackTrace();
                return new ServiceException(ne.getMessage(),Defs.ERROR_CODE_UPDATE);
                
            }
            catch(Exception e){
                if(Defs.isDebug)
                    e.printStackTrace();
                return new ServiceException(e.getMessage(),Defs.ERROR_CODE_UPDATE);
                
            }
        }
        else
        {  
            try{
                uem.create(bioUserEO);
                bioUserBO.setId(bioUserEO.getId());
            }
            catch(Exception e){
                if(Defs.isDebug)
                    e.printStackTrace();
                return new ServiceException(e.getMessage(),Defs.ERROR_CODE_CREATE);
                
            }
        }
        return bioUserBO;
    }
    
    
    public Object deleteUser(BioUser bioUserBO) 
    {
        
        UserEntityManagerBean uem=new UserEntityManagerBean();
        
        database.entity.BioUser bioUserEO=new database.entity.BioUser();
        
        if(bioUserBO.getId()!=null && bioUserBO.getId()>0)
        {
            try{
                uem.delete(bioUserBO.getId().intValue());
            }
            catch(EntityNotFoundException e){
                if(Defs.isDebug)
                    e.printStackTrace();
                return new ServiceException(e.getMessage(), Defs.ERROR_CODE_DELETE);
            }
            catch (Exception ex){
                if(Defs.isDebug)
                    ex.printStackTrace();
                return new ServiceException(ex.getMessage(), Defs.ERROR_CODE_DELETE);
            }
            
        }
        else 
            return new ServiceException("No User ID Found to delete", Defs.ERROR_CODE_DELETE);
        
        return bioUserBO;
    }
    

    public GetUserSummaryResponse getAdvancedSearchUserInfo(Long startIndex, Long limit, BioUser user) {
        GetUserSummaryResponse resp = new GetUserSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioUser> userInfo = new ArrayList<BioUser>();

            UserEntityManagerBean bpm = new UserEntityManagerBean();

            String where = "";
            
            where += Utils.buildJPQLLikeQuery("o.username", user.getUsername());

//o.id, o.username, o.fullName, o.designation, o.phoneNo, o.email, o.status
            Object object = bpm.getMinimumUserInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioUser info = new BioUser();
                    info.setId((Long) objArr[0]);
                    
                    try {
                        info.setUsername((String) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setFullName((String) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setDesignation((String) objArr[3]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setPhoneNo((String) objArr[4]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setEmail((String) objArr[5]);
                    } catch (Exception e) {
                    }

                    try {
                        info.setStatus((String) objArr[6]);
                    } catch (Exception e) {
                    }
                    userInfo.add(info);
                }
            }




            Long totalResult = bpm.getMinimumUserInfoCount(where);
            resp.setUserList(userInfo);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setUserList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }
    
    
    public GetUserSummaryResponse getSingleUserInfo(String id) {
        GetUserSummaryResponse resp = new GetUserSummaryResponse();
        BioUser userInfo = null;
        try {
            UserEntityManagerBean bpm = new UserEntityManagerBean();
            database.entity.BioUser userEO = bpm.findBioUser(Long.parseLong(id));
            if (userEO != null) {
                userInfo=new BioUser(userEO);
            }
            resp.setSingleUser(userInfo);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
        }
        return resp;
    }
    
    public GetUserSummaryResponse getSingleUserInfo(String userName,String password) {
        GetUserSummaryResponse resp = new GetUserSummaryResponse();
        BioUser userInfo = null;
        try {
            UserEntityManagerBean bpm = new UserEntityManagerBean();
            database.entity.BioUser userEO = bpm.findBioUser(userName,password);
            if (userEO != null) {
                userInfo=new BioUser(userEO);
            }
            resp.setSingleUser(userInfo);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
        }
        return resp;
    }
    
    
}
