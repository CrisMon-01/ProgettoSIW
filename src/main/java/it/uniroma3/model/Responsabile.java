package it.uniroma3.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Responsabile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable=false)
	private String user;
	
	@Column(nullable=false)
	private String password;
	
	@ManyToOne	//ok
	private Azienda azienda;
	
	@OneToOne	//ok
	private Azienda aziendadiretta;
	
	@OneToOne	//ok
	private Centro centro;
	
}
