package sn.ena.demat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.ena.demat.entities.Fonction;
import sn.ena.demat.entities.Organisation;
import sn.ena.demat.entities.Utilisateur;
import sn.ena.demat.repositories.IFonctionRepository;
import sn.ena.demat.repositories.IOrganisationRepository;
import sn.ena.demat.repositories.IUtilisateurRepository;

@RestController
public class ApplicationController {
	@Autowired
	private IUtilisateurRepository utilisateurRepository;
	@Autowired
	private IFonctionRepository fonctionRepository;
	@Autowired
	private IOrganisationRepository organisationRepository;
	
	@RequestMapping(value="/test")
	public String test(){
		return "test";
	}
	
	/*insertion*/
	@RequestMapping(value="/saveUser")
	public Utilisateur saveUser(Utilisateur user){
		utilisateurRepository.save(user);
		return user;
	}
	@RequestMapping(value="/saveOrg")
	public Organisation saveOrganisation(Organisation org){
		organisationRepository.save(org);
		return org;
	}
	
	@RequestMapping(value="/saveFunction")
	public Fonction saveFunction(Fonction f){
		fonctionRepository.save(f);
		return f;
	}
	
	/*consultation*/
	@RequestMapping(value="/allUsers")
	public List<Utilisateur> getAllUsers(){
		return utilisateurRepository.findAll();		
	}
	@RequestMapping(value="/allFunctions")
	public List<Fonction> getAllFunctions(){
		return fonctionRepository.findAll();
	}
	@RequestMapping(value="/allOrganisations")
	public List<Organisation> getAllOrganisations(){
		return organisationRepository.findAll();
	}
	
	
}
