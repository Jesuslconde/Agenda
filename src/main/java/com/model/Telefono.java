package com.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;


@Entity
@Transactional
@Table(name="telefonos")
public class Telefono implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtelefonos")
	private  int idtelefono;
	@Column(name="telefono")          
	private String telefono;
	
	@ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
	@JoinColumn(name="idPersona")
	private Persona personat;
	
	
	//Getters and setters
	public int getIdtelefono() {
		return idtelefono;
	}
	public void setIdtelefono(int idtelefonos) {
		this.idtelefono = idtelefonos;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//Constructores
	public Telefono(){
		
	}
	public Telefono(int idtelefono, String telefono, Persona persona) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
		this.personat = persona;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Telefono [idtelefono=" + idtelefono + ", telefono=" + telefono + "]";
	}
	
	//Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idtelefono;
		return result;
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefono other = (Telefono) obj;
		if (idtelefono != other.idtelefono)
			return false;
		return true;
	}
	
	public Persona getpersona(){
		return personat;
	}
	public void setpersona(Persona persona){
		this.personat=persona;
	}
	
	
	
}
