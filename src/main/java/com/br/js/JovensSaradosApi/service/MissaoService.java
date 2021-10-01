package com.br.js.JovensSaradosApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.js.JovensSaradosApi.repo.JpaMissao;

@Service
public class MissaoService {

	@Autowired
	private JpaMissao repo;
}
