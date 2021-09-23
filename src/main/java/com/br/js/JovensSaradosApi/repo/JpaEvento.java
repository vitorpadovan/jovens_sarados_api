package com.br.js.JovensSaradosApi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.js.JovensSaradosApi.model.Evento;

@Repository
public interface JpaEvento extends JpaRepository<Evento, Integer> {

	@Query("SELECT e FROM Evento e WHERE e.ativo = true")
	List<Evento> getEventosAtivos();

	@Query("SELECT e FROM Evento e WHERE e.ativo = true and e.dataEvento >= now()")
	List<Evento> getEventosFuturos();
}
