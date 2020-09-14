package com.hcl;

public class CurrentAccount extends Account {

	private String tinNumber;

	public CurrentAccount() {

	}

	public CurrentAccount(String accName, String accNo, String bankName,
			String tinNumber) {
		super();

		this.tinNumber = tinNumber;

	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public void display() {

		
		System.out.println("Account Name:" + getAccName());
		System.out.println("Account Number:" + getAccNo());
		System.out.println("Bank Name: "+getBankName());
		System.out.println("Tin Number:" + getTinNumber());
		
	}

}
