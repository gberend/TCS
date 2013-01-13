package com.yetra;

public class TuringRow {
	private String qI;
	private char ΣI;
	private String qJ;
	private char ΓJ;
	private char moveJ;

	public TuringRow(String qI, char ΣI, String qJ, char ΓJ, char moveJ) {
		this.qI = qI;
		this.ΣI = ΣI;
		this.qJ = qJ;
		this.ΓJ = ΓJ;
		this.moveJ = moveJ;
	}

	@Override
	public String toString() {
		return "" + qI + " " + ΣI + " → " + qJ + " " + ΓJ + " " + moveJ + "";
	}
}