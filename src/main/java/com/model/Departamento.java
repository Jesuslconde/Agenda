package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
*
* @author Jesús,Álvaro,Rafael,Iván
* @param id PrimaryKey de la tabla.
* @param nombre Nombre de la categoría.
* @param descripcion Descripción del departamento.
* @param empleados Empleados del departamento.
*/
@Component
@Qualifier("departamento")
@Entity
@Table(name = "departamentos")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddepartamento")
	private Integer iddepartamento;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@OneToMany(mappedBy = "depart")
	private Set<Empleado> empleados;
	
		/** 
	    * Constructor de clase vacío.
	    */
		public Departamento() {
			
		}

		/** 
	    * Constructor de clase con todos los parámetros.
	    */
		public Departamento(Integer id, String nombre, Set<Empleado> empleados) {
			this.iddepartamento = id;
			this.nombre = nombre;
			this.empleados = empleados;
		}

		public Integer getId() {
			return iddepartamento;
		}

		public void setId(int id){
			this.iddepartamento = id;
		}
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Set<Empleado> getEmpleados() {
			return empleados;
		}

		public void setEmpleados(Set<Empleado> empleados) {
			this.empleados = empleados;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((iddepartamento == null) ? 0 : iddepartamento.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Departamento other = (Departamento) obj;
			if (iddepartamento == null) {
				if (other.iddepartamento != null)
					return false;
			} else if (!iddepartamento.equals(other.iddepartamento))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Departamento [id=" + iddepartamento + ", nombre=" + nombre + "]";
		}
		
		
}
