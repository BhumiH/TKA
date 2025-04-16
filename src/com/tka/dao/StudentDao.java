package com.tka.dao;

import com.tka.entity.Student;

public class StudentDao {

	public Student getOneStudent(int i, String string, int j) {
	
		Student s=new Student();
		s.setRoll(i);
		s.setName(string);
		s.setMarks(j);
		return s;
	}

}
