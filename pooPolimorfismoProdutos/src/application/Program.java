package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Product x =new Product("Carro",25000.0);
		
		System.out.println(x.priceTag());
		Product y =new UsedProduct("Carro",25000.0,sdf.parse("04/10/1990"));
		
		System.out.println(y.priceTag());
		Product z =new ImportedProduct("Carro",25000.0, 25000.0);
		
		System.out.println(z.priceTag());

	}

}
