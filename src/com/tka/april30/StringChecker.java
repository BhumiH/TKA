package com.tka.april30;

public class StringChecker {

	public boolean checkAnagram(String s1, String s2) {

		if (s1.length() == s2.length()) {
			String s3 = s1.toLowerCase();
			String s4 = s2.toLowerCase();

			int c1 = 0;
			int c2 = 0;
			for (int i = 0; i < s1.length(); i++) {
				c1 = c1 + (int) s3.charAt(i);
				c2 = c2 + (int) s4.charAt(i);
			}

			if (c1 == c2) {
				return true;
			}
		}

		return false;
	}

	public void reverseString(String s) {
		
		for (int i = (s.length() - 1); i >= 0; i--) {

			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

	public void reveseWord(String s1) {
		
		String[] s=s1.split(" ");
		for(String sr:s) {
			
			for(int i=sr.length()-1;i>=0;i--)
			{
				System.out.print(sr.charAt(i));
			}
				System.out.print(" ");
		}


	}
}
