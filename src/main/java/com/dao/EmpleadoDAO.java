package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Categoria;
import com.model.Departamento;
import com.model.Empleado;

@Repository
public class EmpleadoDAO implements InterfazDAO<Empleado>{
	@Autowired
	private SessionFactory sessionFactory;
	
	public EmpleadoDAO(){
		System.out.println("constructor categoriaDAO");
	}
	
	public EmpleadoDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
		System.out.println("-constructor categoriaDAO");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Empleado> list() {
		System.out.println("--EmpleadoDAO.list");
		List<Empleado> listUser = (List<Empleado>) sessionFactory.getCurrentSession()
				.createCriteria(Empleado.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Empleado emp) {
		sessionFactory.getCurrentSession().saveOrUpdate(emp);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		Empleado empToDelete = new Empleado();
		empToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(empToDelete);
	}
	
	@Override
	@Transactional
	public Empleado get(int id) {
		return (Empleado) sessionFactory.getCurrentSession().get(Empleado.class,id);
		
	}
	@Override
	public Empleado buscaPorEmpleados(int id){
		return this.get(id);
	}
	@Override
	public List<Empleado> buscaListado(Empleado empleado){
		
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Empleado.class);
		crit.add(Restrictions.eq("this", empleado));
		return crit.list();
	}
}
