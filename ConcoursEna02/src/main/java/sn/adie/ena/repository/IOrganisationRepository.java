package sn.adie.ena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.adie.ena.entities.Organisation;

public interface IOrganisationRepository extends JpaRepository<Organisation, String> {

}
