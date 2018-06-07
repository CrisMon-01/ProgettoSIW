package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Centro;
import it.uniroma3.model.Responsabile;
import it.uniroma3.model.Utente;
import it.uniroma3.repository.CentroRepository;


public class CentroService {

	@Autowired
	private CentroRepository centroRepository;
	
	public Centro save (Centro centro) {
		return this.centroRepository.save(centro);
	}
	
	public List<Centro> findAll(){
		return (List<Centro>) this.centroRepository.findAll();
	}
	
	public boolean isResponsabile(Responsabile r) {
		return (this.centroRepository.findByResponsabile(r)!=null);			
	}
	
}
