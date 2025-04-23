package com.tka.multilevelInheritance;

public class P extends GP{
int a=20;
	
	void m2()
	{
		System.out.println("P m2");
	}
	
	@Override
	protected void marry() {
		System.out.println("Girl B");
	}

}
