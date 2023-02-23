package com.asterix.weatherapp.helper;

import java.util.List;

import com.asterix.weatherapp.dto.Current;
import com.asterix.weatherapp.dto.Forecast;
import com.asterix.weatherapp.dto.Location;

public class OnForecast {
    private Location location;
    private List<Forecast> forecast;
    private Current current;
    public OnForecast(){}
    public OnForecast(String json){
        // TODO: handle Forecast json
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public List<Forecast> getForecast() {
        return forecast;
    }
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
    public Current getCurrent() {
        return current;
    }
    public void setCurrent(Current current) {
        this.current = current;
    }
    
}
