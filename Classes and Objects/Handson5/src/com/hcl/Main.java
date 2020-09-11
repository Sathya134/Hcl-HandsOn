
package com.hcl;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
	
		Venue venue = new Venue();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the venue name");
		venue.setName(input.nextLine());
		
		System.out.println("Enter the city name");
		venue.setCity(input.nextLine());
		
		System.out.println("Venue Details:");
		System.out.println("Venue Name:"+venue.getName());
		System.out.println("City Name:"+venue.getCity());
		
		System.out.println("Verify and Update venue details");
		System.out.println("Menu");
		System.out.println("1.Update Venue Name");
		System.out.println("2.Update City Name");
		System.out.println("3.All information correct/exit");
		
		System.out.println("Type 1 or 2 or 3");
		
		while(true){
			
		int x=Integer.parseInt(input.nextLine());
		
		if(x==1)
		{
		
			System.out.println("Enter the venue name");
			venue.setName(input.nextLine());
			
			System.out.println("Venue Details:");
			System.out.println("Venue Name:"+venue.getName());
			System.out.println("City Name:"+venue.getCity());
			
			System.out.println("Verify and Update venue details");
			System.out.println("Menu");
			System.out.println("1.Update Venue Name");
			System.out.println("2.Update City Name");
			System.out.println("3.All information correct/exit");
		}
		else if(x==2)
		{
			System.out.println("Enter the city name");
			venue.setCity(input.nextLine());
			
			System.out.println("Venue Details:");
			System.out.println("Venue Name:"+venue.getName());
			System.out.println("City Name:"+venue.getCity());
			
			System.out.println("Verify and Update venue details");
			System.out.println("Menu");
			System.out.println("1.Update Venue Name");
			System.out.println("2.Update City Name");
			System.out.println("3.All information correct/exit");
		}
		else if(x==3)
		{
			System.out.println("Venue Details:");
			System.out.println("Venue Name:"+venue.getName());
			System.out.println("City Name:"+venue.getCity());
		}
		}
		

	}

}
		