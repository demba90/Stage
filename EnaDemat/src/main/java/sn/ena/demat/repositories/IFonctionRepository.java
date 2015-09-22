package sn.ena.demat.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ena.demat.entities.Fonction;
import sn.ena.demat.entities.Organisation;

public interface IFonctionRepository extends JpaRepository<Fonction, String> {

	@Query("Select f from Fonction f where f.organisation.codeOrganisation = :x")
	public List<Fonction> findAllFunctionsByOrg(@Param("x")String org);
}
