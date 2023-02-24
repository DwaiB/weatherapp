package com.asterix.weatherapp.helper;

import com.asterix.weatherapp.dto.Location;
import com.asterix.weatherapp.dto.ForcastDay.ForecastDay;

public class OnDate {
    private Location location;
    private ForecastDay forecastDay;
    public OnDate(){}
    
    public OnDate(Location location, ForecastDay forecastDay) {
        this.location = location;
        this.forecastDay = forecastDay;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public ForecastDay getForecast() {
        return forecastDay;
    }
    public void setForecast(ForecastDay forecast) {
        this.forecastDay = forecast;
    }
    
}
