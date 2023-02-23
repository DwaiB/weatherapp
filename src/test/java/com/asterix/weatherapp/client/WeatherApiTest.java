package com.asterix.weatherapp.client;

import org.junit.jupiter.api.Test;

public class WeatherApiTest {
    @Test
    void testCurrent() {
        WeatherApi api = new WeatherApi();
        System.out.println(api.current("London"));
    }

    @Test
    void testCurrent2() {

    }

    @Test
    void testForecast() {

    }

    @Test
    void testHistory() {

    }

    @Test
    void testSearch() {

    }
}
