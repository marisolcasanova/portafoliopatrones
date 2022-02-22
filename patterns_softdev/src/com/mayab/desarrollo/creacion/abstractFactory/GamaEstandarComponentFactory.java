package com.mayab.desarrollo.creacion.abstractFactory;

public class GamaEstandarComponentFactory implements ComponentesFactory{
	public Estereo createEstereo() {
		return new EstereoGamaEstandar();
	}
	
	public Bocinas createBocinas() {
		return new BocinasGamaEstandar();
	}

}
