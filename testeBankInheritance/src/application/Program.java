package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	
	List<Account>list=new ArrayList<>();
	
	list.add(new SavingsAccount(1001, "Rodrigo", 500.00, 0.01));
	list.add(new BusinessAccount(1002, "Flavia", 1000.00, 400.0));
	list.add(new SavingsAccount(1003, "Douglas", 5600.00, 0.10));
	list.add(new BusinessAccount(1004, "Claudio", 40.00, 100.0));
	
	double sum=0.0;
	for(Account acc: list) {
		sum+=acc.getBalance();
	}
	System.out.printf("Total balance: %.2f%n",sum);
	for(Account acc: list) {
		acc.deposit(50.0);
	}
	
	for(Account acc: list) {
		System.out.printf("Total:"+acc.getHolder()+"have: $ "+String.format("%.2f%n",acc.getBalance()));;
	}
	sum=0.0;
	for(Account acc: list) {
		sum+=acc.getBalance();
	}
	System.out.printf("Total balance: %.2f%n",sum);
	//Account acc=new Account(1001, "Alex", 1000.0);
	//acc.withdraw(200.0);
	//System.out.println(acc.getHolder()+" tem: ");
	//System.out.println(acc.getBalance());
	//BusinessAccount bacc=new BusinessAccount(1002, "Douglas", 100.0, 500.0);
	//exemplos UPCASTING
	
	//Account acc1=bacc;
	//Account acc2= new BusinessAccount(1003, "Bob", 1000.0, 1000.0);
	//acc2.withdraw(200.0);
	//System.out.println(acc2.getHolder()+" tem: ");
	//System.out.println(acc2.getBalance());
	
	
	
	//Account acc3= new SavingsAccount(1004, "Anna", 1000.0, 0.01);
	//acc3.withdraw(200);
	//System.out.println(acc3.getHolder()+" tem: ");
	//System.out.println(acc3.getBalance());
	//DOWNCASTING
	//BusinessAccount acc4=(BusinessAccount)acc2;
	//acc4.loan(100.0);
	//BusinessAccount acc5=(BusinessAccount)acc3;
	//if(acc3 instanceof BusinessAccount) {
		//BusinessAccount acc5=(BusinessAccount)acc3;
		//acc5.loan(200.0);
		//System.out.println("Loan!");
	//}
	//if(acc3 instanceof SavingsAccount) {
		//SavingsAccount acc5=(SavingsAccount)acc3;
		//acc5.updateBalance();
		//System.out.println("Update!");
	//}
	//Account x=new Account(1020, "Rodrigo", 1000.0);
	//Account y= new SavingsAccount(1021, "Flavia", 1000.0, 0.01);
	
	//x.withdraw(50.0);
	//y.withdraw(50.0);
	//System.out.println(x.getBalance());
	//System.out.println(y.getBalance());
	
	}
	

}
