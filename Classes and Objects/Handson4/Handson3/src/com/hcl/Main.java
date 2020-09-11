package com.hcl;

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
	
	Delivery delivery=new Delivery();
	
	Scanner input= new Scanner(System.in);
	
	
	System.out.println("Enter the Over");
	delivery.over=input.nextLong();
	
	System.out.println("Enter the ball");
	delivery.ball=input.nextLong();
	
	System.out.println("Enter the runs");
	delivery.runs=input.nextLong();
	
	System.out.println("Enter the batsman");
	input.nextLine();
	delivery.batsman=input.nextLine();
	
	System.out.println("Enter the bowler");
	delivery.bowler=input.nextLine();
	
	System.out.println("Enter the nonStriker");
	delivery.nonStriker=input.nextLine();
	
	
	delivery.displayDeliverDetails();
	

	}

}
