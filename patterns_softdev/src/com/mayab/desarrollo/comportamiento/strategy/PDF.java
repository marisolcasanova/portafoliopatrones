package com.mayab.desarrollo.comportamiento.strategy;

public class PDF implements Exportable {
	@Override
	public void export() {
		System.out.println("<PDF>");
	}

}
