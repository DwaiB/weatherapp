package com.asterix.weatherapp.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asterix.weatherapp.client.WeatherApi;
import com.asterix.weatherapp.helper.OnForecast;
import com.asterix.weatherapp.helper.OnDate;
import com.asterix.weatherapp.helper.OnSearch;

@Service
public class WeatherApiHandler {

    @Autowired
    private WeatherApi api;
    
    public OnForecast getForecast(String city, int days){
        String response = api.forecast(city, days);
        OnForecast hForecast = new OnForecast(response);
        return hForecast;
    }
    public OnSearch getSearch(String city){
        String response = api.search(city);
        OnSearch hSearch = new OnSearch(response);
        return hSearch;
    }
    public OnDate getCurrent(String city, String date){
        String response = api.current(city, date);
        OnDate hOnDate = new OnDate(response);
        return hOnDate;
    }
    public OnDate getHistory(String city, String date){
        String response = api.history(city, date);
        OnDate hOnDate = new OnDate(response);
        return hOnDate;
    }
}
