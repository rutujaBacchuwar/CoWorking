package com.stackroute.recommendation.controller;

import com.stackroute.recommendation.domain.City;
import com.stackroute.recommendation.service.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "v1/api/city")
public class CityController {

    public CityServiceImpl cityService;

    @Autowired
    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }


    @GetMapping("/allcities")
    public Collection<City> getall(){
        return cityService.getall();
    }

    @PostMapping("/newCity")
    public City saveCity(@RequestBody City city){
        return cityService.saveCity(city.getCityId(),city.getCityName());

    }
}
