package com.project.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.backend.model.Venda;

@Service
public interface VendaService {

	//create user
		public Venda createVenda(Venda venda);
		
		
		//read users - Listar
		public List<Venda> getVenda();
		
		//read users by id - Listar pelo id
		public Venda getVendaById(long id);
		
		//delete user by id
		public void  deleteVenda(long id);
		
		
		//update user by id
		public Venda updateVenda(Venda venda, long id);
		
	}
