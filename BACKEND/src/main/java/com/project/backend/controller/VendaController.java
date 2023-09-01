package com.project.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.model.Venda;
import com.project.backend.service.VendaService;

@RestController
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping("/")
	public String ola() {
		return"Ola, Mundo!!!";
	}
	
	

	//Rest API - CRUD
		//Create(read) User - POST
		//Read(listar) USer - GET
		//Delete user - DELETE
		//Update User - PUT
		

		//create User
		@PostMapping("/addvenda")
		public Venda createVenda(@RequestBody Venda venda) {
			Venda usuario1 = vendaService.createVenda(venda);
			return usuario1;
		}
		
		//Read(listar)
		@GetMapping("/vendas")
		public List<Venda> getVenda(){
			return vendaService.getVenda();
		}
		
		//update- Put
		@PutMapping("/updatevenda/{id}")
		public Venda updateVendaById(@RequestBody Venda venda, @PathVariable("id") long id) {
			return vendaService.updateVenda(venda, id);
		}
		
		//Delete user by id
		@DeleteMapping("/deletevenda/{id}")
		public String deleteVenda(@PathVariable("id") long id) {
			vendaService.deleteVenda(id);
			return "Apagado com Sucesso";
		}
		
		//get User by id
		@GetMapping("/venda/{id}")
		public Venda getById(@PathVariable("id") long id) {

		return vendaService.getVendaById(id);
		}	


}



