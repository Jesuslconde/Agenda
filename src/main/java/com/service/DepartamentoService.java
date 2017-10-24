package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.dao.InterfazDAO;
import com.model.Categoria;
import com.model.Departamento;
import com.model.Empleado;

@Service
@Transactional
public class DepartamentoService implements InterfazService<Departamento>{
	@Autowired
	@Qualifier("departamentoDAO")
	private InterfazDAO<Departamento> deptDAO;
	
	@Autowired
	@Qualifier("empleadoDAO")
	private InterfazDAO<Empleado> empDAO;
	
	
	
	public DepartamentoService() {
	}
	public DepartamentoService(InterfazDAO<Departamento> deptDAO) {
		this.deptDAO = deptDAO;
	}

	public InterfazDAO<Departamento> getDeptDAO() {
		return deptDAO;
	}

	public void setDeptDAO(InterfazDAO<Departamento> deptDAO) {
		this.deptDAO = deptDAO;
	}
	
	@Override
	public List<Departamento> list() {

		return deptDAO.list();
	}

	@Override
	public Departamento get(int id) {
		return deptDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Departamento t) {
		deptDAO.saveOrUpdate(t);

	}

	@Override
	public void delete(int id) {
		deptDAO.delete(id);

	}
	
	@Override
	public List<Empleado> buscaListado(Departamento dept) {
		return deptDAO.buscaListado(dept);
	}
}
