package com.redsocial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Cliente;
import com.redsocial.repositorio.ClienteRepositorio;


@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public Cliente insertaCliente(Cliente obj) {
		return repositorio.save(obj);
	}

	


}


