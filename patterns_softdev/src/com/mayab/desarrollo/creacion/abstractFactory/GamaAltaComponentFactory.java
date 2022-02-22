package com.mayab.desarrollo.creacion.abstractFactory;

public class GamaAltaComponentFactory implements ComponentesFactory {

	@Override
	public Estereo createEstereo() {
		// TODO Auto-generated method stub
		return new EstereoGamaAlta();
	}

	@Override
	public Bocinas createBocinas() {
		// TODO Auto-generated method stub
		return new BocinasGamaAlta();
	}
	

}
