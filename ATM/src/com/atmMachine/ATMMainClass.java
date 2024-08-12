package com.atmMachine;

import java.util.Scanner;

public class ATMMainClass {

	public static void main(String[] args) {

		int atmnum = 123;
		int atmpin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To ATM Machine!!");
		System.out.println("Enter ATM ACCOUNT NUMBER");
		int atmnumber=sc.nextInt();
		System.out.println("Enter ATM PIN");
		int pin =sc.nextInt();
		AtmOperations ap = new AtmOperations();
		if((atmnum==atmnumber)&&(atmpin==pin)) {

			while(true) {
				System.out.println("1.CHECK THE  BALANCE \n 2.WITHDRAW AMOUNT \n 3.DEPOSIT AMOUNT \n 4.MINI STATEMENT \n 5.EXIT");
				System.out.println("ENTER YOUR CHOICE");
				int ch = sc.nextInt();
				if(ch==1) {
					ap.checkbalance();

				}else if(ch==2) {
					System.out.println("ENTER AMOUNT :");
					double withdrawAmount = sc.nextDouble();
					ap.withdrawAmount(withdrawAmount);
				}else if(ch==3) {
					System.out.println("ENTER THE DEPOSIT AMOUNT  :");
					double depositAount =sc.nextDouble();
					ap.depositAmount(depositAount);

				}else if(ch==4) {
					ap.miniStatement();

				}else if(ch==5) {
					System.out.println("THANK YOU FOR USING ATM MACHINE");
					System.exit(0);

				}else {
					System.out.println("PLEASE CHOOSE CORRECT CHOICE");
				}
			}
		}else {
			System.out.println("PLEASE CHECK YOUR DETAILS");
			System.out.println("YOU ENTER THE WRING PIN OR ATM ACCOUNT NUMBER ");
		}

	}

}
