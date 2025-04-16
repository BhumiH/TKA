package com.tka.april16;

public class Player {
	private int jno;
	private String name;
	private int runs;
	private int wickets;
	private String tname;

	public Player(int jn, String nm, int run, int wk, String tnm) {
		jno = jn;
		name = nm;
		runs = run;
		wickets = wk;
		tname = tnm;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jn) {
		jno = jn;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int run) {
		runs = run;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wk) {
		wickets = wk;
	}

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		name = nm;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tnm) {
		tname = tnm;
	}
}
