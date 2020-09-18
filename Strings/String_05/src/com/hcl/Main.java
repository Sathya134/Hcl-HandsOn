package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentences:");
		String humty=sc.nextLine();
		System.out.println("Humpty says:"+humty);
		System.out.println("What Dumpty want to insert & where?");
		String insert1=sc.nextLine();
		
		System.out.println("Enter position:");
		int position=sc.nextInt();
		StringBuffer sb = new StringBuffer(humty);
		sb.insert(position,insert1);

		System.out.println("Humpty's New Sentense :"+sb);
		
	}

}