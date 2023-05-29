package com.example.task40.service;

import com.example.task40.country.Country;
import com.example.task40.repositiry.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;
    public List<Country> findAll() {
//        return List.of(
//                new Country("Georgia", "GEO"),
//                new Country("Ukraine", "UKR"),
//                new Country("United Kingdom", "GBR")
//        );
        return countryRepository.findAll();
    }

    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    public void save(Country country) {
        System.out.println(country);
        countryRepository.save(country);
    }
}
