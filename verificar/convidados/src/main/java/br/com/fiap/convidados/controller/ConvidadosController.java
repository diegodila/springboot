package br.com.fiap.convidados.controller;

import br.com.fiap.convidados.dto.ConvidadosDto;
import br.com.fiap.convidados.entity.ConvidadosEntity;
import br.com.fiap.convidados.service.ConvidadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ConvidadosController {

	@Autowired
	private ConvidadosService service;

	@PostMapping("/convidados")
	public String salvarConvidados(@Valid ConvidadosDto convidadosDto, BindingResult result) {

		if(result.hasErrors()){
			return "redirect:/convidados";
		}else{
			service.salvarConvidados(convidadosDto);
		}
		return "redirect:/convidados";
	}

	@GetMapping("/convidados")
	public ModelAndView listar() {

		ModelAndView view = new ModelAndView("convidados/ListaConvidados");

		List<ConvidadosDto> convidados = service.listarConvidados();
		//List<ConvidadosEntity> convidados = repository.findAll();

		view.addObject("convidado", new ConvidadosEntity());

		view.addObject("convidados", convidados);

		return view;
	}
	
	@GetMapping("/convidados/{id}")
	public ModelAndView editar(@PathVariable Long id) {

		ConvidadosDto convidado = service.editarConvidados(id);

		//ConvidadosEntity convidado = repository.findById(id).get();
		
		ModelAndView view = new ModelAndView("convidados/editar-convidado");

		view.addObject("convidado", convidado);		

		return view;
	}
	
	@GetMapping("/convidados/excluir/{id}")
	public String excluir(@PathVariable Long id) {

		service.excluirConvidados(id);
			
		return "redirect:/convidados";
	}

}
