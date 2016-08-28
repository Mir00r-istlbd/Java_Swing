/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

import business.entity.BioRoleOperation;
import com.istlbd.utils.Defs;
import database.bean.RoleOperationEntityManagerBean;
import database.bean.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import remote.dao.ServiceException;
import ws.response.GetRoleOperationSummaryResponse;

/**
 * ৮৭
 *
 * @author Ataur Rahman
 */
public class RoleOperationManagerBean {

    public Object createUpdateRoleOperation(BioRoleOperation bioRoleOperationBO, List<Long> operationIdList) throws ServiceException {
        boolean isUpdate = false;
        RoleOperationEntityManagerBean roem = new RoleOperationEntityManagerBean();
        database.entity.BioRoleOperation bioRoleOperationEO; //= new database.entity.BioRoleOperation();
        List<database.entity.BioRoleOperation> bioRoleOperationEOList = new ArrayList<database.entity.BioRoleOperation>();

        if (bioRoleOperationBO != null && bioRoleOperationBO.getRoleId() > 0) {
            isUpdate = true;
        }

        if (operationIdList != null && operationIdList.size() > 0) {
            for (int i = 0; i < operationIdList.size(); i++) {
                bioRoleOperationEO = new database.entity.BioRoleOperation();

                //bioRoleOperationEO.setId(bioRoleOperationBO.getId());
                bioRoleOperationEO.setRoleId(bioRoleOperationBO.getRoleId());
                bioRoleOperationEO.setOperationId(operationIdList.get(i));


                bioRoleOperationEO.setStatus(Defs.STATUS_ACTIVE);
                if (bioRoleOperationBO.getCreatedBy() == null || bioRoleOperationBO.getCreatedBy().isEmpty()) {
                    bioRoleOperationEO.setCreatedBy("dummy");
                } else {
                    bioRoleOperationEO.setCreatedBy(bioRoleOperationBO.getCreatedBy());
                }

                if (bioRoleOperationBO.getCreationDate() == null || bioRoleOperationBO.getCreationDate().isEmpty()) {
                    bioRoleOperationEO.setCreationDate(new Date());
                } else {
                    bioRoleOperationEO.setCreationDate(Utils.getStringToDate(bioRoleOperationBO.getCreationDate()));
                }
                if (bioRoleOperationBO.getLastUpdatedBy() == null || bioRoleOperationBO.getLastUpdatedBy().isEmpty()) {
                    bioRoleOperationEO.setLastUpdatedBy("dummy");
                } else {
                    bioRoleOperationEO.setLastUpdatedBy(bioRoleOperationBO.getLastUpdatedBy());
                }

                if (bioRoleOperationBO.getLastUpdateDate() == null || bioRoleOperationBO.getLastUpdateDate().isEmpty()) {
                    bioRoleOperationEO.setLastUpdateDate(new Date());
                } else {
                    bioRoleOperationEO.setLastUpdateDate(Utils.getStringToDate(bioRoleOperationBO.getLastUpdateDate()));
                }

                bioRoleOperationEOList.add(bioRoleOperationEO);
            }


            if (isUpdate) {
                try {
                    roem.update(bioRoleOperationEOList);
                } catch (NonexistentEntityException ne) {
                    if (Defs.isDebug) {
                        ne.printStackTrace();
                    }
                    throw new ServiceException(ne.getMessage(), Defs.ERROR_CODE_UPDATE);

                } catch (Exception e) {
                    if (Defs.isDebug) {
                        e.printStackTrace();
                    }
                    throw new ServiceException(e.getMessage(), Defs.ERROR_CODE_UPDATE);

                }
            } else {
                try {
                    roem.create(bioRoleOperationEOList);
                    //bioRoleOperationEO.setId(bioRoleOperationEO.getId());
                } catch (Exception e) {
                    if (Defs.isDebug) {
                        e.printStackTrace();
                    }
                    throw new ServiceException(e.getMessage(), Defs.ERROR_CODE_CREATE);
                }
            }
        }
        if (operationIdList != null && operationIdList.size() == 0){
            try {
                bioRoleOperationEOList.add(bioRoleOperationBO.getDatabaseEntityBioRoleOperation(bioRoleOperationBO));
                roem.update(bioRoleOperationEOList);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(RoleOperationManagerBean.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(RoleOperationManagerBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bioRoleOperationEOList;
    }

    public GetRoleOperationSummaryResponse getAdvancedSearchRoleOperationInfo(Long startIndex, Long limit, BioRoleOperation bioRoleOperation) {
        GetRoleOperationSummaryResponse resp = new GetRoleOperationSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioRoleOperation> roleOperationInfoList = new ArrayList<BioRoleOperation>();

            RoleOperationEntityManagerBean remb = new RoleOperationEntityManagerBean();

            String where = "";

            where += Utils.buildEqualQuery("o.roleId", String.valueOf(bioRoleOperation.getRoleId()));

//select o.id, o.rolename, o.role_description, o.status from BioRole o where 
            Object object = remb.getMinimumRoleOperationInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioRoleOperation info = new BioRoleOperation();
                    info.setId((Long) objArr[0]);

                    try {
                        info.setRoleId((Long) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setOperationId((Long) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setStatus((String) objArr[3]);
                    } catch (Exception e) {
                    }

                    roleOperationInfoList.add(info);
                }
            }




            Long totalResult = remb.getMinimumRoleOperationInfoCount(where);
            resp.setRoleOperationList(roleOperationInfoList);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setRoleOperationList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }
    
    
}
