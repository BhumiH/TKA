package com.tka.entity;

public class Player {
	
	private int jno;
	private String name;
	private int runs;
	private int wickets;
	private String team;
	private String role;

	public Player(int jno, String name, int runs, int wickets, String team, String role) {
		super();
		this.jno = jno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		if (jno > 0) {
			this.jno = jno;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		if (runs >= 0) {
			this.runs = runs;
		}
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		if (wickets >= 0) {
			this.wickets = wickets;
		}
	}

	@Override
	public String toString() {
		return "Players [jno=" + jno + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + "]";
	}

	public Player(int jno, String name, int runs, int wickets) {
		super();
		this.jno = jno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
	}
	public Player(int jno, String name, int runs, int wickets, String team) {
		super();
		this.jno = jno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
	}

	public Player(int jno, String name, int runs) {
		super();
		this.jno = jno;
		this.name = name;
		this.runs = runs;	
	}
}
