package com.cdsj.design.common.exception;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.cdsj.design.common.exception
 * @Description: 异常处理类
 * @date 2018/9/26 16:28
 */
public class ServiceException extends RuntimeException{
    private static final long serialVersionUID = -6575322592656919970L;

    private String code;

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String code, String message){
          super(message);
          this.code = code;
    }

    public ServiceException(String code, String message, Throwable throwable){
        super(message, throwable);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}