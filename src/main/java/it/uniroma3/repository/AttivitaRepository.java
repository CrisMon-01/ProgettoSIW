package it.uniroma3.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Attivita;

public interface AttivitaRepository extends CrudRepository<Attivita, Long>{

	List<Attivita> findByNome(String nome);
	List<Attivita> findByData(Date data);
	Optional<Attivita> findById(Long id);
}
