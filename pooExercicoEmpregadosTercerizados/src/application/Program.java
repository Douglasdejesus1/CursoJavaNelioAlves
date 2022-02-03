package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		List<Employee>list=new ArrayList<Employee>();
		System.out.print("Enter the number of employess: ");
		int N=sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.print("Employee #"+i+" data:");
			System.out.print("Oursourced (y/n)");
			char ch=sc.next().charAt(0);
			System.out.print("Name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Hours: ");
			int hours=sc.nextInt();
			System.out.print("Value per hour: ");
			double valueperhour=sc.nextDouble();
			if(ch=='y') {
				System.out.print("Additional charge: ");
				double addcharge=sc.nextDouble();
				Employee emp=new OutsourcedEmployee(name, hours, valueperhour, addcharge);
				list.add(emp);
				//ou: list.add(new OutsourcedEmployee(name, hours, valueperhour, addcharge));
			}
			else {
				Employee emp= new Employee(name, hours, valueperhour);
				list.add(emp);
				//ou: list.add(new Employee(name, hours, valueperhour););
				}
			}
			System.out.println();
			System.out.println("PAYMENT");
			for (Employee emp: list) {
				System.out.println(emp.getName()+" - $ "+String.format("%.2f", emp.payment()));
			}
			
		sc.close();
	}
	}
