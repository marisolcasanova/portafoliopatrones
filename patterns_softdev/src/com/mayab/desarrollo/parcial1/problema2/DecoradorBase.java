package com.mayab.desarrollo.parcial1.problema2;

public class DecoradorBase implements ComponenteCosto{
	  ComponenteCosto decorador;

	  public DecoradorBase(ComponenteCosto decorador){
	    this.decorador = decorador;
	  }

	  public float calcularCosto(Producto producto, String localidad){
	    return producto.precio;
	  }
	}