package com.abs.factory.pattern;

public class ExperincedProfessionFactory extends AbstractFactory {

	@Override
	public Profession getProfesssion(ProfessionType pt) {
		
		switch (pt) {
		case ENGINEER:
			return new Engineer();
			
		case TECHER:
			return new Teacher();
		
		default:
			return null;
		}
		
	}

}
