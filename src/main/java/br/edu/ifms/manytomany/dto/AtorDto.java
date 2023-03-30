package br.edu.ifms.manytomany.dto;

import java.io.Serializable;

import br.edu.ifms.manytomany.modelo.Ator;

public class AtorDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private int idade;
	
	public AtorDto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public AtorDto(Ator ator) {
		super();
		this.id = ator.getId();
		this.nome = ator.getNome();
		this.idade = ator.getIdade();
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
