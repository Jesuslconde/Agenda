package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Telefono;

/**
 * @Param
 */


@Repository
@Transactional
public class TelefonoDAO implements InterfazDAO<Telefono>{

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * Constructores
	 */
	public TelefonoDAO(){
		
	}
	
	public TelefonoDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * Recupera una lista con todos los telefonos
	 * 
	 *
	 * @return     El Objeto Lista de telefonos.
	 */
	@Override
	
	public List<Telefono> list() {
		@SuppressWarnings("unchecked")
		List<Telefono> listTelefono = (List<Telefono>) sessionFactory.getCurrentSession()
				.createCriteria(Telefono.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listTelefono;
	}
	
	/**
	 * Recupera un telefono coincidiente con la id de la persona dueña
	 * 
	 *
	 * @param		id del registro a obtener
	 * @return 
	 * @return		La lista de Objetos telefonos
	 */
	
	
	public Telefono get(int key) {
		return null;
	
	}
	
	/**
	 * Añade o actualiza resgistros en tabla
	 * 
	 *
	 * @Param      Objeto Telefono
	 * @return		Lista de Objetos telefonos
	 */
	@Override
	
	public void saveOrUpdate(Telefono telefono) {
		sessionFactory.getCurrentSession().saveOrUpdate(telefono);
		
	}
	
	/**
	 * Borra un registro coincidiente con la id introducida
	 * 
	 *
	 * @param     id del registro a borrar
	 */
	@Override
	
	public void delete(Telefono telefonoToDelete) {
		
		sessionFactory.getCurrentSession().delete(telefonoToDelete);
		
	}


}
