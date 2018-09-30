package com.cdsj.design.web.service;

import com.cdsj.design.dal.mapper.TbMgrDesignerMapper;
import com.cdsj.design.dal.model.TbMgrDesigner;
import com.cdsj.design.dal.model.TbMgrDesignerExample;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class TbMgrDesignerService extends PageService{
    @Resource
    private TbMgrDesignerMapper tbMgrDesignerMapper;

    /**
     * 保存
     * @param tbMgrDesigner
     * @return
     */
    public int saveDesigner(TbMgrDesigner tbMgrDesigner){
        tbMgrDesigner.setStatus("1");
        tbMgrDesigner.setCreateTime(new Date());
        tbMgrDesigner.setUpdateTime(new Date());

        return tbMgrDesignerMapper.insert(tbMgrDesigner);
    }

    /**
     * 删除(将状态置为0)
     * @param desNo
     * @return
     */
    public int deleteDesigner(Long desNo){
        TbMgrDesigner tbMgrDesigner = new TbMgrDesigner();
        tbMgrDesigner.setDesNo(desNo);
        tbMgrDesigner.setStatus("0"); //注销

        return tbMgrDesignerMapper.updateByPrimaryKey(tbMgrDesigner);
    }

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<TbMgrDesigner> pageList(int pageNo, int pageSize, String status){
        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("pageNo",pageNo);
        params.put("pageSize", pageSize);
        TbMgrDesignerExample example = new TbMgrDesignerExample();
        TbMgrDesignerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(status);

        return queryPagination(params, tbMgrDesignerMapper, example);
    }

}
