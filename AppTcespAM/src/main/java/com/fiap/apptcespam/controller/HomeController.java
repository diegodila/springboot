package com.fiap.apptcespam.controller;

import com.fiap.apptcespam.dto.City;
import com.fiap.apptcespam.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CityService service;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("index");
        List<City> cities = service.listCity();
        view.addObject("city", cities);
        return view;
    }
}
