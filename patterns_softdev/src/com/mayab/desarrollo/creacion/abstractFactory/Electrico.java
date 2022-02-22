package com.mayab.desarrollo.creacion.abstractFactory;

public class Electrico extends Auto {
	ComponentesFactory cFactory;
	
	public Electrico(ComponentesFactory factory)
	{
		cFactory = factory;
	}
	
	@Override
	void prepareEnsambleParts() {
		System.out.println("Ensamblando auto eléctrico");
		
		stereo = cFactory.createEstereo();
		bocinas = cFactory.createBocinas();
		
	}

}
