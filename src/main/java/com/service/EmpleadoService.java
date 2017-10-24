package com.service;

import java.util.List;

import com.model.Empleado;

public interface EmpleadoService {

	public List<Empleado> list();
	
	public Empleado get(int id);
	
	public void saveOrUpdate(Empleado Empleado);
	
	public void delete(int id);
}
