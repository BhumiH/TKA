package com.tka.dao;

import com.tka.april28.Players;
//import com.tka.april28.Players;
import com.tka.entity.Player;

public class PlayerDao {

	public Player[] getTeamCSK() {
		Player[] cskteam=new Player[11];
		cskteam[0]=new Player(70, "Dewald Brevis", 272, 1,"CSK","Batter");	
		cskteam[1]=new Player(31, "Devon Conway", 1018, 0,"CSK","Batter");
		cskteam[2]= new Player(75, "Rahul Tripathi", 2291, 0,"CSK","Batter");
		cskteam[3]=new Player(8, "Shaik Rasheed", 46, 8,"CSK","Batter");
		cskteam[4]=new Player(18, "Rachin Ravindra", 413, 0,"CSK","AllRounder");
		cskteam[5]=new Player(99, "Ravichandran Ashwin", 812, 185,"CSK","AllRounder");
		cskteam[6]=new Player(7, "MS Dhoni", 5383, 0,"CSK","Batter");
		cskteam[7]=new Player(96, "Vijay Shankar", 1233, 9,"CSK","AllRounder");
		cskteam[8]=new Player(90, "Sam Curran", 904, 58,"CSK","AllRounder");
		cskteam[9]=new Player(18, "Khaleel Ahmed", 2, 86,"CSK","Bowler");
		cskteam[10]=new Player(74, "Noor Ahmad", 16, 38,"CSK","Bowler");

		return cskteam;
	}

	public Player[] getTeamRCB() {
		Player[] rcbteam=new Player[11];
		rcbteam[0]=new Player(70, "Shubman Gill", 3605, 0,"RCB","Batter");	
		rcbteam[1]=new Player(31, "Jos Buttler", 3988, 0,"RCB","Batter");
		rcbteam[2]= new Player(75, "Kumar Kushagra", 3, 0,"RCB","Batter");
		rcbteam[3]=new Player(8, "Nishant Sindhu", 0, 0,"RCB","AllRounder");
		rcbteam[4]=new Player(18,  "Mahipal Lomror", 527, 1,"RCB","AllRounder");
		rcbteam[5]=new Player(99,"Washington Sundar", 442, 39,"RCB","AllRounder");
		rcbteam[6]=new Player(7, "Mohd. Arshad Khan", 102, 9,"RCB","AllRounder");
		rcbteam[7]=new Player(96, "Kagiso Rabada", 213, 119,"RCB","Bowler");
		rcbteam[8]=new Player(90, "Mohammed Siraj", 109, 105,"RCB","Bowler");
		rcbteam[9]=new Player(18, "Prasidh Krishna", 9, 66,"RCB","Bowler");
		rcbteam[10]=new Player(74,"Manav Suthar", 1, 0,"RCB","Bowler");

		return rcbteam;
	}

//	truing to make generalize function
	public Player[] getAllPlayer(String team) {
		Player[] cskteam=new Player[11];
		cskteam[0]=new Player(70, "Dewald Brevis", 272, 1,"CSK");
	
		cskteam[1]=new Player(31, "Devon Conway", 1018, 0,"CSK");
		cskteam[2]= new Player(75, "Rahul Tripathi", 2291, 0,"CSK");
		cskteam[3]=new Player(8, "Shaik Rasheed", 46, 8,"CSK");
		cskteam[4]=new Player(18, "Rachin Ravindra", 413, 0,"CSK");
		cskteam[5]=new Player(99, "Ravichandran Ashwin", 812, 185,"CSK");
		cskteam[6]=new Player(7, "MS Dhoni", 5383, 0,"CSK");
		cskteam[7]=new Player(96, "Vijay Shankar", 1233, 9,"CSK");
		cskteam[8]=new Player(90, "Sam Curran", 904, 58,"CSK");
		cskteam[9]=new Player(18, "Khaleel Ahmed", 2, 86,"CSK");
		cskteam[10]=new Player(74, "Noor Ahmad", 16, 38,"CSK");

		return cskteam;
	}

}
