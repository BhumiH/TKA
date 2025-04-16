package com.tka.controller;

import com.tka.entity.Player;
import com.tka.entity.Student;
import com.tka.service.IPLService;
import com.tka.service.StudentService;

public class IPLController {

	public static void main(String[] args) {
	
		IPLService service = new IPLService();
		
		Player p1=service.getOnePlayer(7,"MSD",5500,0,"CSK");
		System.out.println(p1);
		System.out.println(p1.getName());
		p1.setRuns(-11);
		System.out.println(p1.getRuns());
		
		
		StudentService S_service = new StudentService();
		
		Student s1=S_service.getOneStudent(1,"Amrita",71);
		System.out.println(s1);
		s1.setMarks(91);
		System.out.println(s1);

	}

}
