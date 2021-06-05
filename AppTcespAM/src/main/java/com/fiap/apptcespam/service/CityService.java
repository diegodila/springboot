package com.fiap.apptcespam.service;

import com.fiap.apptcespam.dto.City;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CityService {
    List<City> listCity();

    City saveCity(City city);

    City editCity(Long id);

    void deleteCity(Long id);
}
