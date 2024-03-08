package com.sports.service;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sports.common.ServerResponse;
import com.sports.entity.SportsEffect;
import com.sports.entity.User;

public interface UserService {
    /**
     *
     * @param userName
     * @param userPassword
     * @return d
     */
    ServerResponse<User> login(String userName, String userPassword);

    ServerResponse<String> register(User user);

    ServerResponse<User> updateInformation(User user);

    /**
     * 目的
     * @return
     */
    JSONArray goalList();

    /**
     * 兴趣
     * @return
     */
    JSONArray interestList();

    /**
     * 器材
     * @return
     */
    JSONArray equipmentiList();

}
