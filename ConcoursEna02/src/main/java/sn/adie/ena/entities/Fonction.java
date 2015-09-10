package sn.adie.ena.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fonctions")
public class Fonction implements Serializable{
	@Id
	private String codeFonction;
	private String libelle;
	private String url;
	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="codeOrganisation")
	private Organisation organisation;
	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fonction(String codeFonction, String libelle, String url,
			Utilisateur utilisateur, Organisation organisation) {
		super();
		this.codeFonction = codeFonction;
		this.libelle = libelle;
		this.url = url;
		this.utilisateur = utilisateur;
		this.organisation = organisation;
	}
	public Fonction(String codeFonction, String libelle, String url) {
		super();
		this.codeFonction = codeFonction;
		this.libelle = libelle;
		this.url = url;
	}
	public String getCodeFonction() {
		return codeFonction;
	}
	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Organisation getOrganisation() {
		return organisation;
	}
	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}
	
}
