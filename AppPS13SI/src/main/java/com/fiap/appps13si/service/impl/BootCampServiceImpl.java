package com.fiap.appps13si.service.impl;

import com.fiap.appps13si.dto.BootCamp;
import com.fiap.appps13si.entity.BootCampEntity;
import com.fiap.appps13si.repository.BootCampRepository;
import com.fiap.appps13si.service.BootCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootCampServiceImpl implements BootCampService {

    @Autowired
    BootCampRepository repository;

    @Override
    public BootCamp saveBootCamp(BootCamp bootCamp) {
        BootCampEntity entity = repository.save(fromTo(bootCamp));
        return fromTo(entity);
    }

    @Override
    public List<BootCamp> listBootCamp() {
        List<BootCampEntity> listEntities = repository.findAll();
        List<BootCamp> listBootCamp = fromTo(listEntities);
        return listBootCamp;
    }

    @Override
    public BootCamp editBootCamp(Long id) {
        BootCampEntity entity = repository.findById(id).get();
        return fromTo(entity);
    }

    @Override
    public void deleteBootCamp(Long id) {
        repository.deleteById(id);
    }

    List<BootCamp> fromTo(List<BootCampEntity> entities){
        List<BootCamp> list = new ArrayList<>();
        for (BootCampEntity entity: entities) {
            BootCamp bootCamp = new BootCamp();
            bootCamp.setId(entity.getId());
            bootCamp.setName(entity.getName());
            bootCamp.setEspecialidade(entity.getEspecialidade());
            bootCamp.setDuracao(entity.getDuracao());
            list.add(bootCamp);
        }
        return list;
    }

    BootCamp fromTo(BootCampEntity entity){
        BootCamp bootCamp = new BootCamp();

        bootCamp.setId(entity.getId());
        bootCamp.setName(entity.getName());
        bootCamp.setEspecialidade(entity.getEspecialidade());
        bootCamp.setDuracao(entity.getDuracao());

        return bootCamp;
    }

    BootCampEntity fromTo(BootCamp bootCamp){
        BootCampEntity entity = new BootCampEntity();
        entity.setId(bootCamp.getId());
        entity.setName(bootCamp.getName());
        entity.setEspecialidade(bootCamp.getEspecialidade());
        entity.setDuracao(bootCamp.getDuracao());

        return entity;
    }
}
