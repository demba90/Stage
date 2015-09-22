package sn.ena.demat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transitions")
public class Transition implements Serializable{
	
	private String codeTransition;
	private Etat etat;

	public Transition() {
		super();
	}
	@Id
	public String getCodeTransition() {
		return codeTransition;
	}

	public void setCodeTransition(String codeTransition) {
		this.codeTransition = codeTransition;
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
