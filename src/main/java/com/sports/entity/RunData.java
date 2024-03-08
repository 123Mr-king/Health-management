package com.sports.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 * @author 小王小王 混世魔王
 */
@Data
public class RunData {
    private Integer id;

    private Integer userId;

    private String userName;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String recordTime;

    private Date startTime;

    private Date endTime;

    private String runTime;

    private Integer timeInterval;

    private String heartRate;

    private Double quietHeartRate;

    private Double maxHeartRate;

    private Double minHeartRate;

    private String runSpeed;

    private Double averageSpeed;

    private Double distance;

    private Double calorie;

    private Integer recipeId;

    private Double temperature;

    private String weather;

    private Double altitude;

    private Double humidity;

    private Integer stepNumber;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        RunData runData = (RunData) object;
        return Objects.equals(id, runData.id) &&
                Objects.equals(userId, runData.userId) &&
                Objects.equals(userName, runData.userName) &&
                Objects.equals(recordTime, runData.recordTime) &&
                Objects.equals(startTime, runData.startTime) &&
                Objects.equals(endTime, runData.endTime) &&
                Objects.equals(runTime, runData.runTime) &&
                Objects.equals(timeInterval, runData.timeInterval) &&
                Objects.equals(heartRate, runData.heartRate) &&
                Objects.equals(quietHeartRate, runData.quietHeartRate) &&
                Objects.equals(maxHeartRate, runData.maxHeartRate) &&
                Objects.equals(minHeartRate, runData.minHeartRate) &&
                Objects.equals(runSpeed, runData.runSpeed) &&
                Objects.equals(averageSpeed, runData.averageSpeed) &&
                Objects.equals(distance, runData.distance) &&
                Objects.equals(calorie, runData.calorie) &&
                Objects.equals(recipeId, runData.recipeId) &&
                Objects.equals(temperature, runData.temperature) &&
                Objects.equals(weather, runData.weather) &&
                Objects.equals(altitude, runData.altitude) &&
                Objects.equals(humidity, runData.humidity) &&
                Objects.equals(stepNumber, runData.stepNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, userName, recordTime, startTime, endTime, runTime, timeInterval, heartRate, quietHeartRate, maxHeartRate, minHeartRate, runSpeed, averageSpeed, distance, calorie, recipeId, temperature, weather, altitude, humidity, stepNumber);
    }
}