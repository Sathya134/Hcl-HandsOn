package com.hcl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		ItemType it = new ItemType();
		
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Item type details: ");
			System.out.println("Enter the name");
			it.name = br.readLine();
			System.out.println("Enter the Deposit: ");
			it.deposit = Double.parseDouble(br.readLine());
			System.out.println("Enter the cost per day: ");
			it.costPerDay = Double.parseDouble(br.readLine());
			System.out.println("Name: "+it.getName());
			System.out.println("Deposit: "+it.getDeposit());
			System.out.println("Cost per Day: "+it.getCostPerDay());
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Enter the numeric Value...");
		}
		
		
		

	}

}
