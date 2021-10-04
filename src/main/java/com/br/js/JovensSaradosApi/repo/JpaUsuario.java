package com.br.js.JovensSaradosApi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.js.JovensSaradosApi.model.Usuario;

public interface JpaUsuario extends JpaRepository<Usuario, Integer> {

	public Optional<Usuario> findByLogin(String login);
}
