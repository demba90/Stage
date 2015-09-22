package sn.ena.demat.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pieces")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PIECE",
discriminatorType=DiscriminatorType.STRING,
length=25)
public class Piece implements Serializable{
	private Long id;
	private String nomPiece;
	
	private Dossier dossier;

	public Piece() {
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

	public String getNomPiece() {
		return nomPiece;
	}

	public void setNomPiece(String nomPiece) {
		this.nomPiece = nomPiece;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codeDossier")
	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	
}
