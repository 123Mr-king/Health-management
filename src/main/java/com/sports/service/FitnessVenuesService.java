package com.sports.service;

import com.sports.common.ServerResponse;
import com.sports.entity.FitnessVenues;
import org.springframework.web.multipart.MultipartFile;

public interface FitnessVenuesService {

    /**
     * 场馆的添加
     * @param files
     * @param fitnessVenues
     * @return
     */
    ServerResponse<String> addFitnessVenues(MultipartFile[] files, FitnessVenues fitnessVenues);

    /**
     * 查询 根据name
     * @param fitnessVenues
     * @return
     */
    ServerResponse selectFitnessVenues(FitnessVenues fitnessVenues);

    /**
     * 查询 根据type
     * @param fitnessVenues
     * @return
     */
    ServerResponse selectFitnessVenuesByType(FitnessVenues fitnessVenues);

    /**
     * 查询 根据typeValue
     * @param fitnessVenues
     * @return
     */
    ServerResponse selectFitnessVenuesByTypeValue(FitnessVenues fitnessVenues);

    /**
     * 删除
     * @param fitnessVenues
     * @return
     */
    String deleteFitnessVenues(FitnessVenues fitnessVenues);

    /**
     * 根据id获取图片链接
     * @param fitnessVenues
     * @return
     */
    ServerResponse getImageUrl (FitnessVenues fitnessVenues);
}
