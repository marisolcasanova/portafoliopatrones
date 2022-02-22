package com.mayab.desarrollo.creacion.simpleFactory;

public class Electric extends NissanFabric {
	Car createCar(String item) {
		if (item.equals("Leaf")) {
			return new Leaf();
		} else if (item.equals("Electric 2")) {
			return new Electric2();
		} else if (item.equals("Electric 3")) {
			return new Electric3();
		} else return null;
	}

}
