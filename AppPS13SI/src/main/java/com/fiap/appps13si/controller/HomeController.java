package com.fiap.appps13si.controller;

import com.fiap.appps13si.service.BootCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    BootCampService service;

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    @GetMapping("home")
    public ModelAndView homeBootCamp() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}
