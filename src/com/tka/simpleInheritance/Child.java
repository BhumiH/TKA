package com.tka.simpleInheritance;

public class Child extends Parent {
	int a=11;
	int b=10;
	
	@Override
	public void m1() {
		System.out.println("Child m1");
	}

	void m3() {
		System.out.println("Child m3");
	}
}
