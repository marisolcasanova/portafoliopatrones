package com.mayab.desarrollo.estructura.adapter;

import java.time.LocalDate;
import java.time.Period;

public class AdapterPersona implements Persona{
	  private PersonaVieja persona;
	  
	  public AdapterPersona(PersonaVieja persona){
	    this.persona = persona;
	  }
	  
	  public String getNombre(){
	    return persona.getNombre() + " " + persona.getApellido();
	  }
	  
	  public int getEdad(){
	    LocalDate hoy = LocalDate.now();
	    Period p = Period.between(persona.getFechaDeNacimiento(), hoy);
	    return p.getYears();
	  }

}
