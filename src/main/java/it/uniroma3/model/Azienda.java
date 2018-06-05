package it.uniroma3.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sun.istack.internal.Nullable;

@Entity
public class Azienda {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@OneToMany	//ok
	@JoinColumn(name="id_centro")
	private Set<Centro> centri;
	
	@OneToMany	//ok
	@JoinColumn(name="id_utente")
	private Set<Utente> utenti;
	
	@OneToMany(mappedBy="azienda")	//ok
	private Set<Responsabile> responsabili;
	
	@OneToOne	//ok
	private Responsabile direttore;
	
}