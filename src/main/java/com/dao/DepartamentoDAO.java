package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.model.Departamento;

@Repository
public class DepartamentoDAO implements InterfazDAO {

		@Autowired
		private SessionFactory sessionFactory;
		
		public DepartamentoDAO(){
			
		}
		
		public DepartamentoDAO(SessionFactory sessionFactory){
			this.sessionFactory = sessionFactory;
		}
		
		@Override
		@Transactional
		public List<Departamento> list() {
			@SuppressWarnings("unchecked")
			List<Departamento> listUser = (List<Departamento>) sessionFactory.getCurrentSession()
					.createCriteria(Departamento.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listUser;
		}
		
		@Override
		@Transactional
		public void saveOrUpdate(Object dept) {
			sessionFactory.getCurrentSession().saveOrUpdate((Departamento)dept);
		}
		
		@Override
		@Transactional
		public void delete(int id) {
			Departamento userToDelete = new Departamento();
			userToDelete.setId(id);
			sessionFactory.getCurrentSession().delete(userToDelete);
		}
		
		@Override
		@Transactional
		public Departamento get(int id) {
			return (Departamento) sessionFactory.getCurrentSession().get(Departamento.class,id);
			
		}

		@Override
		public Object getSearch(String key) {
			// TODO Auto-generated method stub
			return null;
		}


}
