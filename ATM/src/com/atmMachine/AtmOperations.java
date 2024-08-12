package com.atmMachine;

import java.util.ArrayList;
import java.util.List;


public class AtmOperations implements Atminterf{
	Atm atm = new Atm();
	List<String> ministate = new ArrayList<>();
	@Override
	public void checkbalance() {
		System.out.println("AVALIABLE BALANCE IS  :  " +atm.getBalance());

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if((withdrawAmount%500 == 0)||(withdrawAmount%100==0)) {
			if(withdrawAmount<=atm.getBalance()) {
				ministate.add("WITHDRAWN: " + withdrawAmount);
				System.out.println(withdrawAmount+"  :  AMOUNT IS WITHDRAWN \n COLLECT THE CASH");
				atm.setBalance(atm.getBalance()-withdrawAmount);
			}else {
				System.out.println("YOU HAVE INSUFFICIENT FUNDS");
			}
		}else {
			System.out.println("WITHDRAW AMOUNT SAHOULD BE 100 OR 500");
		}

	}
	@Override
	public void depositAmount(double depositeamount) {
		if(depositeamount%100==0) {
			ministate.add("DEPOSITED :" + depositeamount);
			System.out.println(depositeamount + " :  DEPOSITED SUCCESSFULLY");
			atm.setBalance(atm.getBalance()+depositeamount);
			checkbalance();
		}else {
			System.out.println("DEPOSITE AMOUNT SHOULD BE MULTI OF 100");
		}

	}

	@Override
	public void miniStatement() {
		if (ministate.isEmpty()) {
			System.out.println("NO TRANSACTIONS YET.");
		} else {
			System.out.println("MINI STATEMENT:");
			for (String transaction : ministate) {
				System.out.println(transaction);
			}
			System.out.println("CURRENT BALANCE  :" + atm.getBalance());
		}


	}
}
