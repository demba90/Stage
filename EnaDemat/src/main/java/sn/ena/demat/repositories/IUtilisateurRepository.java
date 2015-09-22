package sn.ena.demat.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ena.demat.entities.Fonction;
import sn.ena.demat.entities.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	/*JpaRepository hérite de CrudRepository donc on peut étendre le plus large dans notre cas*/
	@Query("select u from Utilisateur u where nom like :x or prenom like :x")
	public Utilisateur findUtilisateurByMc(@Param("x")String q);
	@Query("select u from Utilisateur u where u.fonction.codeFonction = :x")
	public List<Fonction> findFonctionByUser(@Param("x")String f);
}
