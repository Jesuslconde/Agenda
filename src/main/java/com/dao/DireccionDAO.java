package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
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
	public Object get(int id) {
		return (Direccion) sessionFactory.getCurrentSession().get(Direccion.class, id);
	}

	@Override
	public void saveOrUpdate(Object direccion) {
		sessionFactory.getCurrentSession().saveOrUpdate((Direccion)direccion);
	}

	@Override
	public void delete(int id) {
		Direccion direccionToDelete = new Direccion();
		direccionToDelete.setIddireccion(id);
		sessionFactory.getCurrentSession().delete(direccionToDelete);	
	}
	public List<Direccion> getSearch(String key) {
		
		/*List<Direccion> direccion = sessionFactory.getCurrentSession().createCriteria(Direccion.class)
			    .add(Restrictions.ilike("direccion", "madrid"))
			    /*.add( Restrictions.like("localidad", key) )
			    .add( Restrictions.like("provincia", key) )
			    .list();*/
		/*System.out.println("despues de la query");
		Direccion d = new Direccion();
		d.setDireccion(key);
		 List<Direccion> direccion =  sessionFactory.getCurrentSession().createCriteria(Direccion.class)
				 .add(Restrictions.like("direccion", d)).list();
		 System.out.println(direccion.toString());*/
		String hql = "from Direccion where direccion like :key or localidad like :Key or provincia like :key";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Direccion> direccion = query.list();
		return direccion;
	}

	
}
