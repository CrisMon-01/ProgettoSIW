package it.uniroma3.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Centro {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;

	@Column(nullable=false)
	private String indirizzo;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private Integer telefono;
	
	@Column(nullable=false)	
	private Integer capienzamax;
	
	@OneToOne	//ok
	private Responsabile responsabile;
	
	@OneToMany(mappedBy="centro")	//ok
	private List<Attivita> attivita;

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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getCapienzamax() {
		return capienzamax;
	}

	public void setCapienzamax(Integer capienzamax) {
		this.capienzamax = capienzamax;
	}

	public Responsabile getResponsabile() {
		return responsabile;
	}

	public void setResponsabile(Responsabile responsabile) {
		this.responsabile = responsabile;
	}

	public List<Attivita> getAttivita() {
		return attivita;
	}

	public void setAttivita(List<Attivita> attivita) {
		this.attivita = attivita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capienzamax == null) ? 0 : capienzamax.hashCode());
		result = prime * result + ((indirizzo == null) ? 0 : indirizzo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Centro other = (Centro) obj;
		if (capienzamax == null) {
			if (other.capienzamax != null)
				return false;
		} else if (!capienzamax.equals(other.capienzamax))
			return false;
		if (indirizzo == null) {
			if (other.indirizzo != null)
				return false;
		} else if (!indirizzo.equals(other.indirizzo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
	
}
