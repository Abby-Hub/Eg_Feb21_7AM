package com.sample;

public class Child implements Inf1,Inf2 {

	@Override
	public void m1() {
		System.out.println("I1 :m1() overridden ");
	}

	@Override
	public void m2() {
		System.out.println("I2 :m2() overridden ");
	}

}
