package com.sample;

public class BankAccount {
	int accId;
	String accName;
	private float balance;

	public BankAccount(int accId, String accName, float balance) {
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}

}
