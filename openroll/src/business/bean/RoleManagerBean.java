/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

import business.entity.BioRole;
import com.istlbd.utils.Defs;
import database.bean.RoleEntityManagerBean;
import database.bean.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import remote.dao.ServiceException;
import ws.response.GetRoleSummaryResponse;

/**
 *
 * @author Ataur Rahman
 */
public class RoleManagerBean {

    public Object createUpdateRole(BioRole bioRoleBO) throws ServiceException {
        boolean isUpdate = false;
        RoleEntityManagerBean rem = new RoleEntityManagerBean();
        database.entity.BioRole bioRoleEO = new database.entity.BioRole();

        if (bioRoleBO.getId() != null && bioRoleBO.getId() > 0) {
            bioRoleEO.setId(bioRoleBO.getId());
            isUpdate = true;
        }

        bioRoleEO.setRolename(bioRoleBO.getRolename());
        bioRoleEO.setRoleDescription(bioRoleBO.getRoleDescription());


        bioRoleEO.setStatus(Defs.STATUS_ACTIVE);
        bioRoleEO.setCreatedBy(bioRoleBO.getCreatedBy());
        if (bioRoleBO.getCreationDate() == null || bioRoleBO.getCreationDate().isEmpty()) {
            bioRoleEO.setCreationDate(new Date());
        } else {
            bioRoleEO.setCreationDate(Utils.getStringToDate(bioRoleBO.getCreationDate()));
        }
        if(bioRoleBO.getLastUpdatedBy() == null || bioRoleBO.getLastUpdatedBy().isEmpty())
            bioRoleEO.setLastUpdatedBy("dummy");
        else bioRoleEO.setLastUpdatedBy(bioRoleBO.getLastUpdatedBy());
        
        
        
        if (bioRoleBO.getLastUpdateDate() == null || bioRoleBO.getLastUpdateDate().isEmpty()) {
            bioRoleEO.setLastUpdateDate(new Date());
        } else {
            bioRoleEO.setLastUpdateDate(Utils.getStringToDate(bioRoleBO.getLastUpdateDate()));
        }
        if(bioRoleBO.getCreatedBy()== null || bioRoleBO.getCreatedBy().isEmpty())
            bioRoleEO.setCreatedBy("dummy");
        else bioRoleEO.setCreatedBy(bioRoleBO.getCreatedBy());
        if (isUpdate) {
            try {
                rem.update(bioRoleEO);
            } catch (NonexistentEntityException ne) {
                if (Defs.isDebug) {
                    ne.printStackTrace();
                }
                throw new ServiceException(ne.getMessage(), Defs.ERROR_CODE_UPDATE);

            } catch (Exception e) {
                if (Defs.isDebug) {
                    e.printStackTrace();
                }
                return new ServiceException(e.getMessage(), Defs.ERROR_CODE_UPDATE);

            }
        } else {
            try {
                rem.create(bioRoleEO);
                bioRoleEO.setId(bioRoleEO.getId());
            } catch (Exception e) {
                if (Defs.isDebug) {
                    e.printStackTrace();
                }
                return new ServiceException(e.getMessage(), Defs.ERROR_CODE_CREATE);
            }
        }
        return bioRoleEO;
    }

    public Object deleteUser(BioRole bioRoleBO) {

        RoleEntityManagerBean rem = new RoleEntityManagerBean();
        database.entity.BioRole bioRoleEO = new database.entity.BioRole();

        if (bioRoleBO.getId() != null && bioRoleBO.getId() > 0) {
            try {
                rem.delete(bioRoleBO.getId().intValue());
            } catch (EntityNotFoundException e) {
                if (Defs.isDebug) {
                    e.printStackTrace();
                }
                return new ServiceException(e.getMessage(), Defs.ERROR_CODE_DELETE);
            } catch (Exception ex) {
                if (Defs.isDebug) {
                    ex.printStackTrace();
                }
                return new ServiceException(ex.getMessage(), Defs.ERROR_CODE_DELETE);
            }

        } else {
            return new ServiceException("No User ID Found to delete", Defs.ERROR_CODE_DELETE);
        }

        return bioRoleBO;
    }

    public GetRoleSummaryResponse getAdvancedSearchRoleInfo(Long startIndex, Long limit, BioRole role) {
        GetRoleSummaryResponse resp = new GetRoleSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioRole> roleInfoList = new ArrayList<BioRole>();

            RoleEntityManagerBean remb = new RoleEntityManagerBean();

            String where = "";

            where += Utils.buildJPQLLikeQuery("o.rolename", role.getRolename());

//select o.id, o.rolename, o.role_description, o.status from BioRole o where 
            Object object = remb.getMinimumRoleInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioRole info = new BioRole();
                    info.setId((Long) objArr[0]);

                    try {
                        info.setRolename((String) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setRoleDescription((String) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setStatus((String) objArr[3]);
                    } catch (Exception e) {
                    }

                    roleInfoList.add(info);
                }
            }




            Long totalResult = remb.getMinimumRoleInfoCount(where);
            resp.setRoleList(roleInfoList);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setRoleList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }

    public GetRoleSummaryResponse getSingleRoleInfo(String id) {
        GetRoleSummaryResponse resp = new GetRoleSummaryResponse();
        BioRole roleInfo = null;
        try {
            RoleEntityManagerBean bpm = new RoleEntityManagerBean();
            database.entity.BioRole roleEO = bpm.findBioRole(Long.parseLong(id));
            if (roleEO != null) {
                roleInfo = new BioRole(roleEO);
            }
            resp.setSingleUser(roleInfo);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
        }
        return resp;
    }
}
