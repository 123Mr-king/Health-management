package com.sports.entity;


import lombok.Data;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class UserRecipe {
    private Integer id;

    private Integer userid;

    private String sportWay;

    private Integer sportStrength;

    private Integer minStrengthType;

    private Integer sportTime;

    private Integer minTimeType;

    private Integer sportFrequency;

    private String strengthShowType;
}