package br.facisa.pp.Escola.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.facisa.pp.Escola.api.domains.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
	
	List<Disciplina> findBySerie(int serie);

}
