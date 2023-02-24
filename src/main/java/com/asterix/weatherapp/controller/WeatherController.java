package com.asterix.weatherapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asterix.weatherapp.helper.OnDate;
import com.asterix.weatherapp.helper.OnForecast;
import com.asterix.weatherapp.helper.OnSearch;
import com.asterix.weatherapp.services.WeatherService;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService service;

    @RequestMapping("/")
    public ModelAndView dashboard(){
        ModelAndView view = new ModelAndView();
        view.setViewName("dashboard");
        view.addObject("query", "");
        return view;
    }

    @RequestMapping("/locations")
    public ModelAndView searchResult(@RequestParam(value = "city") String city){
        System.out.println("City "+city);
       ModelAndView view = new ModelAndView();
        view.setViewName("locations");
        OnSearch result = service.search(city);
        view.addObject("locations", result);
       return view;
    }

    @RequestMapping("/forecast")
    public ModelAndView forecastResult(@RequestParam("city") String city, @RequestParam("days") int days){
        ModelAndView view = new ModelAndView();
        view.setViewName("forecast");
        OnForecast result = service.forecast(city, days);
        view.addObject("forecast", result);
        return view;
    }

    @RequestMapping("/current")
    public ModelAndView current(@RequestParam("city") String city, @RequestParam("date")String date){
        ModelAndView view = new ModelAndView();
        view.setViewName("current");
        OnDate result = service.getCurrent(city, date);
        view.addObject("current", result);
        return view;
    }
    @RequestMapping("/history")
    public ModelAndView history(@RequestParam("city") String city, @RequestParam("date")String date){
        ModelAndView view = new ModelAndView();
        view.setViewName("history");
        OnDate result = service.getCurrent(city, date);
        view.addObject("history", result);
        return view;
    }
}