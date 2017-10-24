package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Persona;

@Transactional
@Service
public class PersonaServiceImp implements InterfazService<Persona>{
	
	@Autowired
	@Qualifier("personaDAO")
	private InterfazDAO<Persona> perDAO;
	
	//@Autowired
	//@Qualifier("TelefonoDAO")
	//private InterfazDAO<Telefono> telefonoDAO;
	
	@Override
	public List<Persona> list() {
		System.out.println("Entra en servicio");
		return this.perDAO.list();
	}

	@Override
	public Persona get(Persona id) {
		int key = id.getId();
		Persona per = this.perDAO.get(key);
		return per;
		
	}

	@Override
	public void saveOrUpdate(Persona persona) {
		
	}

	@Override
	public void delete(Persona persona) {
		this.perDAO.delete(persona);
	}

}
