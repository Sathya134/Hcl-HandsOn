package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Player player=new Player();
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the player details");
	     String details=sc.nextLine();
	     String detailsArr[]=details.split(",");
	    
	    	  player.name=detailsArr[0];
	    	  player.country=detailsArr[1];
	    	  player.skill=detailsArr[2];
	    	  
	    	  player.display();	     
	}

}
