package br.edu.ifms.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.manytomany.modelo.Ator;

@Repository
public interface RepositoryAtor extends JpaRepository<Ator, Long>{

}
