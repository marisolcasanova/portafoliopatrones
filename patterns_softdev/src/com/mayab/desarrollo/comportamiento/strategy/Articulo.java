package com.mayab.desarrollo.comportamiento.strategy;

public class Articulo {
	String nombre;
	String costo;
	String cantidad;
	
	public Articulo(String n, String c, String cant) {
		this.nombre = n;
		this.costo = c;
		this.cantidad = cant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
