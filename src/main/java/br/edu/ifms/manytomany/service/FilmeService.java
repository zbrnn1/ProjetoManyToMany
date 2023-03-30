package br.edu.ifms.manytomany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.edu.ifms.manytomany.dto.FilmeDto;

import br.edu.ifms.manytomany.modelo.Filme;

import br.edu.ifms.manytomany.repository.RepositoryFilme;

@Service
public class FilmeService {
	@Autowired
	private RepositoryFilme repositoryFilme;
	
	public List<Filme> buscarTodos(){
		return repositoryFilme.findAll();
	}
	
	public Filme buscarPorId(Long id) {
		Optional<Filme> filme = repositoryFilme.findById(id);
		return filme.orElseThrow();		
	}
	public Filme inserir(Filme filme) {
		filme.setId(null);
		return repositoryFilme.save(filme);
	}
	
	public void remover(Long id) {
		buscarPorId(id);
		repositoryFilme.deleteById(id);		
	}

	public Filme atualizar(Filme filme) {
		Filme filmeNew = buscarPorId(filme.getId());
		filmeNew.setNome(filme.getNome()); 
		filmeNew.setAno(filme.getAno()); 
		return repositoryFilme.save(filmeNew);
	}
	public Filme fromDto(FilmeDto filmeDto) {
		return new Filme(filmeDto.getId(),filmeDto.getNome(),filmeDto.getAno());
	}	
}
