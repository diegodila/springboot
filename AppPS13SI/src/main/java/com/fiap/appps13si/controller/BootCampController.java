package com.fiap.appps13si.controller;

import com.fiap.appps13si.service.BootCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BootCampController {
    @Autowired
    BootCampService service;

    @GetMapping("register")
    public ModelAndView homeProduto() {
        ModelAndView view = new ModelAndView("register");
        return view;
    }
}
