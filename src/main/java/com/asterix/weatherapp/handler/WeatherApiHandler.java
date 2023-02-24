package com.asterix.weatherapp.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asterix.weatherapp.client.WeatherApi;
import com.asterix.weatherapp.helper.OnForecast;
import com.asterix.weatherapp.helper.OnDate;
import com.asterix.weatherapp.helper.OnSearch;
import com.asterix.weatherapp.utils.ParseJson;

@Service
public class WeatherApiHandler {

    @Autowired
    private WeatherApi api;

    @Autowired
    private ParseJson parser;
    
    public OnForecast getForecast(String city, int days){
        String response = api.forecast(city, days);
        OnForecast result = new OnForecast(response);
        return result;
    }
    public OnSearch getSearch(String city){
        String response = api.search(city);
        OnSearch result = parser.parseOnSearchJson(response);
        return result;
    }
    public OnDate getCurrent(String city, String date){
        String response = api.current(city, date);
        OnDate result = parser.parseOnDateJson(response);
        return result;
    }
    public OnDate getHistory(String city, String date){
        String response = api.history(city, date);
        OnDate result = parser.parseOnDateJson(response);
        return result;
    }
}
