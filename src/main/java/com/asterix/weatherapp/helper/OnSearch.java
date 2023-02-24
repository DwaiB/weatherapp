package com.asterix.weatherapp.helper;

import java.util.List;

import com.asterix.weatherapp.dto.Location;

public class OnSearch {
    private List<Location> location;
    public OnSearch() {}
    public OnSearch(Location[] locations) {
        // TODO: handle Search json
    }
    public List<Location> getLocation() {
        return location;
    }
    public void setLocation(List<Location> location) {
        this.location = location;
    }
    
}
