package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public class ReporteVentas extends Reporte {

	public ReporteVentas() {
		exbh = new JSON(); 
	}
	
	public void imprimirReporte() {
		exbh.export();

	}

}
