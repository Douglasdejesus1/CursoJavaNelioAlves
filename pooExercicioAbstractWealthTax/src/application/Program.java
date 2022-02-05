package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FisicalTax;
import entities.EnterpriseTax;
import entities.Tax;

public abstract class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		List<Tax>list=new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)?");
			char ch=sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Anual income: ");
			double income=sc.nextDouble();
			if (ch=='i') {
				System.out.print("Health expenditures: ");
				double helthexp=sc.nextDouble();
				list.add(new FisicalTax(name, income, helthexp));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployess=sc.nextInt();
				list.add(new EnterpriseTax(name, income,numberOfEmployess));
			}
			
			
		}
		double sum=0;
		System.out.println("TAXES PAID:");
		for (Tax tax: list) {
			System.out.printf(tax.getName()+": $ "+String.format("%.2f", tax.Tax()));
			System.out.println();
		}
		for (Tax tax: list) {
			sum+=tax.Tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $"+String.format("%.2f", sum));
		
		
		
		
		
	
	sc.close();	
	}

}
