package com.hcl;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int i,n,cost;
		
		Main main = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the cost of the item for n days");
		cost=sc.nextInt();
		System.out.println("Enter the value of n");
		
		try{
		n=sc.nextInt();
		i=cost/n;
		System.out.println("Cost per day of an item is: "+i);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Enter a valid number");
		}
	}

}
