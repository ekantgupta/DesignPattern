package com.ds.singleton;

import com.abs.factory.pattern.Engineer;

public class TestEgarLoadingSingleTon {

	public static void main(String[] args) {
		EgarLoadingSingleTon elst = EgarLoadingSingleTon.getInstance();
		elst.showHashCode();
		
		EgarLoadingSingleTon elst1 = EgarLoadingSingleTon.getInstance();
		elst1.showHashCode();
		
		Engineer eg = new Engineer();
		System.out.println(eg);
		
		Engineer eg1 = new Engineer();
		System.out.println(eg1);
	}

}
