package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.model.Persona;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String codEmpleado;
	private int salario;
	private String fechaAlta;
	private int idDepartamento;
	private int idCategoria;
	
	@OneToOne(mappedBy="persona")
	@JoinColumn(name="idempleados")
	private Persona persona;
	
	@Id
	@GeneratedValue
	@Column(name = "idempleados")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public Persona persona() {
		return persona;
	}
	public void Persona(Persona persona) {
		this.persona = persona;
	}
}
