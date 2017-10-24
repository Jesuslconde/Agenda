package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.InterfazDAO;
import com.model.Categoria;
import com.model.Empleado;


@Service
@Transactional
public class CategoriaService implements InterfazService<Categoria>{

	@Autowired
	@Qualifier("categoriaDAO")
	private InterfazDAO<Categoria> catDAO;
	
	@Autowired
	@Qualifier("empleadoDAO")
	private InterfazDAO<Empleado> empDAO;
	
	
	public CategoriaService(){
		System.out.println("constructor categoriaService");
	}
	
	public CategoriaService(InterfazDAO<Categoria> catDAO) {
		this.catDAO = catDAO;
		System.out.println("--constructor categoriaService");
	}
	
	public InterfazDAO<Categoria> getCatDAO() {
		return catDAO;
	}

	public void setCatDAO(InterfazDAO<Categoria> catDAO) {
		this.catDAO = catDAO;
	}
	

	public InterfazDAO<Empleado> getEmpDAO() {
		return empDAO;
	}

	public void setEmpDAO(InterfazDAO<Empleado> empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	public List<Categoria> list() {
		System.out.println("--CategoriaService.list");
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
		// TODO Auto-generated method stub
		
	}
	
}
