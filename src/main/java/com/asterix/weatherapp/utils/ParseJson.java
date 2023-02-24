package com.asterix.weatherapp.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Component;

import com.asterix.weatherapp.client.WeatherApi;
import com.asterix.weatherapp.dto.Forecast;
import com.asterix.weatherapp.dto.Location;
import com.asterix.weatherapp.dto.ForcastDay.Astro;
import com.asterix.weatherapp.dto.ForcastDay.Day;
import com.asterix.weatherapp.dto.ForcastDay.ForecastDay;
import com.asterix.weatherapp.dto.ForcastDay.Hour;
import com.asterix.weatherapp.helper.OnDate;
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
    public static void main(String[] args) {
        ParseJson parse = new ParseJson();
        WeatherApi api = new WeatherApi("312a6c240cdf400981f181909232202","http://api.weatherapi.com/v1/");
        String json = api.history("London","2023-02-23");
        parse.parseOnDateJson(json);
    }
    public String loadJson(){
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource("json/history.json");
        
        try {
            File file = new File(resource.toURI());
            String json = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8).toString();
            return json;
            // parseJson(json);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
