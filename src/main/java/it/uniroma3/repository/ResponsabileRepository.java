package it.uniroma3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Centro;
import it.uniroma3.model.Responsabile;

public interface ResponsabileRepository extends CrudRepository<Responsabile, Long>{

	Optional<Responsabile> findById(Long id);
	List<Responsabile> findByNome(String nome);
	List<Responsabile> findByCognome(String cognome);
	Optional<Responsabile> findByCentro(Centro centro);
}
