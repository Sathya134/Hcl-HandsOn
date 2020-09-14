package com.hcl;

public class FixedAccount extends Account {
	private Integer lockingPeriod;
	
	public FixedAccount(){
		
	}

	public FixedAccount(Integer lockingPeriod) {
		super();
		this.lockingPeriod = lockingPeriod;
	}

	public Integer getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(Integer lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
	public void getAccountDetails(){
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n"+getAccountNumber(),getBalance(),getAccountHolderName(),getBalance(),getLockingPeriod());
	}
}
