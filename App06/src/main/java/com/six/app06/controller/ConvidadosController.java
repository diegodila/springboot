package com.six.app06.controller;

import com.six.app06.models.ConvidadosModels;
import com.six.app06.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ConvidadosController {

    @Autowired
    ConvidadosRepository repository;

    @GetMapping("/")
    public ModelAndView home(){

        ModelAndView view = new ModelAndView("convidados/index2");

        view.addObject("convidados", repository.findAll());
        view.addObject("objConvidadoForm", new ConvidadosModels());
        return view;
    }

    @PostMapping("/")
    String redirect(ConvidadosModels entity){
        repository.save(entity);
        return "redirect:/";
    }

    @GetMapping("/convidados/{id}")
    public ModelAndView editar(@PathVariable Long id){

        ConvidadosModels objId = repository.findById(id).get();
        ModelAndView view = new ModelAndView("convidados/index3");

        view.addObject("objId", objId);

        return view;
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id){

        repository.deleteById(id);

        return "redirect:/";
    }
}
