package com.asterix.weatherapp.client;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class WeatherApi {
    
    
    public String get(String city){
        String uri = "http://api.weatherapi.com/v1/forecast.json?key=312a6c240cdf400981f181909232202";
        String url = UriComponentsBuilder.fromUriString(uri).queryParam("q", city).queryParam("aqi", "no")
        .queryParam("alerts", "no").build().toUriString();
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url,String.class);
        return result;
    }

    public void printLoc(String json){
        Object jsonObj = JSONValue.parse(json);
        // JSONArray jArray = (JSONArray) jsonObj;
        JSONObject jObject = (JSONObject) jsonObj;
        JSONObject jLoc = (JSONObject) jObject.get("location");
        System.out.println(jLoc.get("name"));
    }
    public static void main(String[] args) {
        WeatherApi api = new WeatherApi();
        String json = api.get("Delhi");
        api.printLoc(json);
    }
}
