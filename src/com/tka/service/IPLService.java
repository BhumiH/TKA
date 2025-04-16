package com.tka.service;


import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	
	IPLDao dao=null;

	public Player getOnePlayer(int i, String string, int j, int k, String string2) {
		
		System.out.println("In Service Method");
		dao=new IPLDao();
		Player obj = dao.getOnePlayer(i,string,j,k,string2);
		return obj;
	}
	
	

}
