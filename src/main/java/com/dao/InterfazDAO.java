package com.dao;

import java.util.List;

import com.model.Empleado;



public interface InterfazDAO<T> {
	public List<T> list();
	
	public T get(int id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(int id);

	public T buscaPorEmpleados(int id);
	
	public List<Empleado> buscaListado(T obj);

}
