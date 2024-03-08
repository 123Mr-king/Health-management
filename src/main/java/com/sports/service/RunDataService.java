package com.sports.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface RunDataService {

    /**
     * 获取心率曲线数据
     * @param jsonObject
     * @return
     * @throws Exception
     */
    JSONArray getRunData(JSONObject jsonObject) throws Exception;

    /**
     * 获取距离 步数 卡路里等数据
     * @param jsonObject
     * @return
     * @throws Exception
     */
    JSONArray getRunDataByTime(JSONObject jsonObject) throws Exception;

    /**
     * 获取周数据
     * @param jsonObject
     * @return
     * @throws Exception
     */
    JSONArray getWeekData(JSONObject jsonObject) throws Exception;

    /**
     * 获取周数据 按照时间范围
     * @param jsonObject
     * @return
     * @throws Exception
     */
    JSONArray getWeekDataByTime(JSONObject jsonObject) throws Exception;

    /**
     * 获取周数据 按照时间范围
     * @param jsonObject
     * @return
     * @throws Exception
     */
    JSONArray getMoonData(JSONObject jsonObject) throws Exception;
}
