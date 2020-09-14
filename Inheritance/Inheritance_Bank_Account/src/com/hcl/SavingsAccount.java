package com.hcl;

public class SavingsAccount extends Account {

	private String orgName;

	public SavingsAccount() {

	}

	public SavingsAccount(String accName, String accNo, String bankName,
			String orgName) {
		super();
		this.orgName = orgName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void display() {

		System.out.println("Account Name:" + getAccName());
		System.out.println("Account Number:" + getAccNo());
		System.out.println("Bank Name:" + getBankName());
		System.out.println("Organization Name:" + getOrgName());

	}
}
