package com.hcl;

import java.util.Scanner;

public class MainFort {

	public static void main(String[] args) {

		Fort f1 = new Rajmachi();
		Fort f2 = new Shivgadh();
		Fort f3 = new Murud();

		System.out.println("What you want to visit");
		System.out.println("1.Rajmachi");
		System.out.println("2.Shivgadh");
		System.out.println("3.Murud");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if (ch == 1) {
			f1.distance();
		} else if (ch == 2) {
			f2.distance();
		} else if (ch == 3) {
			f3.distance();
		} else
			System.out.println("Wrong Choice..");
		sc.close();
	}

}