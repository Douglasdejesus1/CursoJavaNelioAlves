package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv",9000.00));
		list.add(new Product("Notebook",1200.00));
		list.add(new Product("Tablet",450.00));
		
		/*1º fase verboso
		Comparator<Product>comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};*/
		
		/*2º fase medio
		Comparator<Product>comp = (p1,p2) -> -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());*/
		
		//3º fase resumido
		list.sort((p1,p2) -> -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		
		for (Product p: list){
			System.out.println(p);
		}
		}


}

