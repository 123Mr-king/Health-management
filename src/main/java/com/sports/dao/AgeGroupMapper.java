package com.sports.dao;

import com.sports.entity.AgeGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AgeGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgeGroup record);

    int insertSelective(AgeGroup record);

    AgeGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgeGroup record);

    int updateByPrimaryKey(AgeGroup record);

    /**
     * 获取年龄段
     */
    List<AgeGroup> selectAll();

    /**
     * 获取年龄段
     */
    AgeGroup getNameById(Integer id);

}