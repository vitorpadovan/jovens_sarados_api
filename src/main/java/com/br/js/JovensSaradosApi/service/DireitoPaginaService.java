package com.br.js.JovensSaradosApi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Service;

import com.br.js.JovensSaradosApi.model.DireitoPagina;
import com.br.js.JovensSaradosApi.repo.JpaDireitoPagina;

@Service
public class DireitoPaginaService {

	@Autowired
	private JpaDireitoPagina repo;


	public HttpSecurity adicionarDireitos(HttpSecurity http, HttpMethod metodo) throws Exception {
		ArrayList<DireitoPagina> direitos = repo.direitosPorMetodo(metodo);
		if (direitos.size() > 0) {
			List<String> paginas = direitos.stream().map(obj -> obj.getPagina()).collect(Collectors.toList());
			http.authorizeRequests().antMatchers(metodo, paginas.toArray(new String[paginas.size()])).permitAll();
		}
		return http;
	}
}
