package sn.ena.demat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historiques")
public class Historique implements Serializable {
	
	private Long id;
	private Long dossierId;
	private String EtatCode;
	private Date dateCreation;
	private String action;
	private String fonctionCode;
	
	public Historique() {
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
	
	public Long getDossierId() {
		return dossierId;
	}
	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}
	public String getEtatCode() {
		return EtatCode;
	}
	public void setEtatCode(String etatCode) {
		EtatCode = etatCode;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getFonctionCode() {
		return fonctionCode;
	}
	public void setFonctionCode(String fonctionCode) {
		this.fonctionCode = fonctionCode;
	}
}
