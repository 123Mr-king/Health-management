package com.sports.dao;

import com.sports.entity.RecipeGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecipeGroupMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RecipeGroup record);

    int insertSelective(RecipeGroup record);

    RecipeGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeGroup record);

    int updateByPrimaryKey(RecipeGroup record);

    /**
     * 查询所有
     * @return
     */
    List<RecipeGroup> selectAll();

    /**
     * 按照name 查询
     * @param recipeName
     * @return
     */
    List<RecipeGroup> selectByName( @Param("recipeName") String recipeName);

    /**
     * 按照效果查询
     * @param recipeEffect
     * @return
     */
    List<RecipeGroup> selectByEffect(@Param("recipeEffect")String recipeEffect);

    /**
     * 按照年龄段查询
     * @param ageGroup
     * @return
     */
    List<RecipeGroup> selectByAge(@Param("ageGroup")String ageGroup);

    /**
     * 按照name和age查询
     * @param recipeName
     * @param ageGroup
     * @return
     */
    List<RecipeGroup> selectByNameAndAge(@Param("recipeName") String recipeName,@Param("ageGroup")String ageGroup);

    /**
     * 多条件查询
     * @param recipeName
     * @param recipeEffect
     * @param ageGroup
     * @return
     */
    List<RecipeGroup> selectRecipe(@Param("recipeName") String recipeName,@Param("recipeEffect")String recipeEffect,@Param("ageGroup")String ageGroup);
}