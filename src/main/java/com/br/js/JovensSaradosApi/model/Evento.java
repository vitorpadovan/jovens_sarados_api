package com.br.js.JovensSaradosApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(
		indexes = { @Index(name = "unk_evento", columnList = "evento", unique = true),
				@Index(name = "unk_dta_evento", columnList = "dataEvento") }
)
public class Evento {

	@Column(columnDefinition = "boolean not null default true")
	private Boolean ativo = true;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codEvento;

	@Column(columnDefinition = "datetime not null")
	private Date dataEvento;

	@Column(columnDefinition = "datetime not null")
	private Date dataPublicacao;

	@Column(columnDefinition = "text")
	private String detalheEvento;

	@Column(columnDefinition = "varchar(150) not null", length = 150)
	private String evento;

	@Column(columnDefinition = "varchar(255)", length = 150)
	private String urlImagem;

	@Column(columnDefinition = "datetime")
	private Date limiteInscricao;

	@Column(columnDefinition = "varchar(500)", length = 500)
	private String linkInscricao;

	@Column(columnDefinition = "boolean not null default false")
	private Boolean obrigatorioInscricao = false;


	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getCodEvento() {
		return codEvento;
	}

	public void setCodEvento(Integer codEvento) {
		this.codEvento = codEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getDetalheEvento() {
		return detalheEvento;
	}

	public void setDetalheEvento(String detalheEvento) {
		this.detalheEvento = detalheEvento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Date getLimiteInscricao() {
		return limiteInscricao;
	}

	public void setLimiteInscricao(Date limiteInscricao) {
		this.limiteInscricao = limiteInscricao;
	}

	public String getLinkInscricao() {
		return linkInscricao;
	}

	public void setLinkInscricao(String linkInscricao) {
		this.linkInscricao = linkInscricao;
	}

	public Boolean getObrigatorioInscricao() {
		return obrigatorioInscricao;
	}

	public void setObrigatorioInscricao(Boolean obrigatorioInscricao) {
		this.obrigatorioInscricao = obrigatorioInscricao;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
}
