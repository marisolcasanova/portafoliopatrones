package com.mayab.desarrollo.creacion.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ScheduleSingleton {
	private static ScheduleSingleton instance = null; //instacia privada
	private HashMap<String, String> schedule;
	
	private ScheduleSingleton() { //constructor privado
		schedule = new HashMap<String,String>();
	}
	
	public static ScheduleSingleton getInstance() { //nos va a permitir acceder a la instancia
		if(instance == null) {
			instance = new ScheduleSingleton();
		
		}
		return instance;
	}
	
	public void addClass(String day,String hour,String clase)
	{
		schedule.put(day+"-"+hour, clase);
	}
	
	public void print() {
		for(Map.Entry entrada : schedule.entrySet()) {
			System.out.println(entrada.getKey() + ":" + entrada.getValue());
		}
	}
	

}
