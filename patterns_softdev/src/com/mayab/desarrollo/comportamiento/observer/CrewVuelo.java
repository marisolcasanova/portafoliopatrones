package com.mayab.desarrollo.comportamiento.observer;

public class CrewVuelo implements Observer, DisplayElement {
	private String fromto;
	private String hora;
	private String status;
	private int puerta;
	private String dia;
	private Vuelo vuelo;
	
	public CrewVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
		vuelo.registerObserver(this);
	}
	
	public void update(String fromto, String hora, String status, int puerta, String dia) {
		this.fromto = fromto;
		this.hora = hora;
		this.status = status;
		this.puerta = puerta;
		this.dia = dia;
		display();
		
	}
	
	public void display() {
		System.out.println("Notifiación de cambios en el vuelo: " + "from-to: " + fromto +", " + "hora: " + hora + ", " + "status: " + status + ", " + "puerta: "+ puerta + ", " + "día: " + dia + ". ");
	}

}
