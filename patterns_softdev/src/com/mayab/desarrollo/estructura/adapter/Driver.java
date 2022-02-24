package com.mayab.desarrollo.estructura.adapter;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
	    PersonaVieja personaVieja = new PersonaVieja("Naomi", "Vázquez", LocalDate.of(1998, Month.APRIL, 22));
	    PersonaVieja personaVieja2 = new PersonaVieja("José Carlos", "Medina", LocalDate.of(2002, Month.APRIL, 8));
	    PersonaVieja personaVieja3 = new PersonaVieja("Karla", "Ortega", LocalDate.of(1996, Month.JUNE, 18));
	    
	    ArrayList<Persona> personas = new ArrayList<>();

	    personas.add(new PersonaNueva("Marisol Casanova", 20));
	    personas.add(new AdapterPersona(personaVieja));
	    personas.add(new AdapterPersona(personaVieja2));
	    personas.add(new AdapterPersona(personaVieja3));

	    for(Persona p : personas) {
	      System.out.println(String.format("La persona se llama %s, y tiene %s años.", p.getNombre(), p.getEdad()));
	    };

	}

}
