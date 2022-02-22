package com.mayab.desarrollo.creacion.abstractFactory;

public abstract class Auto {
	Estereo stereo;
	Bocinas bocinas;
	
	abstract void prepareEnsambleParts();
	
	public void addMotor() {
		System.out.println("Agregando motor");
	}
	public void addEstereo() {
		System.out.println("Agregando estereo" + stereo.toString());
	}
	public void addBocinas() {
		System.out.println("Agregando bocinas" + bocinas.toString());
	}

}
