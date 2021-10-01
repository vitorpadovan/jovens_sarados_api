package com.br.js.JovensSaradosApi.model;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuario implements UserDetails {

	@Id
	private Integer idUsuario;

	private String login;

	private String senha;

	@Column(columnDefinition = "date", nullable = false)
	private Date dataValidade;

	@Column(columnDefinition = "boolean default true", nullable = true)
	private Boolean ativo;

	@ManyToMany
	@JoinTable(
			name = "JTUsuarioPerfil", joinColumns = @JoinColumn(name = "idUsuario"), inverseJoinColumns = @JoinColumn(
					name = "idPeril"
			)
	)
	private Set<PerfilUsuario> perfils;


	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.ativo;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.ativo;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.ativo;
	}

	@Override
	public boolean isEnabled() {
		return this.ativo;
	}
}
