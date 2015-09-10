package sn.adie.ena.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="organisations")
public class Organisation implements Serializable{
	@Id
	private String codeOrganisation;
	private String libelle;
	private String type;
	@OneToMany(mappedBy="codeFonction")
	private Collection<Fonction> fonctions;
	@OneToMany(mappedBy="codeSubOrganisation")
	private String codeSubOrganisation;
	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organisation(String codeOrganisation, String libelle, String type) {
		super();
		this.codeOrganisation = codeOrganisation;
		this.libelle = libelle;
		this.type = type;
	}
	public Organisation(String codeOrganisation, String libelle, String type,
			Collection<Fonction> fonctions) {
		super();
		this.codeOrganisation = codeOrganisation;
		this.libelle = libelle;
		this.type = type;
		this.fonctions = fonctions;
	}
	public Organisation(String codeOrganisation, String libelle, String type,
			String codeSubOrganisation) {
		super();
		this.codeOrganisation = codeOrganisation;
		this.libelle = libelle;
		this.type = type;
		this.codeSubOrganisation = codeSubOrganisation;
	}
	
	
}
