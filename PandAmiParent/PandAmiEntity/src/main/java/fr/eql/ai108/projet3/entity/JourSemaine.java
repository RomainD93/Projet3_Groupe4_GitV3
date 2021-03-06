package fr.eql.ai108.projet3.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jour_semaine")
public class JourSemaine implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomJour;
	
	@ManyToOne
	private Disponibilite disponibilite;

	public JourSemaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JourSemaine(Integer id, String nomJour) {
		super();
		this.id = id;
		this.nomJour = nomJour;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomJour() {
		return nomJour;
	}

	public void setNomJour(String nomJour) {
		this.nomJour = nomJour;
	}

	public Disponibilite getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Disponibilite disponibilite) {
		this.disponibilite = disponibilite;
	}

	
}
