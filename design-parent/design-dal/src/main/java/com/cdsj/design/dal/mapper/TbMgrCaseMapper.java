package com.cdsj.design.dal.mapper;

import com.cdsj.design.dal.model.TbMgrCase;
import com.cdsj.design.dal.model.TbMgrCaseExample;
import org.springframework.stereotype.Repository;

/**
 * TbMgrCaseMapper继承基类
 */
@Repository
public interface TbMgrCaseMapper extends MyBatisBaseMapper<TbMgrCase, Long, TbMgrCaseExample> {
}