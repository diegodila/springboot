package com.six.app06.repository;

import com.six.app06.models.ConvidadosModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadosRepository extends JpaRepository<ConvidadosModels,Long> {

}
