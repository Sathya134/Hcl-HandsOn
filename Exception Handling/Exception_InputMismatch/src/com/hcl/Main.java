package com.hcl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer input");

		try {
			int input = sc.nextInt();
			System.out.println("Entered Value is: " + input);
		}

		catch (InputMismatchException ime) {
			System.out.println(ime.toString());

		}

	}

}
