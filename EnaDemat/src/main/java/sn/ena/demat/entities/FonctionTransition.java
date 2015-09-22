package sn.ena.demat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fonctionTransitions")
public class FonctionTransition implements Serializable{
	
	private String codeFT;
	private Fonction fonction;
	private Transition transition;
	
	public FonctionTransition() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	public String getCodeFT() {
		return codeFT;
	}

	public void setCodeFT(String codeFT) {
		this.codeFT = codeFT;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codeFonction")
	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codeTransition")
	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}
	
	
}
