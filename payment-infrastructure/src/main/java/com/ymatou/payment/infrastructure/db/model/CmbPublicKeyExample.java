package com.ymatou.payment.infrastructure.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmbPublicKeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public CmbPublicKeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNull() {
            addCriterion("PublicKey is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNotNull() {
            addCriterion("PublicKey is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyEqualTo(String value) {
            addCriterion("PublicKey =", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotEqualTo(String value) {
            addCriterion("PublicKey <>", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThan(String value) {
            addCriterion("PublicKey >", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PublicKey >=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThan(String value) {
            addCriterion("PublicKey <", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("PublicKey <=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLike(String value) {
            addCriterion("PublicKey like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotLike(String value) {
            addCriterion("PublicKey not like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIn(List<String> values) {
            addCriterion("PublicKey in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotIn(List<String> values) {
            addCriterion("PublicKey not in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyBetween(String value1, String value2) {
            addCriterion("PublicKey between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotBetween(String value1, String value2) {
            addCriterion("PublicKey not between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CreatedTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CreatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CreatedTime =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CreatedTime <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CreatedTime >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedTime >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CreatedTime <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreatedTime <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CreatedTime in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CreatedTime not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CreatedTime between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreatedTime not between", value1, value2, "createdTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated do_not_delete_during_merge Tue Nov 15 20:02:34 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
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