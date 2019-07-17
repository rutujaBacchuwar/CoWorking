package com.stackroute.kafka.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

public class Location {



    String locationName;
    double latitude;
    double longitude;

    public Location() {
    }

    public Location(String locationName, double latitude, double longitude) {

        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
