package com.tka.may2;

public class StrigLogic {

	public StringBuilder reverseString(String s) {

//		StringBuilder s1="";
		StringBuilder s1 = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			s1.append(s.charAt(i));
//			System.out.print(s.charAt(i));
		}
//		System.out.println(s1);
		return s1;
	}

	public boolean palindrom(String s) {

		StringBuilder s1 = new StringBuilder(s);

		StringBuilder rev = reverseString(s);

		if (s1.toString().equals(rev.toString())) {

			return true;
		}

		return false;
	}

	public boolean palindromAscii(String s) {

		StringBuilder s1 = new StringBuilder(s);
		String rs = s1.reverse().toString();
		if (s.length() == rs.length()) {
			String s3 = s.toLowerCase();
			String s4 = rs.toLowerCase();

			int c1 = 0;
			int c2 = 0;
			for (int i = 0; i < s.length(); i++) {
				c1 = c1 + (int) s3.charAt(i);
				c2 = c2 + (int) s4.charAt(i);
			}

			if (c1 == c2) {
				return true;
			}

		}
		return false;

	}

	public String compressString(String s) {
		char[] c = s.toCharArray();

		StringBuilder sb = new StringBuilder();
		int ac = 0;
		int count = 0;
		for (int i = 0; i <= c.length; i++) {

			if (i == 0) {
				ac = (int) c[i];
				sb.append(c[i]);
			} else if (i == c.length) {
				sb.append(count);
			} else if (ac != (int) c[i]) {
				ac = (int) c[i];

				sb.append(count);
				sb.append(c[i]);
				count = 0;

			}

			count++;

		}

		return sb.toString();
	}

}
