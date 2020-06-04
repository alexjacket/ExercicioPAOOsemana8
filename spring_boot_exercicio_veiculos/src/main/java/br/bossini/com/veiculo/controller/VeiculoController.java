package br.bossini.com.veiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.bossini.com.veiculo.model.Veiculo;
import br.bossini.com.veiculo.repository.VeiculosRepository;

import java.util.List;

@Controller
public class VeiculoController {
	@Autowired
	private VeiculosRepository veiculoRepo;
	
	@RequestMapping ("/veiculo")
	public ModelAndView listarVeiculo() {
		List <Veiculo> veiculos = veiculoRepo.findAll();		
		ModelAndView mv = new ModelAndView("Veiculos");
		mv.addObject("veiculos", veiculos);
		return mv;
	}

}
