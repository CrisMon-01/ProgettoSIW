package it.uniroma3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long>{

	Optional<Utente> findById(Long id);
	List<Utente> findByNome(String nome);
	List<Utente> findByCognome(String cognome);
	List<Utente> findByEmail(String email);
//	List<Utente> findByIndirizo(String indirizzo);
}
