package com.dao;

import java.util.List;


public interface InterfazDAO {
	public <E> List<E> list();
	
	public <E> E get(int id);
	
	public <E> void saveOrUpdate(E e);
	
	public void delete(int id);
}
