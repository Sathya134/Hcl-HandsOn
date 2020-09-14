package com.hcl;


import java.util.Scanner;

public class Sample {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers:");
		int a[] = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = sc.nextInt();

		try {
			int divisor;
			System.out.println("Enter the divisor:");
			divisor = sc.nextInt();

			int b[] = new int[10];
			for (int j = 0; j < 10; j++) {
				b[j] = a[j] / divisor;
				System.out.println("result:" + b[j]);
			}
		} catch (ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}

	}

}
