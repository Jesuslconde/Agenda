package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpleadoDAO;
import com.model.Empleado;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{

	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	
	@Override
	public List<Empleado> list() {
		// TODO Auto-generated method stub
		return empleadoDAO.list();
	}

	@Override
	public Empleado get(int id) {
		// TODO Auto-generated method stub
		return empleadoDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoDAO.saveOrUpdate(empleado);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		empleadoDAO.delete(id);
		
	}

}
