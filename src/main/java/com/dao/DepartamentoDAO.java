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
import com.model.Departamento;
import com.model.Empleado;

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
		@Override
		public Departamento buscaPorEmpleados(int id){
			Criteria crit = sessionFactory.getCurrentSession().createCriteria(Empleado.class);
			crit.add(Restrictions.eq("id",id));
			Empleado empleado = (Empleado) crit.uniqueResult();
			return empleado.getDepartamento();
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
		public List<Empleado> buscaListado(Departamento depart) {
			Criteria crit = sessionFactory.getCurrentSession().createCriteria(Empleado.class);
			crit.add(Restrictions.eq("depart",depart));
			return crit.list();
		}


}
