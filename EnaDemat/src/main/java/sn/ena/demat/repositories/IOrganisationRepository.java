package sn.ena.demat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.ena.demat.entities.Organisation;

public interface IOrganisationRepository extends JpaRepository<Organisation, String> {

}
