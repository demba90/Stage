package sn.ena.demat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etats")
public class Etat implements Serializable{
	
	private String codeEtat;
	
	@Id
	public String getCodeEtat() {
		return codeEtat;
	}

	public void setCodeEtat(String codeEtat) {
		this.codeEtat = codeEtat;
	}

	public Etat() {
		super();
		// TODO Auto-generated constructor stub
	}
}
