package oopexamples;

import java.util.Scanner;

public class Main_BankAccount {

	public static void main(String[] args) {
		//creat first bank account
			BankAccount acc1=new BankAccount();
		acc1.creatAccount();
		acc1.deposit(500);
		acc1.withdraw(100);
		acc1.displayAccountInfo();
	//create second account
		BankAccount acc2=new BankAccount();
		acc2.creatAccount();
		acc2.deposit(1000);
		acc2.withdraw(500);
		acc2.displayAccountInfo();
	
	}

	}


