package com.tka.multilevelInheritance;

public class Test {

	public static void main(String[] args) {
		
//		Create Objects Of class
		
//		static binding/static dispatch/ tight coupling
		
		GP gp=new GP();//Created
		P p = new P();//Created
		C c= new C();//created
		
		System.out.println(gp.a);
		gp.m1();
		gp.marry();
		
		System.out.println(p.a);
		p.m1();
		p.m2();
		p.marry();

		
		System.out.println(c.a);
		c.m1();
		c.m2();
		c.m3();
		c.marry();
		
		System.out.println("_-----------------------------");
//		dynamic binding/dynamic dispatch/ lose coupling
		
		GP ga=new P();//Created
		P pa = new C();//Created
		GP gc= new C();//created
		
		System.out.println(ga.a);
		ga.m1();
//		ga.m2();//undefinde
		ga.marry();
		
		
		System.out.println(pa.a);
		pa.m1();
		pa.m2();
//		pa.m3();//undefinde
		pa.marry();
		
		System.out.println(gc.a);
		gc.m1();
//		gc.m2();//undefinde
//		gc.m3();//undefinde
		gc.marry();
	}

}
