package com.abs.factory.pattern;

public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory af = AbstractFactoryProducer.getFactory(FactoryType.TRANEE);
		
		Profession traneeTecher = af.getProfesssion(ProfessionType.TRANEETEACHER);
		traneeTecher.print();
	}

}
