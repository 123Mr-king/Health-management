package com.sports.dao;

import com.sports.entity.SubjectFeel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubjectFeelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SubjectFeel record);

    int insertSelective(SubjectFeel record);

    SubjectFeel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubjectFeel record);

    int updateByPrimaryKey(SubjectFeel record);
}