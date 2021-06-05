package com.fiap.apptcespam.service.impl;

import com.fiap.apptcespam.dto.City;
import com.fiap.apptcespam.entity.CityEntity;
import com.fiap.apptcespam.repository.CityRepository;
import com.fiap.apptcespam.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> listCity() {
        List<CityEntity> listCity = repository.findAll();
        List<City> city = fromTo(listCity);
        return city;
    }

    @Override
    public City saveCity(City city) {
        CityEntity entity = fromTo(city);
        entity = repository.save(entity);
        City returnCity = fromTo(entity);
        return returnCity;
    }

    @Override
    public City editCity(Long id) {
        CityEntity entity = repository.findById(id).get();
        return fromTo(entity);
    }

    @Override
    public void deleteCity(Long id) {
        repository.deleteById(id);

    }

    private List<City> fromTo(List<CityEntity> lista) {
        List<City> listaDto = new ArrayList<>();
        for (CityEntity cityEntity : lista) {
            City dto = new City();
            dto.setId(cityEntity.getId());
            dto.setCityName(cityEntity.getCityName());
            dto.setUrl(cityEntity.getUrl());
            listaDto.add(dto);
        }
        return listaDto;
    }

    private CityEntity fromTo(City city) {
        CityEntity entity = new CityEntity();
        entity.setId(city.getId());
        entity.setCityName(city.getCityName());
        entity.setUrl(city.getUrl());
        return entity;
    }

    private City fromTo(CityEntity entity) {
        City city = new City();
        city.setId(entity.getId());
        city.setCityName(entity.getCityName());
        city.setUrl(entity.getUrl());
        return city;
    }
}
