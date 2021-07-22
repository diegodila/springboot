package com.fiap.app08_1.service.impl;

import com.fiap.app08_1.dto.CarroDto;
import com.fiap.app08_1.entity.Carro;
import com.fiap.app08_1.repository.CarroRepository;
import com.fiap.app08_1.service.listCarrosEntityervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class listCarrosEntityerviceImpl implements listCarrosEntityervice {
    @Autowired
    CarroRepository repository;

    @Override
    public CarroDto save(CarroDto carroDto) {
        Carro carro = repository.save(carroDto.fromto());
        return carro.fromTo();
    }

    @Override
    public List<CarroDto> listAll() {
        List<Carro> carro = repository.findAll();
        List<CarroDto> carroDto = fromToService(carro);
        return carroDto;
    }

    @Override
    public CarroDto editById(Long id) {
        Carro carro = repository.findById(id).get();
        return carro.fromTo();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    List<CarroDto> fromToService(List<Carro> listCarrosEntity){
        List<CarroDto> listCarrosDto = new ArrayList<>();
        for (Carro carroEntity:listCarrosEntity) {
            CarroDto carroDto = new CarroDto();
            carroDto.setId(carroEntity.getId());
            carroDto.setModelo(carroEntity.getModelo());
            carroDto.setCor(carroEntity.getCor());
            carroDto.setAno(carroDto.getAno());

            listCarrosDto.add(carroDto);
        }
        return listCarrosDto;
    }
}
