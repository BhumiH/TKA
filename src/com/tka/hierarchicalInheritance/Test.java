package com.tka.hierarchicalInheritance;

public class Test {

	public static void main(String[] args) {
	
		C1 Jay = new C1();
		C2 Viru = new C2();
		
		P pc1= new C1();
		P pc2 =new C2();
		
		Jay.m1();
		Jay.m2();
//		Jay.m3();//Not accessible undefinde
		
		Viru.m1();
//		Viru.m2();//Not accessible undefinde
		Viru.m3();
		
		System.out.println("________________");
		pc1.m1();	
//		pc1.m2();Not accessible undefinde
//		pc1.m3();//Not accessible undefinde
		
		pc2.m1();
//		pc2.m2();//Not accessible undefinde
//		pc2.m3()Not accessible undefinde

		

	}

}
