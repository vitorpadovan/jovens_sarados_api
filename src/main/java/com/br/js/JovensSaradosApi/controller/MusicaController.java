package com.br.js.JovensSaradosApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.js.JovensSaradosApi.model.Musica;
import com.br.js.JovensSaradosApi.service.MusicaService;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {

	@Autowired
	private MusicaService servico;


	@GetMapping
	public List<Musica> getMusicas() {
		return servico.getMusicas();
	}

	@GetMapping("/comlink")
	public List<Musica> getMusicaComLink() {
		return servico.getMusicasComLink();
	}
}
