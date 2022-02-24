package com.mayab.desarrollo.estructura.proxy;

public class ReporteVentas implements IReporte{
	  public void escribir(String dato){
	    System.out.println(dato);
	  }
	    
	  public String leer(){
	    return "Leyendo datos del reporte";
	  }
}


