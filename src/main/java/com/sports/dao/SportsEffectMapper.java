package com.sports.dao;

import com.sports.entity.SportsEffect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SportsEffectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportsEffect record);

    int insertSelective(SportsEffect record);

    SportsEffect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportsEffect record);

    int updateByPrimaryKey(SportsEffect record);

    List<SportsEffect> selectAll();

    SportsEffect selectGetName(Integer id);
}