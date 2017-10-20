package com.dao;

import java.util.List;

import com.model.Persona;

public interface IPersonaDAO {
	public List<Persona> list();
	public Persona get(Persona persona);
	public void saveoOrUpdate(Persona persona);
	public void delete(Persona persona);
}
