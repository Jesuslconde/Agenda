package com.dao;

import java.util.List;

import com.model.Empleado;



public interface InterfazDAO<T> {
<<<<<<< HEAD
	public  List<T> list();
=======
	public List<T> list();
>>>>>>> branch 'icons' of https://github.com/Jesuslconde/Agenda.git
	
	public T get(int id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(T obj);
	

	public T buscaPorEmpleados(int id);
	
	public List<Empleado> buscaListado(T obj);

}
