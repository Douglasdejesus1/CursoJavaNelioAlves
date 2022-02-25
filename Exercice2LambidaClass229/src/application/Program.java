package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Contact;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		File prods = new File(path);
		List<Contact> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(prods))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double price = Double.parseDouble(fields[2]);
				
				list.add(new Contact(name,email,price));
				line = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		Comparator<String>comp=(s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase());
		
		System.out.print("Enter salary: ");
		Double salary=sc.nextDouble();
		System.out.println("Email of people whose salary is more than "+salary);
		
		List<String>email=list.stream()
				.filter(p->p.getPrice()>salary)
				.map(p->p.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
		

				
		
		email.forEach(System.out::println);
		
		double sum= list.stream()
				.filter(p->p.getName().charAt(0)=='M')
				.map(p ->p.getPrice())
				.reduce(0.0,(x,y)-> x+y);
		System.out.println("Sum of salary of people whose name Stars with 'M' :"+sum);

//C:\\Users\\Douglas\\Desktop\\new paste\\contacts.csv
	sc.close();
	}
}
