package com.tka.controller;

import com.tka.entity.Player;
import com.tka.service.PlayerService;

public class IPL {

	public static void main(String[] args) {

		PlayerService ps = new PlayerService();

		Player[] cskteam = ps.getTeamCSK();
		System.out.println("__________________________CSK_______________________");
		System.out.println("=> Batters <=");
		for (int i = 0; i < cskteam.length; i++) {

			if (cskteam[i].getRuns() > 200 && cskteam[i].getWickets() < 10) {
				System.out.println(cskteam[i]);
			}

		}
		System.out.println("=> All Rounders <=");
		for (int i = 0; i < cskteam.length; i++) {
			if (cskteam[i].getRuns() > 100 && cskteam[i].getWickets() > 10) {
				System.out.println(cskteam[i]);
			}
		}
		System.out.println("=> Bowlers <=");
		for (int i = 0; i < cskteam.length; i++) {
			if (cskteam[i].getWickets() > 10) {
				System.out.println(cskteam[i]);
			}
		}

		System.out.println("________________________RCB____________________________");
		Player[] rcbteam = ps.getTeamRCB();

		System.out.println("=> Batters <=");

		for (int i = 0; i < rcbteam.length; i++) {

			if (rcbteam[i].getRole().equals("Batter")) {
				System.out.println(rcbteam[i]);
			}

		}
		System.out.println("=> All Rounders <=");

		for (int i = 0; i < rcbteam.length; i++) {

			if (rcbteam[i].getRole().equals("AllRounder")) {
				System.out.println(rcbteam[i]);
			}

		}
		System.out.println("=> Bowlers <=");
		
		for (int i = 0; i < rcbteam.length; i++) {

			if (rcbteam[i].getRole().equals("Bowler")) {
				System.out.println(rcbteam[i]);
			}

		}
	}

}
