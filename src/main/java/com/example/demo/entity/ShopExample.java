package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTenantNameIsNull() {
            addCriterion("tenant_name is null");
            return (Criteria) this;
        }

        public Criteria andTenantNameIsNotNull() {
            addCriterion("tenant_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenantNameEqualTo(String value) {
            addCriterion("tenant_name =", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotEqualTo(String value) {
            addCriterion("tenant_name <>", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameGreaterThan(String value) {
            addCriterion("tenant_name >", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_name >=", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLessThan(String value) {
            addCriterion("tenant_name <", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLessThanOrEqualTo(String value) {
            addCriterion("tenant_name <=", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLike(String value) {
            addCriterion("tenant_name like", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotLike(String value) {
            addCriterion("tenant_name not like", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameIn(List<String> values) {
            addCriterion("tenant_name in", values, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotIn(List<String> values) {
            addCriterion("tenant_name not in", values, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameBetween(String value1, String value2) {
            addCriterion("tenant_name between", value1, value2, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotBetween(String value1, String value2) {
            addCriterion("tenant_name not between", value1, value2, "tenantName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRentStartDateIsNull() {
            addCriterion("rent_start_date is null");
            return (Criteria) this;
        }

        public Criteria andRentStartDateIsNotNull() {
            addCriterion("rent_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andRentStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("rent_start_date =", value, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rent_start_date <>", value, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rent_start_date >", value, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_start_date >=", value, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateLessThan(Date value) {
            addCriterionForJDBCDate("rent_start_date <", value, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_start_date <=", value, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("rent_start_date in", values, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rent_start_date not in", values, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_start_date between", value1, value2, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_start_date not between", value1, value2, "rentStartDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateIsNull() {
            addCriterion("rent_end_date is null");
            return (Criteria) this;
        }

        public Criteria andRentEndDateIsNotNull() {
            addCriterion("rent_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andRentEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date =", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date <>", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rent_end_date >", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date >=", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateLessThan(Date value) {
            addCriterionForJDBCDate("rent_end_date <", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date <=", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("rent_end_date in", values, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rent_end_date not in", values, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_end_date between", value1, value2, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_end_date not between", value1, value2, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIsNull() {
            addCriterion("monthly_rent is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIsNotNull() {
            addCriterion("monthly_rent is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentEqualTo(BigDecimal value) {
            addCriterion("monthly_rent =", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotEqualTo(BigDecimal value) {
            addCriterion("monthly_rent <>", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentGreaterThan(BigDecimal value) {
            addCriterion("monthly_rent >", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_rent >=", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentLessThan(BigDecimal value) {
            addCriterion("monthly_rent <", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_rent <=", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIn(List<BigDecimal> values) {
            addCriterion("monthly_rent in", values, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotIn(List<BigDecimal> values) {
            addCriterion("monthly_rent not in", values, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_rent between", value1, value2, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_rent not between", value1, value2, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andIsVacantIsNull() {
            addCriterion("is_vacant is null");
            return (Criteria) this;
        }

        public Criteria andIsVacantIsNotNull() {
            addCriterion("is_vacant is not null");
            return (Criteria) this;
        }

        public Criteria andIsVacantEqualTo(Boolean value) {
            addCriterion("is_vacant =", value, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantNotEqualTo(Boolean value) {
            addCriterion("is_vacant <>", value, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantGreaterThan(Boolean value) {
            addCriterion("is_vacant >", value, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_vacant >=", value, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantLessThan(Boolean value) {
            addCriterion("is_vacant <", value, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantLessThanOrEqualTo(Boolean value) {
            addCriterion("is_vacant <=", value, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantIn(List<Boolean> values) {
            addCriterion("is_vacant in", values, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantNotIn(List<Boolean> values) {
            addCriterion("is_vacant not in", values, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantBetween(Boolean value1, Boolean value2) {
            addCriterion("is_vacant between", value1, value2, "isVacant");
            return (Criteria) this;
        }

        public Criteria andIsVacantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_vacant not between", value1, value2, "isVacant");
            return (Criteria) this;
        }

        public Criteria andHasArrearsIsNull() {
            addCriterion("has_arrears is null");
            return (Criteria) this;
        }

        public Criteria andHasArrearsIsNotNull() {
            addCriterion("has_arrears is not null");
            return (Criteria) this;
        }

        public Criteria andHasArrearsEqualTo(Boolean value) {
            addCriterion("has_arrears =", value, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsNotEqualTo(Boolean value) {
            addCriterion("has_arrears <>", value, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsGreaterThan(Boolean value) {
            addCriterion("has_arrears >", value, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_arrears >=", value, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsLessThan(Boolean value) {
            addCriterion("has_arrears <", value, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsLessThanOrEqualTo(Boolean value) {
            addCriterion("has_arrears <=", value, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsIn(List<Boolean> values) {
            addCriterion("has_arrears in", values, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsNotIn(List<Boolean> values) {
            addCriterion("has_arrears not in", values, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsBetween(Boolean value1, Boolean value2) {
            addCriterion("has_arrears between", value1, value2, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andHasArrearsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_arrears not between", value1, value2, "hasArrears");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateIsNull() {
            addCriterion("last_payment_date is null");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateIsNotNull() {
            addCriterion("last_payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_payment_date =", value, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_payment_date <>", value, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_payment_date >", value, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_payment_date >=", value, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("last_payment_date <", value, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_payment_date <=", value, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_payment_date in", values, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_payment_date not in", values, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_payment_date between", value1, value2, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastPaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_payment_date not between", value1, value2, "lastPaymentDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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