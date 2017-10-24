package com.service;

import java.util.List;

import com.model.Direccion;

public interface IDireccionService {
	public List<Direccion> list();
	public Direccion get(int id);
	public Object getSearch(String key);
	public void saveoOrUpdate(Direccion direccion);
	public void delete(Direccion direccion);
}
