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
	 * @return La Persona por la que se realizo la busqueda.
	 */
	public Persona get(Persona persona);
	/**
	 * Metodo para guardar una nueva Persona o guardar los cambios si existe en la BD. 
	 * @param persona, objeto de la clase Persona que se desea guardar o actualizar en la BD.
	 */
	public void saveoOrUpdate(Persona persona);
	/**
	 * Metodo para eliminar una persona
	 * @param persona, objeto de la clase Persona que se va a eliminar en el BD,
	 */
	public void delete(Persona persona);
}
