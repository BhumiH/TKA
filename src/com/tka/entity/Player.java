package com.tka.entity;

public class Player {
	private int jno;
	private String name;
	private int runs;
	private int wickets;
	private String tname;

	public Player() {
		super();
	}

	public Player(int jno, String name, int runs, int wickets, String tname) {
		super();
		this.jno = jno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		if (jno > 0) {
			this.jno = jno;
		} else {
			System.out.println("JNO can not be negative");
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
		} else {
			System.out.println("Runs can not be negative");
		}
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		if (wickets >= 0) {
			this.wickets = wickets;
		}
		else
		{	System.out.println("Wickets can not be negative");
		
		}

	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Player [jno=" + jno + ", name=" + name + "]";
	}

}
