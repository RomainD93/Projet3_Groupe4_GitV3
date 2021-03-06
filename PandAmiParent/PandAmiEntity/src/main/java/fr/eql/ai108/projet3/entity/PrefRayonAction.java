package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pref_rayon_action")
public class PrefRayonAction implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer rayonAction;
	
	private Date dateDbtPref;
	
	private Date dateFinPref;

		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRayonAction() {
		return rayonAction;
	}

	public void setRayonAction(Integer rayonAction) {
		this.rayonAction = rayonAction;
	}

	public Date getDateDbtPref() {
		return dateDbtPref;
	}

	public void setDateDbtPref(Date dateDbtPref) {
		this.dateDbtPref = dateDbtPref;
	}

	public Date getDateFinPref() {
		return dateFinPref;
	}

	public void setDateFinPref(Date dateFinPref) {
		this.dateFinPref = dateFinPref;
	}

	public PrefRayonAction(Integer id, Integer rayonAction, Date dateDbtPref, Date dateFinPref) {
		super();
		this.id = id;
		this.rayonAction = rayonAction;
		this.dateDbtPref = dateDbtPref;
		this.dateFinPref = dateFinPref;
	}

	public PrefRayonAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
