package com.demo.service;

import com.demo.model.City;
import com.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public long countTotalCities() {
        return cityRepository.count();
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }
}
