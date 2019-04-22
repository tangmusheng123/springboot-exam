-- phpMyAdmin SQL Dump
-- version phpStudy 2014
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2019 �?04 �?22 �?09:19
-- 服务器版本: 5.5.53-log
-- PHP 版本: 5.6.27

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `exam`
--

-- --------------------------------------------------------

--
-- 表的结构 `answer`
--

CREATE TABLE IF NOT EXISTS `answer` (
  `answer_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `exam_id` int(10) unsigned NOT NULL,
  `answer_time` varchar(45) DEFAULT NULL,
  `answer_result` text COMMENT '数据包格式：',
  `answer_allgrade` float DEFAULT NULL COMMENT '总分',
  `answer_y` int(11) DEFAULT NULL COMMENT '正确的',
  `answer_n` int(11) DEFAULT NULL COMMENT '错误的条数',
  `answer_all` int(11) DEFAULT NULL COMMENT '全部多少题',
  PRIMARY KEY (`answer_id`),
  KEY `fk_answer_student1_idx` (`user_id`),
  KEY `fk_answer_exam1_idx` (`exam_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `answer`
--

INSERT INTO `answer` (`answer_id`, `user_id`, `exam_id`, `answer_time`, `answer_result`, `answer_allgrade`, `answer_y`, `answer_n`, `answer_all`) VALUES
(1, 20, 1, '1553149512', NULL, 23, 1, 1, 2);

-- --------------------------------------------------------

--
-- 表的结构 `classes`
--

CREATE TABLE IF NOT EXISTS `classes` (
  `classes_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `teacher_id` int(10) unsigned NOT NULL,
  `student_list` text,
  `classes_name` varchar(45) DEFAULT NULL,
  `classes_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`classes_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- 转存表中的数据 `classes`
--

INSERT INTO `classes` (`classes_id`, `teacher_id`, `student_list`, `classes_name`, `classes_time`) VALUES
(4, 19, '', 'test', '1553148404'),
(5, 19, '20,', 'test2', '1553148439'),
(6, 19, NULL, '12414', '1553149557');

-- --------------------------------------------------------

--
-- 表的结构 `exam`
--

CREATE TABLE IF NOT EXISTS `exam` (
  `exam_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `teacher_id` int(10) unsigned NOT NULL,
  `classes_id` int(10) unsigned NOT NULL,
  `question_list` text COMMENT '题目的列表',
  PRIMARY KEY (`exam_id`),
  KEY `fk_exam_classes1_idx` (`classes_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `exam`
--

INSERT INTO `exam` (`exam_id`, `teacher_id`, `classes_id`, `question_list`) VALUES
(1, 19, 4, '2,3,');

-- --------------------------------------------------------

--
-- 表的结构 `question`
--

CREATE TABLE IF NOT EXISTS `question` (
  `question_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `questiontype_id` int(10) unsigned NOT NULL,
  `question_type` varchar(45) DEFAULT NULL COMMENT '题目的类型，01是单选，02为多选',
  `question_content` text COMMENT '题目的标题',
  `question_a` text,
  `question_b` text,
  `question_c` text,
  `question_d` text,
  `question_e` text,
  `question_f` text,
  `question_g` text,
  `question_answer` varchar(45) DEFAULT NULL COMMENT '答案的字符串',
  `question_time` varchar(45) DEFAULT NULL COMMENT '题目创建的时间',
  PRIMARY KEY (`question_id`),
  KEY `fk_question_questiontype_idx` (`questiontype_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `question`
--

INSERT INTO `question` (`question_id`, `questiontype_id`, `question_type`, `question_content`, `question_a`, `question_b`, `question_c`, `question_d`, `question_e`, `question_f`, `question_g`, `question_answer`, `question_time`) VALUES
(1, 1, '01', 'ccctest', 'a', 'c', 'xsed', 'e都是', '', '', NULL, 'A', '1553051344'),
(2, 2, '01', '12', '243', '324', '324', '43', '', '', '23', 'A', '1553149244'),
(3, 2, '02', '23432', 'WR', '234', 'EWR', '234', 'ER23', 'E2', '123', 'A,B', '1553149264');

-- --------------------------------------------------------

--
-- 表的结构 `questiontype`
--

CREATE TABLE IF NOT EXISTS `questiontype` (
  `questiontype_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `teacher_id` int(10) unsigned NOT NULL,
  `questiontype_name` text,
  `questiontype_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`questiontype_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- 转存表中的数据 `questiontype`
--

INSERT INTO `questiontype` (`questiontype_id`, `teacher_id`, `questiontype_name`, `questiontype_time`) VALUES
(1, 2, 'ccc', '1553051317'),
(2, 19, '324', '1553149229');

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `classes_list` text COMMENT '学生加入的班级列表',
  `user_name` varchar(45) DEFAULT NULL,
  `user_number` varchar(45) DEFAULT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_cookie` varchar(45) DEFAULT NULL,
  `user_role` varchar(45) DEFAULT NULL COMMENT 'admin,teacher,studen',
  `user_permission` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=21 ;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`user_id`, `classes_list`, `user_name`, `user_number`, `user_password`, `user_cookie`, `user_role`, `user_permission`) VALUES
(18, NULL, 'admin', 'admin', 'admin', NULL, 'admin', 'admin'),
(19, NULL, 'teacher', 'teacher', 'teacher', '1553148398', 'teacher', 'teacher'),
(20, '4,', 'student', 'student', 'student', '1553148426', 'student', 'student');

--
-- 限制导出的表
--

--
-- 限制表 `answer`
--
ALTER TABLE `answer`
  ADD CONSTRAINT `fk_answer_exam1` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_answer_student1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `fk_exam_classes1` FOREIGN KEY (`classes_id`) REFERENCES `classes` (`classes_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `fk_question_questiontype` FOREIGN KEY (`questiontype_id`) REFERENCES `questiontype` (`questiontype_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
