package com.sports.dao;

import com.sports.entity.SportType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SportTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportType record);

    int insertSelective(SportType record);

    SportType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportType record);

    int updateByPrimaryKey(SportType record);
}