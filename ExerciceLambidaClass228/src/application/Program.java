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

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		File prods = new File(path);
		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(prods))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String produc = fields[0];
				Double price = Double.parseDouble(fields[1]);
				
				list.add(new Product(produc,price));
				line = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		double avg = list.stream()
				.map(p ->p.getPrice())
				.reduce(0.0,(x,y)-> x+y)/list.size();
		
		System.out.println("Average price: "+String.format("%.2f",avg));
		
		Comparator<String>comp=(s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String>names = list.stream()
				.filter(p->p.getPrice()<avg)
				.map(p ->p.getName())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		
		names.forEach(System.out::println);
			
			System.out.println("______________________________");
			
			/*int sum=((Product) list).getPrice().stream().reduce(0,(x,y)-> x+y);
			System.out.println("Sum= "+sum);
			C:\\Users\\Douglas\\Desktop\\new paste\\Exercicio.csv*/

	sc.close();
	}
}
