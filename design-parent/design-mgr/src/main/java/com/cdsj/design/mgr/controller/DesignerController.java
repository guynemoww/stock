package com.cdsj.design.mgr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.cdsj.design.mgr.controller
 * @Description:
 * @date 2018/9/26 20:02
 */
@RestController
@RequestMapping("/register")
public class DesignerController {

    @RequestMapping("/design")
    public String getUser(){
        return "hello design";
    }

}