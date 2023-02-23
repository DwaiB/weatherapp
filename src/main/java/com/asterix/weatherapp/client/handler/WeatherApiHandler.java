package com.asterix.weatherapp.client.handler;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.asterix.weatherapp.dto.Location;
import com.google.gson.Gson;

public class WeatherApiHandler {
    public void readJson(){
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource("json/weather.json");
        
        try {
            File file = new File(resource.toURI());
            String json = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8).toString();
            parseJson(json);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void parseJson(String json){
        Object value =  JSONValue.parse(json);
        JSONArray object = (JSONArray) value;
        JSONObject object1 = (JSONObject) object.get(0);
        JSONObject object2 = (JSONObject) object1.get("climate");
        System.out.println("Location: "+object2.get("temp"));

        JSONObject location = (JSONObject) object1.get("location");
        Location loc = new Gson().fromJson(location.toString(),Location.class);
        System.out.println(loc);
    }

    public static void main(String[] args) {
        WeatherApiHandler handler = new WeatherApiHandler();

        handler.readJson();
    }
}
