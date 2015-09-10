package sn.adie.ena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.adie.ena.entities.Utilisateur;

public interface  IUtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	
}
