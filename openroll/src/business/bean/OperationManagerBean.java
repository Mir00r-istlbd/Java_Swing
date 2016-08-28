/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

import com.istlbd.utils.Defs;
import database.bean.OperationEntityManagerBean;
import business.entity.BioOperations;
import database.bean.exceptions.NonexistentEntityException;
import database.entity.BioOperation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import remote.dao.ServiceException;
import ws.response.GetOperationSummaryResponse;

/**
 *
 * @author Ataur Rahman
 */
public class OperationManagerBean {

    public Object createUpdateOperation(BioOperations bioOperationBO) {
        boolean isUpdate = false;
        OperationEntityManagerBean rem = new OperationEntityManagerBean();
        database.entity.BioOperation bioOperationEO = new database.entity.BioOperation();

        if (bioOperationBO.getId() != null && bioOperationBO.getId() > 0) {
            bioOperationEO.setId(bioOperationBO.getId());
            isUpdate = true;
        }

        bioOperationEO.setOperationName(bioOperationBO.getOperationName());
        bioOperationEO.setOperationDescription(bioOperationBO.getOperationDescription());


        bioOperationEO.setStatus(Defs.STATUS_ACTIVE);
        bioOperationEO.setCreatedBy(bioOperationBO.getCreatedBy());
        if (bioOperationBO.getCreationDate() == null || bioOperationBO.getCreationDate().isEmpty()) {
            bioOperationEO.setCreationDate(new Date());
        } else {
            bioOperationEO.setCreationDate(Utils.getStringToDate(bioOperationBO.getCreationDate()));
        }

        bioOperationEO.setLastUpdatedBy(bioOperationBO.getLastUpdatedBy());
        if (bioOperationBO.getLastUpdateDate() == null || bioOperationBO.getLastUpdateDate().isEmpty()) {
            bioOperationEO.setLastUpdateDate(new Date());
        } else {
            bioOperationEO.setLastUpdateDate(Utils.getStringToDate(bioOperationBO.getLastUpdateDate()));
        }

        if (isUpdate) {
            try {
                rem.update(bioOperationEO);
            } catch (NonexistentEntityException ne) {
                if (Defs.isDebug) {
                    ne.printStackTrace();
                }
                return new ServiceException(ne.getMessage(), Defs.ERROR_CODE_UPDATE);

            } catch (Exception e) {
                if (Defs.isDebug) {
                    e.printStackTrace();
                }
                return new ServiceException(e.getMessage(), Defs.ERROR_CODE_UPDATE);

            }
        } else {
            try {
                rem.create(bioOperationEO);
                bioOperationEO.setId(bioOperationEO.getId());
            } catch (Exception e) {
                if (Defs.isDebug) {
                    e.printStackTrace();
                }
                return new ServiceException(e.getMessage(), Defs.ERROR_CODE_CREATE);

            }
        }
        return bioOperationEO;
    }

    public Object deleteOperation(BioOperations bioOperationBO) {

        OperationEntityManagerBean rem = new OperationEntityManagerBean();
        database.entity.BioOperation bioOperationEO = new database.entity.BioOperation();

        if (bioOperationBO.getId() != null && bioOperationBO.getId() > 0) {
            try {
                rem.delete(bioOperationBO.getId().intValue());
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

        return bioOperationBO;
    }

    public GetOperationSummaryResponse getAdvancedSearchOperationInfo(Long startIndex, Long limit, BioOperations operation) {
        GetOperationSummaryResponse resp = new GetOperationSummaryResponse();
        try {

            if (startIndex == null || Utils.compareLong(startIndex, 0L)) {
                startIndex = 0L;
            }

            if (limit == null || Utils.compareLong(limit, 0L)) {
                limit = 100L;
            }

            List<BioOperations> operationInfoList = new ArrayList<BioOperations>();

            OperationEntityManagerBean remb = new OperationEntityManagerBean();

            String where = "";

            //where += Utils.buildJPQLLikeQuery("o.id", operation.getId().toString());

//select o.id, o.operationName, o.operationDescription, o.status
            Object object = remb.getMinimumOperationInfo(startIndex.intValue(), limit.intValue(), where);
            if (object != null) {
                List<Object> list = (List<Object>) object;
                for (Object obj : list) {
                    Object[] objArr = (Object[]) obj;
                    BioOperations info = new BioOperations();
                    info.setId((Long) objArr[0]);

                    try {
                        info.setOperationName((String) objArr[1]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setOperationDescription((String) objArr[2]);
                    } catch (Exception e) {
                    }
                    try {
                        info.setStatus((String) objArr[3]);
                    } catch (Exception e) {
                    }

                    operationInfoList.add(info);
                }
            }




            Long totalResult = remb.getMinimumOperationInfoCount(where);
            resp.setOperationList(operationInfoList);
            resp.setTotalResult(totalResult);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setOperationList(null);
            resp.setTotalResult(0L);

        }
        return resp;
    }

    public GetOperationSummaryResponse getSingleOperationInfo(Long id) {
        GetOperationSummaryResponse resp = new GetOperationSummaryResponse();
        business.entity.BioOperations operationInfo = null;
        try {
            OperationEntityManagerBean operationEntityManagerBean = new OperationEntityManagerBean();
            database.entity.BioOperation roleEO = operationEntityManagerBean.findBioOperation(id);
            if (roleEO != null) {
                operationInfo = new BioOperations(roleEO);
            }
            resp.setSingleOperation(operationInfo);
            resp.setOperationStatus(true);
            resp.setErrorMessage(null);
        } catch (Exception ex) {
            resp.setOperationStatus(false);
            resp.setErrorMessage(ex.getMessage());
            resp.setSingleOperation(null);
        }
        return resp;
    }
}
