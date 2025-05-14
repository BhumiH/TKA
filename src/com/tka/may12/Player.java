package com.tka.may12;

public class Player {
	private int jno;
	private String name;
	private int wicket;
	private int runs;
	
	public Player() {
		super();
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public Player(int jno, String name, int runs, int wicket) {
		super();
		this.jno = jno;
		this.name = name;
		this.wicket = wicket;
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Player [jno=" + jno + ", name=" + name + ", wicket=" + wicket + ", runs=" + runs + "]";
	}
	

}
