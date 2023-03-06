package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Cliente;

@Controller
public class FormularioController {
	
	List<Cliente> list = new ArrayList<>();

	@GetMapping("/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	@PostMapping("/cadastro")
	public String cadastrar(Cliente cliente) {
		list.add(new Cliente(cliente.getNome(), cliente.getEmail(), cliente.getSenha(), cliente.getDataDeNascimento()));
		return "redirect:/clientes";
	}
	
	@GetMapping("/clientes")
	public ModelAndView listarClientes() {
		ModelAndView mv = new ModelAndView("clientes");
		mv.addObject("list", list);
		return mv;
	}
	
	@GetMapping("/editar/{nome}")
	public ModelAndView editar(@PathVariable(name = "nome") String nome) {
		ModelAndView mv = new ModelAndView("cadastro");
		Cliente clienteEncontado = list.stream().filter(cliente -> cliente.getNome().equals(nome)).findFirst().get();
		mv.addObject("cliente", clienteEncontado);
		return mv;
	}
}
