package com.mayab.desarrollo.creacion.abstractFactory;

public class Sedan extends Auto {
	ComponentesFactory cFactory;
	
	public Sedan(ComponentesFactory factory)
	{
		cFactory = factory; 
	}
	@Override
	void prepareEnsambleParts() {
		System.out.println("Ensamblando auto Sedan");
		
		stereo = cFactory.createEstereo();
		bocinas = cFactory.createBocinas();
	}

}
