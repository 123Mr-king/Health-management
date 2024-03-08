package com.sports.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class IndividuationRecipe {
    private Integer id;

    private String name;

    private Integer userid;

    private Integer standardId;

    private Integer sportsEffectId;

    private Integer sportsTypeId;

    private Integer sportsIntensityId;

    private String sportsTime;

    private String sportsFrequency;

    private String sportsMustEquipment;

    private Integer sportsFatigue;

    private String runSpeed;

    private Integer subjectFeelId;

    private String tabooDiseaseId;

    private String methodsIntroduce;

    private Integer reviewCycle;

    private String videoUrl;

    private String notice;

    private Integer recipeNum;

    private Date recipeTime;

    private String effectLevel;

    private String satisfactionLevel;
}