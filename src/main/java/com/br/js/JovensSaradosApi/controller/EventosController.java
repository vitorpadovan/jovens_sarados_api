package com.br.js.JovensSaradosApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.js.JovensSaradosApi.model.Evento;
import com.br.js.JovensSaradosApi.service.EventoService;

@RestController
@RequestMapping("/api/eventos/")
public class EventosController {

	@Autowired
	private EventoService servico;


	@GetMapping
	public List<Evento> getEventos() {
		return servico.getEventosFuturos();
	}

	@GetMapping("/ativos")
	public List<Evento> getEventosAtivos() {
		return servico.getEventosAtivos();
	}

	@GetMapping("/futuros")
	public List<Evento> getEventosFuturos() {
		return servico.getEventosFuturos();
	}
}
