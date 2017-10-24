package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Departamento;
import com.model.Direccion;
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
	@Override
	
	public List<Telefono> get(int key) {
		
		
		String hql = "from Telefono where persona = " + key;
		String hq = "FROM Telefono t, Persona p where t.persona=p.id and p.id=" + key;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		System.out.println(query.list().toString());
		List<Telefono> telefono = query.list();
		
		return telefono;
		
	}
	
	/**
	 * Añade o actualiza resgistros en tabla
	 * 
	 *
	 * @Param      Objeto Telefono
	 * @return		Lista de Objetos telefonos
	 */
	@Override
	
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
	
	public void delete(int id) {
		
		Telefono telefonoToDelete = new Telefono();
		telefonoToDelete.setIdtelefono(id);
		sessionFactory.getCurrentSession().delete(telefonoToDelete);
		
	}

	@Override
	public Object getSearch(String key) {
		// TODO Auto-generated method stub
		return null;
	}


}
