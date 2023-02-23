package com.asterix.weatherapp.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class WeatherApi {
    
    @Value("${weather.key}")
    private String key;
    @Value("${weather.url")
    private String uri;
    
    public String search(String city){
        String url = UriComponentsBuilder.fromUriString(uri).path("search.json").queryParam("key", key).queryParam("q", city).queryParam("aqi", "no")
        .queryParam("alerts", "no").build().toUriString();
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url,String.class);
        return result;
    }
    public String current(String city){
        String url = UriComponentsBuilder.fromUriString(uri).path("current.json").queryParam("key", key).queryParam("q", city).queryParam("aqi", "no")
        .queryParam("alerts", "no").build().toUriString();
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url,String.class);
        return result;
    }
    public String forecast(String city,int days){
        String url = UriComponentsBuilder.fromUriString(uri).path("forecast.json").queryParam("key", key).queryParam("q", city).queryParam("aqi", "no")
        .queryParam("alerts", "no").queryParam("days", days).build().toUriString();
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url,String.class);
        return result;
    }
    public String history(String city,String date){
        String url = UriComponentsBuilder.fromUriString(uri).path("history.json").queryParam("key", key).queryParam("q", city).queryParam("aqi", "no")
        .queryParam("alerts", "no").queryParam("dt", date).build().toUriString();
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url,String.class);
        return result;
    }
    public String current(String city, String date) {
        String url = UriComponentsBuilder.fromUriString(uri).path("current.json").queryParam("key", key).queryParam("q", city).queryParam("aqi", "no")
        .queryParam("dt", date).queryParam("alerts", "no").build().toUriString();
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url,String.class);
        return result;
    }
}
