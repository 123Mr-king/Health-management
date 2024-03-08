package com.sports.Vo;

import lombok.Data;

import java.util.List;

@Data
public class StandarRecipeVo2 {
    private Integer id;

    private String name;

    private List<String> sportsEffectList;

    private String sportsTypeId;

    private int sportsIntensityId;

    private String sportsTime;

    private String sportsFrequency;

    private List<String> sportsMustEquipmentList;

    private String sportsFatigue;

    private List<String> tabooDiseaseList;

    private String methodsIntroduce;

    private Integer reviewCycle;

    private String videoUrl;

    private String notice;
    /**
     * 运动强度的
     */
    private Integer heartRateMin;

    private Integer heartRateMax;

    private String fuzhongRange;

    private String number;

    private String groupNum;

    private String intensityType;
}
