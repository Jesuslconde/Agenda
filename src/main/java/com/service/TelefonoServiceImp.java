package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.InterfazDAO;
import com.model.Telefono;

@Transactional
@Service
public class TelefonoServiceImp implements InterfazService<Telefono>{
	
	@Qualifier("TelefonoDAO")
	private InterfazDAO<Telefono> telDAO;
	
	public TelefonoServiceImp() {
		
	}
	public TelefonoServiceImp(InterfazDAO<Telefono> telefonodao) {
		super();
		this.telDAO = telefonodao;
	}

	@Override
	public List<Telefono> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Telefono get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void saveOrUpdate(Telefono obj) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
