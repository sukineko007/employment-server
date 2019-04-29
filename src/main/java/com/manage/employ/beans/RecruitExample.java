package com.manage.employ.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnterIdIsNull() {
            addCriterion("enter_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterIdIsNotNull() {
            addCriterion("enter_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterIdEqualTo(Integer value) {
            addCriterion("enter_id =", value, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdNotEqualTo(Integer value) {
            addCriterion("enter_id <>", value, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdGreaterThan(Integer value) {
            addCriterion("enter_id >", value, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_id >=", value, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdLessThan(Integer value) {
            addCriterion("enter_id <", value, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdLessThanOrEqualTo(Integer value) {
            addCriterion("enter_id <=", value, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdIn(List<Integer> values) {
            addCriterion("enter_id in", values, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdNotIn(List<Integer> values) {
            addCriterion("enter_id not in", values, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdBetween(Integer value1, Integer value2) {
            addCriterion("enter_id between", value1, value2, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_id not between", value1, value2, "enterId");
            return (Criteria) this;
        }

        public Criteria andEnterNameIsNull() {
            addCriterion("enter_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterNameIsNotNull() {
            addCriterion("enter_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterNameEqualTo(String value) {
            addCriterion("enter_name =", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameNotEqualTo(String value) {
            addCriterion("enter_name <>", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameGreaterThan(String value) {
            addCriterion("enter_name >", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameGreaterThanOrEqualTo(String value) {
            addCriterion("enter_name >=", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameLessThan(String value) {
            addCriterion("enter_name <", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameLessThanOrEqualTo(String value) {
            addCriterion("enter_name <=", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameLike(String value) {
            addCriterion("enter_name like", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameNotLike(String value) {
            addCriterion("enter_name not like", value, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameIn(List<String> values) {
            addCriterion("enter_name in", values, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameNotIn(List<String> values) {
            addCriterion("enter_name not in", values, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameBetween(String value1, String value2) {
            addCriterion("enter_name between", value1, value2, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterNameNotBetween(String value1, String value2) {
            addCriterion("enter_name not between", value1, value2, "enterName");
            return (Criteria) this;
        }

        public Criteria andEnterInfoIsNull() {
            addCriterion("enter_info is null");
            return (Criteria) this;
        }

        public Criteria andEnterInfoIsNotNull() {
            addCriterion("enter_info is not null");
            return (Criteria) this;
        }

        public Criteria andEnterInfoEqualTo(String value) {
            addCriterion("enter_info =", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoNotEqualTo(String value) {
            addCriterion("enter_info <>", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoGreaterThan(String value) {
            addCriterion("enter_info >", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoGreaterThanOrEqualTo(String value) {
            addCriterion("enter_info >=", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoLessThan(String value) {
            addCriterion("enter_info <", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoLessThanOrEqualTo(String value) {
            addCriterion("enter_info <=", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoLike(String value) {
            addCriterion("enter_info like", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoNotLike(String value) {
            addCriterion("enter_info not like", value, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoIn(List<String> values) {
            addCriterion("enter_info in", values, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoNotIn(List<String> values) {
            addCriterion("enter_info not in", values, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoBetween(String value1, String value2) {
            addCriterion("enter_info between", value1, value2, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterInfoNotBetween(String value1, String value2) {
            addCriterion("enter_info not between", value1, value2, "enterInfo");
            return (Criteria) this;
        }

        public Criteria andEnterMajorIsNull() {
            addCriterion("enter_major is null");
            return (Criteria) this;
        }

        public Criteria andEnterMajorIsNotNull() {
            addCriterion("enter_major is not null");
            return (Criteria) this;
        }

        public Criteria andEnterMajorEqualTo(String value) {
            addCriterion("enter_major =", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorNotEqualTo(String value) {
            addCriterion("enter_major <>", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorGreaterThan(String value) {
            addCriterion("enter_major >", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorGreaterThanOrEqualTo(String value) {
            addCriterion("enter_major >=", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorLessThan(String value) {
            addCriterion("enter_major <", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorLessThanOrEqualTo(String value) {
            addCriterion("enter_major <=", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorLike(String value) {
            addCriterion("enter_major like", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorNotLike(String value) {
            addCriterion("enter_major not like", value, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorIn(List<String> values) {
            addCriterion("enter_major in", values, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorNotIn(List<String> values) {
            addCriterion("enter_major not in", values, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorBetween(String value1, String value2) {
            addCriterion("enter_major between", value1, value2, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterMajorNotBetween(String value1, String value2) {
            addCriterion("enter_major not between", value1, value2, "enterMajor");
            return (Criteria) this;
        }

        public Criteria andEnterAddressIsNull() {
            addCriterion("enter_address is null");
            return (Criteria) this;
        }

        public Criteria andEnterAddressIsNotNull() {
            addCriterion("enter_address is not null");
            return (Criteria) this;
        }

        public Criteria andEnterAddressEqualTo(String value) {
            addCriterion("enter_address =", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotEqualTo(String value) {
            addCriterion("enter_address <>", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressGreaterThan(String value) {
            addCriterion("enter_address >", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("enter_address >=", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressLessThan(String value) {
            addCriterion("enter_address <", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressLessThanOrEqualTo(String value) {
            addCriterion("enter_address <=", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressLike(String value) {
            addCriterion("enter_address like", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotLike(String value) {
            addCriterion("enter_address not like", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressIn(List<String> values) {
            addCriterion("enter_address in", values, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotIn(List<String> values) {
            addCriterion("enter_address not in", values, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressBetween(String value1, String value2) {
            addCriterion("enter_address between", value1, value2, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotBetween(String value1, String value2) {
            addCriterion("enter_address not between", value1, value2, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andHrNameIsNull() {
            addCriterion("hr_name is null");
            return (Criteria) this;
        }

        public Criteria andHrNameIsNotNull() {
            addCriterion("hr_name is not null");
            return (Criteria) this;
        }

        public Criteria andHrNameEqualTo(String value) {
            addCriterion("hr_name =", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotEqualTo(String value) {
            addCriterion("hr_name <>", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameGreaterThan(String value) {
            addCriterion("hr_name >", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameGreaterThanOrEqualTo(String value) {
            addCriterion("hr_name >=", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameLessThan(String value) {
            addCriterion("hr_name <", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameLessThanOrEqualTo(String value) {
            addCriterion("hr_name <=", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameLike(String value) {
            addCriterion("hr_name like", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotLike(String value) {
            addCriterion("hr_name not like", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameIn(List<String> values) {
            addCriterion("hr_name in", values, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotIn(List<String> values) {
            addCriterion("hr_name not in", values, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameBetween(String value1, String value2) {
            addCriterion("hr_name between", value1, value2, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotBetween(String value1, String value2) {
            addCriterion("hr_name not between", value1, value2, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrPhoneIsNull() {
            addCriterion("hr_phone is null");
            return (Criteria) this;
        }

        public Criteria andHrPhoneIsNotNull() {
            addCriterion("hr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHrPhoneEqualTo(String value) {
            addCriterion("hr_phone =", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotEqualTo(String value) {
            addCriterion("hr_phone <>", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneGreaterThan(String value) {
            addCriterion("hr_phone >", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hr_phone >=", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneLessThan(String value) {
            addCriterion("hr_phone <", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneLessThanOrEqualTo(String value) {
            addCriterion("hr_phone <=", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneLike(String value) {
            addCriterion("hr_phone like", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotLike(String value) {
            addCriterion("hr_phone not like", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneIn(List<String> values) {
            addCriterion("hr_phone in", values, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotIn(List<String> values) {
            addCriterion("hr_phone not in", values, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneBetween(String value1, String value2) {
            addCriterion("hr_phone between", value1, value2, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotBetween(String value1, String value2) {
            addCriterion("hr_phone not between", value1, value2, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrMailboxIsNull() {
            addCriterion("hr_mailbox is null");
            return (Criteria) this;
        }

        public Criteria andHrMailboxIsNotNull() {
            addCriterion("hr_mailbox is not null");
            return (Criteria) this;
        }

        public Criteria andHrMailboxEqualTo(String value) {
            addCriterion("hr_mailbox =", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxNotEqualTo(String value) {
            addCriterion("hr_mailbox <>", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxGreaterThan(String value) {
            addCriterion("hr_mailbox >", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("hr_mailbox >=", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxLessThan(String value) {
            addCriterion("hr_mailbox <", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxLessThanOrEqualTo(String value) {
            addCriterion("hr_mailbox <=", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxLike(String value) {
            addCriterion("hr_mailbox like", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxNotLike(String value) {
            addCriterion("hr_mailbox not like", value, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxIn(List<String> values) {
            addCriterion("hr_mailbox in", values, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxNotIn(List<String> values) {
            addCriterion("hr_mailbox not in", values, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxBetween(String value1, String value2) {
            addCriterion("hr_mailbox between", value1, value2, "hrMailbox");
            return (Criteria) this;
        }

        public Criteria andHrMailboxNotBetween(String value1, String value2) {
            addCriterion("hr_mailbox not between", value1, value2, "hrMailbox");
            return (Criteria) this;
        }
    }

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