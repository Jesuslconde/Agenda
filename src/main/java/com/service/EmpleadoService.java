package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Departamento;
import com.model.Empleado;

@Service
public class EmpleadoService implements InterfazService<Empleado>{

	@Autowired
	@Qualifier("empleadoDAO")
	private InterfazDAO<Empleado> empDAO;
	
	
	
	public EmpleadoService() {
		
	}
	
	
	public EmpleadoService(InterfazDAO<Empleado> empDAO) {
		super();
		this.empDAO = empDAO;
	}

	

	public InterfazDAO<Empleado> getEmpDAO() {
		return empDAO;
	}


	public void setEmpDAO(InterfazDAO<Empleado> empDAO) {
		this.empDAO = empDAO;
	}


	@Override
	public List list() {
		
		return empDAO.list();
	}

	@Override
	public Empleado get(int id) {
		
		return empDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Empleado emp) {
		empDAO.saveOrUpdate(emp);
		
	}

	@Override
	public void delete(int id) {
		empDAO.delete(id);
		
	}

	@Override
	public List<Empleado> buscaListado(Empleado empleado) {
		// TODO Auto-generated method stub
		return empDAO.buscaListado(empleado);
	}

	

}
