package com.tka.april30;

public class ExMethods {

	public static void main(String[] args) {

		String[] namesdb = { "Jay", "Vijay", "Pranav", "Kiran", "Viru" };

//		for (int i = 0; i < namesdb.length; i++) {
//			System.out.println(namesdb[i]);
//			for (int j = 0; j < namesdb[i].length(); j++) {
//
//				System.out.println(namesdb[i].charAt(j));
//			}
//		}
//
//		System.out.println("--------Enhance for loop-----------");
////		enhance for loop for array
//
//		for (String name : namesdb) {
//			System.out.println(name);
//			for (int j = 0; j < name.length(); j++) {
//
//				System.out.println(name.charAt(j));
//			}
//		}
		
//		list of name start with "V"
//		for(String name: namesdb) {
//			if(name.startsWith("V"))
//				System.out.println(name);
//		}
//		
////		list of name endswith "n"
//		for (String name:namesdb) {
//			if(name.endsWith("n"))
//				System.out.println(name);
//		}
////		list of names whose length is more than 4 charectors and display in uppercase
//		for(String name:namesdb) {
//			if(name.length()>4) {
//				System.out.println(name.toUpperCase());
//			}
//		}
//// String is Anagram or Not
		StringChecker sc=new StringChecker();
//		String s1="Listen";
//		String s2="Silentg";
//		
//		
//		if(sc.checkAnagram(s1, s2))
//		{
//			System.out.println("Anagram");
//		}
//		else
//		{
//			System.out.println("Not Anagram");
//		}
//// Reverse the whole string

		String s1="Welcome to TKA.";
		System.out.println(s1);
		System.out.println("-------------------");
		sc.reverseString(s1);
		
		System.out.println("-------------------");
		
		sc.reveseWord(s1);
		
		
		
	}
}
