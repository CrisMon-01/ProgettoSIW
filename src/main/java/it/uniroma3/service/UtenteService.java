package it.uniroma3.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.uniroma3.model.Utente;
import it.uniroma3.repository.UtenteRepository;

@Transactional
@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepo;
	
	public Utente save (Utente utente) {
		return this.utenteRepo.save(utente);
	}
	
	public List<Utente> findAll(){
		return (List<Utente>) this.utenteRepo.findAll();
	}
	
	public Utente findById(Long id) {
		Optional<Utente> utente = this.utenteRepo.findById(id);
		if (utente.isPresent()) 
			return utente.get();
		else
			return null;
	}
	
	public boolean alreadyExists(Utente u) {
		List<Utente> utenti = this.utenteRepo.findByEmail(u.getEmail());
		if (utenti.size() > 0)
			return true;
		else 
			return false;
	}	
	
}
