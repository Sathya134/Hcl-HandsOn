package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String details;
		String[] wickets;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of wickets");
		int wicket = input.nextInt();

		for (int i = 1; i < wicket; i++) {
			System.out.println("Enter the details of wicket");
			details = input.nextLine();
			String[] item = details.split(",");
			details = (item[0]);

		}

	}

}
