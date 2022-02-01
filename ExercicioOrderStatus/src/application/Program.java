package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		Date moment= new Date();
		
		System.out.println("LojasJava.SA");
		System.out.println();
		
		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Email: ");
		String email=sc.nextLine();
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date birthDate=sdf.parse(sc.next());
		Client cli =new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		//passo 3 instanciando o Order:
		Order order=new Order(new Date(), status, cli);
		
		
		System.out.print("How many items to this order? ");
		int N= sc.nextInt();
		for (int i=1; i<=N;i++) {
			System.out.println("Enter #"+i+" item date: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice =sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity=sc.nextInt();
			//passo 1 instanciar o produto:
			Product product = new Product(productName, productPrice);	
			//passo 2 instanciar a orderitem:
			OrderItem it=new OrderItem(quantity, productPrice, product);
			//paaso 4 adicionando um item na Order:
			order.addItem(it);
		}
		System.out.println();
		System.out.println("ORDER SYMARY");
		System.out.println(order);
		
		sc.close();
	}
}
