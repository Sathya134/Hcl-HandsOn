package com.hcl;

import java.util.Scanner;

public class Reverse {

	public static void main(String args[])

	{
		String str="Empty";
		StringBuilder str1 = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter humpty statement: ");
		str = sc.nextLine();
		str1.append(str);
		System.out.println("dumpty says" + str1.reverse());

	}
}
