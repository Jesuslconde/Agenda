package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
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
		Session session = sessionFactory.openSession();
		Criteria criteria =  session.createCriteria(Persona.class).add(Restrictions.eq("id", persona.getId()));// id : nombre de clase Persona -> id (En model)
		Persona person = (Persona)criteria.uniqueResult();
		session.close();
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
