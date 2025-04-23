package come.tka.hybridInheritance;

public class Test {
	public static void main(String ar[]) {
	
//	Create Object
	A a= new A();
	B b= new B();
	C c= new C();
	D d= new D();
	
	d.m1();d.m2();d.m4();

	
	A ab=new B();
	A ac=new C();
	A ad=new D();
	
	B bd=new D();
//	B bc=new C();//no relation /not accessible
	
//	C cd= new D(); no relation /not accessible
	
	
	
	}

}
