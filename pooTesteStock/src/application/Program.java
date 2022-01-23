  package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name= sc.nextLine();
		System.out.print("Price: ");
		double price=sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity=sc.nextInt();

		Product product=new Product(name, price,quantity);
		
		product.setName("Computer");
		System.out.println("Updated Name: "+product.getName());
		
		product.setPrice(800);
		System.out.println("Updated Price: "+product.getPrice());
		System.out.println("Actual Quantity: "+product.getQuantity());
		System.out.println();
		System.out.println("Product data: "+product);
		
//double totalValueInStock = product.totalValueInStock(); 
//System.out.printf("Product data: %s, %.2f, %d units, Total: $ %.2f\n",product.name,product.price,product.quantity,totalValueInStock);
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: "+product);
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		System.out.print("Updated data: "+product);
		
	sc.close();
	}

}
