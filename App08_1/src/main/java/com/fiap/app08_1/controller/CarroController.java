package com.fiap.app08_1.controller;

import com.fiap.app08_1.dto.CarroDto;
import com.fiap.app08_1.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarroController {

    @Autowired
    private CarroService service;

    @GetMapping("/")
    ModelAndView index(){
        List<CarroDto> dto = service.listAll();
        ModelAndView view = new ModelAndView("index");
        view.addObject(new CarroDto());
        view.addObject("carrosList", dto);
        return view;
    }

    @PostMapping("/cadastrar")
    String save(@Valid CarroDto carroDto, BindingResult result){
        if(!result.hasErrors()) {
            service.save(carroDto);
            return "redirect:/";
        }
        return "redirect:/";
    }
}
