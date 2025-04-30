package com.tka.april28;

public class IPL {

	public static void main(String[] args) {

//		creating Players list 22

//		Players []p=new Players[22];
//		TEAM CSK
		Players p1 = new Players(70, "Dewald Brevis", 272, 1);
		Players p2 = new Players(31, "Devon Conway", 1018, 0);
		Players p3 = new Players(75, "Rahul Tripathi", 2291, 0);
		Players p4 = new Players(8, "Shaik Rasheed", 46, 8);
		Players p5 = new Players(18, "Rachin Ravindra", 413, 0);
		Players p6 = new Players(99, "Ravichandran Ashwin", 812, 185);
		Players p7 = new Players(7, "MS Dhoni", 5383, 0);
		Players p8 = new Players(96, "Vijay Shankar", 1233, 9);
		Players p9 = new Players(90, "Sam Curran", 904, 58);
		Players p10 = new Players(18, "Khaleel Ahmed", 2, 86);
		Players p11 = new Players(74, "Noor Ahmad", 16, 38);

//		TEAM Gujarat Titans
		Players p12 = new Players(7, "Shubman Gill", 3605, 0);
		Players p13 = new Players(7, "Jos Buttler", 3988, 0);
		Players p14 = new Players(7, "Kumar Kushagra", 3, 0);
		Players p15 = new Players(7, "Nishant Sindhu", 0, 0);
		Players p16 = new Players(7, "Mahipal Lomror", 527, 1);
		Players p17 = new Players(7, "Washington Sundar", 442, 39);
		Players p18 = new Players(7, "Mohd. Arshad Khan", 102, 9);
		Players p19 = new Players(7, "Kagiso Rabada", 213, 119);
		Players p20 = new Players(7, "Mohammed Siraj", 109, 105);
		Players p21 = new Players(7, "Prasidh Krishna", 9, 66);
		Players p22 = new Players(7, "Manav Suthar", 1, 0);
		
//		System.out.println("-----------TEAM --------------");
//		CSK
		Players[] cskteam=new Players[11];
		cskteam[0]=p1;
		cskteam[1]=p2;
		cskteam[2]=p3;
		cskteam[3]=p4;
		cskteam[4]=p5;
		cskteam[5]=p6;
		cskteam[6]=p7;
		cskteam[7]=p8;
		cskteam[8]=p9;
		cskteam[9]=p10;
		cskteam[10]=p11;
//		GT
		Players[] gtteam=new Players[11];
		gtteam[0]=p12;
		gtteam[1]=p13;
		gtteam[2]=p14;
		gtteam[3]=p15;
		gtteam[4]=p16;
		gtteam[5]=p17;
		gtteam[6]=p18;
		gtteam[7]=p19;
		gtteam[8]=p20;
		gtteam[9]=p21;
		gtteam[10]=p22;
		
		
	
		
		System.out.println("-----------TEAM CSK--------------");
		System.out.println("Batters");
		for (int i = 0; i < cskteam.length; i++) {
			
			if(cskteam[i].getRuns()>200 && cskteam[i].getWickets()<10) {
				System.out.println(cskteam[i]);
			}
	
		}
		System.out.println("All Rounders");
		for (int i = 0; i < cskteam.length;i++) {
			if(cskteam[i].getRuns()>100 && cskteam[i].getWickets()>10) {
				System.out.println(cskteam[i]);
			}
		}
		System.out.println("Bowlers");
		for (int i = 0; i < cskteam.length;i++) {
			if(cskteam[i].getWickets()>10) {
				System.out.println(cskteam[i]);
			}
		}
		System.out.println("-----------TEAM GT--------------");
		System.out.println("Batters");
		for (int i = 0; i < gtteam.length; i++) {
			
			if(gtteam[i].getRuns()>200 && gtteam[i].getWickets()<10) {
				System.out.println(gtteam[i]);
			}
	
		}
		System.out.println("All Rounders");
		for (int i = 0; i < gtteam.length;i++) {
			if(gtteam[i].getRuns()>100 && gtteam[i].getWickets()>10) {
				System.out.println(gtteam[i]);
			}
		}
		System.out.println("Bowlers");
		for (int i = 0; i < gtteam.length;i++) {
			if(gtteam[i].getWickets()>10) {
				System.out.println(gtteam[i]);
			}
		}
//		
	}

}
