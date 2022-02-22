package com.mayab.desarrollo.comportamiento.observer;

import java.util.ArrayList;

public class Vuelo implements Subject {
	private ArrayList observers;
	private String fromto;
	private String hora;
	private String status;
	private int puerta;
	private String dia;
	
	public Vuelo() {
		observers = new ArrayList();
	}
	

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(fromto, hora, status, puerta, dia);
		}
		
	}
	
	public void vueloChanged() {
		notifyObservers();
	}
	
	public void changeVuelo(String fromto, String hora, String status, int puerta, String dia) {
		this.fromto = fromto;
		this.hora = hora;
		this.status = status;
		this.puerta = puerta;
		this.dia = dia;
		vueloChanged();
	}
	
	public String getFromto() {
		return fromto;
	}
	
	public String getHora() {
		return hora;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getPuerta() {
		return puerta;
	}
	
	public String getDia() {
		return dia;
	}

}
