package com.mayab.desarrollo.estructura.proxy;

public class ReporteVentasProxy implements IReporte{
	  ReporteVentas reporte;
	  Empleado empleado;

	  public ReporteVentasProxy(ReporteVentas reporte, Empleado empleado){
	    this.reporte = reporte;
	    this.empleado = empleado;
	  }
	  
	  public void escribir(String dato){
	    if(!validacion()){
	      System.out.println("El empleado no tiene suficientes accesos para escribir.");
	      return;
	    }
	    reporte.escribir(dato);
	  }
	    
	  public String leer(){
	    return "Leyendo datos del reporte";
	  }

	  private boolean validacion(){
	    return empleado.escritura;
	  }
}
