package com.dao;

import java.util.List;

import com.model.Empleado;

public interface EmpleadoDAO {

public List<Empleado> list();
	
	public Empleado get(int id);
	
	public void saveOrUpdate(Empleado empleado);
	
	public void delete(int id);
}
