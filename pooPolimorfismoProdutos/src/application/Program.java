package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		List<Product>list=new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int N=sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.print("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)");
			
			char p =sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Price: ");
			double price=sc.nextDouble();
			if(p=='c') {
				list.add(new Product(name, price));
			}
			else if(p=='u') {
				System.out.println("Manufacture date(DD/MM/YYYY)");
				Date manufactureDate=sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee=sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
				
			}
		System.out.println();	
		System.out.println("PRICE TAGS");
		for (Product prod: list) {
			System.out.println(prod.priceTag());
		}
		
	}

}
