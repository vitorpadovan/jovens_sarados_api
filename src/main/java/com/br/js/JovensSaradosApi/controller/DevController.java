package com.br.js.JovensSaradosApi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.js.JovensSaradosApi.form.FormLogin;
import com.br.js.JovensSaradosApi.model.Usuario;
import com.br.js.JovensSaradosApi.repo.JpaUsuario;

@RestController
@Profile("dev")
@RequestMapping("/dev")
public class DevController {

	private int dias = 2;

	@Autowired
	private JpaUsuario repoUsuario;


	@PostMapping
	private Usuario gerarSenha(@RequestBody FormLogin login) {
		long intervalo = dias * 24 * 60 * 60;
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		Usuario u = new Usuario();
		u.setLogin(login.getLogin());
		u.setSenha(bCrypt.encode(login.getSenha()));
		u.setDataValidade(new Date(System.currentTimeMillis()));
		System.out.println(intervalo + " - " + System.currentTimeMillis());
		repoUsuario.save(u);
		login.setSenha(u.getSenha());
		return u;
	}
}