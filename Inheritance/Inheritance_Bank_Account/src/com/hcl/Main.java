package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {

		CurrentAccount ca = new CurrentAccount();
		SavingsAccount sa = new SavingsAccount();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Account type");
		System.out.println("1.Current Account");
		System.out.println("2.Savings Account");

		int type = Integer.parseInt(br.readLine());

		if (type == 1)

		{

			System.out
					.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,tinNumber)");
			String str = br.readLine();
			String[] details = str.split(",");
			ca.accName = details[0];
			ca.accNo = details[1];
			ca.bankName = details[2];
			ca.setTinNumber(details[3]);

			ca.display();

		} else if (type == 2) {

			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,OrgName)");
			String str = br.readLine();
			String[] details = str.split(",");
			sa.accName = details[0];
			sa.accNo = details[1];
			sa.bankName = details[2];
			sa.setOrgName(details[3]);

			sa.display();

		}
	}

}
