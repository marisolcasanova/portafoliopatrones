package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public abstract class Reporte {
	public ArrayList<Articulo> lista = new ArrayList<Articulo>();
	public Exportable exbh;
	
	Reporte(){
		
	}
	
	public void setExportBehaviour(Exportable e) {
		exbh = e;
	}
	
	public void performExport() {
		exbh.export();
		for(Articulo a:lista) {
			System.out.println(a.getNombre());
		}
	}
	
	public void addArt(Articulo a) {
		lista.add(a);
	}

}
