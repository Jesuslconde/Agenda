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
public class CategoriaDAO implements InterfazDAO<Categoria> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoriaDAO(){
		System.out.println("constructor categoriaDAO");
	}
	
	public CategoriaDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
		System.out.println("-constructor categoriaDAO");
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
	@Override
	public Categoria buscaPorEmpleados(int id){
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Empleado.class);
		crit.add(Restrictions.eq("idEmp",id));
		Empleado empleado = (Empleado) crit.uniqueResult();
		return empleado.getCategoria();
	}
	@Override
	public List<Empleado> buscaListado(Categoria cat){
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Empleado.class);
		crit.add(Restrictions.eq("cat",cat));
		return crit.list();
	}
}
