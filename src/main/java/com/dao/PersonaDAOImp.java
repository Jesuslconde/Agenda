package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Persona;

@Repository
public class PersonaDAOImp implements IPersonaDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Persona> list() {
		@SuppressWarnings("unchecked")
		List<Persona> listPersonas = (List<Persona>)sessionFactory.getCurrentSession().createCriteria(Persona.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listPersonas;
	}

	@Override
	@Transactional
	public Persona get(Persona persona) {
		//Session session = sessionFactory.openSession();
		String hql = "select p from personas as p left join p.listTelef as t where t.idpersona =" + persona.getId();
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		Persona person = (Persona)query.uniqueResult();
		
		
		/*
		Criteria criteria = session.createCriteria(Persona.class);
		criteria.createAlias("persona,listTelef", "telefono");
		criteria.setFetchMode("telefono.idpersona", FetchMode.JOIN);
		criteria.add(Restrictions.eq("id", persona.getId()));

		// this tells Hibernate that the makes must be fetched from the database
		// you must use the name of the annotated field in the Java class: dealerMakes
		
		// Hibernate will return instances of Dealer, but it will return the same instance several times
		// once per make the dealer has. To avoid this, you must use a distinct root entity transformer
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		//List<Persona> listPersonas = criteria.list(); // executes the SQL query:
		// select d.*, m.* from dealer d left join make m on d.dealer_id = m.dealer_id where d.dealer_id > 6
		Persona person = (Persona)criteria.uniqueResult();
		System.out.println(persona.getListTelf().size());
		/*
		Criteria criteria =  session.createCriteria(Persona.class).add(Restrictions.eq("id", persona.getId()));// id : nombre de clase Persona -> id (En model)
		Persona person = (Persona)criteria.uniqueResult();
		session.close();
		*/
		return person;
	}

	@Override
	@Transactional
	public void saveoOrUpdate(Persona persona) {
		sessionFactory.getCurrentSession().saveOrUpdate(persona);
	}

	@Override
	@Transactional
	public void delete(Persona persona) {
		sessionFactory.getCurrentSession().delete(persona);		
	}

}
