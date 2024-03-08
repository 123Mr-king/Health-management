package com.sports.entity;


import lombok.Data;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class StandardRecipe {
    private Integer id;

    private String name;

    private String sportsEffectId;

    private Integer sportsTypeId;

    private Integer sportsIntensityId;

    private String sportsTime;

    private String sportsFrequency;

    private String sportsMustEquipmentId;

    private Integer sportsFatigue;

    private String tabooDiseaseId;

    private String methodsIntroduce;

    private Integer reviewCycle;

    private String videoUrl;

    private String notice;


}