package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min =400.00;
		
		//list.forEach(new PriceUpdate());
		//list.forEach(Product::staticPriceUpdate);
		//list.forEach(Product::nonStaticPriceUpdate);
		double factor = 1.4;
		/*Consumer<Product> cons= p -> {
			p.setPrice(p.getPrice()*factor);
		};*/
		list.forEach(p ->p.setPrice(p.getPrice()*factor));
		list.forEach(System.out::println);
		
		//for(Product p: list) {
			//System.out.println(p);
		//}
		
		
	}
	
	

}
