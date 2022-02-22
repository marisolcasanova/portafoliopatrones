package com.mayab.desarrollo.creacion.abstractFactory;

public class ElectricProductionLine extends ProductionLine {
	@Override
	protected Auto createAuto(String type) {
		Auto auto = null;
		
		ComponentesFactory factoryC = null;
		
		if (type.equals("Lujo")) {
			System.out.println("Creando un auto el�ctrico de gama alta");
			factoryC = new GamaAltaComponentFactory();
			auto = new Electrico(factoryC);
		}
		else 
			if (type.equals("Entry")) {
				System.out.println("Creando un auto el�ctrico de gama est�ndar");
				factoryC = new GamaEstandarComponentFactory();
				auto = new Electrico(factoryC);
			}
		return auto;
	}

}
