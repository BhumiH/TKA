package com.tka.may2;

public class Test {

	public static void main(String[] args) {

		StrigLogic sl = new StrigLogic();

		String s = "Welcome to TKA, Pune.";

		System.out.println(s);
		System.out.println();

		StringBuilder rev = sl.reverseString(s);
		System.out.println(rev);
		//Palindrom using two ways
		String sr = "Nitin";
//		Approach 1
		boolean palinstr = sl.palindrom(sr);

		if (palinstr) {
			System.out.println("String is Palindrom");
		} else {
			System.out.println("String is Not Palindrom");
		}
//Approach 2
		boolean palinstr1 = sl.palindromAscii(sr);

		if (palinstr1) {
			System.out.println("String is Palindrom");
		} else {
			System.out.println("String is Not Palindrom");
		}
//		// compress given string
//		StrigLogic sl1 = new StrigLogic();
		String str = "aaabbccccddddfffrrff";
		
		String compstr = sl.compressString(str);
		System.out.println("Original ==>"+str);
		System.out.println("compress ==>"+compstr);
	}



}
