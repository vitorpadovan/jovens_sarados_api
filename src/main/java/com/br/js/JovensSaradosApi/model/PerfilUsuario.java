package com.br.js.JovensSaradosApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class PerfilUsuario implements GrantedAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPeril;

	@Column(length = 50, nullable = false, unique = true)
	private String perfil;


	public Integer getIdPeril() {
		return idPeril;
	}

	public void setIdPeril(Integer idPeril) {
		this.idPeril = idPeril;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String getAuthority() {
		return perfil;
	}
}
