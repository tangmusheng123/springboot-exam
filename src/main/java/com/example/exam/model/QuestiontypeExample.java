package com.example.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestiontypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestiontypeExample() {
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

        public Criteria andQuestiontypeIdIsNull() {
            addCriterion("questiontype_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdIsNotNull() {
            addCriterion("questiontype_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdEqualTo(Integer value) {
            addCriterion("questiontype_id =", value, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdNotEqualTo(Integer value) {
            addCriterion("questiontype_id <>", value, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdGreaterThan(Integer value) {
            addCriterion("questiontype_id >", value, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("questiontype_id >=", value, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdLessThan(Integer value) {
            addCriterion("questiontype_id <", value, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("questiontype_id <=", value, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdIn(List<Integer> values) {
            addCriterion("questiontype_id in", values, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdNotIn(List<Integer> values) {
            addCriterion("questiontype_id not in", values, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdBetween(Integer value1, Integer value2) {
            addCriterion("questiontype_id between", value1, value2, "questiontypeId");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("questiontype_id not between", value1, value2, "questiontypeId");
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

        public Criteria andQuestiontypeTimeIsNull() {
            addCriterion("questiontype_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeIsNotNull() {
            addCriterion("questiontype_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeEqualTo(String value) {
            addCriterion("questiontype_time =", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeNotEqualTo(String value) {
            addCriterion("questiontype_time <>", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeGreaterThan(String value) {
            addCriterion("questiontype_time >", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("questiontype_time >=", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeLessThan(String value) {
            addCriterion("questiontype_time <", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeLessThanOrEqualTo(String value) {
            addCriterion("questiontype_time <=", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeLike(String value) {
            addCriterion("questiontype_time like", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeNotLike(String value) {
            addCriterion("questiontype_time not like", value, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeIn(List<String> values) {
            addCriterion("questiontype_time in", values, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeNotIn(List<String> values) {
            addCriterion("questiontype_time not in", values, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeBetween(String value1, String value2) {
            addCriterion("questiontype_time between", value1, value2, "questiontypeTime");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeTimeNotBetween(String value1, String value2) {
            addCriterion("questiontype_time not between", value1, value2, "questiontypeTime");
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