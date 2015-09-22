package sn.ena.demat.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="actes")
@DiscriminatorValue("Acte")
public class Acte extends Piece{

	public Acte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Acte";
	}
}
