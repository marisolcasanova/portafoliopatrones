package com.mayab.desarrollo.creacion.simpleFactory;

public class Pickup extends NissanFabric {
	Car createCar(String item) {
		if (item.equals("Frontier")) {
			return new Frontier();
		} else if (item.equals("Pickup 2")) {
			return new Pickup2();
		} else if (item.equals("Pickup 3")) {
			return new Pickup3();
		} else return null;
	}

}
