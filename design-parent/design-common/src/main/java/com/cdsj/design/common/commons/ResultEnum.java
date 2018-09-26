package com.cdsj.design.common.commons;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.cdsj.design.common.commons
 * @Description: 返回码
 * @date 2018/9/26 116:11
 */
public enum ResultEnum {

    SUCCESS(0000, "成功"),
    PARAM_INVALID(1001, "参数无效"),
    PARAM_EMPTY(1002, "参数为空"),
    FAIL(1111, "失败");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public static ResultEnum getByCode(Integer code){
        if(code == null){
            return null;
        }
        for(ResultEnum item : ResultEnum.values()){
            if(item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
