package com.cdsj.design.dal.model;

import java.io.Serializable;

/**
 * tb_mgr_works
 * @author 
 */
public class TbMgrWorks implements Serializable {
    /**
     * 作品主键ID
     */
    private Long workId;

    /**
     * 设计师编号
     */
    private Long desNo;

    /**
     * 作品风格
     */
    private String desStyle;

    private static final long serialVersionUID = 1L;

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public Long getDesNo() {
        return desNo;
    }

    public void setDesNo(Long desNo) {
        this.desNo = desNo;
    }

    public String getDesStyle() {
        return desStyle;
    }

    public void setDesStyle(String desStyle) {
        this.desStyle = desStyle;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbMgrWorks other = (TbMgrWorks) that;
        return (this.getWorkId() == null ? other.getWorkId() == null : this.getWorkId().equals(other.getWorkId()))
            && (this.getDesNo() == null ? other.getDesNo() == null : this.getDesNo().equals(other.getDesNo()))
            && (this.getDesStyle() == null ? other.getDesStyle() == null : this.getDesStyle().equals(other.getDesStyle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkId() == null) ? 0 : getWorkId().hashCode());
        result = prime * result + ((getDesNo() == null) ? 0 : getDesNo().hashCode());
        result = prime * result + ((getDesStyle() == null) ? 0 : getDesStyle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workId=").append(workId);
        sb.append(", desNo=").append(desNo);
        sb.append(", desStyle=").append(desStyle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}