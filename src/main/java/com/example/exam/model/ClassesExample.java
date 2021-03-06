package com.example.exam.model;

import java.util.ArrayList;
import java.util.List;

public class ClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassesExample() {
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

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andClassesNameIsNull() {
            addCriterion("classes_name is null");
            return (Criteria) this;
        }

        public Criteria andClassesNameIsNotNull() {
            addCriterion("classes_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassesNameEqualTo(String value) {
            addCriterion("classes_name =", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotEqualTo(String value) {
            addCriterion("classes_name <>", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameGreaterThan(String value) {
            addCriterion("classes_name >", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameGreaterThanOrEqualTo(String value) {
            addCriterion("classes_name >=", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameLessThan(String value) {
            addCriterion("classes_name <", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameLessThanOrEqualTo(String value) {
            addCriterion("classes_name <=", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameLike(String value) {
            addCriterion("classes_name like", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotLike(String value) {
            addCriterion("classes_name not like", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameIn(List<String> values) {
            addCriterion("classes_name in", values, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotIn(List<String> values) {
            addCriterion("classes_name not in", values, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameBetween(String value1, String value2) {
            addCriterion("classes_name between", value1, value2, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotBetween(String value1, String value2) {
            addCriterion("classes_name not between", value1, value2, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesTimeIsNull() {
            addCriterion("classes_time is null");
            return (Criteria) this;
        }

        public Criteria andClassesTimeIsNotNull() {
            addCriterion("classes_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassesTimeEqualTo(String value) {
            addCriterion("classes_time =", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeNotEqualTo(String value) {
            addCriterion("classes_time <>", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeGreaterThan(String value) {
            addCriterion("classes_time >", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("classes_time >=", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeLessThan(String value) {
            addCriterion("classes_time <", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeLessThanOrEqualTo(String value) {
            addCriterion("classes_time <=", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeLike(String value) {
            addCriterion("classes_time like", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeNotLike(String value) {
            addCriterion("classes_time not like", value, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeIn(List<String> values) {
            addCriterion("classes_time in", values, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeNotIn(List<String> values) {
            addCriterion("classes_time not in", values, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeBetween(String value1, String value2) {
            addCriterion("classes_time between", value1, value2, "classesTime");
            return (Criteria) this;
        }

        public Criteria andClassesTimeNotBetween(String value1, String value2) {
            addCriterion("classes_time not between", value1, value2, "classesTime");
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