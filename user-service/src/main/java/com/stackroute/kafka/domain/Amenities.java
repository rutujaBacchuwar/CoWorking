package com.stackroute.kafka.domain;

public class Amenities {

    String[] amenities;

    public Amenities() {
    }

    public Amenities(String[] amenities) {
        this.amenities = amenities;
    }

    public String[] getAmenities() {
        return amenities;
    }
}
