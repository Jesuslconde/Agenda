package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Departamento;

@Repository
@Transactional
public class DepartamentoDAO implements InterfazDAO<Departamento> {

		@Autowired
		private SessionFactory sessionFactory;
		
		public DepartamentoDAO(){
			
		}
		
		public DepartamentoDAO(SessionFactory sessionFactory){
			this.sessionFactory = sessionFactory;
		}
		
		
		@SuppressWarnings("unchecked")
		@Override
		@Transactional
		public List<Departamento> list() {
			List<Departamento> listUser = (List<Departamento>) sessionFactory.getCurrentSession()
					.createCriteria(Departamento.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listUser;
		}
		
		@Override
		@Transactional
		public void saveOrUpdate(Departamento dept) {
			sessionFactory.getCurrentSession().saveOrUpdate(dept);
		}
		
		@Override
		@Transactional
		public void delete(Departamento userToDelete) {

			sessionFactory.getCurrentSession().delete(userToDelete);
		}
		@Override
		@Transactional
		public Departamento get(int id) {
			return (Departamento) sessionFactory.getCurrentSession().get(Departamento.class,id);
			
		}

}
