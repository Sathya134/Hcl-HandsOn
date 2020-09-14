package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	public static void main(String[] args) throws IOException{
		String accountNumber;
		Double balance;
		String accountHolderName;
		Double minimumBalance;
		Integer lockingPeriod;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter account details in comma seperated");
		String str=br.readLine();
		String[] details=str.split(",");
		accountNumber=details[0];
		balance=Double.parseDouble(details[1]);
		accountHolderName=details[2];	
		minimumBalance=Double.parseDouble(details[3]);
		lockingPeriod=Integer.parseInt(details[4]);
		FixedAccount f = new FixedAccount();
		f.getAccountDetail();
		

	}

}
