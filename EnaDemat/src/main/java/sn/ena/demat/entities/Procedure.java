package sn.ena.demat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="procedures")
public class Procedure implements Serializable{
	
	private String codeProcedure;
	private String libelle;
	
	private Organisation organisation;
	
	public Procedure() {
		super();
	}
	@Id
	public String getCodeProcedure() {
		return codeProcedure;
	}
	public void setCodeProcedure(String codeProcedure) {
		this.codeProcedure = codeProcedure;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
