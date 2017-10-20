package com.dao;

import java.util.List;

import com.model.Persona;
/**
 * 
 * @author Rafael Ferrer
 *
 */
public interface IPersonaDAO {
	/**
	 * Metodo que busca todas las Personas de la BD.
	 * @return Lista con todas las Personas de la BD.
	 */
	public List<Persona> list();
	/**
	 * Metodo para buscar una Persona.
	 * @param persona, objeto de clase Persona para la busqueda.
	 * @return 
	 */
	public Persona get(Persona persona);
	public void saveoOrUpdate(Persona persona);
	public void delete(Persona persona);
}
