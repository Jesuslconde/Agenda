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
}
