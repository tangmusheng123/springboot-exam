package com.example.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
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

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(String value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(String value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(String value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(String value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(String value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLike(String value) {
            addCriterion("question_type like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotLike(String value) {
            addCriterion("question_type not like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<String> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<String> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(String value1, String value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(String value1, String value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIsNull() {
            addCriterion("question_answer is null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIsNotNull() {
            addCriterion("question_answer is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerEqualTo(String value) {
            addCriterion("question_answer =", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotEqualTo(String value) {
            addCriterion("question_answer <>", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerGreaterThan(String value) {
            addCriterion("question_answer >", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("question_answer >=", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLessThan(String value) {
            addCriterion("question_answer <", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLessThanOrEqualTo(String value) {
            addCriterion("question_answer <=", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLike(String value) {
            addCriterion("question_answer like", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotLike(String value) {
            addCriterion("question_answer not like", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIn(List<String> values) {
            addCriterion("question_answer in", values, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotIn(List<String> values) {
            addCriterion("question_answer not in", values, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerBetween(String value1, String value2) {
            addCriterion("question_answer between", value1, value2, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotBetween(String value1, String value2) {
            addCriterion("question_answer not between", value1, value2, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNull() {
            addCriterion("question_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNotNull() {
            addCriterion("question_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeEqualTo(String value) {
            addCriterion("question_time =", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotEqualTo(String value) {
            addCriterion("question_time <>", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThan(String value) {
            addCriterion("question_time >", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("question_time >=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThan(String value) {
            addCriterion("question_time <", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThanOrEqualTo(String value) {
            addCriterion("question_time <=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLike(String value) {
            addCriterion("question_time like", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotLike(String value) {
            addCriterion("question_time not like", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIn(List<String> values) {
            addCriterion("question_time in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotIn(List<String> values) {
            addCriterion("question_time not in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeBetween(String value1, String value2) {
            addCriterion("question_time between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotBetween(String value1, String value2) {
            addCriterion("question_time not between", value1, value2, "questionTime");
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