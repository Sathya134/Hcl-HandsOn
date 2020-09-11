package com.hcl;

public class Delivery {
	long over,ball,runs;
	String batsman,bowler,nonstriker;
	
	public Delivery(){
		
	}
	public Delivery(long over, long ball, long runs, String batsman,String bowler, String nonstriker) 
	{
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
		
	}
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonstriker() {
		return nonstriker;
	}
	public void setNonstriker(String nonstriker) {
		this.nonstriker = nonstriker;
	}

}
