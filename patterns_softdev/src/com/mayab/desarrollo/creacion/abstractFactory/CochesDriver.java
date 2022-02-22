package com.mayab.desarrollo.creacion.abstractFactory;

public class CochesDriver {
	public static void main(String[] args) {
		SedanProductionLine sedanes = new SedanProductionLine();
		PickupProductionLine pickups = new PickupProductionLine();
		ElectricProductionLine electricos = new ElectricProductionLine();
		
		Auto sedan = null;
		Auto pickup = null;
		Auto electrico = null;
		
		sedan = sedanes.ensambleParts("Lujo");
		pickup = pickups.ensambleParts("Entry");
		electrico = electricos.ensambleParts("Lujo");
	}

}
