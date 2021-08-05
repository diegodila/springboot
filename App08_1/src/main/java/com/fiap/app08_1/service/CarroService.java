package com.fiap.app08_1.service;

import com.fiap.app08_1.dto.CarroDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarroService {

    CarroDto save(CarroDto carroDto);
    List<CarroDto> listAll();
    CarroDto editById(Long id);
    void deleteById(Long id);
}
