package com.hcl;

public class Exhibition extends Event {
	
	int noOfStall;
	int revenue;


	public int getNoOfStall() 
	{
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall)
	{
		this.noOfStall = noOfStall;
	}
	public Double projectedRevenue(){
		revenue=noOfStall*10000;
		System.out.println("The projected revenue of that event is:"+" "+revenue);
				return 0.0;
	}
}
