package com.cdsj.design.dal.model;

import java.io.Serializable;

/**
 * tb_mgr_case
 * @author 
 */
public class TbMgrCase implements Serializable {
    /**
     * 客户案例表
     */
    private Long caseId;

    /**
     * 客户编号
     */
    private Long cusNo;

    /**
     * 案例价格范围
     */
    private String casePrice;

    /**
     * 案例风格
     */
    private String caseStyle;

    private static final long serialVersionUID = 1L;

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getCusNo() {
        return cusNo;
    }

    public void setCusNo(Long cusNo) {
        this.cusNo = cusNo;
    }

    public String getCasePrice() {
        return casePrice;
    }

    public void setCasePrice(String casePrice) {
        this.casePrice = casePrice;
    }

    public String getCaseStyle() {
        return caseStyle;
    }

    public void setCaseStyle(String caseStyle) {
        this.caseStyle = caseStyle;
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
        TbMgrCase other = (TbMgrCase) that;
        return (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getCusNo() == null ? other.getCusNo() == null : this.getCusNo().equals(other.getCusNo()))
            && (this.getCasePrice() == null ? other.getCasePrice() == null : this.getCasePrice().equals(other.getCasePrice()))
            && (this.getCaseStyle() == null ? other.getCaseStyle() == null : this.getCaseStyle().equals(other.getCaseStyle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getCusNo() == null) ? 0 : getCusNo().hashCode());
        result = prime * result + ((getCasePrice() == null) ? 0 : getCasePrice().hashCode());
        result = prime * result + ((getCaseStyle() == null) ? 0 : getCaseStyle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseId=").append(caseId);
        sb.append(", cusNo=").append(cusNo);
        sb.append(", casePrice=").append(casePrice);
        sb.append(", caseStyle=").append(caseStyle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}