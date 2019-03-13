package com.example.exam.mapper;

import com.example.exam.model.Questiontype;
import com.example.exam.model.QuestiontypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestiontypeMapper {
    int countByExample(QuestiontypeExample example);

    int deleteByExample(QuestiontypeExample example);

    int deleteByPrimaryKey(Integer questiontypeId);

    int insert(Questiontype record);

    int insertSelective(Questiontype record);

    List<Questiontype> selectByExampleWithBLOBs(QuestiontypeExample example);

    List<Questiontype> selectByExample(QuestiontypeExample example);

    Questiontype selectByPrimaryKey(Integer questiontypeId);

    int updateByExampleSelective(@Param("record") Questiontype record, @Param("example") QuestiontypeExample example);

    int updateByExampleWithBLOBs(@Param("record") Questiontype record, @Param("example") QuestiontypeExample example);

    int updateByExample(@Param("record") Questiontype record, @Param("example") QuestiontypeExample example);

    int updateByPrimaryKeySelective(Questiontype record);

    int updateByPrimaryKeyWithBLOBs(Questiontype record);

    int updateByPrimaryKey(Questiontype record);
}