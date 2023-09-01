package com.project.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendas")

public class Venda {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long idvenda;
	private Long idcar;
	private Long idcliente;
	private String valordavenda;
	private String datasaida;
	public Long getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(Long idvenda) {
		this.idvenda = idvenda;
	}
	public Long getIdcar() {
		return idcar;
	}
	public void setIdcar(Long idcar) {
		this.idcar = idcar;
	}
	public Long getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}
	public String getValordavenda() {
		return valordavenda;
	}
	public void setValordavenda(String valordavenda) {
		this.valordavenda = valordavenda;
	}
	public String getDatasaida() {
		return datasaida;
	}
	public void setDatasaida(String datasaida) {
		this.datasaida = datasaida;
	}

}
