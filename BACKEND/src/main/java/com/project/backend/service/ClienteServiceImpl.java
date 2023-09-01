package com.project.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.backend.model.Cliente;
import com.project.backend.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Cliente createCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> getCliente() {
		return (List<Cliente>)  clienteRepository.findAll();
	}

	@Override
	public Cliente getClienteById(long id) {
		return clienteRepository.findById(id).get();
	}

	@Override
	public void deleteCliente(long id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public Cliente updateCliente(Cliente cliente, long id) {
		clienteRepository.findById(id).get();
		cliente.setNome(cliente.getNome());
		cliente.setCpf(cliente.getCpf());
		cliente.setLogadouro(cliente.getLogadouro());
		cliente.setNumero(cliente.getNumero());
		cliente.setComplemento(cliente.getComplemento());
		cliente.setCidade(cliente.getCidade());
		cliente.setEstado(cliente.getEstado());
		cliente.setPais(cliente.getPais());
		cliente.setTelefone(cliente.getTelefone());
		cliente.setEmail(cliente.getEmail());
		cliente.setAnexocnh(cliente.getAnexoCnh());
		
		
		return clienteRepository.save(cliente);
	}

}
