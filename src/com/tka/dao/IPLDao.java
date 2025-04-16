package com.tka.dao;

import com.tka.entity.Player;

public class IPLDao {

	public Player getOnePlayer(int i, String string, int j, int k, String string2) {
		
		System.out.println("In Dao Method");
		Player p_obj= new Player();
		p_obj.setJno(i);
		p_obj.setName(string);
		p_obj.setRuns(j);
		p_obj.setWickets(k);
		p_obj.setTname(string2);
		return p_obj;
	}

}
