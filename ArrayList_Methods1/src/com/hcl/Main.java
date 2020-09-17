package com.hcl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	ArrayList hall=new ArrayList();
	
	int noOfHall;
	String search;
	System.out.println("Enter the no of halls: ");
	noOfHall = sc.nextInt();
	sc.nextLine();
	
	for(int i=1;i<=noOfHall;i++){
		System.out.println("Enter the hall name:"+i);
		hall.add(sc.nextLine());
		}
	System.out.println("Enter the hall name to be searched: ");
	search=sc.nextLine();
	if(hall.contains(search)==true){
		System.out.println(search+" is found at position "+hall.indexOf(search));
	}
	else{
		System.out.println(search+"Hall is not found");
	}
	
	}	
}