package com.example.task40.controller;

import com.example.task40.city.City;
import com.example.task40.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CityController {

    private final CityService cityService;

    @GetMapping("/city")
    public List<City> findAll() {
        return cityService.findAll();
    }
}
