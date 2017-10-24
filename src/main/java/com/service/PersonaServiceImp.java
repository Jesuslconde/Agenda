package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.IPersonaDAO;
import com.dao.InterfazDAO;
import com.dao.PersonaDAOImp;
import com.model.Persona;

@Service
public class PersonaServiceImp implements IPersonaService{
	
	@Autowired
	@Qualifier("PersonaDAOImp")
	private InterfazDAO<Persona> personaDAO;
	
	@Override
	public List<Persona> list() {
		return this.personaDAO.list();
	}

	@Override
	public Persona get(int id) {
		//Persona persona = new Persona();
		//persona.setId(id);
		System.out.println("-- id personService "+id);
		return this.personaDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Persona persona) {
		this.personaDAO.saveOrUpdate(persona);
	}

	@Override
	public void delete(Persona persona) {
		this.personaDAO.delete(persona.getId());
	}
}
