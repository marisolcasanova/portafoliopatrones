package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public class ReporteMensual extends Reporte {
	public ArrayList<Articulo> lista;
	public ReporteMensual() {
		lista = new ArrayList<Articulo>();
		exbh = new PDF(); 
	}
	
	public void addArt(Articulo a) {
		lista.add(a);
	}
	
	public void imprimirReporte() {
		exbh.export();
		for(Articulo a:lista) {
			System.out.println(a.getNombre());
		}
	}

}
