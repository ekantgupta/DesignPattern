package com.abs.factory.pattern;

public class AbstractFactoryProducer {
	
	public static AbstractFactory getFactory(FactoryType ft) {
		
		switch (ft) {
		case TRANEE:
			return new TraneeFactory();
		
		case EXPERIENCE:
			return new ExperincedProfessionFactory();
		default:
			return null;
		}
	}

}
