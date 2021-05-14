package com.five.app05.repository;

import com.five.app05.entity.ConvidadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadosRepository extends JpaRepository <ConvidadosEntity, Long> {
}
