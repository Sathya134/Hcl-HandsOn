package com.hcl;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter humpty's statement: ");
		String s1 = sc.nextLine();
		System.out.println("Enter dumpty's statement: ");
		String s2 = sc.nextLine();
		String s3 = s1 + "." + s2;
		System.out.println("Concatenated String:  " + s3);
	}

}
