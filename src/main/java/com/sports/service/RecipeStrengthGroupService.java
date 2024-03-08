package com.sports.service;

import com.sports.common.ServerResponse;
import com.sports.entity.RecipeStrengthGroup;

/**
 *
 */
public interface RecipeStrengthGroupService {

    /**
     * 查询全部
     * @param recipeStrengthGroup
     * @return
     */
    ServerResponse selectAll(RecipeStrengthGroup recipeStrengthGroup);

    /**
     * 按照name 效果 训练部位 器材 条件查询
     * @param recipeStrengthGroup
     * @return
     */
    ServerResponse selectByConditions(RecipeStrengthGroup recipeStrengthGroup);
}
