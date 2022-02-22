package com.mayab.desarrollo.creacion.abstractFactory;

public class SedanProductionLine extends ProductionLine {
	Auto auto = null;
	
	ComponentesFactory factoryC = null;
	@Override 
	protected Auto createAuto(String type) {
		
	if (type == "Lujo") {
		System.out.println("Creando un auto sedan de gama alta");
		factoryC = new GamaAltaComponentFactory();
		auto = new Sedan(factoryC);
	}
	else 
		if (type == "Entry") {
			System.out.println("Creando un auto sedan de gama estándar");
			factoryC = new GamaEstandarComponentFactory();
			auto = new Sedan(factoryC);
		}
	
	
	
	return auto;




}
}
