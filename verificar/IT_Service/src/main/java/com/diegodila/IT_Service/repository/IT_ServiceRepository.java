package com.diegodila.IT_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegodila.IT_Service.model.IT_ServiceModel;

@Repository
public interface IT_ServiceRepository extends JpaRepository<IT_ServiceModel, Long>{

}
