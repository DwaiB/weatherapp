package com.asterix.weatherapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
}