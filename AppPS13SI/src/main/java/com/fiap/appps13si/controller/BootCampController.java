package com.fiap.appps13si.controller;

import com.fiap.appps13si.dto.BootCamp;
import com.fiap.appps13si.service.BootCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BootCampController {
    @Autowired
    BootCampService service;

    @PostMapping("save-bootcamp")
    public String saveCity(@Valid BootCamp bootCamp, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute(bootCamp);
            return "bootCamp";
        }
        service.saveBootCamp(bootCamp);
        return "redirect:/";
    }

    @GetMapping("/bootcamp/{id}")
    public ModelAndView editCity(@PathVariable Long id) {
        ModelAndView view = new ModelAndView("index");
        BootCamp bootCamp = service.editBootCamp(id);
        view.addObject("bootCamp", bootCamp);
        return view;
    }

    @GetMapping("/bootcamp/delete/{id}")
    public String deleteCity(@PathVariable Long id) {
        service.deleteBootCamp(id);
        return "redirect:/home";
    }
}
