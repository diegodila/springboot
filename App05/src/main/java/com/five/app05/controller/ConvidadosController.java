package com.five.app05.controller;

import com.five.app05.entity.ConvidadosEntity;
import com.five.app05.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ConvidadosController {

    @Autowired
    ConvidadosRepository repository;

    @PostMapping("/")
    public String redirectView(ConvidadosEntity entity){
        repository.save(entity);
        return "redirect:/";
    }

    @GetMapping("/")
    public ModelAndView currentPath(){
        ModelAndView view = new ModelAndView("convidados/power");

        List<ConvidadosEntity> convidados = repository.findAll();

        view.addObject("objConvidadosForm", new ConvidadosEntity());
        view.addObject("objConvidados", convidados);
        return view;
    }
}
