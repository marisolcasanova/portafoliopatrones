package com.mayab.desarrollo.parcial1.problema2;

import java.time.Month;
import java.util.Hashtable;

public class DecoradorDescuento extends DecoradorBase {
	  private Hashtable temporadasPorProducto;

	  public DecoradorDescuento(ComponenteCosto decorador)
	  {
	    super(decorador);
	    this.temporadasPorProducto = construirDiccionarioDeTemporadasPorProducto();
	  }
	  
	  public float calcularCosto(Producto producto, String localidad) {
	    if(aplicaDescuento(producto)) {
	    	float percentage = 0.1f;
	      return producto.precio * percentage + decorador.calcularCosto(producto, localidad);
	    }
	    return 0.0f + decorador.calcularCosto(producto, localidad);
	  }

	  private boolean aplicaDescuento(Producto producto){
	    return false;
	  }

	  private Hashtable construirDiccionarioDeTemporadasPorProducto() {
	    Hashtable d = new Hashtable<String, Temporada>();
	    d.put("Lacteo", new Temporada(Month.MARCH, Month.APRIL));
	    return d;
	  }
	}
