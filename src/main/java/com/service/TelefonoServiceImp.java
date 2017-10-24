package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Direccion;
import com.model.Telefono;

@Service
public class TelefonoServiceImp {
	
	@Autowired
	private InterfazDAO<Telefono> telefonodao;
	
	public TelefonoServiceImp() {
		
	}
	public TelefonoServiceImp(InterfazDAO<Telefono> telefonodao) {
		super();
		this.telefonodao = telefonodao;
	}

	public List<Telefono> get(String id) {
		System.out.println("Pasa por servicio Telefono");
		int key = Integer.parseInt(id);
		return  this.telefonodao.getSearch(key);
	}
}
