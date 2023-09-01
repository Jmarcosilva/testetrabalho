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

import com.project.backend.model.Carro;
import com.project.backend.service.CarroService;

@RestController
public class CarroController {

	@Autowired
	private CarroService carroService;
	
	
	
	//Rest API - CRUD
	//Create(read) User - POST
	//Read(listar) User - GET
	//Delete User - DELETE
	//Update User - PUT
	
	//create user
	@PostMapping("/addcarro")
	public Carro createCarro(@RequestBody Carro carro) {
		carroService.createCarro(carro);
		return carro;
	}
	
	//Read(listar)
	@GetMapping("/carros")	
	public List<Carro> getCarro(){
		return carroService.getCarro();
	}
	
	//update - PUT
	@PutMapping("/update/{id}")
	public Carro updateById(@RequestBody Carro carro, @PathVariable("id") long id) {
		return carroService.updateCarro(carro, id);
	}
	
	//Delete carro by id
	@DeleteMapping("/delete/{id}")
	public String deleteCarro(@PathVariable("id") long id) {
	  carroService.deleteCarro(id);
	  return "Apagado com sucesso!";
	}
	
	//get User by id
	@GetMapping("/carro/{id}")
	public Carro getById(@PathVariable("id") long id) {
	 return carroService.getCarroById(id);
	}
}
