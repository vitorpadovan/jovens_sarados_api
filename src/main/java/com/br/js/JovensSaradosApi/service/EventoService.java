package com.br.js.JovensSaradosApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.js.JovensSaradosApi.model.Evento;
import com.br.js.JovensSaradosApi.repo.JpaEvento;

@Service
public class EventoService {

	@Autowired
	private JpaEvento repo;


	public List<Evento> getEventos() {
		return repo.findAll();
	}
}
