package com.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Direccion;

@Repository
@Transactional
public class DireccionDAO implements InterfazDAO<Direccion>{

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
					.createCriteria(Direccion.class).list();
			return listDireccion;
	}

	@Override
	public Direccion get(int id) {
		return (Direccion) sessionFactory.getCurrentSession().get(Direccion.class, id);
	}

	@Override
	public void saveOrUpdate(Direccion direccion) {
		sessionFactory.getCurrentSession().saveOrUpdate((Direccion)direccion);
	}

	@Override
	public void delete(Direccion direccionToDelete) {
		sessionFactory.getCurrentSession().delete(direccionToDelete);	
	}

	
}
