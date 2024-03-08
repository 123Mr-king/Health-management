package com.sports.entity;


import lombok.Data;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class Course {
    private Integer id;

    private String name;

    private String type;

    private Double time;

    private String diseaseId;

    private String equipmentId;

    private String genderPreference;

    private String suitableAgeId;

    private Integer practiceNumber;

    private String notice;

    private String courseDescription;

    private String videoUrl;
}