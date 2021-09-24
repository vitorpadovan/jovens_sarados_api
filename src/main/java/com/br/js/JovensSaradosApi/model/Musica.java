package com.br.js.JovensSaradosApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		indexes = { @Index(name = "unk_artista", columnList = "artista"),
				@Index(name = "unk_musica", columnList = "musica") }, uniqueConstraints = {
						@UniqueConstraint(columnNames = { "artista", "musica" }) }
)
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "varchar(80) not null", length = 80, nullable = false)
	private String artista;

	@Column(columnDefinition = "varchar(80) not null", length = 80, nullable = false)
	private String musica;

	@Column(columnDefinition = "varchar(255)", length = 255)
	private String spotify;

	@Column(columnDefinition = "varchar(255)", length = 255)
	private String youtube;

	@Column(columnDefinition = "datetime not null")
	private Date dataPublicacao;

	@Column(columnDefinition = "datetime not null")
	private Date dataAgendamento;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getSpotify() {
		return spotify;
	}

	public void setSpotify(String spotify) {
		this.spotify = spotify;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
}
