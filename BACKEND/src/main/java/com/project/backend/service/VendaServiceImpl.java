package com.project.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.backend.model.Venda;
import com.project.backend.repository.VendaRepository;

@Service
public class VendaServiceImpl implements VendaService{

	@Autowired
	private VendaRepository vendaRepository;
	
	@Override
	public Venda createVenda(Venda venda) {
		return vendaRepository.save(venda);
	}

	@Override
	public List<Venda> getVenda() {
		return (List<Venda>) vendaRepository.findAll();
	}

	@Override
	public Venda getVendaById(long id) {
		 return vendaRepository.findById(id).get();
	}

	@Override
	public void deleteVenda(long id) {
		vendaRepository.deleteById(id);	
	}

	@Override
	public Venda updateVenda(Venda venda, long id) {
		 Venda usuario1 = vendaRepository.findById(id).get();
		 usuario1.setValordavenda(venda.getValordavenda());
		 usuario1.setDatasaida(venda.getDatasaida());
		 
		 
		 
		 
		 return vendaRepository.save(usuario1);
	}

}



