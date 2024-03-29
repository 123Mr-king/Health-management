package com.sports.dao;

import com.sports.entity.SportsIntensity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SportsIntensityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportsIntensity record);

    int insertSelective(SportsIntensity record);

    SportsIntensity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportsIntensity record);

    int updateByPrimaryKey(SportsIntensity record);
}