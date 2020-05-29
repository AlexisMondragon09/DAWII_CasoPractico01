package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.redsocial.entidad.Tipo;

import com.redsocial.repositorio.TipoRepositorio;

@Service
public class TipoServicioImpl implements TipoServicio{

	@Autowired
	private TipoRepositorio repositorio;

	@Override
	public List<Tipo> listaTipo() {
		return repositorio.findAll();
	}

	
	

	
	

}


