package com.asterix.weatherapp.utils;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Component;

import com.asterix.weatherapp.client.WeatherApi;
import com.asterix.weatherapp.dto.Current;
import com.asterix.weatherapp.dto.Forecast;
import com.asterix.weatherapp.dto.Location;
import com.asterix.weatherapp.dto.ForcastDay.Astro;
import com.asterix.weatherapp.dto.ForcastDay.Day;
import com.asterix.weatherapp.dto.ForcastDay.ForecastDay;
import com.asterix.weatherapp.dto.ForcastDay.Hour;
import com.asterix.weatherapp.helper.OnDate;
import com.asterix.weatherapp.helper.OnForecast;
import com.asterix.weatherapp.helper.OnSearch;
import com.google.gson.Gson;

@Component
public class ParseJson {

    public OnSearch parseOnSearchJson(String json){
        Location [] locations = new Gson().fromJson(json, Location[].class);

        OnSearch data = new OnSearch(locations);
        return data;
    }
    public OnDate parseOnDateJson(String json){
        Object value = JSONValue.parse(json);
        JSONObject object = (JSONObject) value;
        JSONObject forecastJson = (JSONObject) object.get("forecast");
        JSONArray array = (JSONArray) forecastJson.get("forecastday");

        JSONObject forecastdayJson = (JSONObject) array.get(0);
        
        JSONObject dayJson = (JSONObject) forecastdayJson.get("day");
        JSONObject astroJson = (JSONObject) forecastdayJson.get("astro");
        JSONArray hourJson = (JSONArray) forecastdayJson.get("hour");

        String date = forecastdayJson.get("date").toString();
        Day day = new Gson().fromJson(dayJson.toString(), Day.class);
        Astro astro = new Gson().fromJson(astroJson.toString(),Astro.class);
        Hour [] hours = new Gson().fromJson(hourJson.toString(), Hour[].class);
        Location location = new Gson().fromJson(object.get("location").toString(), Location.class);

        ForecastDay forecastDay = new ForecastDay(date,day,astro,hours);
        OnDate data = new OnDate(location,forecastDay);
        return data;

    }

    public OnForecast parseOnForecastJson(String json){
        Object value = JSONValue.parse(json);
        JSONObject object = (JSONObject) value;
        JSONObject forecastJson = (JSONObject) object.get("forecast");
        JSONArray array = (JSONArray) forecastJson.get("forecastday");
        
        Forecast forecast = new Forecast();
        List<ForecastDay> forecastDayList = new ArrayList<>();
        
        int i=0;
        Location location = new Gson().fromJson(object.get("location").toString(), Location.class);
        Current current = new Gson().fromJson(object.get("current").toString(), Current.class);
        
        while ( i < array.size()){
            JSONObject forecastdayJson = (JSONObject) array.get(i);
            JSONObject dayJson = (JSONObject) forecastdayJson.get("day");
            JSONObject astroJson = (JSONObject) forecastdayJson.get("astro");
            JSONArray hourJson = (JSONArray) forecastdayJson.get("hour");

            String date = forecastdayJson.get("date").toString();
            Day day = new Gson().fromJson(dayJson.toString(), Day.class);
            Astro astro = new Gson().fromJson(astroJson.toString(),Astro.class);
            Hour [] hours = new Gson().fromJson(hourJson.toString(), Hour[].class);

            ForecastDay forecastDay = new ForecastDay(date,day,astro,hours);
            forecastDayList.add(forecastDay);
            i++;
        }
        forecast.setForecastday(forecastDayList);
        
        OnForecast data = new OnForecast(location,forecast,current);
        return data;
        
    }
    public static void main(String[] args) {
        ParseJson parse = new ParseJson();
        WeatherApi api = new WeatherApi("312a6c240cdf400981f181909232202","http://api.weatherapi.com/v1/");
        String json = api.forecast("London",2);
        OnForecast data = parse.parseOnForecastJson(json);
        Current current = data.getCurrent();
        Location loc = data.getLocation();
        Forecast fore = data.getForecast();
        System.out.println(loc.getCountry()+" "+current.getTemp_c()+" ");
        List<ForecastDay> days = fore.getForecastday();
        for( ForecastDay day : days){
            System.out.println(day.getDate()+" Sunrise: "+ day.getAstro().getSunrise()+" Day 1 temp "+day.getHour().get(1).getFeelslike_c() );
        }
    }
}
