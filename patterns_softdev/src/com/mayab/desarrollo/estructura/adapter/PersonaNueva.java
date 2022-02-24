package com.mayab.desarrollo.estructura.adapter;

public class PersonaNueva implements Persona {
	  String nombre;
	  int edad;
	  
	  public PersonaNueva(String nombre, int edad){
	    this.nombre = nombre;
	    this.edad = edad;
	  }
	  
	  public String getNombre(){
	    return nombre;
	  }
	  
	  public int getEdad(){
	    return edad;
	  }

}
