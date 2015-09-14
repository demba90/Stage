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
@Table(name="organisations")
public class Organisation implements Serializable{

	private String codeOrganisation;
	private String libelle;
	private String type;
	private Collection<Fonction> fonctions;
	private Organisation organisationSup;

	public Organisation() {
		super();
	}

	@Id
	public String getCodeOrganisation() {
		return codeOrganisation;
	}

	public void setCodeOrganisation(String codeOrganisation) {
		this.codeOrganisation = codeOrganisation;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(mappedBy="organisation")
	public Collection<Fonction> getFonctions() {
		return fonctions;
	}

	public void setFonctions(Collection<Fonction> fonctions) {
		this.fonctions = fonctions;
	}
	
	@ManyToOne
	@JoinColumn(name="codeOrgSup")
	public Organisation getOrganisationSup() {
		return organisationSup;
	}

	public void setOrganisationSup(Organisation organisationSup) {
		this.organisationSup = organisationSup;
	}
	
	
}
