package com.asterix.weatherapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asterix.weatherapp.handler.WeatherApiHandler;
import com.asterix.weatherapp.helper.OnDate;
import com.asterix.weatherapp.helper.OnForecast;
import com.asterix.weatherapp.helper.OnSearch;

@Service
public class WeatherService {
    @Autowired
    private WeatherApiHandler handler;

    public OnSearch search(String city){
        return handler.getSearch(city);
    }
    public OnForecast forecast(String city, int days){
        return handler.getForecast(city, days);
    }
    public OnDate getCurrent(String city, String date){
        return handler.getCurrent(city, date);
    }
    public OnDate getHistory(String city, String date){
        return handler.getHistory(city, date);
    }
}
