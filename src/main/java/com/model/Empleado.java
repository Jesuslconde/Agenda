package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempleados")
	private int idEmp;
	private String codEmpleado;
	private int salario;
	private String fechaAlta;
	
	@ManyToOne()
    @JoinColumn(name = "idDepartamento")
	private Departamento depart;
	
	@ManyToOne()
    @JoinColumn(name = "idCategoria")
	private Categoria cat;
	
	@OneToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="idempleados")
	private Persona personaEmp;
	
	public int getId() {
		return idEmp;
	}
	public void setId(int id) {
		this.idEmp = id;
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
	
	public Departamento getDepartamento() {
		return depart;
	}
	public void setDepartamento(Departamento departamento) {
		this.depart = departamento;
	}
	public Categoria getCategoria() {
		return cat;
	}
	public void setCategoria(Categoria categoria) {
		this.cat = categoria;
	}

	public Persona getPersonaEmp() {
		return personaEmp;
	}
	public void setPersonaEmp(Persona personaEmp) {
		this.personaEmp = personaEmp;
	}
	
	@Override
	public String toString() {
		return "Empleado [idEmp=" + idEmp + ", codEmpleado=" + codEmpleado + ", salario=" + salario + ", fechaAlta="
				+ fechaAlta + ", depart=" + depart + ", cat=" + cat + "]";
	}
	
	
	
	
	
}
