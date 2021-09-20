package com.br.js.JovensSaradosApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Evento {
	
	@Id
	private int codEvento;
	private String evento;
	public int getCodEvento() {
		return codEvento;
	}
	public void setCodEvento(int codEvento) {
		this.codEvento = codEvento;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
}
