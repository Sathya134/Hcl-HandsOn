
package com.hcl;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Delivery delivery = new Delivery();
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Over");
		delivery.over=input.nextLong();
		
		System.out.println("Enter the ball");
		delivery.ball=input.nextLong();
		
		System.out.println("Enter the runs");
		delivery.runs=input.nextLong();
		
		System.out.println("Enter the batsman name");
		delivery.batsman=input.nextLine();
		
		input.nextLine();
		System.out.println("Enter the bowler Name");
		delivery.bowler=input.nextLine();
		
		System.out.println("Enter the Non Striker Name");
		delivery.nonstriker=input.nextLine();
		
		System.out.println("Delivery Details:");
		System.out.println("Over:"+delivery.getOver());
		System.out.println("Ball:"+delivery.getBall());
		System.out.println("Runs:"+delivery.getRuns());
		
		
		System.out.println("Batsman:"+delivery.getBatsman());
		System.out.println("Bowler:"+delivery.getBowler());
		System.out.println("Non Striker:"+delivery.getNonstriker());


	}

}
