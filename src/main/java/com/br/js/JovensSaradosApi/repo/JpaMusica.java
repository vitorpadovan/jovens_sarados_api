package com.br.js.JovensSaradosApi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.js.JovensSaradosApi.model.Musica;

public interface JpaMusica extends JpaRepository<Musica, Integer> {

	@Query("SELECT m FROM Musica m where m.youtube is not null or m.spotify is not null")
	public List<Musica> getMusicasComLink();
}
