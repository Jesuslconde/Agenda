package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.dao.InterfazDAO;
import com.model.Departamento;
import com.model.Empleado;

@Service
@Transactional
public class DepartamentoService implements InterfazService<Departamento>{
	@Autowired
	@Qualifier("departamentoDAO")
	private InterfazDAO<Departamento> deptDAO;
	
	public DepartamentoService() {
	}
	public DepartamentoService(InterfazDAO<Departamento> deptDAO) {
		this.deptDAO = deptDAO;
	}

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

	public InterfazDAO<Departamento> getDeptDAO() {
		return deptDAO;
	}

	public void setDeptDAO(InterfazDAO<Departamento> deptDAO) {
		this.deptDAO = deptDAO;
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
	
	public Departamento buscaPorEmpleados(int id) {
		return null;
	}
	@Override
	public List<Empleado> buscaListado(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
