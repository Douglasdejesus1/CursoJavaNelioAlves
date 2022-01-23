package Application;
import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter produc data: ");
		Product product = new Product();
		System.out.print("Name:");
		product.name=sc.nextLine();
		System.out.print("Price: $");
		product.price=sc.nextDouble();
		System.out.print("Quantity in Stock");
		product.quantity=sc.nextInt();
		
		System.out.println(product.ToString());
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity=sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data:"+product.ToString());
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity=sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data:"+product.ToString());
		
		
		sc.close();

	}

}
