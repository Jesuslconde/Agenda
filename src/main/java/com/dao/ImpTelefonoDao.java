package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Telefono;

/**
 * @Param SessionFactory
 */


@Repository
public class ImpTelefonoDao implements InterfazDAO<Telefono>{

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * Constructores
	 */
	public ImpTelefonoDao(){
		
	}
	
	public ImpTelefonoDao(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * Recupera una lista con todos los telefonos
	 * 
	 *
	 * @return     El Objeto Lista de telefonos.
	 */
	@Override
	@Transactional
	public List<Telefono> list() {
		
		return null;
	}
	
	/**
	 * Recupera un telefono coincidiente con la id 
	 * 
	 *
	 * @param		id del registro a obtener
	 * @return		La lista de Objetos telefonos
	 */
	@Override
	@Transactional
	public Telefono get(int id) {
		
		return (Telefono) sessionFactory.getCurrentSession().get(Telefono.class, id);
		
	}
	
	/**
	 * Añade o actualiza resgistros en tabla
	 * 
	 *
	 * @Param      Objeto Telefono
	 * @return		Lista de Objetos telefonos
	 */
	@Override
	@Transactional
	public void saveOrUpdate(Telefono telefono) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Borra un registro coincidiente con la id introducida
	 * 
	 *
	 * @param     id del registro a borrar
	 */
	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T getSearch(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
