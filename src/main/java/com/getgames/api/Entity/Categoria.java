package com.getgames.api.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String categoria;

	@Embedded
	private List<Jogo> jogos = new ArrayList<>();  //ANOTAÇÃO embedded PEDE Q A CLASSE EM QUESTÃO SEJA ANOTADA TAMBEM COM **embeddable**

	public Categoria(Integer id, String categoria, List<Jogo> jogos) {
		this.id = id;
		this.categoria = categoria;
		this.jogos = jogos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

}
