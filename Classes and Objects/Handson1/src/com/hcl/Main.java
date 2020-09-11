package com.hcl;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Venue venue=new Venue();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the venue name");
		venue.name=input.nextLine();
		
		System.out.println("Enter the city name");
		venue.city=input.nextLine();
		
		System.out.println("Venue Details:");
		System.out.println("Venue Name:"+venue.name);
		System.out.println("City Name:"+venue.city);
	}
}
