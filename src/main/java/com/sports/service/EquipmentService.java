package com.sports.service;

import com.alibaba.fastjson.JSONArray;
import com.sports.common.ServerResponse;
import com.sports.entity.SportEquipment;
import org.apache.catalina.Server;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface EquipmentService {

    /**
     * 器材的添加
     * @param sportEquipment
     * @return
     */
    ServerResponse<String> addSE(SportEquipment sportEquipment);

    /**
     * 查询
     * @param sportEquipment
     * @return
     */
    JSONArray selectSE(SportEquipment sportEquipment);

    /**
     * 删除
     * @param sportEquipment
     * @return
     */
    String deleteSE(SportEquipment sportEquipment);

    /**
     * 修改 先查
     * @param sportEquipment
     * @return
     */
    SportEquipment selectById(SportEquipment sportEquipment);

    ServerResponse<SportEquipment> updateSE( MultipartFile file, SportEquipment sportEquipment)throws Exception;
}
