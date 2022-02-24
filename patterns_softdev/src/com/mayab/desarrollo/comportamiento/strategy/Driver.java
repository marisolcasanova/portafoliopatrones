package com.mayab.desarrollo.comportamiento.strategy;

public class Driver {

	public static void main(String[] args) {
		Articulo art1 = new Articulo("shampoo", "$60", 4);
		Articulo art2 = new Articulo("pan bimbo", "$140", 7);
		Articulo art3 = new Articulo("jugo de uva", "$33", 9);
		
		Reporte repmensual = new ReporteMensual();
		System.out.println("------Reporte Mensual------");
		repmensual.addArt(art3);
		repmensual.addArt(art1);
		repmensual.performExport();
		System.out.println("cambiando comportamiento: ");
		repmensual.setExportBehaviour(new XML());
		repmensual.performExport();
		System.out.println("\n");

		
		Reporte repventas = new ReporteVentas();
		System.out.println("------Reporte Ventas------");
		repventas.addArt(art2);
		repventas.addArt(art1);
		repventas.addArt(art3);
		repventas.performExport();
		System.out.println("cambiando comportamiento: ");
		repventas.setExportBehaviour(new PDF());
		repventas.performExport();
		System.out.println("\n");


		
	}

}
