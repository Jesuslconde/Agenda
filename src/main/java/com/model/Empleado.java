package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.model.Persona;

/**
 * Esta clase define la clase Empleado, el cuál tendrá los atributos principales 
 * de un empleado, que esta relacionado con la clase Persona 
 * @author: Alvaro Calixto Roca
 * @version: 23/10/2017/A
 
 */ 


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
	private Date fechaAlta;
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
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
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
