package com.cdsj.design.web.controller;

import com.cdsj.design.common.commons.DesignResponse;
import com.cdsj.design.common.commons.ResultEnum;
import com.cdsj.design.dal.mapper.TbMgrDesignerMapper;
import com.cdsj.design.dal.model.TbMgrDesigner;
import com.cdsj.design.web.service.TbMgrDesignerService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Package com.cdsj.design.mgr.controller
 * @Description: 设计师注册类
 * @date 2018/9/26 20:02
 */
@RestController
@RequestMapping("/api/register")
public class DesignerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private TbMgrDesignerMapper tbMgrDesignerMapper;
    @Autowired
    private TbMgrDesignerService tbMgrDesignerService;

    @PostMapping("/designer")
    public DesignResponse<TbMgrDesigner> createDesigner(@Valid @RequestBody TbMgrDesigner tbMgrDesigner){
        tbMgrDesignerService.saveDesigner(tbMgrDesigner);

        return DesignResponse.success(ResultEnum.SUCCESS, tbMgrDesigner);
    }

    @DeleteMapping("/designer/{loginid}")
    public DesignResponse<TbMgrDesigner> removeDesigner(@PathVariable("loginid") Long desNo){
        try {
            tbMgrDesignerService.deleteDesigner(desNo);
        }catch (Exception e){
            logger.error("删除客户异常{}", e);
            return DesignResponse.success(ResultEnum.FAIL, desNo);
        }

        return DesignResponse.success(ResultEnum.SUCCESS, desNo);
    }

    @PatchMapping("/designer")
    public DesignResponse<TbMgrDesigner> modifyDesigner(@RequestBody TbMgrDesigner tbMgrDesigner){
        Long desNo = tbMgrDesigner.getDesNo();
        tbMgrDesignerMapper.updateByPrimaryKey(tbMgrDesigner);
        tbMgrDesigner = tbMgrDesignerMapper.selectByPrimaryKey(desNo);
        return DesignResponse.success(ResultEnum.SUCCESS, tbMgrDesigner);
    }

    @GetMapping("/designer")
    public DesignResponse<TbMgrDesigner> queryDesigner(@RequestParam("loginid") Long desNo){
        TbMgrDesigner tbMgrDesigner = tbMgrDesignerMapper.selectByPrimaryKey(desNo);
        return DesignResponse.success(ResultEnum.SUCCESS, tbMgrDesigner);
    }

    @GetMapping("/designer/list")
    public DesignResponse<TbMgrDesigner> queryPage(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                                   @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                   @RequestParam String status){
        PageInfo<TbMgrDesigner> pageInfo = tbMgrDesignerService.pageList(pageNo, pageSize, status);
        return DesignResponse.success(ResultEnum.SUCCESS, pageInfo);
    }

}