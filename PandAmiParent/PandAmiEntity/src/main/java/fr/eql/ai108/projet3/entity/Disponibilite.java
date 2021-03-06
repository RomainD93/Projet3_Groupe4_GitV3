package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "disponibilite")
public class Disponibilite implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date heureDbtDispo;
	
	private Date heureFinDispo;
	
	private Date dbtValiditeDispo;
	
	private Date finValiditeDispo;
	
	@OneToMany (mappedBy = "disponibilite", fetch = FetchType.EAGER)
	private Set<JourSemaine> joursDeDispo;
	
	
	private Utilisateur utilisateur;

	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Disponibilite(Integer id, Date heureDbtDispo, Date heureFinDispo, Date dbtValiditeDispo,
			Date finValiditeDispo, Set<JourSemaine> joursDeDispo, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.heureDbtDispo = heureDbtDispo;
		this.heureFinDispo = heureFinDispo;
		this.dbtValiditeDispo = dbtValiditeDispo;
		this.finValiditeDispo = finValiditeDispo;
		this.joursDeDispo = joursDeDispo;
		this.utilisateur = utilisateur;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getHeureDbtDispo() {
		return heureDbtDispo;
	}

	public void setHeureDbtDispo(Date heureDbtDispo) {
		this.heureDbtDispo = heureDbtDispo;
	}

	public Date getHeureFinDispo() {
		return heureFinDispo;
	}

	public void setHeureFinDispo(Date heureFinDispo) {
		this.heureFinDispo = heureFinDispo;
	}

	public Date getDbtValiditeDispo() {
		return dbtValiditeDispo;
	}

	public void setDbtValiditeDispo(Date dbtValiditeDispo) {
		this.dbtValiditeDispo = dbtValiditeDispo;
	}

	public Date getFinValiditeDispo() {
		return finValiditeDispo;
	}

	public void setFinValiditeDispo(Date finValiditeDispo) {
		this.finValiditeDispo = finValiditeDispo;
	}



	public Set<JourSemaine> getJoursDeDispo() {
		return joursDeDispo;
	}

	public void setJoursDeDispo(Set<JourSemaine> joursDeDispo) {
		this.joursDeDispo = joursDeDispo;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	} 
	
	
	
	

}
