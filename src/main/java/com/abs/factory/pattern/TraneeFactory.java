package com.abs.factory.pattern;

public class TraneeFactory extends AbstractFactory{

	@Override
	public Profession getProfesssion(ProfessionType pt) {
		switch (pt) {
		case TRANEETEACHER:
			return new TraneeTeacher();
			
		case TRANEEENGINEER:
			return new TraneeEngineer();

		default:
			return null;
		}
	}

	
}
