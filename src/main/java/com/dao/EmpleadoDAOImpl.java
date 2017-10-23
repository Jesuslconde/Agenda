package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.model.Empleado;


@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO{
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public EmpleadoDAOImpl() {
		
	}
	
	public EmpleadoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	@Transactional
	public List<Empleado> list() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Empleado> listEmpleado = (List<Empleado>) sessionFactory.getCurrentSession()
				.createCriteria(Empleado.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listEmpleado;
		
	}

	@Override
	@Transactional
	public Empleado get(int id) {
		// TODO Auto-generated method stub
		String hql = "from Empleado where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Empleado> listEmpleado = (List<Empleado>) query.list();
		
		if (listEmpleado != null && !listEmpleado.isEmpty()) {
			return listEmpleado.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Empleado empleado) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(empleado);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Empleado empleadoToDelete = new Empleado();
		empleadoToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(empleadoToDelete);
	}

}
