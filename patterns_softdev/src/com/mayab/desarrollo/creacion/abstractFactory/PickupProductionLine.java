package com.mayab.desarrollo.creacion.abstractFactory;

public class PickupProductionLine extends ProductionLine {
	
		Auto auto = null;
		
		ComponentesFactory factoryC = null;
		@Override 
		protected Auto createAuto(String type) {
			
		if (type.equals("Lujo")) {
			System.out.println("Creando un auto pickup de gama alta");
			factoryC = new GamaAltaComponentFactory();
			auto = new Pickup(factoryC);
		}
		else 
			if (type.equals("Entry")) {
				System.out.println("Creando un auto pickup de gama estándar");
				factoryC = new GamaEstandarComponentFactory();
				auto = new Pickup(factoryC);
			}
		
		
		
		return auto;
	

}
}
