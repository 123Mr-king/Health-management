package com.sports.entity;

import lombok.Data;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class RecipeGroup {
    private Integer id;

    private String effect;

    private String recipeName;

    private String type;

    private String typevalue;

    private String musclesTrained;

    private String methodIntroduction;

    private String ageGroup;

    private Integer minHeartrate;

    private Integer maxHeartrate;

    private String sportsFrequency;

    private String sportsTime;

    private String notice;

    private String equipment;

    private String tabooDisease;

    private String image;

    private String other;
}