package com.mayab.desarrollo.comportamiento.template;

public class TemplateTestDriver {

	public static void main(String[] args) {
		Test crear = new CreateTest();
		Test retrieve = new RetrieveTest();
		Test update = new UpdateTest();
		Test delete = new DeleteTest();
		
		crear.executeTest();
		retrieve.executeTest();
		update.executeTest();
		delete.executeTest();

	}

}
