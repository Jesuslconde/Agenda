package com.service;

import java.util.List;


public interface InterfazService<T> {
	public List<T> list();
	
	public T get(int id);
	
	public void saveOrUpdate(T user);
	
	public void delete(int id);
}
