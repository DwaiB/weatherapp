package com.asterix.weatherapp.dto;

import java.util.List;

import com.asterix.weatherapp.dto.ForcastDay.ForecastDay;

public class Forecast {
    private List<ForecastDay> forecastday;
    public Forecast(){}
    public Forecast(List<ForecastDay> forecastday) {
        this.forecastday = forecastday;
    }
    public List<ForecastDay> getForecastday() {
        return forecastday;
    }
    public void setForecastday(List<ForecastDay> forecastday) {
        this.forecastday = forecastday;
    }
    
}
