package sn.ena.demat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fonctions")
public class Fonction implements Serializable{

	private String codeFonction;
	private String libelle;
	private String url;

	private Collection<Utilisateur> utilisateurs;

	private Organisation organisation;

	public Fonction(){
		super();
	}
	@OneToMany(mappedBy="fonction")
	public Collection<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}


	@Id
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

	@ManyToOne
	@JoinColumn(name="codeOrganisation")
	public Organisation getOrganisation() {
		return organisation;
	}
	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

}
