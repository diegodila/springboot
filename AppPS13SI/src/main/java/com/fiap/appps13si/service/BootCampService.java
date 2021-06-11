package com.fiap.appps13si.service;

import com.fiap.appps13si.dto.BootCamp;

import java.util.List;

public interface BootCampService {
    BootCamp saveBootCamp(BootCamp bootCamp);
    List<BootCamp> listBootCamp();
    BootCamp editBootCamp(Long id);
    void deleteBootCamp(Long id);
}
