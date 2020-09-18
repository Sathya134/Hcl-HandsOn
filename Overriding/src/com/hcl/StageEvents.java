package com.hcl;

public class StageEvents extends Event{
	
	int noOfShow;
	int noOfSeatsPerShow;
	int revenue;

	
	public int getNoOfShow() {
		return noOfShow;
	}
	public void setNoOfShow(int noOfShow) {
		this.noOfShow = noOfShow;
	}
	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	
	public Double projectedRevenue(){
		revenue=50*noOfShow*noOfSeatsPerShow;
		return 0.0;
	}
}
