package com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
* @author Rafael Ferrer
*/

/**
 * @Entity Asigna el valor de una tabla a la clase Persona.
 * @Table name asigna el nombre de la tabla "personas" a la clase Persona.
 *
 */
@Entity
@Table(name="personas")
public class Persona {
	
	/**
	 * @param id, GeneratedValue genera automaticamente un numero para id de Persona .
	 * @param id, Colum(name) asigna la columna "idpersonas" en la BD al id de Persona.
	 * */
	@Id
	@GeneratedValue
	@Column(name="idpersonas")
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento;
	
	@OneToMany(mappedBy="telefonos")
	private List<Telefono> listTelf;
	
	@OneToMany(mappedBy="direcciones")
	private List<Direccion> listDir;
	/*
	@OneToOne()
	@JoinColum(name="idEmpleado", referencedColumName="idEmpleados")
	private Empleado empleado;
	*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		//SimpleDateFormat dt1 = new SimpleDateFormat("dd-mm-yyyy");
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
/*
	public List<Telefonos> getListTelf() {
		return listTelf;
	}

	public void setListTelf(List<Telefonos> listTelf) {
		this.listTelf = listTelf;
	}

	public List<Direcciones> getListDir() {
		return listDir;
	}

	public void setListDir(List<Direcciones> listDir) {
		this.listDir = listDir;
	}
	*/
}
