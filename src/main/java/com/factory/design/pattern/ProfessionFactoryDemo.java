package com.factory.design.pattern;

public class ProfessionFactoryDemo {

	public static void main(String[] args) {
		ProfessionFactory pf = new ProfessionFactory();
		Profession doc = pf.getProfession(ProfessionType.DOCTOR);
		doc.print();
		
		Profession eng = pf.getProfession(ProfessionType.ENGINEER);
		eng.print();
		
		Profession tech = pf.getProfession(ProfessionType.TEACHER);
		tech.print();
	}

}
