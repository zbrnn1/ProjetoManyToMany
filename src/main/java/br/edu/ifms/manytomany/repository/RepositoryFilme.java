package br.edu.ifms.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.manytomany.modelo.Filme;
@Repository
public interface RepositoryFilme  extends JpaRepository<Filme, Long>{

}
