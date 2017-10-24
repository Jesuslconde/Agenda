package com.service;

import java.util.List;

<<<<<<< HEAD
public interface InterfazService<T> {

	public  List<T> list();
	
	public T get(T id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(T obj);
=======
import com.model.Categoria;
import com.model.Empleado;


public interface InterfazService<T> {
	public List<T> list();
	
	public T get(int id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(int id);
	
	public List<Empleado> buscaListado(T obj);
>>>>>>> branch 'icons' of https://github.com/Jesuslconde/Agenda.git
}
