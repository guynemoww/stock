package com.cdsj.design.dal.mapper;

import com.cdsj.design.dal.model.TbMgrWorks;
import com.cdsj.design.dal.model.TbMgrWorksExample;
import org.springframework.stereotype.Repository;

/**
 * TbMgrWorksMapper继承基类
 */
@Repository
public interface TbMgrWorksMapper extends MyBatisBaseMapper<TbMgrWorks, Long, TbMgrWorksExample> {
}