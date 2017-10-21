package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.InterfazDAO;
import com.model.Departamento;

@Service
@Transactional
public class DepartamentoService implements InterfazService<Departamento>{
	@Autowired
	private InterfazDAO<Departamento> deptDAO;
	
	/*
	public UserServiceImpl(){
		
	}
	
	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	*/


	@Override
	public List<Departamento> list() {

		return deptDAO.list();
	}

	@Override
	public Departamento get(int id) {
		return (Departamento)deptDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Departamento t) {
		deptDAO.saveOrUpdate(t);

	}

	@Override
	public void delete(int id) {
		deptDAO.delete(id);

	}
}
