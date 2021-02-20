package com.ds.singleton;

/**
 * This is eagr loading singleton class. Object created when class is loaded.
 * @author Ekant
 *
 */
public class EgarLoadingSingleTon {

	private static EgarLoadingSingleTon elst = new EgarLoadingSingleTon();
	
	private EgarLoadingSingleTon() {}
	
	public static EgarLoadingSingleTon getInstance() {
		return elst;
	}
	
	public void showHashCode() {
		System.out.println(elst);
	}
}
