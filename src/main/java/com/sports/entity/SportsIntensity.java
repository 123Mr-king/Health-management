package com.sports.entity;

import lombok.Data;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class SportsIntensity {
    private Integer id;

    private Integer heartRateMin;

    private Integer heartRateMax;

    private String fuzhongRange;

    private String number;

    private String groupNum;

    private String intensityType;
}