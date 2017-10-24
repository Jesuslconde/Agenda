package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Categoria;

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
	
	@Override
	
	public List<Categoria> list() {
		@SuppressWarnings("unchecked")
		List<Categoria> listUser = (List<Categoria>) sessionFactory.getCurrentSession()
				.createCriteria(Categoria.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}
	
	@Override
	public void saveOrUpdate(Categoria cat) {
		sessionFactory.getCurrentSession().saveOrUpdate((Categoria)cat);
	}
	
	
	@Override
	public void delete(Categoria catToDelete) {
		sessionFactory.getCurrentSession().delete(catToDelete);
	}
	
	@Override	
	public Categoria get(int id) {
		return (Categoria) sessionFactory.getCurrentSession().get(Categoria.class,id);
		
	}
}
