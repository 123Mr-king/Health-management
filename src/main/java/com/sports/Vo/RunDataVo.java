package com.sports.Vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class RunDataVo {

    private Integer id;

    private Integer userId;

    private String userName;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String recordTime;

    private String startTime;

    private Date endTime;

    private String runTime;

    private Integer timeInterval;

    private Double heartRate;

    private Double quietHeartRate;

    private Double maxHeartRate;

    private Double minHeartRate;

    private Double runSpeed;

    private Double averageSpeed;

    private Double distance;

    private Double calorie;

    private Integer recipeId;

    private Double temperature;

    private String weather;

    private Double altitude;

    private Double humidity;

    private Integer stepNumber;

    private  String week;
}
