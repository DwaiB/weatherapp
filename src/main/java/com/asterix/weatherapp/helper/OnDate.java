package com.asterix.weatherapp.helper;

import com.asterix.weatherapp.dto.Forecast;
import com.asterix.weatherapp.dto.Location;

public class OnDate {
    private Location location;
    private Forecast forecast;
    public OnDate(){}
    public OnDate(String json){
        // TODO : Date json
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Forecast getForecast() {
        return forecast;
    }
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
    
}
