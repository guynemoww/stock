package com.cdsj.design.dal.mapper;

import com.cdsj.design.dal.model.TbMgrCustomer;
import com.cdsj.design.dal.model.TbMgrCustomerExample;
import org.springframework.stereotype.Repository;

/**
 * TbMgrCustomerMapper继承基类
 */
@Repository
public interface TbMgrCustomerMapper extends MyBatisBaseMapper<TbMgrCustomer, Long, TbMgrCustomerExample> {
}