package com.tka.april29;

public class Example {

	public static void main(String[] args) {
		
		String s=new String("Hello"); //new keyword
		String s1="Hello";//literal
		
		System.out.println(s);
		System.out.println(s.intern());
		
		System.out.println(s==s1);//comparing address //false
		System.out.println(s.intern()==s1);//comparing address  //true
		
		System.out.println(s.equals(s1));//comparing value //true
		
		System.out.println(s.startsWith("E"));//False
		
		System.out.println(s.isEmpty());//false

	}

}
