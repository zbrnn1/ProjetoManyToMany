package br.edu.ifms.manytomany.dto;

import java.io.Serializable;

import br.edu.ifms.manytomany.modelo.Filme;

public class FilmeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private int ano;
	
	public FilmeDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public FilmeDto(Filme filme) {
		super();
		this.id = filme.getId();
		this.nome = filme.getNome();
		this.ano = filme.getAno();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
