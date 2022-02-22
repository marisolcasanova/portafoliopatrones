package com.mayab.desarrollo.creacion.abstractFactory;

public abstract class ProductionLine {
	protected abstract Auto createAuto(String type);
	
	public Auto ensambleParts(String type) {
		Auto auto = createAuto(type);
		auto.prepareEnsambleParts();
		auto.addMotor();
		auto.addEstereo();
		auto.addBocinas();
		return auto;
	}

}
