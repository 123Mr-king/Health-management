package com.sports.entity;


import lombok.Data;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class FatigueDegree {

    private Integer id;

    private String name;
    /**
     * 自我感觉
     */
    private String feel;
    //面色

    private String face;
    //排汗量

    private String sweat;
    //呼吸

    private String breathe;
    //动作

    private String action;
    //注意力

    private String attention;
}