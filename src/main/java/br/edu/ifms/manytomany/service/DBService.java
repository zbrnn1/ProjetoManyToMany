package br.edu.ifms.manytomany.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.manytomany.modelo.Ator;
import br.edu.ifms.manytomany.modelo.Filme;
import br.edu.ifms.manytomany.repository.RepositoryAtor;
import br.edu.ifms.manytomany.repository.RepositoryFilme;

@Service
public class DBService {
	@Autowired
	RepositoryAtor repositoryAtor;
	@Autowired
	RepositoryFilme repositoryFilme;
	
	public void instantiateTestDatabase()  throws ParseException{
		Ator aBruno = new Ator(null,"Bruno",21);;
		Ator aFulano = new Ator(null,"Fulano",22);
		
		Filme f1 = new Filme(null,"Gente grande",2022);
		Filme f2 = new Filme(null,"Gente grande 2",2023);
		Filme f3 = new Filme(null,"Gente grande 3",2023);
		Filme f4 = new Filme(null,"Gente grande 4",2023);
		
		
		aBruno.getFilmes().addAll(Arrays.asList(f1,f3));
		aFulano.getFilmes().addAll(Arrays.asList(f2,f4));
		
		f1.getAtores().addAll(Arrays.asList(aBruno));
		f2.getAtores().addAll(Arrays.asList(aFulano));
		f3.getAtores().addAll(Arrays.asList(aBruno));
		f4.getAtores().addAll(Arrays.asList(aFulano));
		
		repositoryAtor.saveAll(Arrays.asList(aBruno,aFulano));
		repositoryFilme.saveAll(Arrays.asList(f1,f2,f3,f4));
		
	}
}
