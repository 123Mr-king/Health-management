package com.sports.dao;

import com.sports.entity.IndividuationRecipe;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndividuationRecipeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndividuationRecipe record);

    int insertSelective(IndividuationRecipe record);

    IndividuationRecipe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndividuationRecipe record);

    int updateByPrimaryKey(IndividuationRecipe record);
}