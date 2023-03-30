package br.edu.ifms.manytomany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.manytomany.dto.AtorDto;
import br.edu.ifms.manytomany.modelo.Ator;
import br.edu.ifms.manytomany.repository.RepositoryAtor;



@Service
public class AtorService {
	@Autowired
	private RepositoryAtor repositoryAtor;
	
	public List<Ator> buscarTodos(){
		return repositoryAtor.findAll();
	}
	
	public Ator buscarPorId(Long id) {
		Optional< Ator> ator = repositoryAtor.findById(id);
		return ator.orElseThrow();		
	}
	public Ator inserir(Ator ator) {
		ator.setId(null);
		return repositoryAtor.save(ator);
	}
	
	public void remover(Long id) {
		buscarPorId(id);
		repositoryAtor.deleteById(id);		
	}

	public Ator atualizar(Ator ator) {
		Ator atorNew = buscarPorId(ator.getId());
		 atorNew.setNome(ator.getNome()); 
		 atorNew.setIdade(ator.getIdade()); 
		return repositoryAtor.save(atorNew);
	}
	public Ator fromDto(AtorDto atorDto) {
		return new Ator(atorDto.getId(),atorDto.getNome(),atorDto.getIdade());
	}	
}
