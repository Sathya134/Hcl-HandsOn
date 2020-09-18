package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence:");
		String str=sc.nextLine();
		System.out.println("Word To Replace:");
		String word=sc.nextLine();
		System.out.println("Synonym:");
		String synonym=sc.nextLine();
		System.out.println("Replaced String:");
		String replace=str.replace(word, synonym);
		System.out.println(replace);
	}
}