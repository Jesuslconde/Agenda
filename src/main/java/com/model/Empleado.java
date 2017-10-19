package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.model.Persona;

@Entity
@Table(name = "agenda")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String cod_empleado;
	private int salario;
	private String f_alta;
	
	@OneToOne(mappedBy="persona")
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
	public String getCod_empleado() {
		return cod_empleado;
	}
	public void setCod_empleado(String cod_empleado) {
		this.cod_empleado = cod_empleado;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getF_alta() {
		return f_alta;
	}
	public void setF_alta(String f_alta) {
		this.f_alta = f_alta;
	}
	
	public Persona persona() {
		return persona;
	}
	public void Persona(Persona persona) {
		this.persona = persona;
	}
}
