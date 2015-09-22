package sn.ena.demat.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.ena.demat.entities.Organisation;

public interface IOrganisationRepository extends JpaRepository<Organisation, String> {

	@Query("Select o from Organisation o")
	public List<Organisation> findAllOrganisation();
	
}
