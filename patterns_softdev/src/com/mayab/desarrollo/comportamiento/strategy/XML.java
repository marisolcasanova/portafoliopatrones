package com.mayab.desarrollo.comportamiento.strategy;

public class XML implements Exportable {
	@Override
	public void export() {
		System.out.println("<XML>");
	}

}
