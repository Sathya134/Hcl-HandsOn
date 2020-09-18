package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Address1");
		String address1=sc.nextLine();
		System.out.println("Address2");
		String address2=sc.nextLine();
		int length1=address1.length();
		int length2=address2.length(); 
		if(address1.equals(address2)) {
			System.out.println("Red");
		}
		else if(address1.equals(address2) && length1!=length2) {
			System.out.println("Yellow");
		}
		else if(!address1.equals(address2) && length1==length2) {
			System.out.println("Green");
		}
		else {
			System.out.println("Blue");
		}
	}

}