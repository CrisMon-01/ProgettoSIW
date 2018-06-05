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
	
	//GET SET
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Centro> getCentri() {
		return centri;
	}
	
	public void setCentri(Set<Centro> centri) {
		this.centri = centri;
	}
	
	public Set<Utente> getUtenti() {
		return utenti;
	}
	
	public void setUtenti(Set<Utente> utenti) {
		this.utenti = utenti;
	}
	
	public Set<Responsabile> getResponsabili() {
		return responsabili;
	}
	
	public void setResponsabili(Set<Responsabile> responsabili) {
		this.responsabili = responsabili;
	}
	
	public Responsabile getDirettore() {
		return direttore;
	}
	
	public void setDirettore(Responsabile direttore) {
		this.direttore = direttore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Azienda other = (Azienda) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
}