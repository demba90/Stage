package sn.ena.demat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="fichiersfournies")
@DiscriminatorValue("FichiersFournie")
public class FichiersFournie extends Piece{
	
	public FichiersFournie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Fichiers Fournie";
	}
}
