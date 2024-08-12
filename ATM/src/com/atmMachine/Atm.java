package com.atmMachine;

public class Atm {
	private double balance;
	private double depositbalance;
	private double withdrawAmount;
	public Atm(){

	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositbalance() {
		return depositbalance;
	}
	public void setDepositbalance(double depositbalance) {
		this.depositbalance = depositbalance;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
}
