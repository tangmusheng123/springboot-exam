package com.example.exam.mapper;

import com.example.exam.model.Classes;
import com.example.exam.model.ClassesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassesMapper {
    int countByExample(ClassesExample example);

    int deleteByExample(ClassesExample example);

    int deleteByPrimaryKey(Integer classesId);

    int insert(Classes record);

    int insertSelective(Classes record);

    List<Classes> selectByExampleWithBLOBs(ClassesExample example);

    List<Classes> selectByExample(ClassesExample example);

    Classes selectByPrimaryKey(Integer classesId);

    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExampleWithBLOBs(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKeyWithBLOBs(Classes record);

    int updateByPrimaryKey(Classes record);
}