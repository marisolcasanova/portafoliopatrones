package com.mayab.desarrollo.parcial1.problema2;

public class Cliente{
	  public float calcularCosto(Producto producto, String localidad){
		  ComponenteCosto calculador = obtenerCalculadorDeCosto(producto, localidad);
		  return calculador.calcularCosto(producto, localidad);
	  }
	  

	  public ComponenteCosto obtenerCalculadorDeCosto(Producto producto, String localidad)
	  {
	    CalculadorCosto c = new CalculadorCosto();
	    DecoradorIVA iva = new DecoradorIVA(c);
	    DecoradorDescuento desc = new DecoradorDescuento(iva);
	    return new DecoradorImpuestoLocal(desc);
	    
	  }
	  
	}
