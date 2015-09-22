package sn.ena.demat.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="dossiers")
public class Dossier implements Serializable{
	
	private Long id;
	
	private Procedure procedure;
	private Formulaire formulaire;
	private Etat etat;
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codeProcedure")
	public Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}
	
	@OneToOne(cascade=CascadeType.ALL,optional=false,fetch=FetchType.LAZY)
	//optional permet de dire si oui ou non il on enregistre un dossier sans remplir un formulaire
	@JoinColumn(name="FORMULAIRE_ID")
	@PrimaryKeyJoinColumn
	public Formulaire getFormulaire() {
		return formulaire;
	}
	public void setFormulaire(Formulaire formulaire) {
		this.formulaire = formulaire;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codeEtat")
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
}
