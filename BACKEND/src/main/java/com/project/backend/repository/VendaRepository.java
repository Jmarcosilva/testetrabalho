package com.project.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.backend.model.Venda;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Long>  {

}
