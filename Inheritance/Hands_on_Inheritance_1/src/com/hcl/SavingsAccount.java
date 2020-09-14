package com.hcl;

public class SavingsAccount extends Account{
	protected Double minimumBalance;

	public SavingsAccount(){
		
	}

	public SavingsAccount(Double minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}

	public Double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(Double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
}
