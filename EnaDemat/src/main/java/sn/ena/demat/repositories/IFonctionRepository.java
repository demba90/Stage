package sn.ena.demat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.ena.demat.entities.Fonction;

public interface IFonctionRepository extends JpaRepository<Fonction, String> {

}
