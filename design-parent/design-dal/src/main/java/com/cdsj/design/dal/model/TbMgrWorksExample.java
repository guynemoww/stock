package com.cdsj.design.dal.model;

import java.util.ArrayList;
import java.util.List;

public class TbMgrWorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbMgrWorksExample() {
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

        public Criteria andWorkIdIsNull() {
            addCriterion("WORK_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("WORK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Long value) {
            addCriterion("WORK_ID =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Long value) {
            addCriterion("WORK_ID <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Long value) {
            addCriterion("WORK_ID >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WORK_ID >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Long value) {
            addCriterion("WORK_ID <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Long value) {
            addCriterion("WORK_ID <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Long> values) {
            addCriterion("WORK_ID in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Long> values) {
            addCriterion("WORK_ID not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Long value1, Long value2) {
            addCriterion("WORK_ID between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Long value1, Long value2) {
            addCriterion("WORK_ID not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andDesNoIsNull() {
            addCriterion("DES_NO is null");
            return (Criteria) this;
        }

        public Criteria andDesNoIsNotNull() {
            addCriterion("DES_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDesNoEqualTo(Long value) {
            addCriterion("DES_NO =", value, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoNotEqualTo(Long value) {
            addCriterion("DES_NO <>", value, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoGreaterThan(Long value) {
            addCriterion("DES_NO >", value, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoGreaterThanOrEqualTo(Long value) {
            addCriterion("DES_NO >=", value, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoLessThan(Long value) {
            addCriterion("DES_NO <", value, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoLessThanOrEqualTo(Long value) {
            addCriterion("DES_NO <=", value, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoIn(List<Long> values) {
            addCriterion("DES_NO in", values, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoNotIn(List<Long> values) {
            addCriterion("DES_NO not in", values, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoBetween(Long value1, Long value2) {
            addCriterion("DES_NO between", value1, value2, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesNoNotBetween(Long value1, Long value2) {
            addCriterion("DES_NO not between", value1, value2, "desNo");
            return (Criteria) this;
        }

        public Criteria andDesStyleIsNull() {
            addCriterion("DES_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andDesStyleIsNotNull() {
            addCriterion("DES_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andDesStyleEqualTo(String value) {
            addCriterion("DES_STYLE =", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleNotEqualTo(String value) {
            addCriterion("DES_STYLE <>", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleGreaterThan(String value) {
            addCriterion("DES_STYLE >", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleGreaterThanOrEqualTo(String value) {
            addCriterion("DES_STYLE >=", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleLessThan(String value) {
            addCriterion("DES_STYLE <", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleLessThanOrEqualTo(String value) {
            addCriterion("DES_STYLE <=", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleLike(String value) {
            addCriterion("DES_STYLE like", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleNotLike(String value) {
            addCriterion("DES_STYLE not like", value, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleIn(List<String> values) {
            addCriterion("DES_STYLE in", values, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleNotIn(List<String> values) {
            addCriterion("DES_STYLE not in", values, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleBetween(String value1, String value2) {
            addCriterion("DES_STYLE between", value1, value2, "desStyle");
            return (Criteria) this;
        }

        public Criteria andDesStyleNotBetween(String value1, String value2) {
            addCriterion("DES_STYLE not between", value1, value2, "desStyle");
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