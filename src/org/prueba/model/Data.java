package org.prueba.model;

public class Data {
	
	private Long id;
	private String nombre;
	
	public Data() {}

	public Data(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
