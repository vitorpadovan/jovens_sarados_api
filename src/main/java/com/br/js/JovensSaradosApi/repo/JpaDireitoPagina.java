package com.br.js.JovensSaradosApi.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;

import com.br.js.JovensSaradosApi.model.DireitoPagina;

@Repository
public interface JpaDireitoPagina extends JpaRepository<DireitoPagina, Integer> {

	@Query("SELECT d FROM DireitoPagina d where metodo = :metodo")
	public ArrayList<DireitoPagina> direitosPorMetodo(@Param("metodo") HttpMethod metodo);
}
