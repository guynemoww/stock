package com.cdsj.design.dal.model;

import java.util.ArrayList;
import java.util.List;

public class TbMgrCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbMgrCaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Long value) {
            addCriterion("CASE_ID =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Long value) {
            addCriterion("CASE_ID <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Long value) {
            addCriterion("CASE_ID >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CASE_ID >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Long value) {
            addCriterion("CASE_ID <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("CASE_ID <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Long> values) {
            addCriterion("CASE_ID in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Long> values) {
            addCriterion("CASE_ID not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Long value1, Long value2) {
            addCriterion("CASE_ID between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("CASE_ID not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNull() {
            addCriterion("CUS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("CUS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(Long value) {
            addCriterion("CUS_NO =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(Long value) {
            addCriterion("CUS_NO <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(Long value) {
            addCriterion("CUS_NO >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CUS_NO >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(Long value) {
            addCriterion("CUS_NO <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(Long value) {
            addCriterion("CUS_NO <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<Long> values) {
            addCriterion("CUS_NO in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<Long> values) {
            addCriterion("CUS_NO not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(Long value1, Long value2) {
            addCriterion("CUS_NO between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(Long value1, Long value2) {
            addCriterion("CUS_NO not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCasePriceIsNull() {
            addCriterion("CASE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCasePriceIsNotNull() {
            addCriterion("CASE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCasePriceEqualTo(String value) {
            addCriterion("CASE_PRICE =", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceNotEqualTo(String value) {
            addCriterion("CASE_PRICE <>", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceGreaterThan(String value) {
            addCriterion("CASE_PRICE >", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_PRICE >=", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceLessThan(String value) {
            addCriterion("CASE_PRICE <", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceLessThanOrEqualTo(String value) {
            addCriterion("CASE_PRICE <=", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceLike(String value) {
            addCriterion("CASE_PRICE like", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceNotLike(String value) {
            addCriterion("CASE_PRICE not like", value, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceIn(List<String> values) {
            addCriterion("CASE_PRICE in", values, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceNotIn(List<String> values) {
            addCriterion("CASE_PRICE not in", values, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceBetween(String value1, String value2) {
            addCriterion("CASE_PRICE between", value1, value2, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCasePriceNotBetween(String value1, String value2) {
            addCriterion("CASE_PRICE not between", value1, value2, "casePrice");
            return (Criteria) this;
        }

        public Criteria andCaseStyleIsNull() {
            addCriterion("CASE_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andCaseStyleIsNotNull() {
            addCriterion("CASE_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStyleEqualTo(String value) {
            addCriterion("CASE_STYLE =", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleNotEqualTo(String value) {
            addCriterion("CASE_STYLE <>", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleGreaterThan(String value) {
            addCriterion("CASE_STYLE >", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_STYLE >=", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleLessThan(String value) {
            addCriterion("CASE_STYLE <", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleLessThanOrEqualTo(String value) {
            addCriterion("CASE_STYLE <=", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleLike(String value) {
            addCriterion("CASE_STYLE like", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleNotLike(String value) {
            addCriterion("CASE_STYLE not like", value, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleIn(List<String> values) {
            addCriterion("CASE_STYLE in", values, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleNotIn(List<String> values) {
            addCriterion("CASE_STYLE not in", values, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleBetween(String value1, String value2) {
            addCriterion("CASE_STYLE between", value1, value2, "caseStyle");
            return (Criteria) this;
        }

        public Criteria andCaseStyleNotBetween(String value1, String value2) {
            addCriterion("CASE_STYLE not between", value1, value2, "caseStyle");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}