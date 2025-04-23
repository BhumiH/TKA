package com.tka.simpleInheritance;

public class Test {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		
		System.out.println(p.a);
		p.m1();
		p.m2();
		//p.m3(); //Compile time error. no method found/undefine
		
		Child c=new Child();
		System.out.println(c.a);//Variable can not be override.
		System.out.println(c.b);
		c.m1();//child m1 call / Method Overriding
		c.m2();//parent m2 call
		c.m3();//child m3 call
		
		
		Parent pa=new Child();//dynamic dispatch/dynamic bindding/lose coupling
		
		System.out.println(pa.a);//Variable can not be override.display parent a
//		System.out.println(pa.b);//undefine 
		pa.m1();//child m1 call / Method Overriding
		pa.m2();//parent m2 call
//		pa.m3();//undefined
		

	}

}
