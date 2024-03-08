package com.sports.service;

import com.alibaba.fastjson.JSONArray;
import com.sports.common.ServerResponse;
import com.sports.entity.FatigueDegree;

public interface FatigueDegreeService {
    /**
     * 疾病的添加
     * @param fatigueDegree
     * @return
     */
    ServerResponse<String> addFatigueDegree(FatigueDegree fatigueDegree);

    /**
     * 疾病的查询
     * @param fatigueDegree
     * @return
     */
    JSONArray selectFatigueDegree(FatigueDegree fatigueDegree);

    /**
     * 疾病的删除
     * @param fatigueDegree
     * @return
     */
    String  deleteFatigueDegree(FatigueDegree fatigueDegree);

    /**
     * 疾病的修改 先查
     * @param fatigueDegree
     * @return
     */
    FatigueDegree selectById(FatigueDegree fatigueDegree);

    /**
     * 后改
     * @param fatigueDegree
     * @return
     */
    ServerResponse<FatigueDegree> updateFatigueDegree(FatigueDegree fatigueDegree);
}
