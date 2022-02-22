package com.mayab.desarrollo.comportamiento.strategy;

public abstract class Reporte {
	public Exportable exbh;
	
	Reporte(){
		
	}
	
	public void setExportBehaviour(Exportable e) {
		exbh = e;
	}
	
	public void performExport() {
		exbh.export();
	}

}
