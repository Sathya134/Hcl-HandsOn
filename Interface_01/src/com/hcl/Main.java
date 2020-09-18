package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		

		GoldStall s = new GoldStall();
		PremeiumStall s1 = new PremeiumStall();
		ExecutiveStall s2 = new ExecutiveStall();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Stall type");
		System.out.println("1.Gold Stall");
		System.out.println("2.Premium Stall");
		System.out.println("3.Executive Stall");
		int type = sc.nextInt();
		

		if (type == 1) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets:");
			
			String details=br.readLine(); 
			String detailsArr[]=details.split(",");
			
			s1.setStallName(detailsArr[0]);
			s1.setCost(Integer.parseInt(detailsArr[1]));
			s1.setOwnerName(detailsArr[2]);
			s.setTvSet(Integer.parseInt(detailsArr[3]));
			
			
			s.display();
			
		} else if (type == 2) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors:");
			
			String details=br.readLine();
			String detailsArr[]=details.split(",");
			
			s1.setStallName(detailsArr[0]);
			s1.setCost(Integer.parseInt(detailsArr[1])) ;
			s1.setOwnerName(detailsArr[2]);
			s1.setProjector(Integer.parseInt(detailsArr[3]));
			
			s1.display();
		} else if (type == 3) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens:");
			
			String details=br.readLine();
			String detailsArr[]=details.split(",");
		
			s1.setStallName(detailsArr[0]);
			s1.setCost(Integer.parseInt(detailsArr[1])) ;
			s1.setOwnerName(detailsArr[2]);
			s2.setScreen(Integer.parseInt(detailsArr[3]));
			s2.display();
		}

	}		
}
