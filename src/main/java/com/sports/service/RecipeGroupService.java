package com.sports.service;

import com.sports.common.ServerResponse;
import com.sports.entity.RecipeGroup;

public interface RecipeGroupService {

    /**
     * 查询 按照name
     * @param recipeGroup
     * @return
     */
    ServerResponse selectRecipeByName (RecipeGroup recipeGroup);

    /**
     *  查询 按照效果查询
     * @param recipeGroup
     * @return
     */
    ServerResponse selectRecipeByEffect (RecipeGroup recipeGroup);

    /**
     * 查询 按照年龄段查询
     * @param recipeGroup
     * @return
     */
    ServerResponse selectRecipeByAge (RecipeGroup recipeGroup);

    /**
     * 动态查询 多条件
     * @param recipeGroup
     * @return
     */
    ServerResponse selectRecipe(RecipeGroup recipeGroup);
}
