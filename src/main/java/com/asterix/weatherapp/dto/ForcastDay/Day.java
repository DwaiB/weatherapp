package com.asterix.weatherapp.dto.ForcastDay;

import com.asterix.weatherapp.dto.Condition;

public class Day {
    private Double maxtemp_c;
    private Double mintemp_c;
    private Double avghumidity;
    private Condition condition;

    public Day(){}

    public Day(Double maxtemp_c, Double mintemp_c, Double avghumidity, Condition condition) {
        this.maxtemp_c = maxtemp_c;
        this.mintemp_c = mintemp_c;
        this.avghumidity = avghumidity;
        this.condition = condition;
    }

    public Double getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(Double maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public Double getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(Double mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public Double getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(Double avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    
    
}
