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

import com.project.backend.model.Cliente;
import com.project.backend.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	
	//Rest API - CRUD
	//Create(read) User - POST
	//Read(listar) User - GET
	//Delete User - DELETE
	//Update User - PUT
	
	//create user
	@PostMapping("/addcliente")
	public Cliente createUser(@RequestBody Cliente cliente) {
		clienteService.createCliente(cliente);
		return cliente;
	}
	
	//Read(listar)
	@GetMapping("/cliente")
	public List<Cliente> getCliente(){
		return clienteService.getCliente();
	}
	
	//update - PUT
	@PutMapping("/updatecliente/{id}")
	public Cliente updateClienteById(@RequestBody Cliente cliente, @PathVariable("id") long id) {
		return clienteService.updateCliente(cliente, id);
	}
	
	//Delete cliente by id
	@DeleteMapping("/deletecliente/{id}")
	public String deleteCliente(@PathVariable("id") long id) {
	 clienteService.deleteCliente(id);
	  return "Apagado com sucesso!";
	}
	
	//get User by id
	@GetMapping("/cliente/{id}")
	public Cliente getById(@PathVariable("id") long id) {
	 return clienteService.getClienteById(id);
	}
}