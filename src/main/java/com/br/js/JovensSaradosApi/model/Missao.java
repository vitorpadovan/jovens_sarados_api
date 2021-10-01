package com.br.js.JovensSaradosApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "nomeMissao", "cidade" }, name = "uk_missao_cidade") })
public class Missao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMissao;

	@Column(length = 50, nullable = false)
	private String nomeMissao;

	@Column(length = 50, nullable = false)
	private String cidade;

	@Column(length = 150, nullable = false, unique = true)
	private String endereco;

	@Column(length = 250, nullable = true)
	private String instragram;

	@Column(length = 250, nullable = true)
	private String youtube;

	@Column(length = 250, nullable = true)
	private String facebook;


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdMissao() {
		return idMissao;
	}

	public void setIdMissao(int idMissao) {
		this.idMissao = idMissao;
	}

	public String getNomeMissao() {
		return nomeMissao;
	}

	public void setNomeMissao(String nomeMissao) {
		this.nomeMissao = nomeMissao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getInstragram() {
		return instragram;
	}

	public void setInstragram(String instragram) {
		this.instragram = instragram;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
}
