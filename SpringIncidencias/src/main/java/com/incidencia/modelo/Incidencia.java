package com.incidencia.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Incidencia {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "ID_OPERADOR_IN")
	
	private Integer id_operador_in;
	public Incidencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Incidencia(Integer id, String nombre, String descripcion, Integer id_operador_in) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id_operador_in = id_operador_in;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getId_operador_in() {
		return id_operador_in;
	}
	public void setId_operador_in(Integer id_operador_in) {
		this.id_operador_in = id_operador_in;
	}
	
	
	

}
