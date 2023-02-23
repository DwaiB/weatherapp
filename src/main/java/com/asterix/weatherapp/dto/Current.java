package com.asterix.weatherapp.dto;

public class Current {
    private String last_updated;
    private Double temp_c;
    private Integer humidity;
    private Double feelslike_c;
    

    public Current() {
    }
    public String getLast_updated() {
        return last_updated;
    }
    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
    public Double getTemp_c() {
        return temp_c;
    }
    public void setTemp_c(Double temp_c) {
        this.temp_c = temp_c;
    }
    public Integer getHumidity() {
        return humidity;
    }
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
    public Double getFeelslike_c() {
        return feelslike_c;
    }
    public void setFeelslike_c(Double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    
}
