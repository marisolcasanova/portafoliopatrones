package com.mayab.desarrollo.estructura.proxy;

public class Driver {

	public static void main(String[] args) {
	    Empleado admin = new Empleado(true, true, "Administrador");
	    Empleado ventas = new Empleado(true, false, "Vendedor");

	    ReporteVentas reporteReal = new ReporteVentas();
	    IReporte reporteAdmin = new ReporteVentasProxy(reporteReal, admin);
	    IReporte reporteVentas = new ReporteVentasProxy(reporteReal, ventas);
	    System.out.println(reporteAdmin.leer());
	    reporteAdmin.escribir("Administrador escribiendo reporte...");

	    System.out.println(reporteVentas.leer());
	    reporteVentas.escribir("Vendedor escribiendo reporte...");

	}

}
