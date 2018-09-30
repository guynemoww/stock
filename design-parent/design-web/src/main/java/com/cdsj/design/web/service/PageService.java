package com.cdsj.design.web.service;

import com.cdsj.design.dal.mapper.MyBatisBaseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.cdsj.design.mgr.service
 * @Description:
 * @date 2018/9/28 15:24
 */
public class PageService<M extends MyBatisBaseMapper, T, E> {
    /**
     * 分页查询
     * @param params
     * @param modelMapper
     * @param example
     * @return
     */
    public PageInfo<T> queryPagination(Map<String, Integer> params,M modelMapper, E example){
        PageHelper.startPage(params.get("pageNo"), params.get("pageSize"));
        List<T> list = modelMapper.selectByExample(example);
        PageInfo<T> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}