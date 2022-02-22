package com.mayab.desarrollo.parcial1.problema2;

public class DecoradorImpuestoLocal extends DecoradorBase {
	  public DecoradorImpuestoLocal(ComponenteCosto decorador)
	  {
	    super(decorador);
	  }
	  
	  public float calcularCosto(Producto producto, String localidad) {
		if(localidad == "frontera") {
		float taxRate = .02f;
	    return producto.precio * taxRate + decorador.calcularCosto(producto, localidad);
		}
		return 0.0f + decorador.calcularCosto(producto, localidad);
	  }
	}
