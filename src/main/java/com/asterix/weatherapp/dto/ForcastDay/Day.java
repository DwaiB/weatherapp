package com.asterix.weatherapp.dto.ForcastDay;

import com.asterix.weatherapp.dto.Condition;

public class Day {
    private Integer maxtemp_c;
    private Integer mintemp_c;
    private Integer avghumidity;
    private Condition condition;

    public Day(){}

    public Day(Integer maxtemp_c, Integer mintemp_c, Integer avghumidity, Condition condition) {
        this.maxtemp_c = maxtemp_c;
        this.mintemp_c = mintemp_c;
        this.avghumidity = avghumidity;
        this.condition = condition;
    }

    public Integer getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(Integer maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public Integer getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(Integer mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public Integer getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(Integer avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    
    
}
