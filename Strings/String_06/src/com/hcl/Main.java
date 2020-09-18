package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentences:");
		String humty=sc.nextLine();
		System.out.println("Enter Dumpty's Sentences:");
		String dumpty=sc.nextLine();
		int wordlength1= humty.split(" ").length;
		int wordlength2= dumpty.split(" ").length;
		if(wordlength1==wordlength2) {
			System.out.println("Both have used equal number of words");
		}
		else if(wordlength1>wordlength2){
			System.out.println("Humpty has used more words");
		}
		else {
			System.out.println("Dumpty has used more words");
		}
	}

}