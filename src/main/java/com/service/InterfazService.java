package com.service;

import java.util.List;

import com.model.Empleado;


public interface InterfazService<T> {
	public List<T> list();
	
	public T get(int id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(int id);
	
	
}
