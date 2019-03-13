package com.example.exam.model;

import java.util.ArrayList;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNull() {
            addCriterion("answer_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNotNull() {
            addCriterion("answer_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeEqualTo(String value) {
            addCriterion("answer_time =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotEqualTo(String value) {
            addCriterion("answer_time <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThan(String value) {
            addCriterion("answer_time >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThanOrEqualTo(String value) {
            addCriterion("answer_time >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThan(String value) {
            addCriterion("answer_time <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThanOrEqualTo(String value) {
            addCriterion("answer_time <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLike(String value) {
            addCriterion("answer_time like", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotLike(String value) {
            addCriterion("answer_time not like", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIn(List<String> values) {
            addCriterion("answer_time in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotIn(List<String> values) {
            addCriterion("answer_time not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeBetween(String value1, String value2) {
            addCriterion("answer_time between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotBetween(String value1, String value2) {
            addCriterion("answer_time not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeIsNull() {
            addCriterion("answer_allgrade is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeIsNotNull() {
            addCriterion("answer_allgrade is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeEqualTo(Float value) {
            addCriterion("answer_allgrade =", value, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeNotEqualTo(Float value) {
            addCriterion("answer_allgrade <>", value, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeGreaterThan(Float value) {
            addCriterion("answer_allgrade >", value, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeGreaterThanOrEqualTo(Float value) {
            addCriterion("answer_allgrade >=", value, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeLessThan(Float value) {
            addCriterion("answer_allgrade <", value, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeLessThanOrEqualTo(Float value) {
            addCriterion("answer_allgrade <=", value, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeIn(List<Float> values) {
            addCriterion("answer_allgrade in", values, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeNotIn(List<Float> values) {
            addCriterion("answer_allgrade not in", values, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeBetween(Float value1, Float value2) {
            addCriterion("answer_allgrade between", value1, value2, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerAllgradeNotBetween(Float value1, Float value2) {
            addCriterion("answer_allgrade not between", value1, value2, "answerAllgrade");
            return (Criteria) this;
        }

        public Criteria andAnswerYIsNull() {
            addCriterion("answer_y is null");
            return (Criteria) this;
        }

        public Criteria andAnswerYIsNotNull() {
            addCriterion("answer_y is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerYEqualTo(Integer value) {
            addCriterion("answer_y =", value, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYNotEqualTo(Integer value) {
            addCriterion("answer_y <>", value, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYGreaterThan(Integer value) {
            addCriterion("answer_y >", value, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_y >=", value, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYLessThan(Integer value) {
            addCriterion("answer_y <", value, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYLessThanOrEqualTo(Integer value) {
            addCriterion("answer_y <=", value, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYIn(List<Integer> values) {
            addCriterion("answer_y in", values, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYNotIn(List<Integer> values) {
            addCriterion("answer_y not in", values, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYBetween(Integer value1, Integer value2) {
            addCriterion("answer_y between", value1, value2, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerYNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_y not between", value1, value2, "answerY");
            return (Criteria) this;
        }

        public Criteria andAnswerNIsNull() {
            addCriterion("answer_n is null");
            return (Criteria) this;
        }

        public Criteria andAnswerNIsNotNull() {
            addCriterion("answer_n is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerNEqualTo(Integer value) {
            addCriterion("answer_n =", value, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNNotEqualTo(Integer value) {
            addCriterion("answer_n <>", value, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNGreaterThan(Integer value) {
            addCriterion("answer_n >", value, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_n >=", value, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNLessThan(Integer value) {
            addCriterion("answer_n <", value, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNLessThanOrEqualTo(Integer value) {
            addCriterion("answer_n <=", value, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNIn(List<Integer> values) {
            addCriterion("answer_n in", values, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNNotIn(List<Integer> values) {
            addCriterion("answer_n not in", values, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNBetween(Integer value1, Integer value2) {
            addCriterion("answer_n between", value1, value2, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerNNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_n not between", value1, value2, "answerN");
            return (Criteria) this;
        }

        public Criteria andAnswerAllIsNull() {
            addCriterion("answer_all is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAllIsNotNull() {
            addCriterion("answer_all is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAllEqualTo(Integer value) {
            addCriterion("answer_all =", value, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllNotEqualTo(Integer value) {
            addCriterion("answer_all <>", value, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllGreaterThan(Integer value) {
            addCriterion("answer_all >", value, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_all >=", value, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllLessThan(Integer value) {
            addCriterion("answer_all <", value, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllLessThanOrEqualTo(Integer value) {
            addCriterion("answer_all <=", value, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllIn(List<Integer> values) {
            addCriterion("answer_all in", values, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllNotIn(List<Integer> values) {
            addCriterion("answer_all not in", values, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllBetween(Integer value1, Integer value2) {
            addCriterion("answer_all between", value1, value2, "answerAll");
            return (Criteria) this;
        }

        public Criteria andAnswerAllNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_all not between", value1, value2, "answerAll");
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