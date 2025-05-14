package com.tka.may12;

import java.util.ArrayList;
import java.util.List;

public class IPL {

	public static void main(String[] args) {

		List<Player> csk = new ArrayList<>();

		csk.add(new Player(1, "MSD", 5423, 0));
		csk.add(new Player(2, "Dewald Brevis", 2356, 1));
		csk.add(new Player(3, "Devon Conway", 1018, 0));
		csk.add(new Player(4, "Rahul Tripathi", 2291, 0));
		csk.add(new Player(5, "Rachin Ravindra", 413, 0));
		csk.add(new Player(6, "Ravichandran Ashwin", 820, 185));
		csk.add(new Player(7, "Vijay Shankar", 1233, 9));
		csk.add(new Player(8, "Sam Curran", 997, 59));
		csk.add(new Player(9, "Khaleel Ahmed", 2, 88));
		csk.add(new Player(10, "Noor Ahmad", 18, 44));
		csk.add(new Player(11, "Mukesh Choudhary", 6, 17));

		List<Player> mi = new ArrayList<>();
		
		mi.add(new Player(1,"Rohit Sharma",6928,15));
		mi.add(new Player(2,"Surya Kumar Yadav",4104,0));
		mi.add(new Player(3,"Robin Minz",6,0));
		mi.add(new Player(4,"Ryan Rickelton",336,0));
		mi.add(new Player(5,"Hardik Pandya",2683,77));
		mi.add(new Player(6,"Naman Dhir",302,0));
		mi.add(new Player(7,"Will Jacks",425,7));
		mi.add(new Player(8,"Trent Boult",85,139));
		mi.add(new Player(9,"Karn Sharma",351,82));
		mi.add(new Player(10,"Deepak Chahar",117,87));
		mi.add(new Player(11,"Ashwani Kumar",0,8));
	
		System.out.println("             CSK             ");
		System.out.println("-----Allrounder--------");

		for (Player p : csk) {
			if ((p.getRuns() > 200 && p.getRuns()<2000) && p.getWicket()<5) {
				System.out.println(p);
			}

		}
		
		System.out.println("-----Batters--------");

		for (Player p : csk) {
			if (p.getRuns() > 2000) {
				System.out.println(p);
			}

		}
		System.out.println("-----Boller--------");

		for (Player p : csk) {
			if (p.getWicket()>5) {
				System.out.println(p);
			}

		}
		
		System.out.println("             MI             ");
		System.out.println("-----Allrounder--------");

		for (Player p : csk) {
			if ((p.getRuns() > 200 && p.getRuns()<2000) && p.getWicket()<5) {
				System.out.println(p);
			}

		}
		
		System.out.println("-----Batters--------");

		for (Player p : csk) {
			if (p.getRuns() > 2000) {
				System.out.println(p);
			}

		}
		System.out.println("-----Boller--------");

		for (Player p : csk) {
			if (p.getWicket()>5) {
				System.out.println(p);
			}

		}
	}

}
