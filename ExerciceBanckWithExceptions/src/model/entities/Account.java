package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	
	}
		
	//public Account(int number, String holder,double withdrawLimit) {
	//		this.number = number;
	//		this.holder = holder;
	//      withdrawLimit = withdrawLimit;
	//	}

	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		if(withdrawLimit>balance) {
			throw new DomainException("The amount exceeds withdraw limit");				
		}
		else {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
			this.withdrawLimit = withdrawLimit;
		}
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance<amount) {
			throw new DomainException("Not enough balance to withdraw");
		}
		if(amount>withdrawLimit) {
			throw new DomainException("not day limit");
		}
		else {
		balance-=amount;
		}
	}
	
}
