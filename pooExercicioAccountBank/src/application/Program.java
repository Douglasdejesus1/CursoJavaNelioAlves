package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	Account account;
	System.out.print("Enter account number: ");
	int number = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter account holder: ");
	String holder = sc.nextLine();
	
	System.out.print("Is there na initial deposit(y/n)?");
	char response = sc.nextLine().charAt(0);
	double balance = 0;
	if (response=='y'){
		System.out.print("Enter initial deposit value: ");
		double initialDeposit = sc.nextDouble();	
		 account = new Account(number,holder, initialDeposit);
	}
	else{
		 account = new Account(number, holder);
	}
	
	System.out.println();
	System.out.println("Accont data: ");
	System.out.println(account);
	System.out.println();
	System.out.print("Enter a deposit value: ");
	balance=sc.nextDouble();
	account.deposit(balance);
	System.out.println("Accont data: ");
	System.out.println(account);
	System.out.println();
	System.out.print("Enter a withdraw value: ");
	balance=sc.nextDouble();
	account.withdrawBalance(balance);
	System.out.println("Accont data: ");
	System.out.println(account);
			
	
	
	
	sc.close();
	}

}
