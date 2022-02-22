package com.mayab.desarrollo.parcial1.problema2;

public class DecoradorIVA extends DecoradorBase {
	  
	  public DecoradorIVA(ComponenteCosto decorador) {
		super(decorador);
	}

	public float calcularCosto(Producto producto, String localidad) {
		if (localidad == "frontera") {
			float taxRate = .08f;
			return producto.precio * taxRate + decorador.calcularCosto(producto, localidad);
		}
		else {
		float taxRate = .16f;
	    return producto.precio * taxRate + decorador.calcularCosto(producto, localidad);
	  }
	}
}
