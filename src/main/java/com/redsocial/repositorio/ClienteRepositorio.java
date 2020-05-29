package com.redsocial.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entidad.Cliente;


public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>  {

	
	
}
