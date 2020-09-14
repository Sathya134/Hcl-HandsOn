package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int lockingPeriod;
		
		Account a=new Account();
		SavingsAccount s= new SavingsAccount();
		FixedAccount f= new FixedAccount();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Account Details in comma seperated: ");
		String str=br.readLine();
		String detailsArr[]=str.split(",");
		a.accountNumber=detailsArr[0];
		a.balance=Double.parseDouble(detailsArr[1]);
		a.accountHolderName=detailsArr[2];
		s.minimumBalance=Double.parseDouble(detailsArr[3]);
		lockingPeriod=Integer.parseInt(detailsArr[4]);
		
		f.getAccountDetails();
		
		
	}

}
