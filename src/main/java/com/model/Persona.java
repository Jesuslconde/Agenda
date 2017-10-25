package com.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

/**
* @author Rafael Ferrer
*/

/**
 * @Entity Asigna el valor de una tabla a la clase Persona.
 * @Table name asigna el nombre de la tabla "personas" a la clase Persona.
 *
 */


@Entity
@Transactional
@Table(name="personas")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="personat")
	private List<Telefono> listTelf;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idDirecciones")
	private Direccion dir;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy="personaEmp")
	@JoinColumn(name="idEmpleado", referencedColumnName="idempleados")
	private Empleado emple;

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", listTelf=" + listTelf + ", dir=" + dir
				+ ", emple=" + emple + "]";
	}


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
	

	public List<Telefono> getListTelf() {
		return listTelf;
	}

	public void setListTelf(List<Telefono> listTelf) {
		this.listTelf = listTelf;
	}



	public Direccion getDir() {
		return dir;
	}


	public void setDir(Direccion dir) {
		this.dir = dir;
	}


	public Empleado getEmple() {
		return emple;
	}


	public void setEmple(Empleado emple) {
		this.emple = emple;
	}
	
	public Persona() {
	
	}

	public Persona(int id, String nombre, String apellido1, String apellido2, String dni, Date fechaNacimiento,
			List<Telefono> listTelf, Direccion dir, Empleado emple) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.listTelf = listTelf;
		this.dir = dir;
		this.emple = emple;
	}

	

}
