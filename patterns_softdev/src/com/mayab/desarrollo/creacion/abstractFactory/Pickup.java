package com.mayab.desarrollo.creacion.abstractFactory;

public class Pickup extends Auto {
	ComponentesFactory cFactory;

	public Pickup(ComponentesFactory factory)
	{
		cFactory = factory; 
	}
	@Override
	void prepareEnsambleParts() {
		System.out.println("Ensamblando auto Pickup");
		
		stereo = cFactory.createEstereo();
		bocinas = cFactory.createBocinas();
	}

}
