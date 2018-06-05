package it.uniroma3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Centro;
import it.uniroma3.model.Responsabile;

public interface CentroRepository extends CrudRepository<Centro, Long> {

	Centro findById(Long id);
	List<Centro> findByNome(String nome);
	List<Centro> findByTelefono(Integer telefono);
	Centro findByResponsabile(Responsabile responsabile);
	
}
