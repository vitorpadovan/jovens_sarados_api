package com.br.js.JovensSaradosApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.http.HttpMethod;

import com.sun.istack.Nullable;

@Entity
public class DireitoPagina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDireitoPagina;

	@Enumerated(EnumType.STRING)
	private HttpMethod metodo;

	@Column(length = 500)
	private String pagina;

	@Nullable
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@Nullable
	@ManyToOne
	@JoinColumn(name = "idPeril")
	private PerfilUsuario perfilUsuario;


	public int getIdDireitoPagina() {
		return idDireitoPagina;
	}

	public void setIdDireitoPagina(int idDireitoPagina) {
		this.idDireitoPagina = idDireitoPagina;
	}

	public HttpMethod getMetodo() {
		return metodo;
	}

	public void setMetodo(HttpMethod metodo) {
		this.metodo = metodo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
}
