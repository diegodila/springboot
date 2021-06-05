package com.fiap.apptcespam.controller;

import com.fiap.apptcespam.dto.City;
import com.fiap.apptcespam.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CityController {
    @Autowired
    CityService service;

    @GetMapping("new-city")
    public ModelAndView homeProduto() {
        ModelAndView view = new ModelAndView("city");
        view.addObject(new City());
        return view;
    }

    @PostMapping("save-city")
    public String saveCity(@Valid City city, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute(city);
            return "produto";
        }
        service.saveCity(city);
        return "redirect:/";
    }

    @GetMapping("/city/{id}")
    public ModelAndView editCity(@PathVariable Long id) {
        ModelAndView view = new ModelAndView("city");
        City city = service.editCity(id);
        view.addObject("city", city);
        return view;
    }

    @GetMapping("/city/delete/{id}")
    public String deleteCity(@PathVariable Long id) {
        service.deleteCity(id);
        return "redirect:/";
    }
}
