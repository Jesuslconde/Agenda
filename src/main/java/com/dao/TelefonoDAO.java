package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Departamento;
import com.model.Telefono;

/**
 * @Param
 */


@Repository
public class TelefonoDAO implements InterfazDAO{

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
	@Transactional
	public List<Telefono> list() {
		@SuppressWarnings("unchecked")
		List<Telefono> listTelefono = (List<Telefono>) sessionFactory.getCurrentSession()
				.createCriteria(Telefono.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listTelefono;
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
	public void saveOrUpdate(Object telefono) {
		sessionFactory.getCurrentSession().saveOrUpdate((Departamento)telefono);
		
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
		
		Telefono telefonoToDelete = new Telefono();
		telefonoToDelete.setIdtelefono(id);
		sessionFactory.getCurrentSession().delete(telefonoToDelete);
		
	}


}
