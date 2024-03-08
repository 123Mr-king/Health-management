package com.sports.Vo;

import lombok.Data;

import java.util.List;

@Data
public class CourseVo {
    private Integer id;

    private String name;

    private String type;

    private Double time;

    private List<String> diseaseList;

    private List<String> equipmentList;

    private String genderPreference;

    private List<String> suitableAgeList;

    private Integer practiceNumber;

    private String notice;

    private String courseDescription;

    private String videoUrl;

}
