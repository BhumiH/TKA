package com.tka.service;

import com.tka.dao.PlayerDao;
import com.tka.entity.Player;

public class PlayerService {

	public Player[] getTeamCSK() {
		PlayerDao obj=new PlayerDao();
		Player[] cskTeam=obj.getTeamCSK();
		return cskTeam;
	}
	
	public Player[] getTeamRCB() {
		PlayerDao obj=new PlayerDao();
		Player[] rcbTeam=obj.getTeamRCB();
		return rcbTeam;
	}

}
