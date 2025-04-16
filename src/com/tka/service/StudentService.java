package com.tka.service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

public class StudentService {
	StudentDao dao = null;

	public Student getOneStudent(int i, String string, int j) {
		
		dao=new StudentDao();
		Student s=dao.getOneStudent(i,string,j);
		return s;
	}

}
