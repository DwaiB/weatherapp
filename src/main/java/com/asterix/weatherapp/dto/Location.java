package com.asterix.weatherapp.dto;

public class Location {
    private String name;
    private String region;
    private String country;
    private String localtime;

    

    public Location() {
    }



    public Location(String name, String region, String country, String localtime) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.localtime = localtime;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getRegion() {
        return region;
    }



    public void setRegion(String region) {
        this.region = region;
    }



    public String getCountry() {
        return country;
    }



    public void setCountry(String country) {
        this.country = country;
    }



    public String getLocalTime() {
        return localtime;
    }



    public void setLocalTime(String localtime) {
        this.localtime = localtime;
    }



    @Override
    public String toString() {
        return String.format("Location [name=%s, region=%s country =%s, localtime = %s]", name, region, country,localtime);
    }
}
