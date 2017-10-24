package com.dao;

import java.util.List;



public interface InterfazDAO<T> {
	public  List<T> list();
	
	public T get(int id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(T obj);
	

}
