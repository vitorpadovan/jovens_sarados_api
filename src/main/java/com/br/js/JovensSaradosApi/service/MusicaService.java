package com.br.js.JovensSaradosApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.js.JovensSaradosApi.model.Musica;
import com.br.js.JovensSaradosApi.repo.JpaMusica;

@Service
public class MusicaService {

	@Autowired
	private JpaMusica repo;


	public List<Musica> getMusicas() {
		return repo.findAll();
	}

	public List<Musica> getMusicasComLink() {
		return repo.getMusicasComLink();
	}
}
