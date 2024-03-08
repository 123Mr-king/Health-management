package com.sports.service;

import com.alibaba.fastjson.JSONArray;
import com.sports.common.ServerResponse;
import com.sports.entity.Disease;

import java.util.List;

public interface DiseaseService {

    /**
     * 疾病的添加
     * @param disease
     * @return
     */
    ServerResponse<String> addDisease(Disease disease);

    /**
     * 疾病的查询
     * @param disease
     * @return
     */
    JSONArray selectDisease(Disease disease);

    /**
     * 疾病的删除
     * @param disease
     * @return
     */
    String  deleteDisease(Disease disease);

    /**
     * 疾病的修改
     * @param disease
     * @return
     */
    Disease selectById(Disease disease);

    /**
     * 后改
     * @param disease
     * @return
     */
    ServerResponse<Disease> updateDisease(Disease disease);
}
