package com.factory.design.pattern;

public class ProfessionFactory {

	
	public Profession getProfession(ProfessionType pt) {
		
		switch (pt) {
		case DOCTOR:
			return new Doctor();
		
		case ENGINEER:
			return new Engineer();
		
		case TEACHER:
			return new Teacher();
		default:
			return null;
		}
		
	}
}
