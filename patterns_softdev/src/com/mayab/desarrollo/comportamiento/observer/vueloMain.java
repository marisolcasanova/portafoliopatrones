package com.mayab.desarrollo.comportamiento.observer;

public class vueloMain {

	public static void main(String[] args) {
		Vuelo vuelo = new Vuelo();
		
		Pasajero pasajero = new Pasajero(vuelo);
		DisplayAeropuerto displayaero = new DisplayAeropuerto(vuelo);
		CrewVuelo crewvuelo = new CrewVuelo(vuelo);
		
		vuelo.changeVuelo("Argentina - Honduras", "8 am", "cancelado", 87, "4 de mayo");

	}

}
