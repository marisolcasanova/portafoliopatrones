package com.mayab.desarrollo.creacion.singleton;

public class Coordinador {
	private String carrera;
	
	public Coordinador(String c) {
		carrera = c;
	}
	
	public void addClass(String dia, String hora, String clase)
	{
		ScheduleSingleton.getInstance().addClass(dia, hora, clase);
	}
	

}
