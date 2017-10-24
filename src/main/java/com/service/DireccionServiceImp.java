package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Direccion;

@Service
public class DireccionServiceImp implements IDireccionService {

	@Autowired
	private InterfazDAO<Direccion> direcciondao;
	

	public InterfazDAO<Direccion> getDirecciondao() {
		return direcciondao;
	}

	public void setDirecciondao(InterfazDAO<Direccion> direcciondao) {
		this.direcciondao = direcciondao;
	}

	@Override
	public List<Direccion> list() {
		return this.direcciondao.list();
	}

	@Override
	public Direccion get(int id) {
		return (Direccion) this.direcciondao.get(id);
	}

	@Override
	public void saveoOrUpdate(Direccion direccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Direccion direccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Direccion> getSearch(String key) {
		System.out.println("Pasa por servicio");
		return  this.direcciondao.getSearch(key);
	}

}
