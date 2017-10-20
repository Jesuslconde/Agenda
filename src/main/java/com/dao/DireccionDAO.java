package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Departamento;
import com.model.Direccion;
import com.model.Telefono;

@Repository
public class DireccionDAO implements InterfazDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public DireccionDAO() {
	
	}
	
	public DireccionDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Direccion> list() {
			@SuppressWarnings("unchecked")
			List<Direccion> listDireccion = (List<Direccion>) sessionFactory.getCurrentSession()
					.createCriteria(Direccion.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listDireccion;

	}

	@Override
	public Object get(int id) {
		return (Direccion) sessionFactory.getCurrentSession().get(Direccion.class, id);
	}

	@Override
	public void saveOrUpdate(Object direccion) {
		sessionFactory.getCurrentSession().saveOrUpdate((Departamento)direccion);
	}

	@Override
	public void delete(int id) {
		Direccion direccionToDelete = new Direccion();
		direccionToDelete.setIddireccion(id);
		sessionFactory.getCurrentSession().delete(direccionToDelete);
		
	}
	
}
