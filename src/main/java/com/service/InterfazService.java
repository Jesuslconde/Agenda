package com.service;

import java.util.List;

import com.model.Categoria;
import com.model.Empleado;


public interface InterfazService<T> {
	public List<T> list();
	
	public T get(int id);
	
	public void saveOrUpdate(T user);
	
	public void delete(int id);
	
	public T buscaPorEmpleados(int id);
	
	public List<Empleado> buscaListado(int id);
}
