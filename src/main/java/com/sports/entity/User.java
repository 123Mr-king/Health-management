package com.sports.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @author 小王小王 混世魔王
 */
@Data
public class User {
    private Integer userId;

    private String userName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBirthday;

    private String userSex;

    private String userAccount;

    private String userPassword;

    private Float userBmi;

    private String userDisease;

    private Integer userOptimalRate;

    private Integer userIsManager;

    private String userImage;

    private String userDelcar;

    private Float userWeight;

    private Float userHeight;

    private Float userWaist;

    private Float userChest;

    private Float userHipline;

    private Integer userSubhealthy;

    private Integer userSportAbility;

    private String userSportEquipmentId;

    private String userSportLike;

    private Integer userSportObjective1;

    private Integer userSportObjective2;

    private String userObjectiveDescription;

    private Integer userRecipeNum;

    private Integer userRecipeStatus;
}