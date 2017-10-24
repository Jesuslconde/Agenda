package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Persona;

@Repository
@Transactional
public class PersonaDAO implements InterfazDAO<Persona>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Persona> list() {
		System.out.println("Entra en Persona dao");
		@SuppressWarnings("unchecked")
		List<Persona> listPersonas = (List<Persona>)sessionFactory.getCurrentSession().createCriteria(Persona.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listPersonas;
	}

	@Override
	public Persona get(int key) {
		
		
		String hql = "from Persona where id = " + key;
		Persona per = (Persona) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
		System.out.println(per.toString());		
		return per;
	}
	
	@Override
	public void saveOrUpdate(Persona obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
		
	}

	@Override
	public void delete(Persona id) {
		sessionFactory.getCurrentSession().delete(id);	
		
	}


}
