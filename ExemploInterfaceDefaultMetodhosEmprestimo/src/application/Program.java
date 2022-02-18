package application;

import java.util.Locale;
import java.util.Scanner;

import Service.BrazilInterestService;
import Service.InterestService;
import Service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Monthes: ");
		int months = sc.nextInt();
		
		BrazilInterestService in = new BrazilInterestService(2.0);
		
		double payment =in.payment(amount, months);
		
		System.out.println("BR Payment after "+months+" months: ");
		System.out.println(String.format("%.2f",payment));
		
		
		UsaInterestService usis = new UsaInterestService(1.00);
		
		payment =usis.payment(amount, months);
		
		System.out.println("USA Payment after "+months+" months: ");
		System.out.println(String.format("%.2f",payment));
		
		InterestService is = new UsaInterestService(3.00);
		
		payment =is.payment(amount, months);
		
		System.out.println("generic Payment after "+months+" months: ");
		System.out.println(String.format("%.2f",payment));
		
		sc.close();

	}

}
