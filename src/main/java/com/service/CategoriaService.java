package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Categoria;


@Service
@Transactional
public class CategoriaService implements InterfazService<Categoria>{

	@Autowired
	private InterfazDAO<Categoria> catDAO;
	
	
	public CategoriaService(){
		
	}
	
	public CategoriaService(InterfazDAO catDAO) {
		this.catDAO = catDAO;
	}
	


	@Override
	public List<Categoria> list() {

		return catDAO.list();
	}

	@Override
	public Categoria get(int id) {
		return (Categoria)catDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Categoria t) {
		catDAO.saveOrUpdate(t);

	}

	@Override
	public void delete(int id) {
	catDAO.delete(id);

	}
}
