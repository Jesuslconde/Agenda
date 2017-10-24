package com.service;

import java.util.List;

import com.model.Persona;

public interface IPersonaService {
	public List<Persona> list();
	public Persona get(String id);
	public void saveoOrUpdate(Persona persona);
	public void delete(Persona persona);
}
