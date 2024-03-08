package com.sports.service;


import com.alibaba.fastjson.JSONArray;
import com.sports.Vo.StandarRecipeVo2;
import com.sports.common.ServerResponse;
import com.sports.entity.SportsIntensityStandard;
import com.sports.entity.StandardRecipe;

public interface StandardRecipeService   {

    /**
     * 效果 effect
     * @return
     */
    JSONArray goalList();

    /**
     * 类型 name
     * @return
     */
    JSONArray interestList();

    /**
     * 器材 多选 name
     * @return
     */
    JSONArray equipmentiList();

    /**
     * 疲劳度等级 name
     * @return
     */
    JSONArray fatigueList();

    /**
     * 禁忌疾病 name
     * @return
     */
    JSONArray diseaseList();

    /**
     * 查询全部 和 根据name查询
     * @param standardRecipe
     * @return
     */
    JSONArray selectSR(StandardRecipe standardRecipe);

    /**
     * 查询全部 和 根据运动类型查询
     * @param standardRecipe
     * @return
     */
    JSONArray selectByTypeId(StandardRecipe standardRecipe);

    /**
     * 查询全部 和 根据运动效果模糊查询
     * @param standardRecipe
     * @return
     */
    JSONArray selectByEffectId(StandardRecipe standardRecipe);

    /**
     * 删除修改
     * @param standardRecipe
     */
    void deleteSR1(StandardRecipe standardRecipe);

    /**
     * 更新第一步 先查出来进行返回
     * @param standarRecipeVo2
     * @param standardRecipe
     * @return
     */
    JSONArray selectSRyId(StandarRecipeVo2 standarRecipeVo2, StandardRecipe standardRecipe);

    ServerResponse<StandardRecipe> updateInformation(StandardRecipe standardRecipe, SportsIntensityStandard sportsIntensityStandard);

}
