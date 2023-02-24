package com.asterix.weatherapp.dto.ForcastDay;

import java.util.Arrays;
import java.util.List;

public class ForecastDay {
    private String date;
    private Day day;
    private Astro astro;
    private List<Hour> hour;
    
    public ForecastDay(){}
    public ForecastDay(String date, Day day, Astro astro, Hour [] hour) {
        this.date = date;
        this.day = day;
        this.astro = astro;
        this.hour = Arrays.asList(hour);
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Day getDay() {
        return day;
    }
    public void setDay(Day day) {
        this.day = day;
    }
    public Astro getAstro() {
        return astro;
    }
    public void setAstro(Astro astro) {
        this.astro = astro;
    }
    public List<Hour> getHour() {
        return hour;
    }
    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }
    
    
}
