package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IPersonaDAO;
import com.model.Persona;

@Service
public class PersonaServiceImp implements IPersonaService{
	
	@Autowired
	private IPersonaDAO personaDAO;
	
	@Override
	public List<Persona> list() {
		return this.personaDAO.list();
	}

	@Override
	public Persona get(int id) {
		Persona persona = new Persona();
		persona.setId(id);
		return this.personaDAO.get(persona);
	}

	@Override
	public void saveoOrUpdate(Persona persona) {
		this.personaDAO.saveoOrUpdate(persona);
	}

	@Override
	public void delete(Persona persona) {
		this.personaDAO.delete(persona);
	}

}
