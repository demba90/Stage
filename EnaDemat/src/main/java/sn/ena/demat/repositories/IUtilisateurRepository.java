package sn.ena.demat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ena.demat.entities.Utilisateur;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	
}
