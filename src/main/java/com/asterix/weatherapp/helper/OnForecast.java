package com.asterix.weatherapp.helper;


import com.asterix.weatherapp.dto.Current;
import com.asterix.weatherapp.dto.Forecast;
import com.asterix.weatherapp.dto.Location;

public class OnForecast {
    private Location location;
    private Forecast forecast;
    private Current current;
    public OnForecast(){}
    
    public OnForecast(Location location, Forecast forecast, Current current) {
        this.location = location;
        this.forecast = forecast;
        this.current = current;
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
    public Current getCurrent() {
        return current;
    }
    public void setCurrent(Current current) {
        this.current = current;
    }
    
}
