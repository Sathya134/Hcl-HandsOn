package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String sentence=sc.nextLine();
		int uppercase=1;
		char[] charArray = sentence.toCharArray();
		for(int i=0; i < charArray.length; i++) {
			if( Character.isLetter(charArray[i]) ){
				if( !Character.isUpperCase( charArray[i] )) {
					uppercase=0;
				}
				else {
					uppercase=1;
				}
			}
			
		}
		if(uppercase==1) {
			System.out.println("String is in uppercase");
		}
		else {
			System.out.println("String is not in uppercase");
		}
	}
}