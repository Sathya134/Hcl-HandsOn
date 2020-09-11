package com.hcl;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Player player= new Player();
	
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the Player Name");
		player.name=input.nextLine();
		
		System.out.println("Enter the Country Name");
		player.country=input.nextLine();
		
		System.out.println("Enter the Skill Name");
		player.skill=input.nextLine();
		
		System.out.println("Player Details:");
		System.out.println("Player Name:"+player.name);
		System.out.println("Player Country:"+player.country);
		System.out.println("Player Skill:"+player.skill);

	}

}
