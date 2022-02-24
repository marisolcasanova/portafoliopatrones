package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public class ReporteMensual extends Reporte {
	
	public ReporteMensual() {
		exbh = new PDF(); 
	}		
	
	public void imprimirReporte() {
		exbh.export();
		
	}

}
