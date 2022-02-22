package com.mayab.desarrollo.parcial1.problema3;

import com.mayab.desarrollo.parcial1.problema1.SubscriptorSMS;

public class Driver {

	public static void main(String[] args) {
		AltaPresion altap = new AltaPresion();
		Acetileno acetil = new Acetileno();
		Liquido liquido = new Liquido();
		
		System.out.println("Llenando lote de gas a alta presión...");
		altap.registrarParamIn();
		altap.registrarParamFin();
		altap.calcularVolumen();
		altap.realizarInspeccionSeguridad();
		altap.imprimirReporte();
		System.out.println("\n");
		
		System.out.println("Llenando lote de acetileno...");
		acetil.registrarParamIn();
		acetil.registrarParamFin();
		acetil.calcularVolumen();
		acetil.realizarInspeccionSeguridad();
		acetil.imprimirReporte();
		System.out.println("\n");
		
		System.out.println("Llenando lote de gases líquidos...");
		liquido.registrarParamIn();
		liquido.registrarParamFin();
		liquido.calcularVolumen();
		liquido.realizarInspeccionSeguridad();
		liquido.imprimirReporte();
		System.out.println("\n");

	}

}
