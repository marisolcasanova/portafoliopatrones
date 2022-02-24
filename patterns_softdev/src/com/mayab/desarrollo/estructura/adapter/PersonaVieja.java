package com.mayab.desarrollo.estructura.adapter;

import java.time.LocalDate;

public class PersonaVieja {
	  String nombre;
	  String apellido;
	  LocalDate fechaDeNacimiento;
	  
	  public PersonaVieja(String nombre, String apellido, LocalDate fechaDeNacimiento){
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.fechaDeNacimiento = fechaDeNacimiento;
	  }
	  
	  public String getNombre(){
	    return nombre;
	  }
	  
	  public String getApellido(){
	    return apellido;
	  }
	  
	  public LocalDate getFechaDeNacimiento(){
	    return fechaDeNacimiento;
	  }

}
