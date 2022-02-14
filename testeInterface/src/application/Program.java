package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String model=sc.nextLine();
		System.out.print("Pickup (dd/MM/yyy hh:mm):");
		
		System.out.print("Return (dd/MM/yyy hh:mm):");
		
		System.out.print("Enter price per hour: ");
		double hourPrice= sc.nextDouble();
		System.out.print("Enter price per day: ");
		double dayPrice= sc.nextDouble();
		
		System.out.println("INVOICE");
	}

}
