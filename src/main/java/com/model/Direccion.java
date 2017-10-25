package com.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import org.springframework.transaction.annotation.Transactional;


@Entity
@Transactional
@Table(name="direcciones")
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddirecciones")
	private int iddireccion;
	@Column(name="direccion")
	private String direccion;
	@Column(name="codPostal")
	private String codpostal;
	@Column(name="localidad")
	private String localidad;
	@Column(name="provincia")
	private String provincia;
	
	@OneToMany(mappedBy="dir",cascade=CascadeType.ALL)
    private Collection<Persona> personad;
	
	//Getters and setters
	public int getIddireccion() {
		return iddireccion;
	}
	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
	
	public String getCodpostal() {
		return codpostal;
	}
	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}


	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public Collection<Persona> getPersonad() {
		return personad;
	}
	public void setPersonad(Collection<Persona> personad) {
		this.personad = personad;
	}
	//Constructores
	public Direccion(){
		
	}
	public Direccion(int iddireccion, String direccion, String codpostal, String localidad, String provincia, Collection<Persona> personad) {
		super();
		this.iddireccion = iddireccion;
		this.direccion = direccion;
		this.codpostal = codpostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.personad = personad;
	}
	
	//ToString	
	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad + ", provincia=" + provincia + "]";
	}
	
	//Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iddireccion;
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
		Direccion other = (Direccion) obj;
		if (iddireccion != other.iddireccion)
			return false;
		return true;
	}
	
	
	
}
