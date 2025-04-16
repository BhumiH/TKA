package com.tka.april16;

public class Student {

	private int roll;
	private int marks;
	private String name;

	public Student(int rno, String nm, int m) {
		roll = rno;
		name = nm;
		marks = m;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int rno) {
		roll = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int m) {
		marks = m;
	}

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		name = nm;
	}
}
