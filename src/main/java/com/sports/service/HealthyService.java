package com.sports.service;

import com.sports.common.ServerResponse;
import com.sports.entity.SportAbility;
import com.sports.entity.Subhealthy;

public interface HealthyService {

    /**
     * 存储体质测试相关信息
     * @param subhealthy
     * @param disease_str
     * @param user_height
     * @param user_weight
     * @param user_optimal_rate1
     * @param user_optimal_rate2
     * @param user_chest
     * @param user_waist
     * @param user_hipline
     * @param uid
     * @return
     */
    ServerResponse<String> tizhi_evaluting(Subhealthy subhealthy, String disease_str, float user_height, float user_weight,int user_optimal_rate1, int user_optimal_rate2, float user_chest, float user_waist, float user_hipline,int uid);

    /**
     * 存储运动能力测试相关信息
     * @param sportAbility
     * @return
     */
    ServerResponse<String> sportability_evaluting(SportAbility sportAbility);

    /**
     * 对用户进行体质评测
     * @param userid
     */
    void tizhi_comprehensive(int userid);

}
