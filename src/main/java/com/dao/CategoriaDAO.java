package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Categoria;

import com.model.Empleado;

@Repository
@Transactional
public class CategoriaDAO implements InterfazDAO<Categoria> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoriaDAO(){
		
	}
	
	public CategoriaDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Categoria> list() {
		System.out.println("--CategoriaDAO.list");
		List<Categoria> listUser = (List<Categoria>) sessionFactory.getCurrentSession()
				.createCriteria(Categoria.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Categoria cat) {
		sessionFactory.getCurrentSession().saveOrUpdate(cat);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		Categoria catToDelete = new Categoria();
		catToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(catToDelete);
	}
	
	@Override
	@Transactional
	public Categoria get(int id) {
		return (Categoria) sessionFactory.getCurrentSession().get(Categoria.class,id);
		
	}
}
