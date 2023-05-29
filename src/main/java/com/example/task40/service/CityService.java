package com.example.task40.service;

import com.example.task40.city.City;
import com.example.task40.repositiry.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public List<City> findAll() {
//        return List.of(
//                new City("Tbilisi", "GE"),
//                new City("Batumi", "GE"),
//                new City("Kutaisi", "GE"),
//                new City("Kiyv", "UKR"),
//                new City("Severodonetsk", "UKR"),
//                new City("Lviv", "UKR"),
//                new City("Vinnytsia", "UKR"),
//                new City("London", "GBR"),
//                new City("Birmingham", "GBR"),
//                new City("Manchester", "GBR")
//        );
        return cityRepository.findAll();
    }

    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    public void save(City city) {
        System.out.println(city);
         cityRepository.save(city);
    }
}
