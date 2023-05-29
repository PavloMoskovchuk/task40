package com.example.task40.controller;

import com.example.task40.country.Country;
import com.example.task40.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CountryController {

    private final CountryService countryService;
    @GetMapping("/country")
    public List<Country> findAll() {
        return countryService.findAll();
    }
}
