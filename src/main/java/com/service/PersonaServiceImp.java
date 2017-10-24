package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Persona;

@Transactional
@Service
public class PersonaServiceImp implements InterfazService<Persona>{
	
	@Autowired
	private InterfazDAO<Persona> personaDAO;
	
	//@Autowired
	//@Qualifier("TelefonoDAO")
	//private InterfazDAO<Telefono> telefonoDAO;
	
	@Override
	public List<Persona> list() {
		return this.personaDAO.list();
	}

	@Override
	public Persona get(Persona id) {
		int key = id.getId();
		Persona per = this.personaDAO.get(key);
		return per;
		
	}

	@Override
	public void saveOrUpdate(Persona persona) {
		
	}

	@Override
	public void delete(Persona persona) {
		this.personaDAO.delete(persona);
	}

}
