package it.uniroma3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Centro;
import it.uniroma3.model.Responsabile;

public interface CentroRepository extends CrudRepository<Centro, Long> {

	Optional<Centro> findById(Long id);
	List<Centro> findByNome(String nome);
	List<Centro> findByTelefono(Integer telefono);
	Optional<Centro> findByResponsabile(Responsabile responsabile);
	
}
