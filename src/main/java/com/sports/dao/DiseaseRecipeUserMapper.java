package com.sports.dao;

import com.sports.entity.DiseaseRecipeUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DiseaseRecipeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseaseRecipeUser record);

    int insertSelective(DiseaseRecipeUser record);

    DiseaseRecipeUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseaseRecipeUser record);

    int updateByPrimaryKey(DiseaseRecipeUser record);
}