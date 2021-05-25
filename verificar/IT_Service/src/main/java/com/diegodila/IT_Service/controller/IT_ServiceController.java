package com.diegodila.IT_Service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.diegodila.IT_Service.model.IT_ServiceModel;
import com.diegodila.IT_Service.repository.IT_ServiceRepository;


@Controller
public class IT_ServiceController {
	
	@Autowired
	IT_ServiceRepository repository;
	
	@GetMapping("/adding")
	public ModelAndView adding() {
		ModelAndView view = new ModelAndView("static/open");
		return view;
	}
	
	@PostMapping("/salve")
	public ModelAndView openSolicitation() {
		ModelAndView view = new ModelAndView("static/solicitation");
		return view;
	}
	
	@PostMapping("/open_sucess")
	public ModelAndView solicitation(IT_ServiceModel servicemodel) {
		
		repository.save(servicemodel);
		ModelAndView view = new ModelAndView("static/sucess");
		return view;
	}
}
