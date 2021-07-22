package com.fiap.app08_1.repository;

import com.fiap.app08_1.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}