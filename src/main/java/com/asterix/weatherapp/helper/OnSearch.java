package com.asterix.weatherapp.helper;

import java.util.Arrays;
import java.util.List;

import com.asterix.weatherapp.dto.Location;

public class OnSearch {
    private List<Location> location;
    public OnSearch() {}
    public OnSearch(Location[] locations) {
        this.location = Arrays.asList(locations);
    }
    public List<Location> getLocation() {
        return location;
    }
    public void setLocation(List<Location> location) {
        this.location = location;
    }
    
}
