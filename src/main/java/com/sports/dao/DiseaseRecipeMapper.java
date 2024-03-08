package com.sports.dao;

import com.sports.entity.DiseaseRecipe;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DiseaseRecipeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseaseRecipe record);

    int insertSelective(DiseaseRecipe record);

    DiseaseRecipe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseaseRecipe record);

    int updateByPrimaryKey(DiseaseRecipe record);
}