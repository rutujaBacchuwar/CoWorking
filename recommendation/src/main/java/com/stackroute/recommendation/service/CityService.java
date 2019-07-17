package com.stackroute.recommendation.service;

import com.stackroute.recommendation.domain.City;

import java.util.Collection;

public interface CityService {

    public Collection<City> getall();

    public City saveCity(long cityId,String cityName);

}
