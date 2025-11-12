package oopexamples;

import java.util.Scanner;

public class BankAccount {
	//instance variables
	 String accountHolder;
	 String accountNumber;
	 double balance;

	//method to initialize the account details
	public void creatAccount() {
		Scanner scanner=new Scanner(System.in);
	System.out.print("Enter Account Holder Name : ");
	accountHolder=scanner.nextLine();
	System.out.print("Enter Account Number : ");
	accountNumber=scanner.nextLine();
	System.out.print("Enter Account Balance : ");
	balance=scanner.nextDouble();
	System.out.println("Account Created Successfully");
	}
	//method to deposit money
	public void deposit(double amount) {
		if(amount>0) {
		balance += amount;
		System.out.println("succesfully deposited "+amount);
	} else {
		System.out.println("deposit amount must be positive");
	}
	}
	//method to withdraw money if sufficint balance exists
	public void withdraw(double amount) {
		if(amount>0&& amount<=balance) {
			balance -= amount;
			System.out.println("with draw successful " +amount);
		}else {
			System.out.println("in-sufficient balance or in-valid amount");
		}
	}
	//method to display account details
	public void displayAccountInfo() {
		System.out.println("\n==account information==");
		System.out.println("Account Holder :"+accountHolder);
		System.out.println("Account number :"+accountNumber);
		System.out.println("Account balance :"+balance);
	}	
}

	