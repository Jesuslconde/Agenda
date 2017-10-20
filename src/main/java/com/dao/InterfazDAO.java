package com.dao;

import java.util.List;



public interface InterfazDAO<T> {
	public <T> List<T> list();
	
	public <T> T get(int id);
	
	public <T> void saveOrUpdate(T obj);
	
	public void delete(int id);

}
