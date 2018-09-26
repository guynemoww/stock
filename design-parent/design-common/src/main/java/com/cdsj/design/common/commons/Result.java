package com.cdsj.design.common.commons;

import java.io.Serializable;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.cdsj.design.common.commons
 * @Description:
 * @date 2018/9/26 11:11
 */
public class Result<T> implements Serializable{
    private int code = 0;
    private String message = "";
    private boolean isSucess = true;
    private T data;







}