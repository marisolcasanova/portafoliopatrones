package com.mayab.desarrollo.creacion.simpleFactory;

public class Sedan extends NissanFabric {
	Car createCar(String item) {
		if (item.equals("Sentra")) {
			return new Sentra();
		} else if (item.equals("Sedan 2")) {
			return new Sedan2();
		} else if (item.equals("Sedan 3")) {
			return new Sedan3();
		} else return null;
	}

}
