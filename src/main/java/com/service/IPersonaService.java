package com.service;

import java.util.List;

import com.model.Persona;

public interface IPersonaService {
	public List<Persona> list();
	public Persona get(int id);
	public void saveOrUpdate(Persona persona);
	public void delete(Persona persona);
}
