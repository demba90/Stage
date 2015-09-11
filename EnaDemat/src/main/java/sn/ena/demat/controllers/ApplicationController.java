package sn.ena.demat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.ena.demat.entities.Utilisateur;
import sn.ena.demat.repositories.IUtilisateurRepository;

@RestController
public class ApplicationController {
	@Autowired
	private IUtilisateurRepository utilisateurRepository;
	
	@RequestMapping(value="/test")
	public String test(){
		return "test";
	}
	@RequestMapping(value="/saveUser")
	public Utilisateur saveUser(Utilisateur user){
		utilisateurRepository.save(user);
		return user;
	}
}
