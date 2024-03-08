package com.sports.dao;

import com.sports.entity.UserRecipe;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRecipeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRecipe record);

    int insertSelective(UserRecipe record);

    UserRecipe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRecipe record);

    int updateByPrimaryKey(UserRecipe record);

    UserRecipe selectByUserId(int  userid);
}