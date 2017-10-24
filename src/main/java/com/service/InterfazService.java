package com.service;

import java.util.List;

public interface InterfazService<T> {

	public  List<T> list();
	
	public T get(T id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(T obj);
}
