package com.hcl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username 1:");
		String name = sc.nextLine();
		System.out.println("Do you want to continue?(y/n):");
		String option = sc.nextLine();
		a.add(name);
		
		if (option.equals("y")) {
			System.out.println("Enter the username2: ");
			String name1 = sc.nextLine();
			System.out.println("Do you want to continue?(y/n):");
			String option1 = sc.nextLine();
			a.add(name1);
			System.out.println("The name entered are:" + a);
		} else {
			System.out.println("The name entered are:" + a);
		}

	}

}
