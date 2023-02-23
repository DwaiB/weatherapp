package com.asterix.weatherapp.dto.ForcastDay;

import ch.qos.logback.core.joran.conditional.Condition;

public class Hour {
    private String time;
    private Integer is_day;
    private Condition condition;
    private Integer humidity;
    private Integer cloud;
    private Integer feelslike_c;
    private Integer feelslike_f;

    public Hour(){}

    public Hour(String time, Integer is_day, Condition condition, Integer humidity, Integer cloud, Integer feelslike_c,
            Integer feelslike_f) {
        this.time = time;
        this.is_day = is_day;
        this.condition = condition;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getIs_day() {
        return is_day;
    }

    public void setIs_day(Integer is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Integer getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(Integer feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Integer getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(Integer feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    
}
